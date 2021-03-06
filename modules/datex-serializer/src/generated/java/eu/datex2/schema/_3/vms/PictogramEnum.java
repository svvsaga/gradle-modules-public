
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
@XmlType(name = "PictogramEnum")
@XmlEnum
public enum PictogramEnum {

    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),
    @XmlEnumValue("bridgeClosed")
    BRIDGE_CLOSED("bridgeClosed"),
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),
    @XmlEnumValue("carParkSpacesAvailable")
    CAR_PARK_SPACES_AVAILABLE("carParkSpacesAvailable"),
    @XmlEnumValue("corridorForEmergencyVehicleAccess")
    CORRIDOR_FOR_EMERGENCY_VEHICLE_ACCESS("corridorForEmergencyVehicleAccess"),
    @XmlEnumValue("curveArrowToLeft")
    CURVE_ARROW_TO_LEFT("curveArrowToLeft"),
    @XmlEnumValue("curveArrowToRight")
    CURVE_ARROW_TO_RIGHT("curveArrowToRight"),
    @XmlEnumValue("dangerOfFire")
    DANGER_OF_FIRE("dangerOfFire"),
    @XmlEnumValue("doubleExitToLeft")
    DOUBLE_EXIT_TO_LEFT("doubleExitToLeft"),
    @XmlEnumValue("doubleExitToRight")
    DOUBLE_EXIT_TO_RIGHT("doubleExitToRight"),
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),
    @XmlEnumValue("fastenChildrensSeatBelts")
    FASTEN_CHILDRENS_SEAT_BELTS("fastenChildrensSeatBelts"),
    @XmlEnumValue("fastenYourSeatBelt")
    FASTEN_YOUR_SEAT_BELT("fastenYourSeatBelt"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),
    @XmlEnumValue("hardShoulderNotRunning")
    HARD_SHOULDER_NOT_RUNNING("hardShoulderNotRunning"),
    @XmlEnumValue("hardShoulderRunning")
    HARD_SHOULDER_RUNNING("hardShoulderRunning"),
    @XmlEnumValue("horizontalDiversionToLeft")
    HORIZONTAL_DIVERSION_TO_LEFT("horizontalDiversionToLeft"),
    @XmlEnumValue("horizontalDiversionToRight")
    HORIZONTAL_DIVERSION_TO_RIGHT("horizontalDiversionToRight"),
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),
    @XmlEnumValue("keepLeft")
    KEEP_LEFT("keepLeft"),
    @XmlEnumValue("keepRight")
    KEEP_RIGHT("keepRight"),
    @XmlEnumValue("lane1ClosedOf2")
    LANE_1_CLOSED_OF_2("lane1ClosedOf2"),
    @XmlEnumValue("lane2ClosedOf2")
    LANE_2_CLOSED_OF_2("lane2ClosedOf2"),
    @XmlEnumValue("lane1ClosedOf3")
    LANE_1_CLOSED_OF_3("lane1ClosedOf3"),
    @XmlEnumValue("lane3ClosedOf3")
    LANE_3_CLOSED_OF_3("lane3ClosedOf3"),
    @XmlEnumValue("lanes1And2ClosedOf3")
    LANES_1_AND_2_CLOSED_OF_3("lanes1And2ClosedOf3"),
    @XmlEnumValue("lanes2And3ClosedOf3")
    LANES_2_AND_3_CLOSED_OF_3("lanes2And3ClosedOf3"),
    @XmlEnumValue("lane1ClosedOf4")
    LANE_1_CLOSED_OF_4("lane1ClosedOf4"),
    @XmlEnumValue("lane4ClosedOf4")
    LANE_4_CLOSED_OF_4("lane4ClosedOf4"),
    @XmlEnumValue("lanes1And2ClosedOf4")
    LANES_1_AND_2_CLOSED_OF_4("lanes1And2ClosedOf4"),
    @XmlEnumValue("lanes3And4ClosedOf4")
    LANES_3_AND_4_CLOSED_OF_4("lanes3And4ClosedOf4"),
    @XmlEnumValue("lanes1And2And3ClosedOf4")
    LANES_1_AND_2_AND_3_CLOSED_OF_4("lanes1And2And3ClosedOf4"),
    @XmlEnumValue("lanes2And3And4ClosedOf4")
    LANES_2_AND_3_AND_4_CLOSED_OF_4("lanes2And3And4ClosedOf4"),
    @XmlEnumValue("leftHandLaneClosed")
    LEFT_HAND_LANE_CLOSED("leftHandLaneClosed"),
    @XmlEnumValue("narrowLanesAhead")
    NARROW_LANES_AHEAD("narrowLanesAhead"),
    @XmlEnumValue("obliqueArrowToLeft")
    OBLIQUE_ARROW_TO_LEFT("obliqueArrowToLeft"),
    @XmlEnumValue("obliqueArrowToRight")
    OBLIQUE_ARROW_TO_RIGHT("obliqueArrowToRight"),
    @XmlEnumValue("pollutionOrSmogAlert")
    POLLUTION_OR_SMOG_ALERT("pollutionOrSmogAlert"),
    @XmlEnumValue("rightHandLaneClosed")
    RIGHT_HAND_LANE_CLOSED("rightHandLaneClosed"),
    @XmlEnumValue("singleExitToLeft")
    SINGLE_EXIT_TO_LEFT("singleExitToLeft"),
    @XmlEnumValue("singleExitToRight")
    SINGLE_EXIT_TO_RIGHT("singleExitToRight"),
    @XmlEnumValue("smoke")
    SMOKE("smoke"),
    @XmlEnumValue("snowPloughInAction")
    SNOW_PLOUGH_IN_ACTION("snowPloughInAction"),
    @XmlEnumValue("speedCamerasInAction")
    SPEED_CAMERAS_IN_ACTION("speedCamerasInAction"),
    @XmlEnumValue("straightVerticalArrow")
    STRAIGHT_VERTICAL_ARROW("straightVerticalArrow"),
    @XmlEnumValue("trafficDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficDeviatedToOppositeCarriagewayAhead"),
    @XmlEnumValue("trafficPartiallyDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_PARTIALLY_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficPartiallyDeviatedToOppositeCarriagewayAhead"),
    @XmlEnumValue("tunnelClosed")
    TUNNEL_CLOSED("tunnelClosed"),
    @XmlEnumValue("verticalDiversion")
    VERTICAL_DIVERSION("verticalDiversion"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictogramEnum fromValue(String v) {
        for (PictogramEnum c: PictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
