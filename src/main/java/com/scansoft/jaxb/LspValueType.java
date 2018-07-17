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
 * <p>Java-Klasse für lspValueType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="lspValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="oneAndHalf"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="exactly"/>
 *     &lt;enumeration value="atLeast"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lspValueType")
@XmlEnum
public enum LspValueType {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("oneAndHalf")
    ONE_AND_HALF("oneAndHalf"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("exactly")
    EXACTLY("exactly"),
    @XmlEnumValue("atLeast")
    AT_LEAST("atLeast");
    private final String value;

    LspValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LspValueType fromValue(String v) {
        for (LspValueType c: LspValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
