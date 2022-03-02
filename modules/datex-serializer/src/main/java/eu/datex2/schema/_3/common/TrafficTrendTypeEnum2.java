
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficTrendTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrafficTrendTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="trafficBuildingUp"/&gt;
 *     &lt;enumeration value="trafficEasing"/&gt;
 *     &lt;enumeration value="trafficStable"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficTrendTypeEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum TrafficTrendTypeEnum2 {


    /**
     * Traffic conditions are changing from free-flow to heavy or slow service levels.
     *             Queues may also be expected.
     *           
     * 
     */
    @XmlEnumValue("trafficBuildingUp")
    TRAFFIC_BUILDING_UP("trafficBuildingUp"),

    /**
     * Traffic conditions are changing from heavy or slow service levels to free-flow.
     *           
     * 
     */
    @XmlEnumValue("trafficEasing")
    TRAFFIC_EASING("trafficEasing"),

    /**
     * Traffic conditions are currently stable.
     * 
     */
    @XmlEnumValue("trafficStable")
    TRAFFIC_STABLE("trafficStable"),

    /**
     * The trend of traffic conditions is currently unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TrafficTrendTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTrendTypeEnum2 fromValue(String v) {
        for (TrafficTrendTypeEnum2 c: TrafficTrendTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
