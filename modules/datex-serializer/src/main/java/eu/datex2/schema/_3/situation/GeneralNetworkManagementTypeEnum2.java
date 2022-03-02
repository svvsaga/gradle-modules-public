
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralNetworkManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GeneralNetworkManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bridgeSwingInOperation"/&gt;
 *     &lt;enumeration value="convoyService"/&gt;
 *     &lt;enumeration value="obstacleSignalling"/&gt;
 *     &lt;enumeration value="rampMeteringInOperation"/&gt;
 *     &lt;enumeration value="temporaryTrafficLights"/&gt;
 *     &lt;enumeration value="tollGatesOpen"/&gt;
 *     &lt;enumeration value="trafficBeingManuallyDirected"/&gt;
 *     &lt;enumeration value="trafficHeld"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralNetworkManagementTypeEnum")
@XmlEnum
public enum GeneralNetworkManagementTypeEnum2 {


    /**
     * The bridge at the specified location has swung or lifted and is therefore
     *             temporarily closed to traffic.
     *           
     * 
     */
    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),

    /**
     * A vehicle convoy service is in operation, for example with a snowplough running
     *             ahead due to bad weather conditions.
     *           
     * 
     */
    @XmlEnumValue("convoyService")
    CONVOY_SERVICE("convoyService"),

    /**
     * Signs are being put out before or around an obstacle to protect drivers.
     *           
     * 
     */
    @XmlEnumValue("obstacleSignalling")
    OBSTACLE_SIGNALLING("obstacleSignalling"),

    /**
     * Ramp metering is now active at the specified location.
     * 
     */
    @XmlEnumValue("rampMeteringInOperation")
    RAMP_METERING_IN_OPERATION("rampMeteringInOperation"),

    /**
     * Traffic is being controlled by temporary traffic lights (red-yellow-green or
     *             red-green).
     *           
     * 
     */
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),

    /**
     * Toll gates are open with no fee collection at the specified location.
     *           
     * 
     */
    @XmlEnumValue("tollGatesOpen")
    TOLL_GATES_OPEN("tollGatesOpen"),

    /**
     * Traffic is being manually directed.
     * 
     */
    @XmlEnumValue("trafficBeingManuallyDirected")
    TRAFFIC_BEING_MANUALLY_DIRECTED("trafficBeingManuallyDirected"),

    /**
     * Traffic in the specified direction is temporarily held up due to an unplanned
     *             event (e.g. for clearance of wreckage following an accident).
     *           
     * 
     */
    @XmlEnumValue("trafficHeld")
    TRAFFIC_HELD("trafficHeld"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    GeneralNetworkManagementTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralNetworkManagementTypeEnum2 fromValue(String v) {
        for (GeneralNetworkManagementTypeEnum2 c: GeneralNetworkManagementTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
