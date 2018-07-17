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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ddType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ddType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shape" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}shapeType" minOccurs="0"/>
 *         &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}borderGroup"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="para" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paraType" minOccurs="0"/>
 *           &lt;element name="picture" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}picType" minOccurs="0"/>
 *           &lt;element name="table" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}tableType" minOccurs="0"/>
 *           &lt;element name="frame" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}frameType" minOccurs="0"/>
 *           &lt;element name="rulerline" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}rulerType" minOccurs="0"/>
 *           &lt;element name="dd" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}ddType" minOccurs="0"/>
 *           &lt;element name="section" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}sectionType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}backgroundAppearanceDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}anchorDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}distanceFromTextDesc"/>
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
@XmlType(name = "ddType", propOrder = {
    "shape",
    "leftBorder",
    "topBorder",
    "rightBorder",
    "bottomBorder",
    "paraOrPictureOrTable"
})
public class DdType {

    protected ShapeType shape;
    protected LineType leftBorder;
    protected LineType topBorder;
    protected LineType rightBorder;
    protected LineType bottomBorder;
    @XmlElements({
        @XmlElement(name = "para", type = ParaType.class),
        @XmlElement(name = "picture", type = PicType.class),
        @XmlElement(name = "table", type = TableType.class),
        @XmlElement(name = "frame", type = FrameType.class),
        @XmlElement(name = "rulerline", type = RulerType.class),
        @XmlElement(name = "dd", type = DdType.class),
        @XmlElement(name = "section", type = SectionType.class)
    })
    protected List<Object> paraOrPictureOrTable;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "textDirection")
    protected TextDirectionType textDirection;
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
    @XmlAttribute(name = "anchorTo")
    protected AnchorToType anchorTo;
    @XmlAttribute(name = "refTo")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object refTo;
    @XmlAttribute(name = "leftDistance")
    protected BigInteger leftDistance;
    @XmlAttribute(name = "topDistance")
    protected BigInteger topDistance;
    @XmlAttribute(name = "rightDistance")
    protected BigInteger rightDistance;
    @XmlAttribute(name = "bottomDistance")
    protected BigInteger bottomDistance;
    @XmlAttribute(name = "l", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "t", required = true)
    protected BigInteger t;
    @XmlAttribute(name = "r", required = true)
    protected BigInteger r;
    @XmlAttribute(name = "b", required = true)
    protected BigInteger b;

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShapeType }
     *     
     */
    public ShapeType getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeType }
     *     
     */
    public void setShape(ShapeType value) {
        this.shape = value;
    }

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
     * Gets the value of the paraOrPictureOrTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraOrPictureOrTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaOrPictureOrTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParaType }
     * {@link PicType }
     * {@link TableType }
     * {@link FrameType }
     * {@link RulerType }
     * {@link DdType }
     * {@link SectionType }
     * 
     * 
     */
    public List<Object> getParaOrPictureOrTable() {
        if (paraOrPictureOrTable == null) {
            paraOrPictureOrTable = new ArrayList<Object>();
        }
        return this.paraOrPictureOrTable;
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
     * Ruft den Wert der anchorTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnchorToType }
     *     
     */
    public AnchorToType getAnchorTo() {
        return anchorTo;
    }

    /**
     * Legt den Wert der anchorTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorToType }
     *     
     */
    public void setAnchorTo(AnchorToType value) {
        this.anchorTo = value;
    }

    /**
     * Ruft den Wert der refTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefTo() {
        return refTo;
    }

    /**
     * Legt den Wert der refTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefTo(Object value) {
        this.refTo = value;
    }

    /**
     * Ruft den Wert der leftDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeftDistance() {
        return leftDistance;
    }

    /**
     * Legt den Wert der leftDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeftDistance(BigInteger value) {
        this.leftDistance = value;
    }

    /**
     * Ruft den Wert der topDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTopDistance() {
        return topDistance;
    }

    /**
     * Legt den Wert der topDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTopDistance(BigInteger value) {
        this.topDistance = value;
    }

    /**
     * Ruft den Wert der rightDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRightDistance() {
        return rightDistance;
    }

    /**
     * Legt den Wert der rightDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRightDistance(BigInteger value) {
        this.rightDistance = value;
    }

    /**
     * Ruft den Wert der bottomDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBottomDistance() {
        return bottomDistance;
    }

    /**
     * Legt den Wert der bottomDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBottomDistance(BigInteger value) {
        this.bottomDistance = value;
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
