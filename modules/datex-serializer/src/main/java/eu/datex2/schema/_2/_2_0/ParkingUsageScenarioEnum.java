
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingUsageScenarioEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingUsageScenarioEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="truckParking"/&gt;
 *     &lt;enumeration value="parkAndRide"/&gt;
 *     &lt;enumeration value="parkAndCycle"/&gt;
 *     &lt;enumeration value="parkAndWalk"/&gt;
 *     &lt;enumeration value="kissAndRide"/&gt;
 *     &lt;enumeration value="liftshare"/&gt;
 *     &lt;enumeration value="carSharing"/&gt;
 *     &lt;enumeration value="restArea"/&gt;
 *     &lt;enumeration value="serviceArea"/&gt;
 *     &lt;enumeration value="dropOffWithValet"/&gt;
 *     &lt;enumeration value="dropOffMechanical"/&gt;
 *     &lt;enumeration value="eventParking"/&gt;
 *     &lt;enumeration value="automaticParkingGuidance"/&gt;
 *     &lt;enumeration value="staffGuidesToSpace"/&gt;
 *     &lt;enumeration value="vehicleLift"/&gt;
 *     &lt;enumeration value="loadingBay"/&gt;
 *     &lt;enumeration value="dropOff"/&gt;
 *     &lt;enumeration value="overnightParking"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingUsageScenarioEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingUsageScenarioEnum {

    @XmlEnumValue("truckParking")
    TRUCK_PARKING("truckParking"),
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("parkAndCycle")
    PARK_AND_CYCLE("parkAndCycle"),
    @XmlEnumValue("parkAndWalk")
    PARK_AND_WALK("parkAndWalk"),
    @XmlEnumValue("kissAndRide")
    KISS_AND_RIDE("kissAndRide"),
    @XmlEnumValue("liftshare")
    LIFTSHARE("liftshare"),
    @XmlEnumValue("carSharing")
    CAR_SHARING("carSharing"),
    @XmlEnumValue("restArea")
    REST_AREA("restArea"),
    @XmlEnumValue("serviceArea")
    SERVICE_AREA("serviceArea"),
    @XmlEnumValue("dropOffWithValet")
    DROP_OFF_WITH_VALET("dropOffWithValet"),
    @XmlEnumValue("dropOffMechanical")
    DROP_OFF_MECHANICAL("dropOffMechanical"),
    @XmlEnumValue("eventParking")
    EVENT_PARKING("eventParking"),
    @XmlEnumValue("automaticParkingGuidance")
    AUTOMATIC_PARKING_GUIDANCE("automaticParkingGuidance"),
    @XmlEnumValue("staffGuidesToSpace")
    STAFF_GUIDES_TO_SPACE("staffGuidesToSpace"),
    @XmlEnumValue("vehicleLift")
    VEHICLE_LIFT("vehicleLift"),
    @XmlEnumValue("loadingBay")
    LOADING_BAY("loadingBay"),
    @XmlEnumValue("dropOff")
    DROP_OFF("dropOff"),
    @XmlEnumValue("overnightParking")
    OVERNIGHT_PARKING("overnightParking"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingUsageScenarioEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingUsageScenarioEnum fromValue(String v) {
        for (ParkingUsageScenarioEnum c: ParkingUsageScenarioEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
