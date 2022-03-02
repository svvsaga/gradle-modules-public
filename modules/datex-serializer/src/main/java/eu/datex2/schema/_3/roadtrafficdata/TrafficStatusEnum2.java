
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrafficStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stationary"/&gt;
 *     &lt;enumeration value="queuing"/&gt;
 *     &lt;enumeration value="slow"/&gt;
 *     &lt;enumeration value="heavy"/&gt;
 *     &lt;enumeration value="unspecifiedAbnormal"/&gt;
 *     &lt;enumeration value="freeFlow"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficStatusEnum")
@XmlEnum
public enum TrafficStatusEnum2 {


    /**
     * Traffic is stationary, or very near stationary, at the specified location (i.e.
     *             average speed is less than 10% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("stationary")
    STATIONARY("stationary"),

    /**
     * Traffic is queuing at the specified location, although there is still some traffic
     *             movement (i.e. average speed is between 10% and 25% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("queuing")
    QUEUING("queuing"),

    /**
     * Traffic is slow moving at the specified location, but not yet forming queues (i.e.
     *             average speed is between 25% and 75% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("slow")
    SLOW("slow"),

    /**
     * Traffic in the specified direction is heavier than usual making driving conditions
     *             more difficult than normal.
     *           
     * 
     */
    @XmlEnumValue("heavy")
    HEAVY("heavy"),

    /**
     * There are abnormal traffic conditions of an unspecified nature at the specified
     *             location.
     *           
     * 
     */
    @XmlEnumValue("unspecifiedAbnormal")
    UNSPECIFIED_ABNORMAL("unspecifiedAbnormal"),

    /**
     * Traffic at the specified location is free-flowing.
     * 
     */
    @XmlEnumValue("freeFlow")
    FREE_FLOW("freeFlow"),

    /**
     * Traffic conditions are unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TrafficStatusEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficStatusEnum2 fromValue(String v) {
        for (TrafficStatusEnum2 c: TrafficStatusEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
