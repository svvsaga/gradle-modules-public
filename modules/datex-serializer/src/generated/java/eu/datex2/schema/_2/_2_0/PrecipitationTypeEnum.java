
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PrecipitationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="drizzle"/&gt;
 *     &lt;enumeration value="freezingRain"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="rain"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="snow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrecipitationTypeEnum")
@XmlEnum
public enum PrecipitationTypeEnum {

    @XmlEnumValue("drizzle")
    DRIZZLE("drizzle"),
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("snow")
    SNOW("snow");
    private final String value;

    PrecipitationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrecipitationTypeEnum fromValue(String v) {
        for (PrecipitationTypeEnum c: PrecipitationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
