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
 * <p>Java-Klasse für paraType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="paraType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paraAttribGroup"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ln" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}lnType"/>
 *           &lt;element name="ch" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}charType"/>
 *           &lt;element name="alt" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}altType"/>
 *           &lt;element name="run" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}runType"/>
 *           &lt;element name="wd" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}wordType"/>
 *           &lt;element name="nl" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}nlType"/>
 *           &lt;element name="tab" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}tabPositionType"/>
 *           &lt;element name="space" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}spaceType"/>
 *           &lt;element name="link" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}linkType"/>
 *           &lt;element name="fieldCode" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}fieldCodeType"/>
 *           &lt;element name="formGroup" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}formGroupType"/>
 *           &lt;element name="inputLine" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}inputLineType"/>
 *           &lt;element name="checkBox" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}checkBoxType"/>
 *           &lt;element name="circleText" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}circleTextType"/>
 *           &lt;element name="fillGraphics" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}fillGraphicsType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paraDesc"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}rcDesc"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="styleRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="linkTo" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paraType", propOrder = {
    "content"
})
public class ParaType {

    @XmlElementRefs({
        @XmlElementRef(name = "checkBox", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "run", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dropCap", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wd", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bottomBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ln", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formGroup", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "topBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bullet", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fieldCode", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "leftBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tabs", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "circleText", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rightBorder", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alt", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ch", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inputLine", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fillGraphics", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tab", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nl", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "space", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "styleRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object styleRef;
    @XmlAttribute(name = "linkTo")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkTo;
    @XmlAttribute(name = "fli")
    protected BigInteger fli;
    @XmlAttribute(name = "lsp")
    protected LspValueType lsp;
    @XmlAttribute(name = "lspExact")
    protected BigInteger lspExact;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
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
     * {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunType }{@code >}
     * {@link JAXBElement }{@code <}{@link DropCapType }{@code >}
     * {@link JAXBElement }{@code <}{@link WordType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link LnType }{@code >}
     * {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link BulletType }{@code >}
     * {@link JAXBElement }{@code <}{@link FieldCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link TabType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltType }{@code >}
     * {@link JAXBElement }{@code <}{@link CharType }{@code >}
     * {@link JAXBElement }{@code <}{@link InputLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillGraphicsType }{@code >}
     * {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link NlType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceType }{@code >}
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
     * Ruft den Wert der styleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStyleRef() {
        return styleRef;
    }

    /**
     * Legt den Wert der styleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStyleRef(Object value) {
        this.styleRef = value;
    }

    /**
     * Ruft den Wert der linkTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkTo() {
        return linkTo;
    }

    /**
     * Legt den Wert der linkTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkTo(Object value) {
        this.linkTo = value;
    }

    /**
     * Ruft den Wert der fli-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFli() {
        return fli;
    }

    /**
     * Legt den Wert der fli-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFli(BigInteger value) {
        this.fli = value;
    }

    /**
     * Ruft den Wert der lsp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LspValueType }
     *     
     */
    public LspValueType getLsp() {
        return lsp;
    }

    /**
     * Legt den Wert der lsp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LspValueType }
     *     
     */
    public void setLsp(LspValueType value) {
        this.lsp = value;
    }

    /**
     * Ruft den Wert der lspExact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLspExact() {
        return lspExact;
    }

    /**
     * Legt den Wert der lspExact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLspExact(BigInteger value) {
        this.lspExact = value;
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
