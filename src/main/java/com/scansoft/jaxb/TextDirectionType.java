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
 * <p>Java-Klasse für textDirectionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="textDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="left2right"/>
 *     &lt;enumeration value="top2down"/>
 *     &lt;enumeration value="down2top"/>
 *     &lt;enumeration value="top2downNeon"/>
 *     &lt;enumeration value="right2left"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textDirectionType")
@XmlEnum
public enum TextDirectionType {

    @XmlEnumValue("left2right")
    LEFT_2_RIGHT("left2right"),
    @XmlEnumValue("top2down")
    TOP_2_DOWN("top2down"),
    @XmlEnumValue("down2top")
    DOWN_2_TOP("down2top"),
    @XmlEnumValue("top2downNeon")
    TOP_2_DOWN_NEON("top2downNeon"),
    @XmlEnumValue("right2left")
    RIGHT_2_LEFT("right2left");
    private final String value;

    TextDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextDirectionType fromValue(String v) {
        for (TextDirectionType c: TextDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
