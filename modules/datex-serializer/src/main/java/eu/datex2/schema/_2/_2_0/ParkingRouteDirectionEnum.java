
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRouteDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingRouteDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="towardsParkingSite"/&gt;
 *     &lt;enumeration value="awayFromParkingSite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingRouteDirectionEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingRouteDirectionEnum {

    @XmlEnumValue("towardsParkingSite")
    TOWARDS_PARKING_SITE("towardsParkingSite"),
    @XmlEnumValue("awayFromParkingSite")
    AWAY_FROM_PARKING_SITE("awayFromParkingSite");
    private final String value;

    ParkingRouteDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingRouteDirectionEnum fromValue(String v) {
        for (ParkingRouteDirectionEnum c: ParkingRouteDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
