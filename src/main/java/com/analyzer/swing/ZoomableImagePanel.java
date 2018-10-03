package com.analyzer.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.apache.commons.collections4.CollectionUtils;

import com.analyzer.util.AffineUtils;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BoundingPoly;
import com.google.cloud.vision.v1.EntityAnnotation;
import com.google.cloud.vision.v1.Vertex;
import com.scansoft.jaxb.Document;
import com.scansoft.jaxb.PageType;

/**
 * The Class ZoomableImagePanel.
 */
public class ZoomableImagePanel extends JPanel {

	/** The image. */
	private BufferedImage image;

	/** The ui bounds. */
	private final Rectangle2D uiBounds = new Rectangle2D.Double();

	/** The image bounds. */
	private final Rectangle2D imageBounds = new Rectangle2D.Double();

	/** The image transform. */
	private final AffineTransform imageTransform = new AffineTransform();

	/** The ui transform. */
	private final AffineTransform uiTransform = new AffineTransform();

	/** The doc. */
	private Document doc;

	/** The current idx. */
	private int currentIdx;

	/** The current worker. */
	private SwingWorker<BufferedImage, Void> currentWorker;

	/** The annotations. */
	AnnotateImageResponse annotations;

	/**
	 * Instantiates a new zoomable image panel.
	 */
	public ZoomableImagePanel() {
		super();
		//
		final ZoomableMouseHandler mouseHandler = new ZoomableMouseHandler();
		addMouseListener(mouseHandler);
		addMouseWheelListener(mouseHandler);
		addMouseMotionListener(mouseHandler);
	}

	/**
	 * Paint.
	 *
	 * @param g the g
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		final Graphics2D g2d = (Graphics2D) g;

		final int w = getWidth();
		final int h = getHeight();

		//
		if (image != null) {
			g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			//
			uiBounds.setRect(w * 0.05, h * 0.05, w - 2 * w * 0.05, h - 2 * h * 0.05);
			imageBounds.setRect(0, 0, image.getWidth(), image.getHeight());

			// only center
			if (imageBounds.getWidth() < uiBounds.getWidth() && imageBounds.getHeight() < uiBounds.getHeight()) {
				AffineUtils.createCenterTransform(imageBounds, uiBounds, imageTransform);
			} else {
				AffineUtils.createTransformToFitBounds(imageBounds, uiBounds, true, imageTransform);
			}
			imageTransform.concatenate(uiTransform);
			g2d.drawImage(image, imageTransform, this);

			// draw omnipage annotations
			if (doc != null) {
				drawAnnotations(g2d, doc.getPage().get(currentIdx));
			} else if (annotations != null) // google text recognition
			{
				drawAnnotations(g2d);
			}
		}
	}

	/**
	 * Draw annotations.
	 *
	 * @param g2d the g 2 d
	 */
	private void drawAnnotations(Graphics2D g2d) {
		if (CollectionUtils.isNotEmpty(annotations.getTextAnnotationsList())) {
			// first element is full text annotation
			final List<EntityAnnotation> textAnnotations = annotations.getTextAnnotationsList();
			for (int j = 0; j < textAnnotations.size(); j++) {
				final EntityAnnotation an = textAnnotations.get(j);

				//
				if (j == 0) {
					int y = 0;
					for (final String line : an.getDescription().split("\n")) {
						g2d.drawString(line, 10, y += g2d.getFontMetrics().getHeight());
					}
					g2d.setColor(Color.RED);
				}

				final Optional<List<Vertex>> vertices = Optional.ofNullable(an.getBoundingPoly())
						.map(BoundingPoly::getVerticesList);

				if (vertices.isPresent()) {
					for (int i = 0; i < vertices.get().size(); i++) {
						final Vertex from = vertices.get().get(i);
						final Vertex to = vertices.get().get((i + 1) % vertices.get().size());

						final Point2D p0 = imageTransform.transform(new Point2D.Float(from.getX(), from.getY()), null);
						final Point2D p1 = imageTransform.transform(new Point2D.Float(to.getX(), to.getY()), null);

						g2d.drawLine((int) p0.getX(), (int) p0.getY(), (int) p1.getX(), (int) p1.getY());
					}
				}
			}
		}
	}

	/**
	 * Draw annotations.
	 *
	 * @param g2d  the g 2 d
	 * @param page the page
	 */
	private void drawAnnotations(Graphics2D g2d, PageType page) {
	}

	/**
	 * Sets the document model.
	 *
	 * @param doc the new document model
	 */
	public void setDocumentModel(Document doc) {
		this.doc = doc;
		if (doc.getPage().size() > 0) {
			loadDocument(0);
		} else {
			throw new RuntimeException("Document has no pages.");
		}
	}

	public void setImageAnnotations(AnnotateImageResponse annotations, File imageFile) {
		this.annotations = annotations;
		if (currentWorker != null) {
			currentWorker.cancel(true);
		}
		//
		uiTransform.setToIdentity();
		image = null;
		//
		currentWorker = new ImageLoadWorker(imageFile);
		currentWorker.execute();
		//
		repaint();
	}

	/**
	 * Load document.
	 *
	 * @param idx the idx
	 */
	private void loadDocument(int idx) {
		currentIdx = idx;
		if (currentWorker != null) {
			currentWorker.cancel(true);
		}
		//
		uiTransform.setToIdentity();
		image = null;
		//
		final String fileName = doc.getPage().get(idx).getDescription().getSource().getFile();
		currentWorker = new ImageLoadWorker(new File(fileName));
		currentWorker.execute();
		//
		repaint();
	}

	/**
	 * The Class ZoomableMouseHandler.
	 */
	private class ZoomableMouseHandler extends MouseAdapter {

		/** The min scale. */
		private final double minScale = 1;

		/** The max scale. */
		private final double maxScale = 10;

		/** The blocked. */
		private final boolean blocked = true;

		/** The last point. */
		private final Point lastPoint = new Point();

		/**
		 * Mouse wheel moved.
		 *
		 * @param e the e
		 */
		/*
		 * (non-Javadoc)
		 *
		 * @see
		 * java.awt.event.MouseAdapter#mouseWheelMoved(java.awt.event.MouseWheelEvent)
		 */
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// transform into panel coordinate system
			final Point point = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), ZoomableImagePanel.this);
			//
			double scaleDelta = (1.0 + (0.1 * -e.getWheelRotation()));
			final double currentScale = uiTransform.getScaleX();
			final double newScale = currentScale * scaleDelta;
			if (newScale < minScale) {
				scaleDelta = minScale / currentScale;
			}
			if (maxScale < 0 || newScale > maxScale) {
				scaleDelta = maxScale / currentScale;
			}

			try {
				// transform into current image coordinate system
				imageTransform.inverseTransform(point, point);
			} catch (final NoninvertibleTransformException ex) {
			}
			// scale about transformed image point
			AffineUtils.scaleAboutPoint(scaleDelta, scaleDelta, point.getX(), point.getY(), uiTransform);
			//
			ZoomableImagePanel.this.repaint();
			// consume event
			if (blocked) {
				e.consume();
			}
		}

		/**
		 * Mouse dragged.
		 *
		 * @param e the e
		 */
		@Override
		public void mouseDragged(MouseEvent e) {
			final Point point = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), ZoomableImagePanel.this);
			try {
				// transform into image coordinate system
				final Point tmp = new Point(point);

				imageTransform.inverseTransform(tmp, tmp);
				imageTransform.inverseTransform(lastPoint, lastPoint);
				// drag
				final int dx = tmp.x - lastPoint.x;
				final int dy = tmp.y - lastPoint.y;
				uiTransform.translate(dx, dy);
				ZoomableImagePanel.this.repaint();
				//
				lastPoint.setLocation(point);
				//
				if (blocked) {
					e.consume();
				}
			} catch (final NoninvertibleTransformException ex) {
				// should not happend
			}
		}

		/**
		 * Mouse pressed.
		 *
		 * @param e the e
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			final Point point = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), ZoomableImagePanel.this);
			lastPoint.setLocation(point);
		}
	}

	/**
	 * The Class ImageLoadWorker.
	 */
	private class ImageLoadWorker extends SwingWorker<BufferedImage, Void> {

		/** The file. */
		private final File file;

		/**
		 * Instantiates a new image load worker.
		 *
		 * @param file the file
		 */
		public ImageLoadWorker(File file) {
			super();
			this.file = file;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see javax.swing.SwingWorker#doInBackground()
		 */
		@Override
		protected BufferedImage doInBackground() throws Exception {
			return ImageIO.read(this.file);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see javax.swing.SwingWorker#done()
		 */
		@Override
		protected void done() {
			try {
				super.done();
				image = get();
				repaint();
			} catch (final Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}
