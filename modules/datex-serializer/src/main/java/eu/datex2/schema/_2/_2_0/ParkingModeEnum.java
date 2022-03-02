
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="perpendicularParking"/&gt;
 *     &lt;enumeration value="parallelParking"/&gt;
 *     &lt;enumeration value="echelonParking"/&gt;
 *     &lt;enumeration value="parkingOnOppositeSideOfRoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingModeEnum")
@XmlEnum
public enum ParkingModeEnum {

    @XmlEnumValue("perpendicularParking")
    PERPENDICULAR_PARKING("perpendicularParking"),
    @XmlEnumValue("parallelParking")
    PARALLEL_PARKING("parallelParking"),
    @XmlEnumValue("echelonParking")
    ECHELON_PARKING("echelonParking"),
    @XmlEnumValue("parkingOnOppositeSideOfRoad")
    PARKING_ON_OPPOSITE_SIDE_OF_ROAD("parkingOnOppositeSideOfRoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingModeEnum fromValue(String v) {
        for (ParkingModeEnum c: ParkingModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
