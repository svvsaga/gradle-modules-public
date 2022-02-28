
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpaceAccessibilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSpaceAccessibilityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="extraSpaceLeftSide"/&gt;
 *     &lt;enumeration value="extraSpaceRightSide"/&gt;
 *     &lt;enumeration value="nearbyPedestrianExit"/&gt;
 *     &lt;enumeration value="bordersMarked"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpaceAccessibilityEnum")
@XmlEnum
public enum ParkingSpaceAccessibilityEnum {

    @XmlEnumValue("extraSpaceLeftSide")
    EXTRA_SPACE_LEFT_SIDE("extraSpaceLeftSide"),
    @XmlEnumValue("extraSpaceRightSide")
    EXTRA_SPACE_RIGHT_SIDE("extraSpaceRightSide"),
    @XmlEnumValue("nearbyPedestrianExit")
    NEARBY_PEDESTRIAN_EXIT("nearbyPedestrianExit"),
    @XmlEnumValue("bordersMarked")
    BORDERS_MARKED("bordersMarked"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSpaceAccessibilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSpaceAccessibilityEnum fromValue(String v) {
        for (ParkingSpaceAccessibilityEnum c: ParkingSpaceAccessibilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
