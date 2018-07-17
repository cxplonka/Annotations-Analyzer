package com.analyzer.swing;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;

import com.analyzer.swing.FileDrop.Listener;
import com.analyzer.util.OmniPageXMLParser;

/**
 * The Class AnalyzerJFrame.
 * 
 * @author Christian Plonka (cplonka81@gmail.com)
 */
public class AnalyzerJFrame extends JFrame {

	private ZoomableImagePanel dropPanel;

	/**
	 * Instantiates a new analyzer J frame.
	 */
	public AnalyzerJFrame() {
		super();

		setTitle("OMNIPAGE Analyzer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLayout(new BorderLayout());

		initOwnComponents();
	}

	/**
	 * Inits the own components.
	 */
	private void initOwnComponents() {
		new FileDrop(this.dropPanel = new ZoomableImagePanel(), new OmniPageXMLDropHandler());
		add(dropPanel, BorderLayout.CENTER);
	}

	/**
	 * The Class OmniPageXMLDropHandler.
	 */
	private class OmniPageXMLDropHandler implements Listener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.analyzer.swing.FileDrop.Listener#filesDropped(java.io.File[])
		 */
		@Override
		public void filesDropped(File[] files) {
			if (files.length != 1) {
				throw new IllegalArgumentException("Es wird 1 Datei erwartet.");
			}

			final File xmlFile = files[0];
			if (!xmlFile.getAbsolutePath().endsWith("xml")) {
				throw new IllegalArgumentException("Bitte eine OMNIPAGE-XML Datei bereitstellen.");
			}

			try {
				dropPanel.setDocumentModel(OmniPageXMLParser.readXMLModel(xmlFile));
			} catch (final Exception e) {
				throw new RuntimeException("Datei konnte nicht geladen werden!", e);
			}
		}
	}
}
