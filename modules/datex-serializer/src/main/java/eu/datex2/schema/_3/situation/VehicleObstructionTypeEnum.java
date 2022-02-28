
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleObstructionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abandonedVehicle"/&gt;
 *     &lt;enumeration value="abnormalLoad"/&gt;
 *     &lt;enumeration value="brokenDownVehicle"/&gt;
 *     &lt;enumeration value="convoy"/&gt;
 *     &lt;enumeration value="damagedVehicle"/&gt;
 *     &lt;enumeration value="dangerousSlowMovingVehicle"/&gt;
 *     &lt;enumeration value="emergencyVehicle"/&gt;
 *     &lt;enumeration value="highSpeedEmergencyVehicle"/&gt;
 *     &lt;enumeration value="longLoad"/&gt;
 *     &lt;enumeration value="highSpeedChase"/&gt;
 *     &lt;enumeration value="medicalEmergency"/&gt;
 *     &lt;enumeration value="militaryConvoy"/&gt;
 *     &lt;enumeration value="overheightVehicle"/&gt;
 *     &lt;enumeration value="prohibitedVehicleOnTheRoad"/&gt;
 *     &lt;enumeration value="recklessDriver"/&gt;
 *     &lt;enumeration value="slowVehicle"/&gt;
 *     &lt;enumeration value="specialPermitTransport"/&gt;
 *     &lt;enumeration value="trackedVehicle"/&gt;
 *     &lt;enumeration value="unlitVehicleOnTheRoad"/&gt;
 *     &lt;enumeration value="vehicleOnFire"/&gt;
 *     &lt;enumeration value="vehicleCarryingHazardousMaterials"/&gt;
 *     &lt;enumeration value="vehicleInDifficulty"/&gt;
 *     &lt;enumeration value="vehicleOnWrongCarriageway"/&gt;
 *     &lt;enumeration value="vehicleStuck"/&gt;
 *     &lt;enumeration value="vehicleWithOverheightLoad"/&gt;
 *     &lt;enumeration value="vehicleWithOverwideLoad"/&gt;
 *     &lt;enumeration value="winterMaintetanceVehicleInTransfer"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleObstructionTypeEnum")
@XmlEnum
public enum VehicleObstructionTypeEnum {


    /**
     * Abandoned vehicle(s) on the roadway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("abandonedVehicle")
    ABANDONED_VEHICLE("abandonedVehicle"),

    /**
     * Vehicle(s) carrying exceptional load(s) which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),

    /**
     * Broken down vehicle(s) on the carriageway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("brokenDownVehicle")
    BROKEN_DOWN_VEHICLE("brokenDownVehicle"),

    /**
     * A group of vehicles moving together in formation which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("convoy")
    CONVOY("convoy"),

    /**
     * Damaged vehicle(s) on the carriageway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("damagedVehicle")
    DAMAGED_VEHICLE("damagedVehicle"),

    /**
     * Dangerous slow moving vehicles which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("dangerousSlowMovingVehicle")
    DANGEROUS_SLOW_MOVING_VEHICLE("dangerousSlowMovingVehicle"),

    /**
     * Emergency service vehicles on the roadway in response to an emergency situation.
     *           
     * 
     */
    @XmlEnumValue("emergencyVehicle")
    EMERGENCY_VEHICLE("emergencyVehicle"),

    /**
     * Emergency service vehicles progressing at high speed along the roadway in response
     *             to or en route from an emergency situation.
     *           
     * 
     */
    @XmlEnumValue("highSpeedEmergencyVehicle")
    HIGH_SPEED_EMERGENCY_VEHICLE("highSpeedEmergencyVehicle"),

    /**
     * A vehicle of length greater than that normally allowed which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("longLoad")
    LONG_LOAD("longLoad"),

    /**
     * Authorised and unauthorised vehicles are travelling at high speeds along the
     *             roadway. This may present a hazard to other vehicles.
     *           
     * 
     */
    @XmlEnumValue("highSpeedChase")
    HIGH_SPEED_CHASE("highSpeedChase"),

    /**
     * Vehicle has stopped due a medical issue of a driver or passenger
     *           
     * 
     */
    @XmlEnumValue("medicalEmergency")
    MEDICAL_EMERGENCY("medicalEmergency"),

    /**
     * A group of military vehicles moving together in formation which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("militaryConvoy")
    MILITARY_CONVOY("militaryConvoy"),

    /**
     * Vehicles of height greater than normally allowed which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("overheightVehicle")
    OVERHEIGHT_VEHICLE("overheightVehicle"),

    /**
     * Vehicles not normally permitted on the motorway are present which may cause
     *             traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("prohibitedVehicleOnTheRoad")
    PROHIBITED_VEHICLE_ON_THE_ROAD("prohibitedVehicleOnTheRoad"),

    /**
     * A vehicle being driven without due care and attention is causing a hazard to other
     *             vehicles.
     *           
     * 
     */
    @XmlEnumValue("recklessDriver")
    RECKLESS_DRIVER("recklessDriver"),

    /**
     * A vehicle travelling at well below normal highway speeds which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("slowVehicle")
    SLOW_VEHICLE("slowVehicle"),

    /**
     * Special type of load or vehicle size, or even speed, that is allowed on the road
     *             only with special permission. The presence of this transport may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("specialPermitTransport")
    SPECIAL_PERMIT_TRANSPORT("specialPermitTransport"),

    /**
     * Carterpillar tracked vehicles are in use which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("trackedVehicle")
    TRACKED_VEHICLE("trackedVehicle"),

    /**
     * Vehicles without lights are in use which may present a hazard to road users.
     *           
     * 
     */
    @XmlEnumValue("unlitVehicleOnTheRoad")
    UNLIT_VEHICLE_ON_THE_ROAD("unlitVehicleOnTheRoad"),

    /**
     * A vehicle is or has been on fire and may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("vehicleOnFire")
    VEHICLE_ON_FIRE("vehicleOnFire"),

    /**
     * Vehicles carrying materials of a hazardous nature are present and these could
     *             expose road users to additional hazards.
     *           
     * 
     */
    @XmlEnumValue("vehicleCarryingHazardousMaterials")
    VEHICLE_CARRYING_HAZARDOUS_MATERIALS("vehicleCarryingHazardousMaterials"),

    /**
     * A vehicle is experiencing difficulties (e.g. manoeuvring or propulsion
     *             difficulties) which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("vehicleInDifficulty")
    VEHICLE_IN_DIFFICULTY("vehicleInDifficulty"),

    /**
     * A vehicle is travelling the wrong way along a divided highway (i.e. on the wrong
     *             side).
     *           
     * 
     */
    @XmlEnumValue("vehicleOnWrongCarriageway")
    VEHICLE_ON_WRONG_CARRIAGEWAY("vehicleOnWrongCarriageway"),

    /**
     * One or more vehicles are stuck (i.e. unable to move) due to environmental
     *             conditions such as a snow drift or severe icy road.
     *           
     * 
     */
    @XmlEnumValue("vehicleStuck")
    VEHICLE_STUCK("vehicleStuck"),

    /**
     * An over-height vehicle which may present a hazard to road users.
     *           
     * 
     */
    @XmlEnumValue("vehicleWithOverheightLoad")
    VEHICLE_WITH_OVERHEIGHT_LOAD("vehicleWithOverheightLoad"),

    /**
     * A vehicle of width greater than that normally allowed which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("vehicleWithOverwideLoad")
    VEHICLE_WITH_OVERWIDE_LOAD("vehicleWithOverwideLoad"),

    /**
     * Winter maintenance vehicle is on the road, not doing its specific work. Its
     *             presence may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("winterMaintetanceVehicleInTransfer")
    WINTER_MAINTETANCE_VEHICLE_IN_TRANSFER("winterMaintetanceVehicleInTransfer"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    VehicleObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleObstructionTypeEnum fromValue(String v) {
        for (VehicleObstructionTypeEnum c: VehicleObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
