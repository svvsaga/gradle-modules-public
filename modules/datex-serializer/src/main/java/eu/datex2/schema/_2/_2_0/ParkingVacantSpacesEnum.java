
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingVacantSpacesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingVacantSpacesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noParkingSpacesAvailable"/&gt;
 *     &lt;enumeration value="expectNoSpacesAvailable"/&gt;
 *     &lt;enumeration value="onlyAFewSpacesAvailable"/&gt;
 *     &lt;enumeration value="lessThan10SpacesAvailable"/&gt;
 *     &lt;enumeration value="lessThan20SpacesAvailable"/&gt;
 *     &lt;enumeration value="lessThan30SpacesAvailable"/&gt;
 *     &lt;enumeration value="lessThan40SpacesAvailable"/&gt;
 *     &lt;enumeration value="lessThan50SpacesAvailable"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingVacantSpacesEnum")
@XmlEnum
public enum ParkingVacantSpacesEnum {

    @XmlEnumValue("noParkingSpacesAvailable")
    NO_PARKING_SPACES_AVAILABLE("noParkingSpacesAvailable"),
    @XmlEnumValue("expectNoSpacesAvailable")
    EXPECT_NO_SPACES_AVAILABLE("expectNoSpacesAvailable"),
    @XmlEnumValue("onlyAFewSpacesAvailable")
    ONLY_A_FEW_SPACES_AVAILABLE("onlyAFewSpacesAvailable"),
    @XmlEnumValue("lessThan10SpacesAvailable")
    LESS_THAN_10_SPACES_AVAILABLE("lessThan10SpacesAvailable"),
    @XmlEnumValue("lessThan20SpacesAvailable")
    LESS_THAN_20_SPACES_AVAILABLE("lessThan20SpacesAvailable"),
    @XmlEnumValue("lessThan30SpacesAvailable")
    LESS_THAN_30_SPACES_AVAILABLE("lessThan30SpacesAvailable"),
    @XmlEnumValue("lessThan40SpacesAvailable")
    LESS_THAN_40_SPACES_AVAILABLE("lessThan40SpacesAvailable"),
    @XmlEnumValue("lessThan50SpacesAvailable")
    LESS_THAN_50_SPACES_AVAILABLE("lessThan50SpacesAvailable"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingVacantSpacesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingVacantSpacesEnum fromValue(String v) {
        for (ParkingVacantSpacesEnum c: ParkingVacantSpacesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
