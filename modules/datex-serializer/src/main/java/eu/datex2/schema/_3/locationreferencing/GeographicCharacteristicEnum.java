
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicCharacteristicEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GeographicCharacteristicEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aroundABendInRoad"/&gt;
 *     &lt;enumeration value="onBorder"/&gt;
 *     &lt;enumeration value="onPass"/&gt;
 *     &lt;enumeration value="overCrestOfHill"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeographicCharacteristicEnum")
@XmlEnum
public enum GeographicCharacteristicEnum {


    /**
     * Around a bend in the road.
     * 
     */
    @XmlEnumValue("aroundABendInRoad")
    AROUND_A_BEND_IN_ROAD("aroundABendInRoad"),

    /**
     * On border crossing.
     * 
     */
    @XmlEnumValue("onBorder")
    ON_BORDER("onBorder"),

    /**
     * On mountain pass.
     * 
     */
    @XmlEnumValue("onPass")
    ON_PASS("onPass"),

    /**
     * Over the crest of a hill.
     * 
     */
    @XmlEnumValue("overCrestOfHill")
    OVER_CREST_OF_HILL("overCrestOfHill"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    GeographicCharacteristicEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeographicCharacteristicEnum fromValue(String v) {
        for (GeographicCharacteristicEnum c: GeographicCharacteristicEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
