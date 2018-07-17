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
 * <p>Java-Klasse für continuityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="continuityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contToNext"/>
 *     &lt;enumeration value="contFromPrev"/>
 *     &lt;enumeration value="contFromPrevToNext"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "continuityType")
@XmlEnum
public enum ContinuityType {

    @XmlEnumValue("contToNext")
    CONT_TO_NEXT("contToNext"),
    @XmlEnumValue("contFromPrev")
    CONT_FROM_PREV("contFromPrev"),
    @XmlEnumValue("contFromPrevToNext")
    CONT_FROM_PREV_TO_NEXT("contFromPrevToNext");
    private final String value;

    ContinuityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuityType fromValue(String v) {
        for (ContinuityType c: ContinuityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
