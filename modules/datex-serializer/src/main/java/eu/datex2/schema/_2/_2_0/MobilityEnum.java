
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MobilityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mobile"/&gt;
 *     &lt;enumeration value="stationary"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum MobilityEnum {

    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("stationary")
    STATIONARY("stationary"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MobilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnum fromValue(String v) {
        for (MobilityEnum c: MobilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
