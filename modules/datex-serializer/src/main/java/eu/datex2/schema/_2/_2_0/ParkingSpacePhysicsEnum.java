
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpacePhysicsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSpacePhysicsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="driveThrough"/&gt;
 *     &lt;enumeration value="openAir"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpacePhysicsEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingSpacePhysicsEnum {

    @XmlEnumValue("driveThrough")
    DRIVE_THROUGH("driveThrough"),
    @XmlEnumValue("openAir")
    OPEN_AIR("openAir");
    private final String value;

    ParkingSpacePhysicsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSpacePhysicsEnum fromValue(String v) {
        for (ParkingSpacePhysicsEnum c: ParkingSpacePhysicsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
