
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
@XmlType(name = "LaneEnum", namespace = "http://datex2.eu/schema/3/locationReferencing")
@XmlEnum
public enum LaneEnum2 {


    /**
     * In all lanes of the carriageway.
     * 
     */
    @XmlEnumValue("allLanesCompleteCarriageway")
    ALL_LANES_COMPLETE_CARRIAGEWAY("allLanesCompleteCarriageway"),

    /**
     * In the bus lane.
     * 
     */
    @XmlEnumValue("busLane")
    BUS_LANE("busLane"),

    /**
     * In the bus stop lane.
     * 
     */
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),

    /**
     * In the carpool lane.
     * 
     */
    @XmlEnumValue("carPoolLane")
    CAR_POOL_LANE("carPoolLane"),

    /**
     * On the central reservation separating the two directional carriageways of the
     *             highway.
     *           
     * 
     */
    @XmlEnumValue("centralReservation")
    CENTRAL_RESERVATION("centralReservation"),

    /**
     * In the crawler lane - a lane that should be used by slower vehicles.
     *           
     * 
     */
    @XmlEnumValue("crawlerLane")
    CRAWLER_LANE("crawlerLane"),

    /**
     * Part of a carriageway designated for cycles. A cycle lane is distinguished from
     *             the rest of the carriageway by longitudinal road markings.
     *           
     * 
     */
    @XmlEnumValue("cycleLane")
    CYCLE_LANE("cycleLane"),

    /**
     * In the emergency lane.
     * 
     */
    @XmlEnumValue("emergencyLane")
    EMERGENCY_LANE("emergencyLane"),

    /**
     * In the escape lane.
     * 
     */
    @XmlEnumValue("escapeLane")
    ESCAPE_LANE("escapeLane"),

    /**
     * In the express lane.
     * 
     */
    @XmlEnumValue("expressLane")
    EXPRESS_LANE("expressLane"),

    /**
     * On the hard shoulder.
     * 
     */
    @XmlEnumValue("hardShoulder")
    HARD_SHOULDER("hardShoulder"),

    /**
     * In the heavy vehicle lane.
     * 
     */
    @XmlEnumValue("heavyVehicleLane")
    HEAVY_VEHICLE_LANE("heavyVehicleLane"),

    /**
     * In a lay-by.
     * 
     */
    @XmlEnumValue("layBy")
    LAY_BY("layBy"),

    /**
     * In the left hand turning lane.
     * 
     */
    @XmlEnumValue("leftHandTurningLane")
    LEFT_HAND_TURNING_LANE("leftHandTurningLane"),

    /**
     * In the left lane.
     * 
     */
    @XmlEnumValue("leftLane")
    LEFT_LANE("leftLane"),

    /**
     * In the local traffic lane.
     * 
     */
    @XmlEnumValue("localTrafficLane")
    LOCAL_TRAFFIC_LANE("localTrafficLane"),

    /**
     * In the middle lane.
     * 
     */
    @XmlEnumValue("middleLane")
    MIDDLE_LANE("middleLane"),

    /**
     * In the overtaking lane.
     * 
     */
    @XmlEnumValue("overtakingLane")
    OVERTAKING_LANE("overtakingLane"),

    /**
     * In the right hand turning lane.
     * 
     */
    @XmlEnumValue("rightHandTurningLane")
    RIGHT_HAND_TURNING_LANE("rightHandTurningLane"),

    /**
     * In the right lane.
     * 
     */
    @XmlEnumValue("rightLane")
    RIGHT_LANE("rightLane"),

    /**
     * In the lane dedicated for use during the rush (peak) hour.
     * 
     */
    @XmlEnumValue("rushHourLane")
    RUSH_HOUR_LANE("rushHourLane"),

    /**
     * In the area/lane reserved for passenger pick-up or set-down.
     * 
     */
    @XmlEnumValue("setDownArea")
    SET_DOWN_AREA("setDownArea"),

    /**
     * In a lane dedicated to vehicles that are not permitted to exceed a fixed slow
     *             speed.
     *           
     * 
     */
    @XmlEnumValue("slowVehicleLane")
    SLOW_VEHICLE_LANE("slowVehicleLane"),

    /**
     * In the through traffic lane.
     * 
     */
    @XmlEnumValue("throughTrafficLane")
    THROUGH_TRAFFIC_LANE("throughTrafficLane"),

    /**
     * In the lane dedicated for use as a tidal flow lane.
     * 
     */
    @XmlEnumValue("tidalFlowLane")
    TIDAL_FLOW_LANE("tidalFlowLane"),

    /**
     * In the turning lane.
     * 
     */
    @XmlEnumValue("turningLane")
    TURNING_LANE("turningLane"),

    /**
     * On the verge.
     * 
     */
    @XmlEnumValue("verge")
    VERGE("verge"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    LaneEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaneEnum2 fromValue(String v) {
        for (LaneEnum2 c: LaneEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
