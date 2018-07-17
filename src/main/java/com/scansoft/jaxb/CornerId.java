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
 * <p>Java-Klasse für cornerId.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="cornerId">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="topLeft"/>
 *     &lt;enumeration value="topRight"/>
 *     &lt;enumeration value="bottomLeft"/>
 *     &lt;enumeration value="bottomRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cornerId")
@XmlEnum
public enum CornerId {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("topLeft")
    TOP_LEFT("topLeft"),
    @XmlEnumValue("topRight")
    TOP_RIGHT("topRight"),
    @XmlEnumValue("bottomLeft")
    BOTTOM_LEFT("bottomLeft"),
    @XmlEnumValue("bottomRight")
    BOTTOM_RIGHT("bottomRight");
    private final String value;

    CornerId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CornerId fromValue(String v) {
        for (CornerId c: CornerId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
