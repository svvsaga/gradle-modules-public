
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

    @XmlEnumValue("abandonedVehicle")
    ABANDONED_VEHICLE("abandonedVehicle"),
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),
    @XmlEnumValue("brokenDownVehicle")
    BROKEN_DOWN_VEHICLE("brokenDownVehicle"),
    @XmlEnumValue("convoy")
    CONVOY("convoy"),
    @XmlEnumValue("damagedVehicle")
    DAMAGED_VEHICLE("damagedVehicle"),
    @XmlEnumValue("dangerousSlowMovingVehicle")
    DANGEROUS_SLOW_MOVING_VEHICLE("dangerousSlowMovingVehicle"),
    @XmlEnumValue("emergencyVehicle")
    EMERGENCY_VEHICLE("emergencyVehicle"),
    @XmlEnumValue("highSpeedEmergencyVehicle")
    HIGH_SPEED_EMERGENCY_VEHICLE("highSpeedEmergencyVehicle"),
    @XmlEnumValue("longLoad")
    LONG_LOAD("longLoad"),
    @XmlEnumValue("highSpeedChase")
    HIGH_SPEED_CHASE("highSpeedChase"),
    @XmlEnumValue("medicalEmergency")
    MEDICAL_EMERGENCY("medicalEmergency"),
    @XmlEnumValue("militaryConvoy")
    MILITARY_CONVOY("militaryConvoy"),
    @XmlEnumValue("overheightVehicle")
    OVERHEIGHT_VEHICLE("overheightVehicle"),
    @XmlEnumValue("prohibitedVehicleOnTheRoad")
    PROHIBITED_VEHICLE_ON_THE_ROAD("prohibitedVehicleOnTheRoad"),
    @XmlEnumValue("recklessDriver")
    RECKLESS_DRIVER("recklessDriver"),
    @XmlEnumValue("slowVehicle")
    SLOW_VEHICLE("slowVehicle"),
    @XmlEnumValue("specialPermitTransport")
    SPECIAL_PERMIT_TRANSPORT("specialPermitTransport"),
    @XmlEnumValue("trackedVehicle")
    TRACKED_VEHICLE("trackedVehicle"),
    @XmlEnumValue("unlitVehicleOnTheRoad")
    UNLIT_VEHICLE_ON_THE_ROAD("unlitVehicleOnTheRoad"),
    @XmlEnumValue("vehicleOnFire")
    VEHICLE_ON_FIRE("vehicleOnFire"),
    @XmlEnumValue("vehicleCarryingHazardousMaterials")
    VEHICLE_CARRYING_HAZARDOUS_MATERIALS("vehicleCarryingHazardousMaterials"),
    @XmlEnumValue("vehicleInDifficulty")
    VEHICLE_IN_DIFFICULTY("vehicleInDifficulty"),
    @XmlEnumValue("vehicleOnWrongCarriageway")
    VEHICLE_ON_WRONG_CARRIAGEWAY("vehicleOnWrongCarriageway"),
    @XmlEnumValue("vehicleStuck")
    VEHICLE_STUCK("vehicleStuck"),
    @XmlEnumValue("vehicleWithOverheightLoad")
    VEHICLE_WITH_OVERHEIGHT_LOAD("vehicleWithOverheightLoad"),
    @XmlEnumValue("vehicleWithOverwideLoad")
    VEHICLE_WITH_OVERWIDE_LOAD("vehicleWithOverwideLoad"),
    @XmlEnumValue("winterMaintetanceVehicleInTransfer")
    WINTER_MAINTETANCE_VEHICLE_IN_TRANSFER("winterMaintetanceVehicleInTransfer"),
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
