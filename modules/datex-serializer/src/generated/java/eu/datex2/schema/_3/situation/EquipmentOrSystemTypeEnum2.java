
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
public enum EquipmentOrSystemTypeEnum2 {

    @XmlEnumValue("anprCameras")
    ANPR_CAMERAS("anprCameras"),
    @XmlEnumValue("automatedTollSystem")
    AUTOMATED_TOLL_SYSTEM("automatedTollSystem"),
    @XmlEnumValue("cctvCameras")
    CCTV_CAMERAS("cctvCameras"),
    @XmlEnumValue("emergencyRoadsideTelephones")
    EMERGENCY_ROADSIDE_TELEPHONES("emergencyRoadsideTelephones"),
    @XmlEnumValue("fireDetectionEquipment")
    FIRE_DETECTION_EQUIPMENT("fireDetectionEquipment"),
    @XmlEnumValue("galleryLights")
    GALLERY_LIGHTS("galleryLights"),
    @XmlEnumValue("laneControlSigns")
    LANE_CONTROL_SIGNS("laneControlSigns"),
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),
    @XmlEnumValue("matrixSigns")
    MATRIX_SIGNS("matrixSigns"),
    @XmlEnumValue("rampControls")
    RAMP_CONTROLS("rampControls"),
    @XmlEnumValue("roadsideCommunicationsSystem")
    ROADSIDE_COMMUNICATIONS_SYSTEM("roadsideCommunicationsSystem"),
    @XmlEnumValue("roadsidePowerSystem")
    ROADSIDE_POWER_SYSTEM("roadsidePowerSystem"),
    @XmlEnumValue("speedControlSigns")
    SPEED_CONTROL_SIGNS("speedControlSigns"),
    @XmlEnumValue("streetLighting")
    STREET_LIGHTING("streetLighting"),
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),
    @XmlEnumValue("tollGates")
    TOLL_GATES("tollGates"),
    @XmlEnumValue("trafficLightSets")
    TRAFFIC_LIGHT_SETS("trafficLightSets"),
    @XmlEnumValue("trafficSignals")
    TRAFFIC_SIGNALS("trafficSignals"),
    @XmlEnumValue("tunnelEmergencyPhones")
    TUNNEL_EMERGENCY_PHONES("tunnelEmergencyPhones"),
    @XmlEnumValue("tunnelFireFightingEquipment")
    TUNNEL_FIRE_FIGHTING_EQUIPMENT("tunnelFireFightingEquipment"),
    @XmlEnumValue("tunnelLights")
    TUNNEL_LIGHTS("tunnelLights"),
    @XmlEnumValue("tunnelMobileCommunication")
    TUNNEL_MOBILE_COMMUNICATION("tunnelMobileCommunication"),
    @XmlEnumValue("tunnelRadioCommunication")
    TUNNEL_RADIO_COMMUNICATION("tunnelRadioCommunication"),
    @XmlEnumValue("tunnelSafetySystem")
    TUNNEL_SAFETY_SYSTEM("tunnelSafetySystem"),
    @XmlEnumValue("tunnelVentilation")
    TUNNEL_VENTILATION("tunnelVentilation"),
    @XmlEnumValue("variableMessageSigns")
    VARIABLE_MESSAGE_SIGNS("variableMessageSigns"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    EquipmentOrSystemTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemTypeEnum2 fromValue(String v) {
        for (EquipmentOrSystemTypeEnum2 c: EquipmentOrSystemTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
