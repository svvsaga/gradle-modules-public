
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccessCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="vehicleEntranceAndExit"/&gt;
 *     &lt;enumeration value="vehicleEntrance"/&gt;
 *     &lt;enumeration value="vehicleExit"/&gt;
 *     &lt;enumeration value="pedestrianEntranceAndExit"/&gt;
 *     &lt;enumeration value="pedestrianEntrance"/&gt;
 *     &lt;enumeration value="pedestrianExit"/&gt;
 *     &lt;enumeration value="rentalCarReturn"/&gt;
 *     &lt;enumeration value="bicycles"/&gt;
 *     &lt;enumeration value="emergencyExit"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessCategoryEnum")
@XmlEnum
public enum AccessCategoryEnum {

    @XmlEnumValue("vehicleEntranceAndExit")
    VEHICLE_ENTRANCE_AND_EXIT("vehicleEntranceAndExit"),
    @XmlEnumValue("vehicleEntrance")
    VEHICLE_ENTRANCE("vehicleEntrance"),
    @XmlEnumValue("vehicleExit")
    VEHICLE_EXIT("vehicleExit"),
    @XmlEnumValue("pedestrianEntranceAndExit")
    PEDESTRIAN_ENTRANCE_AND_EXIT("pedestrianEntranceAndExit"),
    @XmlEnumValue("pedestrianEntrance")
    PEDESTRIAN_ENTRANCE("pedestrianEntrance"),
    @XmlEnumValue("pedestrianExit")
    PEDESTRIAN_EXIT("pedestrianExit"),
    @XmlEnumValue("rentalCarReturn")
    RENTAL_CAR_RETURN("rentalCarReturn"),
    @XmlEnumValue("bicycles")
    BICYCLES("bicycles"),
    @XmlEnumValue("emergencyExit")
    EMERGENCY_EXIT("emergencyExit"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessCategoryEnum fromValue(String v) {
        for (AccessCategoryEnum c: AccessCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
