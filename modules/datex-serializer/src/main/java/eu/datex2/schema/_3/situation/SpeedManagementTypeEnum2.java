
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpeedManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="activeSpeedControlInOperation"/&gt;
 *     &lt;enumeration value="doNotSlowdownUnnecessarily"/&gt;
 *     &lt;enumeration value="observeSpeedLimit"/&gt;
 *     &lt;enumeration value="policeSpeedChecksInOperation"/&gt;
 *     &lt;enumeration value="reduceYourSpeed"/&gt;
 *     &lt;enumeration value="speedRestrictionInOperation"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpeedManagementTypeEnum")
@XmlEnum
public enum SpeedManagementTypeEnum2 {


    /**
     * Automatic speed control measures are in place at the specified location, whereby
     *             speed limits are set by an automatic system which is triggered by traffic sensing equipment.
     *           
     * 
     */
    @XmlEnumValue("activeSpeedControlInOperation")
    ACTIVE_SPEED_CONTROL_IN_OPERATION("activeSpeedControlInOperation"),

    /**
     * Do not slow down unnecessarily.
     * 
     */
    @XmlEnumValue("doNotSlowdownUnnecessarily")
    DO_NOT_SLOWDOWN_UNNECESSARILY("doNotSlowdownUnnecessarily"),

    /**
     * Observe speed limit.
     * 
     */
    @XmlEnumValue("observeSpeedLimit")
    OBSERVE_SPEED_LIMIT("observeSpeedLimit"),

    /**
     * Police speed checks are in operation.
     * 
     */
    @XmlEnumValue("policeSpeedChecksInOperation")
    POLICE_SPEED_CHECKS_IN_OPERATION("policeSpeedChecksInOperation"),

    /**
     * Reduce your speed.
     * 
     */
    @XmlEnumValue("reduceYourSpeed")
    REDUCE_YOUR_SPEED("reduceYourSpeed"),

    /**
     * A speed restriction is in operation.
     * 
     */
    @XmlEnumValue("speedRestrictionInOperation")
    SPEED_RESTRICTION_IN_OPERATION("speedRestrictionInOperation"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    SpeedManagementTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedManagementTypeEnum2 fromValue(String v) {
        for (SpeedManagementTypeEnum2 c: SpeedManagementTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
