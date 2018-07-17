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
 * <p>Java-Klasse für fontFamilyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="fontFamilyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="roman"/>
 *     &lt;enumeration value="swiss"/>
 *     &lt;enumeration value="modern"/>
 *     &lt;enumeration value="script"/>
 *     &lt;enumeration value="decorative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fontFamilyType")
@XmlEnum
public enum FontFamilyType {

    @XmlEnumValue("roman")
    ROMAN("roman"),
    @XmlEnumValue("swiss")
    SWISS("swiss"),
    @XmlEnumValue("modern")
    MODERN("modern"),
    @XmlEnumValue("script")
    SCRIPT("script"),
    @XmlEnumValue("decorative")
    DECORATIVE("decorative");
    private final String value;

    FontFamilyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontFamilyType fromValue(String v) {
        for (FontFamilyType c: FontFamilyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
