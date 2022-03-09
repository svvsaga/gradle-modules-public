
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaneEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LaneEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allLanesCompleteCarriageway"/&gt;
 *     &lt;enumeration value="busLane"/&gt;
 *     &lt;enumeration value="busStop"/&gt;
 *     &lt;enumeration value="carPoolLane"/&gt;
 *     &lt;enumeration value="centralReservation"/&gt;
 *     &lt;enumeration value="crawlerLane"/&gt;
 *     &lt;enumeration value="cycleLane"/&gt;
 *     &lt;enumeration value="emergencyLane"/&gt;
 *     &lt;enumeration value="escapeLane"/&gt;
 *     &lt;enumeration value="expressLane"/&gt;
 *     &lt;enumeration value="hardShoulder"/&gt;
 *     &lt;enumeration value="heavyVehicleLane"/&gt;
 *     &lt;enumeration value="layBy"/&gt;
 *     &lt;enumeration value="leftHandTurningLane"/&gt;
 *     &lt;enumeration value="leftLane"/&gt;
 *     &lt;enumeration value="localTrafficLane"/&gt;
 *     &lt;enumeration value="middleLane"/&gt;
 *     &lt;enumeration value="overtakingLane"/&gt;
 *     &lt;enumeration value="rightHandTurningLane"/&gt;
 *     &lt;enumeration value="rightLane"/&gt;
 *     &lt;enumeration value="rushHourLane"/&gt;
 *     &lt;enumeration value="setDownArea"/&gt;
 *     &lt;enumeration value="slowVehicleLane"/&gt;
 *     &lt;enumeration value="throughTrafficLane"/&gt;
 *     &lt;enumeration value="tidalFlowLane"/&gt;
 *     &lt;enumeration value="turningLane"/&gt;
 *     &lt;enumeration value="verge"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LaneEnum")
@XmlEnum
public enum LaneEnum {

    @XmlEnumValue("allLanesCompleteCarriageway")
    ALL_LANES_COMPLETE_CARRIAGEWAY("allLanesCompleteCarriageway"),
    @XmlEnumValue("busLane")
    BUS_LANE("busLane"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("carPoolLane")
    CAR_POOL_LANE("carPoolLane"),
    @XmlEnumValue("centralReservation")
    CENTRAL_RESERVATION("centralReservation"),
    @XmlEnumValue("crawlerLane")
    CRAWLER_LANE("crawlerLane"),
    @XmlEnumValue("cycleLane")
    CYCLE_LANE("cycleLane"),
    @XmlEnumValue("emergencyLane")
    EMERGENCY_LANE("emergencyLane"),
    @XmlEnumValue("escapeLane")
    ESCAPE_LANE("escapeLane"),
    @XmlEnumValue("expressLane")
    EXPRESS_LANE("expressLane"),
    @XmlEnumValue("hardShoulder")
    HARD_SHOULDER("hardShoulder"),
    @XmlEnumValue("heavyVehicleLane")
    HEAVY_VEHICLE_LANE("heavyVehicleLane"),
    @XmlEnumValue("layBy")
    LAY_BY("layBy"),
    @XmlEnumValue("leftHandTurningLane")
    LEFT_HAND_TURNING_LANE("leftHandTurningLane"),
    @XmlEnumValue("leftLane")
    LEFT_LANE("leftLane"),
    @XmlEnumValue("localTrafficLane")
    LOCAL_TRAFFIC_LANE("localTrafficLane"),
    @XmlEnumValue("middleLane")
    MIDDLE_LANE("middleLane"),
    @XmlEnumValue("overtakingLane")
    OVERTAKING_LANE("overtakingLane"),
    @XmlEnumValue("rightHandTurningLane")
    RIGHT_HAND_TURNING_LANE("rightHandTurningLane"),
    @XmlEnumValue("rightLane")
    RIGHT_LANE("rightLane"),
    @XmlEnumValue("rushHourLane")
    RUSH_HOUR_LANE("rushHourLane"),
    @XmlEnumValue("setDownArea")
    SET_DOWN_AREA("setDownArea"),
    @XmlEnumValue("slowVehicleLane")
    SLOW_VEHICLE_LANE("slowVehicleLane"),
    @XmlEnumValue("throughTrafficLane")
    THROUGH_TRAFFIC_LANE("throughTrafficLane"),
    @XmlEnumValue("tidalFlowLane")
    TIDAL_FLOW_LANE("tidalFlowLane"),
    @XmlEnumValue("turningLane")
    TURNING_LANE("turningLane"),
    @XmlEnumValue("verge")
    VERGE("verge"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    LaneEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaneEnum fromValue(String v) {
        for (LaneEnum c: LaneEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
