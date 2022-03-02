
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrOrientationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OpenlrOrientationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noOrientationOrUnknown"/&gt;
 *     &lt;enumeration value="withLineDirection"/&gt;
 *     &lt;enumeration value="againstLineDirection"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrOrientationEnum")
@XmlEnum
public enum OpenlrOrientationEnum2 {


    /**
     * No orientation or unknown
     * 
     */
    @XmlEnumValue("noOrientationOrUnknown")
    NO_ORIENTATION_OR_UNKNOWN("noOrientationOrUnknown"),

    /**
     * With line direction
     * 
     */
    @XmlEnumValue("withLineDirection")
    WITH_LINE_DIRECTION("withLineDirection"),

    /**
     * Against line direction
     * 
     */
    @XmlEnumValue("againstLineDirection")
    AGAINST_LINE_DIRECTION("againstLineDirection"),

    /**
     * Both directions
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    OpenlrOrientationEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrOrientationEnum2 fromValue(String v) {
        for (OpenlrOrientationEnum2 c: OpenlrOrientationEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
