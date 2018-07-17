//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für sectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}borderGroup"/>
 *         &lt;element name="column" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}columnType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}rcDesc"/>
 *       &lt;attribute name="language" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}languageType" default="en" />
 *       &lt;attribute name="textDirection" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}textDirectionType" default="left2right" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectionType", propOrder = {
    "leftBorder",
    "topBorder",
    "rightBorder",
    "bottomBorder",
    "column"
})
public class SectionType {

    protected LineType leftBorder;
    protected LineType topBorder;
    protected LineType rightBorder;
    protected LineType bottomBorder;
    @XmlElement(required = true)
    protected List<ColumnType> column;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "textDirection")
    protected TextDirectionType textDirection;
    @XmlAttribute(name = "l", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "t", required = true)
    protected BigInteger t;
    @XmlAttribute(name = "r", required = true)
    protected BigInteger r;
    @XmlAttribute(name = "b", required = true)
    protected BigInteger b;

    /**
     * Ruft den Wert der leftBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLeftBorder() {
        return leftBorder;
    }

    /**
     * Legt den Wert der leftBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLeftBorder(LineType value) {
        this.leftBorder = value;
    }

    /**
     * Ruft den Wert der topBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getTopBorder() {
        return topBorder;
    }

    /**
     * Legt den Wert der topBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setTopBorder(LineType value) {
        this.topBorder = value;
    }

    /**
     * Ruft den Wert der rightBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getRightBorder() {
        return rightBorder;
    }

    /**
     * Legt den Wert der rightBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setRightBorder(LineType value) {
        this.rightBorder = value;
    }

    /**
     * Ruft den Wert der bottomBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getBottomBorder() {
        return bottomBorder;
    }

    /**
     * Legt den Wert der bottomBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setBottomBorder(LineType value) {
        this.bottomBorder = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnType }
     * 
     * 
     */
    public List<ColumnType> getColumn() {
        if (column == null) {
            column = new ArrayList<ColumnType>();
        }
        return this.column;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        if (language == null) {
            return "en";
        } else {
            return language;
        }
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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

    /**
     * Ruft den Wert der l-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getL() {
        return l;
    }

    /**
     * Legt den Wert der l-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setL(BigInteger value) {
        this.l = value;
    }

    /**
     * Ruft den Wert der t-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getT() {
        return t;
    }

    /**
     * Legt den Wert der t-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setT(BigInteger value) {
        this.t = value;
    }

    /**
     * Ruft den Wert der r-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getR() {
        return r;
    }

    /**
     * Legt den Wert der r-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setR(BigInteger value) {
        this.r = value;
    }

    /**
     * Ruft den Wert der b-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getB() {
        return b;
    }

    /**
     * Legt den Wert der b-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setB(BigInteger value) {
        this.b = value;
    }

}
