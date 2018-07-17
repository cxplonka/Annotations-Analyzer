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
 * <p>Java-Klasse für bulletValueType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="bulletValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="smallCircle"/>
 *     &lt;enumeration value="whiteCircle"/>
 *     &lt;enumeration value="smallSquare"/>
 *     &lt;enumeration value="whiteSquare"/>
 *     &lt;enumeration value="squareRoot"/>
 *     &lt;enumeration value="triangular"/>
 *     &lt;enumeration value="dash"/>
 *     &lt;enumeration value="diamond"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bulletValueType")
@XmlEnum
public enum BulletValueType {

    @XmlEnumValue("smallCircle")
    SMALL_CIRCLE("smallCircle"),
    @XmlEnumValue("whiteCircle")
    WHITE_CIRCLE("whiteCircle"),
    @XmlEnumValue("smallSquare")
    SMALL_SQUARE("smallSquare"),
    @XmlEnumValue("whiteSquare")
    WHITE_SQUARE("whiteSquare"),
    @XmlEnumValue("squareRoot")
    SQUARE_ROOT("squareRoot"),
    @XmlEnumValue("triangular")
    TRIANGULAR("triangular"),
    @XmlEnumValue("dash")
    DASH("dash"),
    @XmlEnumValue("diamond")
    DIAMOND("diamond");
    private final String value;

    BulletValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BulletValueType fromValue(String v) {
        for (BulletValueType c: BulletValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
