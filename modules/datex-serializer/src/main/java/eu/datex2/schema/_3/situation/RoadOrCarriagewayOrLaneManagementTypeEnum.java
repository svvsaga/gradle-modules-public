
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
public enum RoadOrCarriagewayOrLaneManagementTypeEnum {


    /**
     * Dedicated car pool lane(s) are in operation for vehicles carrying at least the
     *             specified number of occupants.
     *           
     * 
     */
    @XmlEnumValue("carPoolLaneInOperation")
    CAR_POOL_LANE_IN_OPERATION("carPoolLaneInOperation"),

    /**
     * Carriageway closures are in operation at the specified location.
     *           
     * 
     */
    @XmlEnumValue("carriagewayClosures")
    CARRIAGEWAY_CLOSURES("carriagewayClosures"),

    /**
     * Clear a lane for emergency vehicles.
     * 
     */
    @XmlEnumValue("clearALaneForEmergencyVehicles")
    CLEAR_A_LANE_FOR_EMERGENCY_VEHICLES("clearALaneForEmergencyVehicles"),

    /**
     * Clear a lane for snow ploughs and gritting vehicles.
     * 
     */
    @XmlEnumValue("clearALaneForSnowploughsAndGrittingVehicles")
    CLEAR_A_LANE_FOR_SNOWPLOUGHS_AND_GRITTING_VEHICLES("clearALaneForSnowploughsAndGrittingVehicles"),

    /**
     * The road is closed to vehicles with the specified characteristics or all, if none
     *             defined, for the duration of the winter.
     *           
     * 
     */
    @XmlEnumValue("closedPermanentlyForTheWinter")
    CLOSED_PERMANENTLY_FOR_THE_WINTER("closedPermanentlyForTheWinter"),

    /**
     * Two-way traffic is temporarily sharing a single carriageway.
     * 
     */
    @XmlEnumValue("contraflow")
    CONTRAFLOW("contraflow"),

    /**
     * Do not use the specified lane(s) or carriageway(s).
     * 
     */
    @XmlEnumValue("doNotUseSpecifiedLanesOrCarriageways")
    DO_NOT_USE_SPECIFIED_LANES_OR_CARRIAGEWAYS("doNotUseSpecifiedLanesOrCarriageways"),

    /**
     * The hard shoulder is open as an operational lane.
     * 
     */
    @XmlEnumValue("hardShoulderRunningInOperation")
    HARD_SHOULDER_RUNNING_IN_OPERATION("hardShoulderRunningInOperation"),

    /**
     * the hardshoulder used for dynamic hardshoulder management is closed to vehicles
     *             i.e. not running
     *           
     * 
     */
    @XmlEnumValue("hardShoulderRunningNotInOperation")
    HARD_SHOULDER_RUNNING_NOT_IN_OPERATION("hardShoulderRunningNotInOperation"),

    /**
     * A height restriction is in operation.
     * 
     */
    @XmlEnumValue("heightRestrictionInOperation")
    HEIGHT_RESTRICTION_IN_OPERATION("heightRestrictionInOperation"),

    /**
     * Road closures occur intermittently on the specified road in the specified
     *             direction for short durations.
     *           
     * 
     */
    @XmlEnumValue("intermittentShortTermClosures")
    INTERMITTENT_SHORT_TERM_CLOSURES("intermittentShortTermClosures"),

    /**
     * Keep to the left.
     * 
     */
    @XmlEnumValue("keepToTheLeft")
    KEEP_TO_THE_LEFT("keepToTheLeft"),

    /**
     * Keep to the right.
     * 
     */
    @XmlEnumValue("keepToTheRight")
    KEEP_TO_THE_RIGHT("keepToTheRight"),

    /**
     * Lane closures are in operation at the specified location for vehicles with the
     *             specified characteristics or all, if none defined, in the specified direction.
     *           
     * 
     */
    @XmlEnumValue("laneClosures")
    LANE_CLOSURES("laneClosures"),

    /**
     * Lane deviations are in operation at the specified location.
     * 
     */
    @XmlEnumValue("lanesDeviated")
    LANES_DEVIATED("lanesDeviated"),

    /**
     * Normal lane widths are temporarily reduced.
     * 
     */
    @XmlEnumValue("narrowLanes")
    NARROW_LANES("narrowLanes"),

    /**
     * A new layout of lanes/carriageway has been implemented associated with
     *             roadworks.
     *           
     * 
     */
    @XmlEnumValue("newRoadworksLayout")
    NEW_ROADWORKS_LAYOUT("newRoadworksLayout"),

    /**
     * Every night the road is closed to vehicles with the specified characteristics or
     *             all, if none defined, in the specified direction by decision of the appropriate authorities.
     *           
     * 
     */
    @XmlEnumValue("overnightClosures")
    OVERNIGHT_CLOSURES("overnightClosures"),

    /**
     * The road has been cleared of earlier reported problems.
     * 
     */
    @XmlEnumValue("roadCleared")
    ROAD_CLEARED("roadCleared"),

    /**
     * The road is closed to vehicles with the specified characteristics or all, if none
     *             defined, in the specified direction.
     *           
     * 
     */
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),

    /**
     * Traffic officers or police are driving slowly in front of a queue of traffic to
     *             create a gap in the traffic to allow for clearance activities to take place in safety on the
     *             road ahead.
     *           
     * 
     */
    @XmlEnumValue("rollingRoadBlock")
    ROLLING_ROAD_BLOCK("rollingRoadBlock"),

    /**
     * Dedicated rush (peak) hour lane(s) are in operation.
     * 
     */
    @XmlEnumValue("rushHourLaneInOperation")
    RUSH_HOUR_LANE_IN_OPERATION("rushHourLaneInOperation"),

    /**
     * Traffic is being controlled to move in alternate single lines. This control may be
     *             undertaken by traffic lights or flagman.
     *           
     * 
     */
    @XmlEnumValue("singleAlternateLineTraffic")
    SINGLE_ALTERNATE_LINE_TRAFFIC("singleAlternateLineTraffic"),

    /**
     * Dedicated tidal flow lane(s) are in operation in the specified direction.
     *           
     * 
     */
    @XmlEnumValue("tidalFlowLaneInOperation")
    TIDAL_FLOW_LANE_IN_OPERATION("tidalFlowLaneInOperation"),

    /**
     * Traffic is being directed back down the opposite carriageway, possibly requiring
     *             the temporary removal of the central crash barrier.
     *           
     * 
     */
    @XmlEnumValue("turnAroundInOperation")
    TURN_AROUND_IN_OPERATION("turnAroundInOperation"),

    /**
     * The specified lane(s) or carriageway(s) may be used. The normal lane(s) or
     *             carriageway(s) restrictions are not currently in force.
     *           
     * 
     */
    @XmlEnumValue("useOfSpecifiedLanesOrCarriagewaysAllowed")
    USE_OF_SPECIFIED_LANES_OR_CARRIAGEWAYS_ALLOWED("useOfSpecifiedLanesOrCarriagewaysAllowed"),

    /**
     * Use the specified lane(s) or carriageway(s).
     * 
     */
    @XmlEnumValue("useSpecifiedLanesOrCarriageways")
    USE_SPECIFIED_LANES_OR_CARRIAGEWAYS("useSpecifiedLanesOrCarriageways"),

    /**
     * Vehicles are being stored on the roadway and/or at a rest area or service area at
     *             the specified location.
     *           
     * 
     */
    @XmlEnumValue("vehicleStorageInOperation")
    VEHICLE_STORAGE_IN_OPERATION("vehicleStorageInOperation"),

    /**
     * A weight restriction is in operation.
     * 
     */
    @XmlEnumValue("weightRestrictionInOperation")
    WEIGHT_RESTRICTION_IN_OPERATION("weightRestrictionInOperation"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    RoadOrCarriagewayOrLaneManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadOrCarriagewayOrLaneManagementTypeEnum fromValue(String v) {
        for (RoadOrCarriagewayOrLaneManagementTypeEnum c: RoadOrCarriagewayOrLaneManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
