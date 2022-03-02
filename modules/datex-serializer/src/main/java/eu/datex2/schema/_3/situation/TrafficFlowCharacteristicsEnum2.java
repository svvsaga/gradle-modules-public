
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficFlowCharacteristicsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrafficFlowCharacteristicsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="erraticFlow"/&gt;
 *     &lt;enumeration value="smoothFlow"/&gt;
 *     &lt;enumeration value="stopAndGo"/&gt;
 *     &lt;enumeration value="trafficBlocked"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficFlowCharacteristicsEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum TrafficFlowCharacteristicsEnum2 {


    /**
     * Traffic flow is of an irregular nature, subject to sudden changes in rates.
     *           
     * 
     */
    @XmlEnumValue("erraticFlow")
    ERRATIC_FLOW("erraticFlow"),

    /**
     * Traffic flow is smooth.
     * 
     */
    @XmlEnumValue("smoothFlow")
    SMOOTH_FLOW("smoothFlow"),

    /**
     * Traffic flow is of a stop and go nature with queues forming and ending
     *             continuously on the specified section of road.
     *           
     * 
     */
    @XmlEnumValue("stopAndGo")
    STOP_AND_GO("stopAndGo"),

    /**
     * Traffic is blocked at the specified location and in the specified direction due to
     *             an unplanned event.
     *           
     * 
     */
    @XmlEnumValue("trafficBlocked")
    TRAFFIC_BLOCKED("trafficBlocked"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TrafficFlowCharacteristicsEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficFlowCharacteristicsEnum2 fromValue(String v) {
        for (TrafficFlowCharacteristicsEnum2 c: TrafficFlowCharacteristicsEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
