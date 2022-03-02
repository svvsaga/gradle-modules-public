
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LinearDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="aligned"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinearDirectionEnum")
@XmlEnum
public enum LinearDirectionEnum2 {


    /**
     * Indicates that both directions of traffic flow are affected by the situation or
     *             relate to the traffic data.
     *           
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related
     *             to the traffic data is in the opposite sense to the direction in which the linear element is
     *             defined.
     *           
     * 
     */
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related
     *             to the traffic data is in the same sense as the direction in which the linear element is
     *             defined.
     *           
     * 
     */
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related
     *             to the traffic data is unknown.
     *           
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    LinearDirectionEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearDirectionEnum2 fromValue(String v) {
        for (LinearDirectionEnum2 c: LinearDirectionEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
