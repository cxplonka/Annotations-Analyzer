package com.analyzer.swing;

import java.awt.BorderLayout;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.analyzer.swing.FileDrop.Listener;
import com.analyzer.util.OmniPageXMLParser;
import com.analyzer.util.VisionAPI;

/**
 * The Class AnalyzerJFrame.
 */
public class AnalyzerJFrame extends JFrame {

    /** The drop panel. */
    private ZoomableImagePanel dropPanel;

    /**
     * Instantiates a new analyzer J frame.
     */
    public AnalyzerJFrame() {
        super();

        setTitle("Analyzer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        initOwnComponents();
    }

    /**
     * Inits the own components.
     */
    private void initOwnComponents() {
        new FileDrop(this.dropPanel = new ZoomableImagePanel(), new XMLAndImageDropHandler());
        add(dropPanel, BorderLayout.CENTER);
    }

    public static void main(String[] arg) {
        System.out.println(Arrays.toString(ImageIO.getReaderFileSuffixes()));
    }

    /**
     * The Class XMLAndImageDropHandler.
     */
    private class XMLAndImageDropHandler implements Listener {

        private final Set<String> extensions;

        public XMLAndImageDropHandler() {
            extensions = new HashSet<>(Arrays.asList(ImageIO.getReaderFileSuffixes()));
            extensions.add("xml");
        }

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

            final File file = files[0];
            final String ext = getFileExtension(file).toLowerCase();
            if (!extensions.contains(ext)) {
                throw new IllegalArgumentException(
                        String.format("Die Dateierweiterung wird nicht unterstüzt: %s", file.getName()));
            }

            try {
                switch (ext) {
                    case "xml":
                        dropPanel.setDocumentModel(OmniPageXMLParser.readXMLModel(file));
                        break;
                    default:
                        dropPanel.setImageAnnotations(VisionAPI.recognizeTextInImage(file), file);
                        break;
                }
            } catch (final Exception e) {
                throw new RuntimeException("Datei konnte nicht geladen werden!", e);
            }
        }

        /**
         * Gets the file extension.
         *
         * @param file the file
         * @return the file extension
         */
        private String getFileExtension(File file) {
            String extension = "";
            try {
                if (file != null && file.exists()) {
                    final String name = file.getName();
                    extension = name.substring(name.lastIndexOf(".") + 1);
                }
            } catch (final Exception e) {
            }
            return extension;
        }
    }
}
