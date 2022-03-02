
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrSideOfRoadEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OpenlrSideOfRoadEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onRoadOrUnknown"/&gt;
 *     &lt;enumeration value="right"/&gt;
 *     &lt;enumeration value="left"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrSideOfRoadEnum")
@XmlEnum
public enum OpenlrSideOfRoadEnum2 {


    /**
     * On road or unknown
     * 
     */
    @XmlEnumValue("onRoadOrUnknown")
    ON_ROAD_OR_UNKNOWN("onRoadOrUnknown"),

    /**
     * On the right side of the road.
     * 
     */
    @XmlEnumValue("right")
    RIGHT("right"),

    /**
     * On the left side of the road.
     * 
     */
    @XmlEnumValue("left")
    LEFT("left"),

    /**
     * On both sides of the road.
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    OpenlrSideOfRoadEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrSideOfRoadEnum2 fromValue(String v) {
        for (OpenlrSideOfRoadEnum2 c: OpenlrSideOfRoadEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
