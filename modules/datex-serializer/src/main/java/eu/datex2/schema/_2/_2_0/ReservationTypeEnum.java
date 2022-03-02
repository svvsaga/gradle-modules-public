
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReservationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="optional"/&gt;
 *     &lt;enumeration value="mandatory"/&gt;
 *     &lt;enumeration value="notAvailable"/&gt;
 *     &lt;enumeration value="partly"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ReservationTypeEnum {

    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("mandatory")
    MANDATORY("mandatory"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable"),
    @XmlEnumValue("partly")
    PARTLY("partly"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    ReservationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationTypeEnum fromValue(String v) {
        for (ReservationTypeEnum c: ReservationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
