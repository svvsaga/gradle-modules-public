
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSiteStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSiteStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="spacesAvailable"/&gt;
 *     &lt;enumeration value="almostFull"/&gt;
 *     &lt;enumeration value="fullAtEntrance"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSiteStatusEnum")
@XmlEnum
public enum ParkingSiteStatusEnum {

    @XmlEnumValue("spacesAvailable")
    SPACES_AVAILABLE("spacesAvailable"),
    @XmlEnumValue("almostFull")
    ALMOST_FULL("almostFull"),
    @XmlEnumValue("fullAtEntrance")
    FULL_AT_ENTRANCE("fullAtEntrance"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSiteStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSiteStatusEnum fromValue(String v) {
        for (ParkingSiteStatusEnum c: ParkingSiteStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
