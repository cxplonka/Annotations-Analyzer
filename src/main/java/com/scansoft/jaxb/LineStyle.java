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
 * <p>Java-Klasse für lineStyle.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="lineStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="thick"/>
 *     &lt;enumeration value="dash"/>
 *     &lt;enumeration value="double"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lineStyle")
@XmlEnum
public enum LineStyle {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("dotted")
    DOTTED("dotted"),
    @XmlEnumValue("thick")
    THICK("thick"),
    @XmlEnumValue("dash")
    DASH("dash"),
    @XmlEnumValue("double")
    DOUBLE("double");
    private final String value;

    LineStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineStyle fromValue(String v) {
        for (LineStyle c: LineStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
