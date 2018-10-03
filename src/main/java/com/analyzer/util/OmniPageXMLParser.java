package com.analyzer.util;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.scansoft.jaxb.Document;

/**
 * The Class OmniPageXMLParser.
 */
@SuppressWarnings("restriction")
public class OmniPageXMLParser {

	/**
	 * Read XML model.
	 *
	 * @param file the file
	 * @return the document
	 * @throws Exception the exception
	 */
	public static Document readXMLModel(File file) throws Exception {
		final JAXBContext jc = JAXBContext.newInstance("com.scansoft.jaxb");
		final Unmarshaller unmarshaller = jc.createUnmarshaller();

		// Create an XMLReader to use with our filter
		final XMLReader reader = XMLReaderFactory.createXMLReader();

		// Create the filter (to add namespace) and set the xmlReader as its parent.
		final NamespaceFilter inFilter = new NamespaceFilter("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd",
				true);
		inFilter.setParent(reader);

		try (FileInputStream in = new FileInputStream(file)) {
			final InputSource is = new InputSource(in);
			final SAXSource source = new SAXSource(inFilter, is);

			return (Document) unmarshaller.unmarshal(source);
		}
	}
}
