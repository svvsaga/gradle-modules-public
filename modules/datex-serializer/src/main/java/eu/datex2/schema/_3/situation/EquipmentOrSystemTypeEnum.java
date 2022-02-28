
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentOrSystemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EquipmentOrSystemTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anprCameras"/&gt;
 *     &lt;enumeration value="automatedTollSystem"/&gt;
 *     &lt;enumeration value="cctvCameras"/&gt;
 *     &lt;enumeration value="emergencyRoadsideTelephones"/&gt;
 *     &lt;enumeration value="fireDetectionEquipment"/&gt;
 *     &lt;enumeration value="galleryLights"/&gt;
 *     &lt;enumeration value="laneControlSigns"/&gt;
 *     &lt;enumeration value="levelCrossing"/&gt;
 *     &lt;enumeration value="matrixSigns"/&gt;
 *     &lt;enumeration value="rampControls"/&gt;
 *     &lt;enumeration value="roadsideCommunicationsSystem"/&gt;
 *     &lt;enumeration value="roadsidePowerSystem"/&gt;
 *     &lt;enumeration value="speedControlSigns"/&gt;
 *     &lt;enumeration value="streetLighting"/&gt;
 *     &lt;enumeration value="temporaryTrafficLights"/&gt;
 *     &lt;enumeration value="tollGates"/&gt;
 *     &lt;enumeration value="trafficLightSets"/&gt;
 *     &lt;enumeration value="trafficSignals"/&gt;
 *     &lt;enumeration value="tunnelEmergencyPhones"/&gt;
 *     &lt;enumeration value="tunnelFireFightingEquipment"/&gt;
 *     &lt;enumeration value="tunnelLights"/&gt;
 *     &lt;enumeration value="tunnelMobileCommunication"/&gt;
 *     &lt;enumeration value="tunnelRadioCommunication"/&gt;
 *     &lt;enumeration value="tunnelSafetySystem"/&gt;
 *     &lt;enumeration value="tunnelVentilation"/&gt;
 *     &lt;enumeration value="variableMessageSigns"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentOrSystemTypeEnum")
@XmlEnum
public enum EquipmentOrSystemTypeEnum {


    /**
     * Automatic number plate recognition cameras.
     * 
     */
    @XmlEnumValue("anprCameras")
    ANPR_CAMERAS("anprCameras"),

    /**
     * Automated toll system.
     * 
     */
    @XmlEnumValue("automatedTollSystem")
    AUTOMATED_TOLL_SYSTEM("automatedTollSystem"),

    /**
     * Closed-circuit television cameras.
     * 
     */
    @XmlEnumValue("cctvCameras")
    CCTV_CAMERAS("cctvCameras"),

    /**
     * Emergency roadside telephones.
     * 
     */
    @XmlEnumValue("emergencyRoadsideTelephones")
    EMERGENCY_ROADSIDE_TELEPHONES("emergencyRoadsideTelephones"),

    /**
     * Fire detection equipment
     * 
     */
    @XmlEnumValue("fireDetectionEquipment")
    FIRE_DETECTION_EQUIPMENT("fireDetectionEquipment"),

    /**
     * Gallery lights.
     * 
     */
    @XmlEnumValue("galleryLights")
    GALLERY_LIGHTS("galleryLights"),

    /**
     * Signs used to control lane usage (e.g. in tidal flow systems or hard shoulder
     *             running).
     *           
     * 
     */
    @XmlEnumValue("laneControlSigns")
    LANE_CONTROL_SIGNS("laneControlSigns"),

    /**
     * Level crossing (barriers and signals).
     * 
     */
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),

    /**
     * Matrix signs. These normally comprise a symbol display area surrounded by four
     *             lights (usually amber) which flash when a symbol is displayed.
     *           
     * 
     */
    @XmlEnumValue("matrixSigns")
    MATRIX_SIGNS("matrixSigns"),

    /**
     * Ramp control equipment.
     * 
     */
    @XmlEnumValue("rampControls")
    RAMP_CONTROLS("rampControls"),

    /**
     * Roadside communications system which is used by one or more roadside equipments or
     *             systems.
     *           
     * 
     */
    @XmlEnumValue("roadsideCommunicationsSystem")
    ROADSIDE_COMMUNICATIONS_SYSTEM("roadsideCommunicationsSystem"),

    /**
     * Roadside power system which is used by one or more roadside equipments or
     *             systems.
     *           
     * 
     */
    @XmlEnumValue("roadsidePowerSystem")
    ROADSIDE_POWER_SYSTEM("roadsidePowerSystem"),

    /**
     * Signs used to control traffic speed.
     * 
     */
    @XmlEnumValue("speedControlSigns")
    SPEED_CONTROL_SIGNS("speedControlSigns"),

    /**
     * Street or road lighting.
     * 
     */
    @XmlEnumValue("streetLighting")
    STREET_LIGHTING("streetLighting"),

    /**
     * Temporary traffic lights.
     * 
     */
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),

    /**
     * Toll gates.
     * 
     */
    @XmlEnumValue("tollGates")
    TOLL_GATES("tollGates"),

    /**
     * Sets of traffic lights.
     * 
     */
    @XmlEnumValue("trafficLightSets")
    TRAFFIC_LIGHT_SETS("trafficLightSets"),

    /**
     * Traffic signals.
     * 
     */
    @XmlEnumValue("trafficSignals")
    TRAFFIC_SIGNALS("trafficSignals"),

    /**
     * Tunnel emergency telephones
     * 
     */
    @XmlEnumValue("tunnelEmergencyPhones")
    TUNNEL_EMERGENCY_PHONES("tunnelEmergencyPhones"),

    /**
     * Tunnel fire fighting equipment
     * 
     */
    @XmlEnumValue("tunnelFireFightingEquipment")
    TUNNEL_FIRE_FIGHTING_EQUIPMENT("tunnelFireFightingEquipment"),

    /**
     * Tunnel lights.
     * 
     */
    @XmlEnumValue("tunnelLights")
    TUNNEL_LIGHTS("tunnelLights"),

    /**
     * Tunnel mobile coverage communication equipment
     * 
     */
    @XmlEnumValue("tunnelMobileCommunication")
    TUNNEL_MOBILE_COMMUNICATION("tunnelMobileCommunication"),

    /**
     * Tunnel radio communication equipment
     * 
     */
    @XmlEnumValue("tunnelRadioCommunication")
    TUNNEL_RADIO_COMMUNICATION("tunnelRadioCommunication"),

    /**
     * Any tunnel safety system
     * 
     */
    @XmlEnumValue("tunnelSafetySystem")
    TUNNEL_SAFETY_SYSTEM("tunnelSafetySystem"),

    /**
     * Tunnel ventilation system.
     * 
     */
    @XmlEnumValue("tunnelVentilation")
    TUNNEL_VENTILATION("tunnelVentilation"),

    /**
     * Variable message signs.
     * 
     */
    @XmlEnumValue("variableMessageSigns")
    VARIABLE_MESSAGE_SIGNS("variableMessageSigns"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    EquipmentOrSystemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemTypeEnum fromValue(String v) {
        for (EquipmentOrSystemTypeEnum c: EquipmentOrSystemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
