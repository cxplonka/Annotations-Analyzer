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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tableType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}borderGroup"/>
 *         &lt;element name="gridTable" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}gridTableType"/>
 *         &lt;element name="cell" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}cellType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paralikeDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}rcDesc"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableType", propOrder = {
    "leftBorder",
    "topBorder",
    "rightBorder",
    "bottomBorder",
    "gridTable",
    "cell"
})
public class TableType {

    protected LineType leftBorder;
    protected LineType topBorder;
    protected LineType rightBorder;
    protected LineType bottomBorder;
    @XmlElement(required = true)
    protected GridTableType gridTable;
    protected List<CellType> cell;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "backColor")
    protected String backColor;
    @XmlAttribute(name = "alignment")
    protected AlignmentType alignment;
    @XmlAttribute(name = "li")
    protected BigInteger li;
    @XmlAttribute(name = "ri")
    protected BigInteger ri;
    @XmlAttribute(name = "spaceBefore")
    protected BigInteger spaceBefore;
    @XmlAttribute(name = "spaceAfter")
    protected BigInteger spaceAfter;
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
     * Ruft den Wert der gridTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GridTableType }
     *     
     */
    public GridTableType getGridTable() {
        return gridTable;
    }

    /**
     * Legt den Wert der gridTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GridTableType }
     *     
     */
    public void setGridTable(GridTableType value) {
        this.gridTable = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellType }
     * 
     * 
     */
    public List<CellType> getCell() {
        if (cell == null) {
            cell = new ArrayList<CellType>();
        }
        return this.cell;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Ruft den Wert der li-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLi() {
        return li;
    }

    /**
     * Legt den Wert der li-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLi(BigInteger value) {
        this.li = value;
    }

    /**
     * Ruft den Wert der ri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRi() {
        return ri;
    }

    /**
     * Legt den Wert der ri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRi(BigInteger value) {
        this.ri = value;
    }

    /**
     * Ruft den Wert der spaceBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpaceBefore() {
        return spaceBefore;
    }

    /**
     * Legt den Wert der spaceBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpaceBefore(BigInteger value) {
        this.spaceBefore = value;
    }

    /**
     * Ruft den Wert der spaceAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpaceAfter() {
        return spaceAfter;
    }

    /**
     * Legt den Wert der spaceAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpaceAfter(BigInteger value) {
        this.spaceAfter = value;
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
