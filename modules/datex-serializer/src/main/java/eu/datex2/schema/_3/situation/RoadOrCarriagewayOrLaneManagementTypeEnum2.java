
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOrCarriagewayOrLaneManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadOrCarriagewayOrLaneManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="carPoolLaneInOperation"/&gt;
 *     &lt;enumeration value="carriagewayClosures"/&gt;
 *     &lt;enumeration value="clearALaneForEmergencyVehicles"/&gt;
 *     &lt;enumeration value="clearALaneForSnowploughsAndGrittingVehicles"/&gt;
 *     &lt;enumeration value="closedPermanentlyForTheWinter"/&gt;
 *     &lt;enumeration value="contraflow"/&gt;
 *     &lt;enumeration value="doNotUseSpecifiedLanesOrCarriageways"/&gt;
 *     &lt;enumeration value="hardShoulderRunningInOperation"/&gt;
 *     &lt;enumeration value="hardShoulderRunningNotInOperation"/&gt;
 *     &lt;enumeration value="heightRestrictionInOperation"/&gt;
 *     &lt;enumeration value="intermittentShortTermClosures"/&gt;
 *     &lt;enumeration value="keepToTheLeft"/&gt;
 *     &lt;enumeration value="keepToTheRight"/&gt;
 *     &lt;enumeration value="laneClosures"/&gt;
 *     &lt;enumeration value="lanesDeviated"/&gt;
 *     &lt;enumeration value="narrowLanes"/&gt;
 *     &lt;enumeration value="newRoadworksLayout"/&gt;
 *     &lt;enumeration value="overnightClosures"/&gt;
 *     &lt;enumeration value="roadCleared"/&gt;
 *     &lt;enumeration value="roadClosed"/&gt;
 *     &lt;enumeration value="rollingRoadBlock"/&gt;
 *     &lt;enumeration value="rushHourLaneInOperation"/&gt;
 *     &lt;enumeration value="singleAlternateLineTraffic"/&gt;
 *     &lt;enumeration value="tidalFlowLaneInOperation"/&gt;
 *     &lt;enumeration value="turnAroundInOperation"/&gt;
 *     &lt;enumeration value="useOfSpecifiedLanesOrCarriagewaysAllowed"/&gt;
 *     &lt;enumeration value="useSpecifiedLanesOrCarriageways"/&gt;
 *     &lt;enumeration value="vehicleStorageInOperation"/&gt;
 *     &lt;enumeration value="weightRestrictionInOperation"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadOrCarriagewayOrLaneManagementTypeEnum")
@XmlEnum
public enum RoadOrCarriagewayOrLaneManagementTypeEnum2 {

    @XmlEnumValue("carPoolLaneInOperation")
    CAR_POOL_LANE_IN_OPERATION("carPoolLaneInOperation"),
    @XmlEnumValue("carriagewayClosures")
    CARRIAGEWAY_CLOSURES("carriagewayClosures"),
    @XmlEnumValue("clearALaneForEmergencyVehicles")
    CLEAR_A_LANE_FOR_EMERGENCY_VEHICLES("clearALaneForEmergencyVehicles"),
    @XmlEnumValue("clearALaneForSnowploughsAndGrittingVehicles")
    CLEAR_A_LANE_FOR_SNOWPLOUGHS_AND_GRITTING_VEHICLES("clearALaneForSnowploughsAndGrittingVehicles"),
    @XmlEnumValue("closedPermanentlyForTheWinter")
    CLOSED_PERMANENTLY_FOR_THE_WINTER("closedPermanentlyForTheWinter"),
    @XmlEnumValue("contraflow")
    CONTRAFLOW("contraflow"),
    @XmlEnumValue("doNotUseSpecifiedLanesOrCarriageways")
    DO_NOT_USE_SPECIFIED_LANES_OR_CARRIAGEWAYS("doNotUseSpecifiedLanesOrCarriageways"),
    @XmlEnumValue("hardShoulderRunningInOperation")
    HARD_SHOULDER_RUNNING_IN_OPERATION("hardShoulderRunningInOperation"),
    @XmlEnumValue("hardShoulderRunningNotInOperation")
    HARD_SHOULDER_RUNNING_NOT_IN_OPERATION("hardShoulderRunningNotInOperation"),
    @XmlEnumValue("heightRestrictionInOperation")
    HEIGHT_RESTRICTION_IN_OPERATION("heightRestrictionInOperation"),
    @XmlEnumValue("intermittentShortTermClosures")
    INTERMITTENT_SHORT_TERM_CLOSURES("intermittentShortTermClosures"),
    @XmlEnumValue("keepToTheLeft")
    KEEP_TO_THE_LEFT("keepToTheLeft"),
    @XmlEnumValue("keepToTheRight")
    KEEP_TO_THE_RIGHT("keepToTheRight"),
    @XmlEnumValue("laneClosures")
    LANE_CLOSURES("laneClosures"),
    @XmlEnumValue("lanesDeviated")
    LANES_DEVIATED("lanesDeviated"),
    @XmlEnumValue("narrowLanes")
    NARROW_LANES("narrowLanes"),
    @XmlEnumValue("newRoadworksLayout")
    NEW_ROADWORKS_LAYOUT("newRoadworksLayout"),
    @XmlEnumValue("overnightClosures")
    OVERNIGHT_CLOSURES("overnightClosures"),
    @XmlEnumValue("roadCleared")
    ROAD_CLEARED("roadCleared"),
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),
    @XmlEnumValue("rollingRoadBlock")
    ROLLING_ROAD_BLOCK("rollingRoadBlock"),
    @XmlEnumValue("rushHourLaneInOperation")
    RUSH_HOUR_LANE_IN_OPERATION("rushHourLaneInOperation"),
    @XmlEnumValue("singleAlternateLineTraffic")
    SINGLE_ALTERNATE_LINE_TRAFFIC("singleAlternateLineTraffic"),
    @XmlEnumValue("tidalFlowLaneInOperation")
    TIDAL_FLOW_LANE_IN_OPERATION("tidalFlowLaneInOperation"),
    @XmlEnumValue("turnAroundInOperation")
    TURN_AROUND_IN_OPERATION("turnAroundInOperation"),
    @XmlEnumValue("useOfSpecifiedLanesOrCarriagewaysAllowed")
    USE_OF_SPECIFIED_LANES_OR_CARRIAGEWAYS_ALLOWED("useOfSpecifiedLanesOrCarriagewaysAllowed"),
    @XmlEnumValue("useSpecifiedLanesOrCarriageways")
    USE_SPECIFIED_LANES_OR_CARRIAGEWAYS("useSpecifiedLanesOrCarriageways"),
    @XmlEnumValue("vehicleStorageInOperation")
    VEHICLE_STORAGE_IN_OPERATION("vehicleStorageInOperation"),
    @XmlEnumValue("weightRestrictionInOperation")
    WEIGHT_RESTRICTION_IN_OPERATION("weightRestrictionInOperation"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    RoadOrCarriagewayOrLaneManagementTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadOrCarriagewayOrLaneManagementTypeEnum2 fromValue(String v) {
        for (RoadOrCarriagewayOrLaneManagementTypeEnum2 c: RoadOrCarriagewayOrLaneManagementTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
