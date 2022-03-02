
package eu.datex2.schema._2._2_0;

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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrSideOfRoadEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum OpenlrSideOfRoadEnum {

    @XmlEnumValue("onRoadOrUnknown")
    ON_ROAD_OR_UNKNOWN("onRoadOrUnknown"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    OpenlrSideOfRoadEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrSideOfRoadEnum fromValue(String v) {
        for (OpenlrSideOfRoadEnum c: OpenlrSideOfRoadEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
