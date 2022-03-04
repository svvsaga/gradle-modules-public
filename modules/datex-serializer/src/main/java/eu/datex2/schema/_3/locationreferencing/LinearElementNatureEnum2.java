
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearElementNatureEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LinearElementNatureEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="roadSection"/&gt;
 *     &lt;enumeration value="slipRoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinearElementNatureEnum")
@XmlEnum
public enum LinearElementNatureEnum2 {

    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("roadSection")
    ROAD_SECTION("roadSection"),
    @XmlEnumValue("slipRoad")
    SLIP_ROAD("slipRoad"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    LinearElementNatureEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearElementNatureEnum2 fromValue(String v) {
        for (LinearElementNatureEnum2 c: LinearElementNatureEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
