
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenyReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DenyReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknownReason"/&gt;
 *     &lt;enumeration value="wrongCatalogue"/&gt;
 *     &lt;enumeration value="wrongFilter"/&gt;
 *     &lt;enumeration value="wrongOrder"/&gt;
 *     &lt;enumeration value="wrongPartner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenyReasonEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum DenyReasonEnum {

    @XmlEnumValue("unknownReason")
    UNKNOWN_REASON("unknownReason"),
    @XmlEnumValue("wrongCatalogue")
    WRONG_CATALOGUE("wrongCatalogue"),
    @XmlEnumValue("wrongFilter")
    WRONG_FILTER("wrongFilter"),
    @XmlEnumValue("wrongOrder")
    WRONG_ORDER("wrongOrder"),
    @XmlEnumValue("wrongPartner")
    WRONG_PARTNER("wrongPartner");
    private final String value;

    DenyReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenyReasonEnum fromValue(String v) {
        for (DenyReasonEnum c: DenyReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
