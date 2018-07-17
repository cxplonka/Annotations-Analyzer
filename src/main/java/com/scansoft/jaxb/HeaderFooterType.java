//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für header_footerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="header_footerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="section" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}sectionType"/>
 *           &lt;element name="dd" type="{https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd}ddType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "header_footerType", propOrder = {
    "sectionOrDd"
})
public class HeaderFooterType {

    @XmlElements({
        @XmlElement(name = "section", type = SectionType.class),
        @XmlElement(name = "dd", type = DdType.class)
    })
    protected List<Object> sectionOrDd;

    /**
     * Gets the value of the sectionOrDd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionOrDd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionOrDd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionType }
     * {@link DdType }
     * 
     * 
     */
    public List<Object> getSectionOrDd() {
        if (sectionOrDd == null) {
            sectionOrDd = new ArrayList<Object>();
        }
        return this.sectionOrDd;
    }

}
