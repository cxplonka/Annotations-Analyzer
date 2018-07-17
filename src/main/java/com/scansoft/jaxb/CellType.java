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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für cellType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="cellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}borderGroup"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="para" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paraType" minOccurs="0"/>
 *           &lt;element name="picture" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}picType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}innerMarginDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}backgroundAppearanceDesc"/>
 *       &lt;attribute name="gridColFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gridColTill" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gridRowFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gridRowTill" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="alignment" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}alignmentType" />
 *       &lt;attribute name="verticalAlignment" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}verticalAlignmentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cellType", propOrder = {
    "leftBorder",
    "topBorder",
    "rightBorder",
    "bottomBorder",
    "paraOrPicture"
})
public class CellType {

    protected LineType leftBorder;
    protected LineType topBorder;
    protected LineType rightBorder;
    protected LineType bottomBorder;
    @XmlElements({
        @XmlElement(name = "para", type = ParaType.class),
        @XmlElement(name = "picture", type = PicType.class)
    })
    protected List<Object> paraOrPicture;
    @XmlAttribute(name = "gridColFrom", required = true)
    protected int gridColFrom;
    @XmlAttribute(name = "gridColTill", required = true)
    protected int gridColTill;
    @XmlAttribute(name = "gridRowFrom", required = true)
    protected int gridRowFrom;
    @XmlAttribute(name = "gridRowTill", required = true)
    protected int gridRowTill;
    @XmlAttribute(name = "alignment")
    protected AlignmentType alignment;
    @XmlAttribute(name = "verticalAlignment")
    protected VerticalAlignmentType verticalAlignment;
    @XmlAttribute(name = "marginLeft")
    protected BigInteger marginLeft;
    @XmlAttribute(name = "marginTop")
    protected BigInteger marginTop;
    @XmlAttribute(name = "marginRight")
    protected BigInteger marginRight;
    @XmlAttribute(name = "marginBottom")
    protected BigInteger marginBottom;
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
     * Gets the value of the paraOrPicture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraOrPicture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaOrPicture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParaType }
     * {@link PicType }
     * 
     * 
     */
    public List<Object> getParaOrPicture() {
        if (paraOrPicture == null) {
            paraOrPicture = new ArrayList<Object>();
        }
        return this.paraOrPicture;
    }

    /**
     * Ruft den Wert der gridColFrom-Eigenschaft ab.
     * 
     */
    public int getGridColFrom() {
        return gridColFrom;
    }

    /**
     * Legt den Wert der gridColFrom-Eigenschaft fest.
     * 
     */
    public void setGridColFrom(int value) {
        this.gridColFrom = value;
    }

    /**
     * Ruft den Wert der gridColTill-Eigenschaft ab.
     * 
     */
    public int getGridColTill() {
        return gridColTill;
    }

    /**
     * Legt den Wert der gridColTill-Eigenschaft fest.
     * 
     */
    public void setGridColTill(int value) {
        this.gridColTill = value;
    }

    /**
     * Ruft den Wert der gridRowFrom-Eigenschaft ab.
     * 
     */
    public int getGridRowFrom() {
        return gridRowFrom;
    }

    /**
     * Legt den Wert der gridRowFrom-Eigenschaft fest.
     * 
     */
    public void setGridRowFrom(int value) {
        this.gridRowFrom = value;
    }

    /**
     * Ruft den Wert der gridRowTill-Eigenschaft ab.
     * 
     */
    public int getGridRowTill() {
        return gridRowTill;
    }

    /**
     * Legt den Wert der gridRowTill-Eigenschaft fest.
     * 
     */
    public void setGridRowTill(int value) {
        this.gridRowTill = value;
    }

    /**
     * Ruft den Wert der alignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlignmentType }
     *     
     */
    public AlignmentType getAlignment() {
        return alignment;
    }

    /**
     * Legt den Wert der alignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentType }
     *     
     */
    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }

    /**
     * Ruft den Wert der verticalAlignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VerticalAlignmentType }
     *     
     */
    public VerticalAlignmentType getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * Legt den Wert der verticalAlignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalAlignmentType }
     *     
     */
    public void setVerticalAlignment(VerticalAlignmentType value) {
        this.verticalAlignment = value;
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

}
