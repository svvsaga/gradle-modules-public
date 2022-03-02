
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PictogramEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blankVoid"/&gt;
 *     &lt;enumeration value="bridgeClosed"/&gt;
 *     &lt;enumeration value="carParkFull"/&gt;
 *     &lt;enumeration value="carParkSpacesAvailable"/&gt;
 *     &lt;enumeration value="corridorForEmergencyVehicleAccess"/&gt;
 *     &lt;enumeration value="curveArrowToLeft"/&gt;
 *     &lt;enumeration value="curveArrowToRight"/&gt;
 *     &lt;enumeration value="dangerOfFire"/&gt;
 *     &lt;enumeration value="doubleExitToLeft"/&gt;
 *     &lt;enumeration value="doubleExitToRight"/&gt;
 *     &lt;enumeration value="endOfAdvisorySpeed"/&gt;
 *     &lt;enumeration value="fastenChildrensSeatBelts"/&gt;
 *     &lt;enumeration value="fastenYourSeatBelt"/&gt;
 *     &lt;enumeration value="fire"/&gt;
 *     &lt;enumeration value="footballMatch"/&gt;
 *     &lt;enumeration value="hardShoulderNotRunning"/&gt;
 *     &lt;enumeration value="hardShoulderRunning"/&gt;
 *     &lt;enumeration value="horizontalDiversionToLeft"/&gt;
 *     &lt;enumeration value="horizontalDiversionToRight"/&gt;
 *     &lt;enumeration value="keepASafeDistance"/&gt;
 *     &lt;enumeration value="keepLeft"/&gt;
 *     &lt;enumeration value="keepRight"/&gt;
 *     &lt;enumeration value="lane1ClosedOf2"/&gt;
 *     &lt;enumeration value="lane2ClosedOf2"/&gt;
 *     &lt;enumeration value="lane1ClosedOf3"/&gt;
 *     &lt;enumeration value="lane3ClosedOf3"/&gt;
 *     &lt;enumeration value="lanes1And2ClosedOf3"/&gt;
 *     &lt;enumeration value="lanes2And3ClosedOf3"/&gt;
 *     &lt;enumeration value="lane1ClosedOf4"/&gt;
 *     &lt;enumeration value="lane4ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes1And2ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes3And4ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes1And2And3ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes2And3And4ClosedOf4"/&gt;
 *     &lt;enumeration value="leftHandLaneClosed"/&gt;
 *     &lt;enumeration value="narrowLanesAhead"/&gt;
 *     &lt;enumeration value="obliqueArrowToLeft"/&gt;
 *     &lt;enumeration value="obliqueArrowToRight"/&gt;
 *     &lt;enumeration value="pollutionOrSmogAlert"/&gt;
 *     &lt;enumeration value="rightHandLaneClosed"/&gt;
 *     &lt;enumeration value="singleExitToLeft"/&gt;
 *     &lt;enumeration value="singleExitToRight"/&gt;
 *     &lt;enumeration value="smoke"/&gt;
 *     &lt;enumeration value="snowPloughInAction"/&gt;
 *     &lt;enumeration value="speedCamerasInAction"/&gt;
 *     &lt;enumeration value="straightVerticalArrow"/&gt;
 *     &lt;enumeration value="trafficDeviatedToOppositeCarriagewayAhead"/&gt;
 *     &lt;enumeration value="trafficPartiallyDeviatedToOppositeCarriagewayAhead"/&gt;
 *     &lt;enumeration value="tunnelClosed"/&gt;
 *     &lt;enumeration value="verticalDiversion"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PictogramEnum", namespace = "http://datex2.eu/schema/3/vms")
@XmlEnum
public enum PictogramEnum2 {


    /**
     * Blank or void.
     * 
     */
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),

    /**
     * Bridge closed.
     * 
     */
    @XmlEnumValue("bridgeClosed")
    BRIDGE_CLOSED("bridgeClosed"),

    /**
     * Car park full.
     * 
     */
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),

    /**
     * Spaces available in car park.
     * 
     */
    @XmlEnumValue("carParkSpacesAvailable")
    CAR_PARK_SPACES_AVAILABLE("carParkSpacesAvailable"),

    /**
     * Corridor for emergency vehicle access
     * 
     */
    @XmlEnumValue("corridorForEmergencyVehicleAccess")
    CORRIDOR_FOR_EMERGENCY_VEHICLE_ACCESS("corridorForEmergencyVehicleAccess"),

    /**
     * Single curve arrow to the leftt corresponding to an exit (without fork).
     *           
     * 
     */
    @XmlEnumValue("curveArrowToLeft")
    CURVE_ARROW_TO_LEFT("curveArrowToLeft"),

    /**
     * Single curve arrow to the right corresponding to an exit (without fork).
     *           
     * 
     */
    @XmlEnumValue("curveArrowToRight")
    CURVE_ARROW_TO_RIGHT("curveArrowToRight"),

    /**
     * Danger of fire.
     * 
     */
    @XmlEnumValue("dangerOfFire")
    DANGER_OF_FIRE("dangerOfFire"),

    /**
     * Triple arrow corresponding to two sequential exits to the left.
     * 
     */
    @XmlEnumValue("doubleExitToLeft")
    DOUBLE_EXIT_TO_LEFT("doubleExitToLeft"),

    /**
     * Triple arrow corresponding to two sequential exits to the right.
     *           
     * 
     */
    @XmlEnumValue("doubleExitToRight")
    DOUBLE_EXIT_TO_RIGHT("doubleExitToRight"),

    /**
     * End of advisory speed.
     * 
     */
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),

    /**
     * Fasten the seat belts of children.
     * 
     */
    @XmlEnumValue("fastenChildrensSeatBelts")
    FASTEN_CHILDRENS_SEAT_BELTS("fastenChildrensSeatBelts"),

    /**
     * Fasten your seat belt.
     * 
     */
    @XmlEnumValue("fastenYourSeatBelt")
    FASTEN_YOUR_SEAT_BELT("fastenYourSeatBelt"),

    /**
     * Fire.
     * 
     */
    @XmlEnumValue("fire")
    FIRE("fire"),

    /**
     * Football match (current or anticipated disruption due to football match).
     *           
     * 
     */
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),

    /**
     * Hard shoulder running is in operation.
     * 
     */
    @XmlEnumValue("hardShoulderNotRunning")
    HARD_SHOULDER_NOT_RUNNING("hardShoulderNotRunning"),

    /**
     * Hard shoulder running is not in operation.
     * 
     */
    @XmlEnumValue("hardShoulderRunning")
    HARD_SHOULDER_RUNNING("hardShoulderRunning"),

    /**
     * Correspond to the horizontal orange (to the left) sign for diversion
     *           
     * 
     */
    @XmlEnumValue("horizontalDiversionToLeft")
    HORIZONTAL_DIVERSION_TO_LEFT("horizontalDiversionToLeft"),

    /**
     * Correspond to the horizontal orange (to the right) sign for diversion
     *           
     * 
     */
    @XmlEnumValue("horizontalDiversionToRight")
    HORIZONTAL_DIVERSION_TO_RIGHT("horizontalDiversionToRight"),

    /**
     * Keep a safe distance.
     * 
     */
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),

    /**
     * Keep left.
     * 
     */
    @XmlEnumValue("keepLeft")
    KEEP_LEFT("keepLeft"),

    /**
     * Keep right.
     * 
     */
    @XmlEnumValue("keepRight")
    KEEP_RIGHT("keepRight"),

    /**
     * Lane 1 closed on a 2 lane carriageway. Lanes numbered from nearside (next to hard
     *             shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lane1ClosedOf2")
    LANE_1_CLOSED_OF_2("lane1ClosedOf2"),

    /**
     * Lane 2 closed on a 2 lane carriageway. Lanes numbered from nearside (next to hard
     *             shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lane2ClosedOf2")
    LANE_2_CLOSED_OF_2("lane2ClosedOf2"),

    /**
     * Lane 1 closed on a 3 lane carriageway. Lanes numbered from nearside (next to hard
     *             shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lane1ClosedOf3")
    LANE_1_CLOSED_OF_3("lane1ClosedOf3"),

    /**
     * Lane 3 closed on a 3 lane carriageway. Lanes numbered from nearside (next to hard
     *             shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lane3ClosedOf3")
    LANE_3_CLOSED_OF_3("lane3ClosedOf3"),

    /**
     * Lanes 1 and 2 closed on a 3 lane carriageway. Lanes numbered from nearside (next
     *             to hard shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lanes1And2ClosedOf3")
    LANES_1_AND_2_CLOSED_OF_3("lanes1And2ClosedOf3"),

    /**
     * Lanes 2 and 3 closed on a 3 lane carriageway. Lanes numbered from nearside (next
     *             to hard shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lanes2And3ClosedOf3")
    LANES_2_AND_3_CLOSED_OF_3("lanes2And3ClosedOf3"),

    /**
     * Lane 1 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard
     *             shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lane1ClosedOf4")
    LANE_1_CLOSED_OF_4("lane1ClosedOf4"),

    /**
     * Lane 4 closed on a 4 lane carriageway. Lanes numbered from nearside (next to hard
     *             shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lane4ClosedOf4")
    LANE_4_CLOSED_OF_4("lane4ClosedOf4"),

    /**
     * Lanes 1 and 2 closed on a 4 lane carriageway. Lanes numbered from nearside (next
     *             to hard shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lanes1And2ClosedOf4")
    LANES_1_AND_2_CLOSED_OF_4("lanes1And2ClosedOf4"),

    /**
     * Lanes 3 and 4 closed on a 4 lane carriageway. Lanes numbered from nearside (next
     *             to hard shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lanes3And4ClosedOf4")
    LANES_3_AND_4_CLOSED_OF_4("lanes3And4ClosedOf4"),

    /**
     * Lanes 1, 2 and 3 closed on a 4 lane carriageway. Lanes numbered from nearside
     *             (next to hard shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lanes1And2And3ClosedOf4")
    LANES_1_AND_2_AND_3_CLOSED_OF_4("lanes1And2And3ClosedOf4"),

    /**
     * Lanes 2, 3 and 4 closed on a 4 lane carriageway. Lanes numbered from nearside
     *             (next to hard shoulder on motorway) to central median.
     *           
     * 
     */
    @XmlEnumValue("lanes2And3And4ClosedOf4")
    LANES_2_AND_3_AND_4_CLOSED_OF_4("lanes2And3And4ClosedOf4"),

    /**
     * Left-hand lane closed ahead.
     * 
     */
    @XmlEnumValue("leftHandLaneClosed")
    LEFT_HAND_LANE_CLOSED("leftHandLaneClosed"),

    /**
     * Narrow lanes ahead.
     * 
     */
    @XmlEnumValue("narrowLanesAhead")
    NARROW_LANES_AHEAD("narrowLanesAhead"),

    /**
     * Single oblique straight arrow to the left corresponding to an exit (without
     *             fork).
     *           
     * 
     */
    @XmlEnumValue("obliqueArrowToLeft")
    OBLIQUE_ARROW_TO_LEFT("obliqueArrowToLeft"),

    /**
     * Single oblique straight arrow to the right corresponding to an exit (without
     *             fork).
     *           
     * 
     */
    @XmlEnumValue("obliqueArrowToRight")
    OBLIQUE_ARROW_TO_RIGHT("obliqueArrowToRight"),

    /**
     * Pollution or smog alert.
     * 
     */
    @XmlEnumValue("pollutionOrSmogAlert")
    POLLUTION_OR_SMOG_ALERT("pollutionOrSmogAlert"),

    /**
     * Right-hand lane closed ahead.
     * 
     */
    @XmlEnumValue("rightHandLaneClosed")
    RIGHT_HAND_LANE_CLOSED("rightHandLaneClosed"),

    /**
     * Double arrow corresponding to a single exit to the left.
     * 
     */
    @XmlEnumValue("singleExitToLeft")
    SINGLE_EXIT_TO_LEFT("singleExitToLeft"),

    /**
     * Double arrow corresponding to a single exit to the right.
     * 
     */
    @XmlEnumValue("singleExitToRight")
    SINGLE_EXIT_TO_RIGHT("singleExitToRight"),

    /**
     * Smoke.
     * 
     */
    @XmlEnumValue("smoke")
    SMOKE("smoke"),

    /**
     * Snow plough(s) in action.
     * 
     */
    @XmlEnumValue("snowPloughInAction")
    SNOW_PLOUGH_IN_ACTION("snowPloughInAction"),

    /**
     * Speed cameras in action.
     * 
     */
    @XmlEnumValue("speedCamerasInAction")
    SPEED_CAMERAS_IN_ACTION("speedCamerasInAction"),

    /**
     * Straight vertical arrow (towards top).
     * 
     */
    @XmlEnumValue("straightVerticalArrow")
    STRAIGHT_VERTICAL_ARROW("straightVerticalArrow"),

    /**
     * All traffic is diverted to the opposite carriageway ahead in a contraflow
     *             layout.
     *           
     * 
     */
    @XmlEnumValue("trafficDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficDeviatedToOppositeCarriagewayAhead"),

    /**
     * Traffic is partially diverted to the opposite carriageway ahead in a contraflow
     *             layout.
     *           
     * 
     */
    @XmlEnumValue("trafficPartiallyDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_PARTIALLY_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficPartiallyDeviatedToOppositeCarriagewayAhead"),

    /**
     * Tunnel closed.
     * 
     */
    @XmlEnumValue("tunnelClosed")
    TUNNEL_CLOSED("tunnelClosed"),

    /**
     * Correspond to the vertical orange sign for diversion.
     * 
     */
    @XmlEnumValue("verticalDiversion")
    VERTICAL_DIVERSION("verticalDiversion"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PictogramEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictogramEnum2 fromValue(String v) {
        for (PictogramEnum2 c: PictogramEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
