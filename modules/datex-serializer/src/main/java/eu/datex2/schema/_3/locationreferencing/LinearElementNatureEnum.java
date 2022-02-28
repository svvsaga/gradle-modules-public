
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
public enum LinearElementNatureEnum {


    /**
     * The nature of the linear element is a road.
     * 
     */
    @XmlEnumValue("road")
    ROAD("road"),

    /**
     * The nature of the linear element is a section of a road.
     * 
     */
    @XmlEnumValue("roadSection")
    ROAD_SECTION("roadSection"),

    /**
     * The nature of the linear element is a slip road.
     * 
     */
    @XmlEnumValue("slipRoad")
    SLIP_ROAD("slipRoad"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    LinearElementNatureEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearElementNatureEnum fromValue(String v) {
        for (LinearElementNatureEnum c: LinearElementNatureEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
