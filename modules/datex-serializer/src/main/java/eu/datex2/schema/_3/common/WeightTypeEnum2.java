
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeightTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="actual"/&gt;
 *     &lt;enumeration value="maximumPermitted"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightTypeEnum")
@XmlEnum
public enum WeightTypeEnum2 {


    /**
     * The weight is the actual weight of a specific vehicle
     * 
     */
    @XmlEnumValue("actual")
    ACTUAL("actual"),

    /**
     * The weight is the maximum permitted weight for a vehicle
     * 
     */
    @XmlEnumValue("maximumPermitted")
    MAXIMUM_PERMITTED("maximumPermitted"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    WeightTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightTypeEnum2 fromValue(String v) {
        for (WeightTypeEnum2 c: WeightTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
