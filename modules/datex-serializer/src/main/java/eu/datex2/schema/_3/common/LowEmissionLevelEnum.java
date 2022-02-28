
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LowEmissionLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LowEmissionLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lowLevelEmission"/&gt;
 *     &lt;enumeration value="freeOfEmission"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LowEmissionLevelEnum")
@XmlEnum
public enum LowEmissionLevelEnum {


    /**
     * Vehicles with low level emission.
     * 
     */
    @XmlEnumValue("lowLevelEmission")
    LOW_LEVEL_EMISSION("lowLevelEmission"),

    /**
     * Only vehicles that do not produce emissions (e.g. electric driven). Hybrid driven
     *             cars are allowed, when they switch to emission free mode within the considered situation.
     *           
     * 
     */
    @XmlEnumValue("freeOfEmission")
    FREE_OF_EMISSION("freeOfEmission"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    LowEmissionLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LowEmissionLevelEnum fromValue(String v) {
        for (LowEmissionLevelEnum c: LowEmissionLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
