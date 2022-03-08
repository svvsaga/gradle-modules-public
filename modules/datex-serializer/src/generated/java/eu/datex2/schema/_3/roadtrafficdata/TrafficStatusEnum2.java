
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

    @XmlEnumValue("stationary")
    STATIONARY("stationary"),
    @XmlEnumValue("queuing")
    QUEUING("queuing"),
    @XmlEnumValue("slow")
    SLOW("slow"),
    @XmlEnumValue("heavy")
    HEAVY("heavy"),
    @XmlEnumValue("unspecifiedAbnormal")
    UNSPECIFIED_ABNORMAL("unspecifiedAbnormal"),
    @XmlEnumValue("freeFlow")
    FREE_FLOW("freeFlow"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
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
