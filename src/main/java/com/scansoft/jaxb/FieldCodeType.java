//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für fieldCodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fieldCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ch" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}charType"/>
 *           &lt;element name="alt" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}altType"/>
 *           &lt;element name="run" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}runType"/>
 *           &lt;element name="wd" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}wordType"/>
 *           &lt;element name="nl" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}nlType"/>
 *           &lt;element name="tab" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}tabPositionType"/>
 *           &lt;element name="space" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}spaceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}fieldCodeTypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldCodeType", propOrder = {
    "content"
})
public class FieldCodeType {

    @XmlElementRefs({
        @XmlElementRef(name = "tab", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "space", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nl", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wd", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ch", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "run", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alt", namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "type", required = true)
    protected FieldCodeTypeType type;

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
     * {@link JAXBElement }{@code <}{@link SpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NlType }{@code >}
     * {@link JAXBElement }{@code <}{@link WordType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link CharType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltType }{@code >}
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldCodeTypeType }
     *     
     */
    public FieldCodeTypeType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldCodeTypeType }
     *     
     */
    public void setType(FieldCodeTypeType value) {
        this.type = value;
    }

}
