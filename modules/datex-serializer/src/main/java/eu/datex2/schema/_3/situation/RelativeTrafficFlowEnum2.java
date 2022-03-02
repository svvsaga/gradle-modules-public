
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeTrafficFlowEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RelativeTrafficFlowEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="trafficVeryMuchHeavierThanNormal"/&gt;
 *     &lt;enumeration value="trafficHeavierThanNormal"/&gt;
 *     &lt;enumeration value="trafficFlowNormal"/&gt;
 *     &lt;enumeration value="trafficLighterThanNormal"/&gt;
 *     &lt;enumeration value="trafficVeryMuchLighterThanNormal"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelativeTrafficFlowEnum")
@XmlEnum
public enum RelativeTrafficFlowEnum2 {


    /**
     * Traffic is very much heavier than normally expected at the specified location at
     *             this date/time.
     *           
     * 
     */
    @XmlEnumValue("trafficVeryMuchHeavierThanNormal")
    TRAFFIC_VERY_MUCH_HEAVIER_THAN_NORMAL("trafficVeryMuchHeavierThanNormal"),

    /**
     * Traffic is heavier than normally expected at the specified location at this
     *             date/time.
     *           
     * 
     */
    @XmlEnumValue("trafficHeavierThanNormal")
    TRAFFIC_HEAVIER_THAN_NORMAL("trafficHeavierThanNormal"),

    /**
     * Traffic flow is normal at the specified location at this date/time.
     *           
     * 
     */
    @XmlEnumValue("trafficFlowNormal")
    TRAFFIC_FLOW_NORMAL("trafficFlowNormal"),

    /**
     * Traffic is lighter than normally expected at the specified location at this
     *             date/time.
     *           
     * 
     */
    @XmlEnumValue("trafficLighterThanNormal")
    TRAFFIC_LIGHTER_THAN_NORMAL("trafficLighterThanNormal"),

    /**
     * Traffic is very much lighter than normally expected at the specified location at
     *             this date/time.
     *           
     * 
     */
    @XmlEnumValue("trafficVeryMuchLighterThanNormal")
    TRAFFIC_VERY_MUCH_LIGHTER_THAN_NORMAL("trafficVeryMuchLighterThanNormal"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    RelativeTrafficFlowEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeTrafficFlowEnum2 fromValue(String v) {
        for (RelativeTrafficFlowEnum2 c: RelativeTrafficFlowEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
