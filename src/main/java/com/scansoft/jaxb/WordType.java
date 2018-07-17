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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für wordType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="wordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ch" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}charType"/>
 *           &lt;element name="alt" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}altType"/>
 *           &lt;element name="run" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}runType"/>
 *           &lt;element name="link" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}linkType"/>
 *           &lt;element name="fieldCode" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}fieldCodeType"/>
 *           &lt;element name="formGroup" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}formGroupType"/>
 *           &lt;element name="inputLine" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}inputLineType"/>
 *           &lt;element name="checkBox" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}checkBoxType"/>
 *           &lt;element name="circleText" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}circleTextType"/>
 *           &lt;element name="nl" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}nlType"/>
 *           &lt;element name="tab" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}tabPositionType"/>
 *           &lt;element name="space" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}spaceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}fontDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}rcDesc"/>
 *       &lt;attribute name="continuityType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wordType", propOrder = {
    "content"
})
public class WordType {

    @XmlElementRefs({
        @XmlElementRef(name = "tab", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fieldCode", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "circleText", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "space", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formGroup", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nl", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alt", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inputLine", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ch", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "run", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "checkBox", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "continuityType")
    @XmlSchemaType(name = "anySimpleType")
    protected String continuityType;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "italic")
    protected Boolean italic;
    @XmlAttribute(name = "underlined")
    protected UnderlinedType underlined;
    @XmlAttribute(name = "strikethrough")
    protected Boolean strikethrough;
    @XmlAttribute(name = "subsuperscript")
    protected SubsuperscriptType subsuperscript;
    @XmlAttribute(name = "fontSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long fontSize;
    @XmlAttribute(name = "fontFace")
    protected String fontFace;
    @XmlAttribute(name = "fontFamily")
    protected FontFamilyType fontFamily;
    @XmlAttribute(name = "fontPitch")
    protected FontPitchType fontPitch;
    @XmlAttribute(name = "spacing")
    protected BigInteger spacing;
    @XmlAttribute(name = "scale")
    protected Integer scale;
    @XmlAttribute(name = "foreColor")
    protected String foreColor;
    @XmlAttribute(name = "l", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "t", required = true)
    protected BigInteger t;
    @XmlAttribute(name = "r", required = true)
    protected BigInteger r;
    @XmlAttribute(name = "b", required = true)
    protected BigInteger b;

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
     * {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link FieldCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link NlType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltType }{@code >}
     * {@link JAXBElement }{@code <}{@link InputLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link CharType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}
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
     * Ruft den Wert der continuityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinuityType() {
        return continuityType;
    }

    /**
     * Legt den Wert der continuityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinuityType(String value) {
        this.continuityType = value;
    }

    /**
     * Ruft den Wert der bold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**
     * Legt den Wert der bold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Ruft den Wert der italic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * Legt den Wert der italic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Ruft den Wert der underlined-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnderlinedType }
     *     
     */
    public UnderlinedType getUnderlined() {
        return underlined;
    }

    /**
     * Legt den Wert der underlined-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlinedType }
     *     
     */
    public void setUnderlined(UnderlinedType value) {
        this.underlined = value;
    }

    /**
     * Ruft den Wert der strikethrough-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrikethrough() {
        if (strikethrough == null) {
            return false;
        } else {
            return strikethrough;
        }
    }

    /**
     * Legt den Wert der strikethrough-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrikethrough(Boolean value) {
        this.strikethrough = value;
    }

    /**
     * Ruft den Wert der subsuperscript-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubsuperscriptType }
     *     
     */
    public SubsuperscriptType getSubsuperscript() {
        return subsuperscript;
    }

    /**
     * Legt den Wert der subsuperscript-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsuperscriptType }
     *     
     */
    public void setSubsuperscript(SubsuperscriptType value) {
        this.subsuperscript = value;
    }

    /**
     * Ruft den Wert der fontSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getFontSize() {
        if (fontSize == null) {
            return  10L;
        } else {
            return fontSize;
        }
    }

    /**
     * Legt den Wert der fontSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFontSize(Long value) {
        this.fontSize = value;
    }

    /**
     * Ruft den Wert der fontFace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFace() {
        return fontFace;
    }

    /**
     * Legt den Wert der fontFace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFace(String value) {
        this.fontFace = value;
    }

    /**
     * Ruft den Wert der fontFamily-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontFamilyType }
     *     
     */
    public FontFamilyType getFontFamily() {
        return fontFamily;
    }

    /**
     * Legt den Wert der fontFamily-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFamilyType }
     *     
     */
    public void setFontFamily(FontFamilyType value) {
        this.fontFamily = value;
    }

    /**
     * Ruft den Wert der fontPitch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontPitchType }
     *     
     */
    public FontPitchType getFontPitch() {
        return fontPitch;
    }

    /**
     * Legt den Wert der fontPitch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontPitchType }
     *     
     */
    public void setFontPitch(FontPitchType value) {
        this.fontPitch = value;
    }

    /**
     * Ruft den Wert der spacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpacing() {
        return spacing;
    }

    /**
     * Legt den Wert der spacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpacing(BigInteger value) {
        this.spacing = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Ruft den Wert der foreColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeColor() {
        return foreColor;
    }

    /**
     * Legt den Wert der foreColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeColor(String value) {
        this.foreColor = value;
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
