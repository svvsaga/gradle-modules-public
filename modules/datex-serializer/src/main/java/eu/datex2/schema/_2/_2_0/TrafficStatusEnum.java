
package eu.datex2.schema._2._2_0;

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
 *     &lt;enumeration value="impossible"/&gt;
 *     &lt;enumeration value="congested"/&gt;
 *     &lt;enumeration value="heavy"/&gt;
 *     &lt;enumeration value="freeFlow"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficStatusEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum TrafficStatusEnum {

    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),
    @XmlEnumValue("congested")
    CONGESTED("congested"),
    @XmlEnumValue("heavy")
    HEAVY("heavy"),
    @XmlEnumValue("freeFlow")
    FREE_FLOW("freeFlow"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficStatusEnum fromValue(String v) {
        for (TrafficStatusEnum c: TrafficStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
