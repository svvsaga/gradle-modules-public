
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OpeningStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="closedAbnormal"/&gt;
 *     &lt;enumeration value="openingTimesInForce"/&gt;
 *     &lt;enumeration value="statusUnknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpeningStatusEnum")
@XmlEnum
public enum OpeningStatusEnum {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("closedAbnormal")
    CLOSED_ABNORMAL("closedAbnormal"),
    @XmlEnumValue("openingTimesInForce")
    OPENING_TIMES_IN_FORCE("openingTimesInForce"),
    @XmlEnumValue("statusUnknown")
    STATUS_UNKNOWN("statusUnknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OpeningStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpeningStatusEnum fromValue(String v) {
        for (OpeningStatusEnum c: OpeningStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
