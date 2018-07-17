//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für fillGraphicsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fillGraphicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}borderGroup"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}backgroundAppearanceDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}rcDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}inputFormFieldDesc"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fillGraphicsType", propOrder = {
    "content"
})
public class FillGraphicsType {

    @XmlElementRefs({
        @XmlElementRef(name = "leftBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bottomBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rightBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "topBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "backColor")
    protected String backColor;
    @XmlAttribute(name = "shadowWidth")
    protected BigInteger shadowWidth;
    @XmlAttribute(name = "shadowWhere")
    protected CornerId shadowWhere;
    @XmlAttribute(name = "topLeftCornerRadius")
    protected BigInteger topLeftCornerRadius;
    @XmlAttribute(name = "topRightCornerRadius")
    protected BigInteger topRightCornerRadius;
    @XmlAttribute(name = "bottomLeftCornerRadius")
    protected BigInteger bottomLeftCornerRadius;
    @XmlAttribute(name = "bottomRightCornerRadius")
    protected BigInteger bottomRightCornerRadius;
    @XmlAttribute(name = "patternType")
    protected String patternType;
    @XmlAttribute(name = "patternColor")
    protected CornerId patternColor;
    @XmlAttribute(name = "l", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "t", required = true)
    protected BigInteger t;
    @XmlAttribute(name = "r", required = true)
    protected BigInteger r;
    @XmlAttribute(name = "b", required = true)
    protected BigInteger b;
    @XmlAttribute(name = "inputDataName")
    protected String inputDataName;
    @XmlAttribute(name = "formId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String formId;
    @XmlAttribute(name = "nextTab")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object nextTab;
    @XmlAttribute(name = "prevTab")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object prevTab;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
        return backColor;
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
     * Ruft den Wert der shadowWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShadowWidth() {
        return shadowWidth;
    }

    /**
     * Legt den Wert der shadowWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShadowWidth(BigInteger value) {
        this.shadowWidth = value;
    }

    /**
     * Ruft den Wert der shadowWhere-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CornerId }
     *     
     */
    public CornerId getShadowWhere() {
        return shadowWhere;
    }

    /**
     * Legt den Wert der shadowWhere-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CornerId }
     *     
     */
    public void setShadowWhere(CornerId value) {
        this.shadowWhere = value;
    }

    /**
     * Ruft den Wert der topLeftCornerRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTopLeftCornerRadius() {
        if (topLeftCornerRadius == null) {
            return new BigInteger("0");
        } else {
            return topLeftCornerRadius;
        }
    }

    /**
     * Legt den Wert der topLeftCornerRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTopLeftCornerRadius(BigInteger value) {
        this.topLeftCornerRadius = value;
    }

    /**
     * Ruft den Wert der topRightCornerRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTopRightCornerRadius() {
        if (topRightCornerRadius == null) {
            return new BigInteger("0");
        } else {
            return topRightCornerRadius;
        }
    }

    /**
     * Legt den Wert der topRightCornerRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTopRightCornerRadius(BigInteger value) {
        this.topRightCornerRadius = value;
    }

    /**
     * Ruft den Wert der bottomLeftCornerRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBottomLeftCornerRadius() {
        if (bottomLeftCornerRadius == null) {
            return new BigInteger("0");
        } else {
            return bottomLeftCornerRadius;
        }
    }

    /**
     * Legt den Wert der bottomLeftCornerRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBottomLeftCornerRadius(BigInteger value) {
        this.bottomLeftCornerRadius = value;
    }

    /**
     * Ruft den Wert der bottomRightCornerRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBottomRightCornerRadius() {
        if (bottomRightCornerRadius == null) {
            return new BigInteger("0");
        } else {
            return bottomRightCornerRadius;
        }
    }

    /**
     * Legt den Wert der bottomRightCornerRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBottomRightCornerRadius(BigInteger value) {
        this.bottomRightCornerRadius = value;
    }

    /**
     * Ruft den Wert der patternType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternType() {
        return patternType;
    }

    /**
     * Legt den Wert der patternType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternType(String value) {
        this.patternType = value;
    }

    /**
     * Ruft den Wert der patternColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CornerId }
     *     
     */
    public CornerId getPatternColor() {
        return patternColor;
    }

    /**
     * Legt den Wert der patternColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CornerId }
     *     
     */
    public void setPatternColor(CornerId value) {
        this.patternColor = value;
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

    /**
     * Ruft den Wert der inputDataName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDataName() {
        return inputDataName;
    }

    /**
     * Legt den Wert der inputDataName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDataName(String value) {
        this.inputDataName = value;
    }

    /**
     * Ruft den Wert der formId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Legt den Wert der formId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * Ruft den Wert der nextTab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNextTab() {
        return nextTab;
    }

    /**
     * Legt den Wert der nextTab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNextTab(Object value) {
        this.nextTab = value;
    }

    /**
     * Ruft den Wert der prevTab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrevTab() {
        return prevTab;
    }

    /**
     * Legt den Wert der prevTab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrevTab(Object value) {
        this.prevTab = value;
    }

}
