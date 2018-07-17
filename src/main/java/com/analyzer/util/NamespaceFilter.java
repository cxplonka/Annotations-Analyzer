package com.analyzer.util;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * The Class NamespaceFilter.
 * 
 * https://stackoverflow.com/questions/277502/jaxb-how-to-ignore-namespace-during-unmarshalling-xml-document
 * 
 */
public class NamespaceFilter extends XMLFilterImpl {

	/** The used namespace uri. */
	private String usedNamespaceUri;

	/** The add namespace. */
	private final boolean addNamespace;

	/** The added namespace. */
	// State variable
	private boolean addedNamespace = false;

	/**
	 * Instantiates a new namespace filter.
	 *
	 * @param namespaceUri the namespace uri
	 * @param addNamespace the add namespace
	 */
	public NamespaceFilter(String namespaceUri, boolean addNamespace) {
		super();

		if (addNamespace)
			this.usedNamespaceUri = namespaceUri;
		else
			this.usedNamespaceUri = "";
		this.addNamespace = addNamespace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.XMLFilterImpl#startDocument()
	 */
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		if (addNamespace) {
			startControlledPrefixMapping();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.XMLFilterImpl#startElement(java.lang.String,
	 * java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {

		super.startElement(this.usedNamespaceUri, arg1, arg2, arg3);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.XMLFilterImpl#endElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {

		super.endElement(this.usedNamespaceUri, arg1, arg2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.XMLFilterImpl#startPrefixMapping(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void startPrefixMapping(String prefix, String url) throws SAXException {

		if (addNamespace) {
			this.startControlledPrefixMapping();
		} else {
			// Remove the namespace, i.e. don´t call startPrefixMapping for parent!
		}

	}

	/**
	 * Start controlled prefix mapping.
	 *
	 * @throws SAXException the SAX exception
	 */
	private void startControlledPrefixMapping() throws SAXException {

		if (this.addNamespace && !this.addedNamespace) {
			// We should add namespace since it is set and has not yet been done.
			super.startPrefixMapping("", this.usedNamespaceUri);

			// Make sure we dont do it twice
			this.addedNamespace = true;
		}
	}

}