//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für subsuperscriptType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="subsuperscriptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="subscript"/>
 *     &lt;enumeration value="superscript"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "subsuperscriptType")
@XmlEnum
public enum SubsuperscriptType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("subscript")
    SUBSCRIPT("subscript"),
    @XmlEnumValue("superscript")
    SUPERSCRIPT("superscript");
    private final String value;

    SubsuperscriptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubsuperscriptType fromValue(String v) {
        for (SubsuperscriptType c: SubsuperscriptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
