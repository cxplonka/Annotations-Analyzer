//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für pageDescType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="pageDescType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}sourceType"/>
 *         &lt;element name="theoreticalPage" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}theoreticalPageType" minOccurs="0"/>
 *         &lt;element name="language" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}languageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="backColor" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}colorType" default="defaultForeground" />
 *       &lt;attribute name="textDirection" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}textDirectionType" default="left2right" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageDescType", propOrder = {
    "source",
    "theoreticalPage",
    "language"
})
public class PageDescType {

    @XmlElement(required = true)
    protected SourceType source;
    protected TheoreticalPageType theoreticalPage;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> language;
    @XmlAttribute(name = "backColor")
    protected String backColor;
    @XmlAttribute(name = "textDirection")
    protected TextDirectionType textDirection;

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der theoreticalPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TheoreticalPageType }
     *     
     */
    public TheoreticalPageType getTheoreticalPage() {
        return theoreticalPage;
    }

    /**
     * Legt den Wert der theoreticalPage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TheoreticalPageType }
     *     
     */
    public void setTheoreticalPage(TheoreticalPageType value) {
        this.theoreticalPage = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

    /**
     * Ruft den Wert der backColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackColor() {
        if (backColor == null) {
            return "defaultForeground";
        } else {
            return backColor;
        }
    }

    /**
     * Legt den Wert der backColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackColor(String value) {
        this.backColor = value;
    }

    /**
     * Ruft den Wert der textDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextDirectionType }
     *     
     */
    public TextDirectionType getTextDirection() {
        if (textDirection == null) {
            return TextDirectionType.LEFT_2_RIGHT;
        } else {
            return textDirection;
        }
    }

    /**
     * Legt den Wert der textDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDirectionType }
     *     
     */
    public void setTextDirection(TextDirectionType value) {
        this.textDirection = value;
    }

}
