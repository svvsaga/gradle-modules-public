
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
public enum OpenlrOrientationEnum {

    @XmlEnumValue("noOrientationOrUnknown")
    NO_ORIENTATION_OR_UNKNOWN("noOrientationOrUnknown"),
    @XmlEnumValue("withLineDirection")
    WITH_LINE_DIRECTION("withLineDirection"),
    @XmlEnumValue("againstLineDirection")
    AGAINST_LINE_DIRECTION("againstLineDirection"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    OpenlrOrientationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrOrientationEnum fromValue(String v) {
        for (OpenlrOrientationEnum c: OpenlrOrientationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
