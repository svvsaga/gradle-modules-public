
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpecialLocationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSpecialLocationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airportTerminal"/&gt;
 *     &lt;enumeration value="exhibitonCentre"/&gt;
 *     &lt;enumeration value="shoppingCentre"/&gt;
 *     &lt;enumeration value="specificFacility"/&gt;
 *     &lt;enumeration value="trainStation"/&gt;
 *     &lt;enumeration value="campground"/&gt;
 *     &lt;enumeration value="themePark"/&gt;
 *     &lt;enumeration value="ferryTerminal"/&gt;
 *     &lt;enumeration value="vehicleOnRailTerminal"/&gt;
 *     &lt;enumeration value="coachStation"/&gt;
 *     &lt;enumeration value="cableCarStation"/&gt;
 *     &lt;enumeration value="publicTransportStation"/&gt;
 *     &lt;enumeration value="market"/&gt;
 *     &lt;enumeration value="religiousCentre"/&gt;
 *     &lt;enumeration value="conventionCentre"/&gt;
 *     &lt;enumeration value="cinema"/&gt;
 *     &lt;enumeration value="skilift"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpecialLocationEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingSpecialLocationEnum {

    @XmlEnumValue("airportTerminal")
    AIRPORT_TERMINAL("airportTerminal"),
    @XmlEnumValue("exhibitonCentre")
    EXHIBITON_CENTRE("exhibitonCentre"),
    @XmlEnumValue("shoppingCentre")
    SHOPPING_CENTRE("shoppingCentre"),
    @XmlEnumValue("specificFacility")
    SPECIFIC_FACILITY("specificFacility"),
    @XmlEnumValue("trainStation")
    TRAIN_STATION("trainStation"),
    @XmlEnumValue("campground")
    CAMPGROUND("campground"),
    @XmlEnumValue("themePark")
    THEME_PARK("themePark"),
    @XmlEnumValue("ferryTerminal")
    FERRY_TERMINAL("ferryTerminal"),
    @XmlEnumValue("vehicleOnRailTerminal")
    VEHICLE_ON_RAIL_TERMINAL("vehicleOnRailTerminal"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("cableCarStation")
    CABLE_CAR_STATION("cableCarStation"),
    @XmlEnumValue("publicTransportStation")
    PUBLIC_TRANSPORT_STATION("publicTransportStation"),
    @XmlEnumValue("market")
    MARKET("market"),
    @XmlEnumValue("religiousCentre")
    RELIGIOUS_CENTRE("religiousCentre"),
    @XmlEnumValue("conventionCentre")
    CONVENTION_CENTRE("conventionCentre"),
    @XmlEnumValue("cinema")
    CINEMA("cinema"),
    @XmlEnumValue("skilift")
    SKILIFT("skilift"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSpecialLocationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSpecialLocationEnum fromValue(String v) {
        for (ParkingSpecialLocationEnum c: ParkingSpecialLocationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
