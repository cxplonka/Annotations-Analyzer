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
 * <p>Java-Klasse für sourceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dpix" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dpiy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sizex" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="sizey" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceType" />
 *       &lt;attribute name="orientation" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}orientationType" default="0" />
 *       &lt;attribute name="skew" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceType")
public class SourceType {

    @XmlAttribute(name = "file")
    protected String file;
    @XmlAttribute(name = "dpix")
    protected Integer dpix;
    @XmlAttribute(name = "dpiy")
    protected Integer dpiy;
    @XmlAttribute(name = "sizex")
    protected BigInteger sizex;
    @XmlAttribute(name = "sizey")
    protected BigInteger sizey;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "skew")
    protected Integer skew;

    /**
     * Ruft den Wert der file-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Legt den Wert der file-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Ruft den Wert der dpix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDpix() {
        return dpix;
    }

    /**
     * Legt den Wert der dpix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDpix(Integer value) {
        this.dpix = value;
    }

    /**
     * Ruft den Wert der dpiy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDpiy() {
        return dpiy;
    }

    /**
     * Legt den Wert der dpiy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDpiy(Integer value) {
        this.dpiy = value;
    }

    /**
     * Ruft den Wert der sizex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizex() {
        return sizex;
    }

    /**
     * Legt den Wert der sizex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizex(BigInteger value) {
        this.sizex = value;
    }

    /**
     * Ruft den Wert der sizey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizey() {
        return sizey;
    }

    /**
     * Legt den Wert der sizey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizey(BigInteger value) {
        this.sizey = value;
    }

    /**
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "0";
        } else {
            return orientation;
        }
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Ruft den Wert der skew-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSkew() {
        if (skew == null) {
            return  0;
        } else {
            return skew;
        }
    }

    /**
     * Legt den Wert der skew-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkew(Integer value) {
        this.skew = value;
    }

}
