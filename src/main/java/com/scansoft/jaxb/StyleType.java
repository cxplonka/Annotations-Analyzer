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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für styleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="styleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paraAttribGroup"/>
 *       &lt;attGroup ref="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}paraDesc"/>
 *       &lt;attribute name="styleID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "styleType", propOrder = {
    "leftBorder",
    "topBorder",
    "rightBorder",
    "bottomBorder",
    "dropCap",
    "bullet",
    "tabs"
})
public class StyleType {

    protected LineType leftBorder;
    protected LineType topBorder;
    protected LineType rightBorder;
    protected LineType bottomBorder;
    protected DropCapType dropCap;
    protected BulletType bullet;
    protected List<TabType> tabs;
    @XmlAttribute(name = "styleID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String styleID;
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
     * Ruft den Wert der dropCap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DropCapType }
     *     
     */
    public DropCapType getDropCap() {
        return dropCap;
    }

    /**
     * Legt den Wert der dropCap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DropCapType }
     *     
     */
    public void setDropCap(DropCapType value) {
        this.dropCap = value;
    }

    /**
     * Ruft den Wert der bullet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BulletType }
     *     
     */
    public BulletType getBullet() {
        return bullet;
    }

    /**
     * Legt den Wert der bullet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletType }
     *     
     */
    public void setBullet(BulletType value) {
        this.bullet = value;
    }

    /**
     * Gets the value of the tabs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabType }
     * 
     * 
     */
    public List<TabType> getTabs() {
        if (tabs == null) {
            tabs = new ArrayList<TabType>();
        }
        return this.tabs;
    }

    /**
     * Ruft den Wert der styleID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleID() {
        return styleID;
    }

    /**
     * Legt den Wert der styleID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleID(String value) {
        this.styleID = value;
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

}
