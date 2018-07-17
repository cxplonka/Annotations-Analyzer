//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für theoreticalPageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="theoreticalPageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="size" use="required" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}pageSizeType" />
 *       &lt;attribute name="marginLeft" use="required" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="marginTop" use="required" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="marginRight" use="required" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="marginBottom" use="required" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="offsetX" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="offsetY" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="width" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="height" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "theoreticalPageType")
public class TheoreticalPageType {

    @XmlAttribute(name = "size", required = true)
    protected String size;
    @XmlAttribute(name = "marginLeft", required = true)
    protected BigInteger marginLeft;
    @XmlAttribute(name = "marginTop", required = true)
    protected BigInteger marginTop;
    @XmlAttribute(name = "marginRight", required = true)
    protected BigInteger marginRight;
    @XmlAttribute(name = "marginBottom", required = true)
    protected BigInteger marginBottom;
    @XmlAttribute(name = "offsetX")
    protected BigInteger offsetX;
    @XmlAttribute(name = "offsetY")
    protected BigInteger offsetY;
    @XmlAttribute(name = "width")
    protected BigInteger width;
    @XmlAttribute(name = "height")
    protected BigInteger height;

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der marginLeft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarginLeft() {
        return marginLeft;
    }

    /**
     * Legt den Wert der marginLeft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarginLeft(BigInteger value) {
        this.marginLeft = value;
    }

    /**
     * Ruft den Wert der marginTop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarginTop() {
        return marginTop;
    }

    /**
     * Legt den Wert der marginTop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarginTop(BigInteger value) {
        this.marginTop = value;
    }

    /**
     * Ruft den Wert der marginRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarginRight() {
        return marginRight;
    }

    /**
     * Legt den Wert der marginRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarginRight(BigInteger value) {
        this.marginRight = value;
    }

    /**
     * Ruft den Wert der marginBottom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarginBottom() {
        return marginBottom;
    }

    /**
     * Legt den Wert der marginBottom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarginBottom(BigInteger value) {
        this.marginBottom = value;
    }

    /**
     * Ruft den Wert der offsetX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetX() {
        return offsetX;
    }

    /**
     * Legt den Wert der offsetX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetX(BigInteger value) {
        this.offsetX = value;
    }

    /**
     * Ruft den Wert der offsetY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetY() {
        return offsetY;
    }

    /**
     * Legt den Wert der offsetY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetY(BigInteger value) {
        this.offsetY = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

}
