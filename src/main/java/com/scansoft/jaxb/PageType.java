//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für pageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="pageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}pageDescType"/>
 *         &lt;element name="styleTable" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}styleTableType" minOccurs="0"/>
 *         &lt;element name="header" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}header_footerType" minOccurs="0"/>
 *         &lt;element name="body" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}bodyType"/>
 *         &lt;element name="footer" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}header_footerType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ocr-vers" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageType", propOrder = {
    "description",
    "styleTable",
    "header",
    "body",
    "footer"
})
public class PageType {

    @XmlElement(required = true)
    protected PageDescType description;
    protected StyleTableType styleTable;
    protected HeaderFooterType header;
    @XmlElement(required = true)
    protected BodyType body;
    protected HeaderFooterType footer;
    @XmlAttribute(name = "ocr-vers")
    protected String ocrVers;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PageDescType }
     *     
     */
    public PageDescType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PageDescType }
     *     
     */
    public void setDescription(PageDescType value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der styleTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StyleTableType }
     *     
     */
    public StyleTableType getStyleTable() {
        return styleTable;
    }

    /**
     * Legt den Wert der styleTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleTableType }
     *     
     */
    public void setStyleTable(StyleTableType value) {
        this.styleTable = value;
    }

    /**
     * Ruft den Wert der header-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeaderFooterType }
     *     
     */
    public HeaderFooterType getHeader() {
        return header;
    }

    /**
     * Legt den Wert der header-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderFooterType }
     *     
     */
    public void setHeader(HeaderFooterType value) {
        this.header = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setBody(BodyType value) {
        this.body = value;
    }

    /**
     * Ruft den Wert der footer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeaderFooterType }
     *     
     */
    public HeaderFooterType getFooter() {
        return footer;
    }

    /**
     * Legt den Wert der footer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderFooterType }
     *     
     */
    public void setFooter(HeaderFooterType value) {
        this.footer = value;
    }

    /**
     * Ruft den Wert der ocrVers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcrVers() {
        return ocrVers;
    }

    /**
     * Legt den Wert der ocrVers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcrVers(String value) {
        this.ocrVers = value;
    }

}
