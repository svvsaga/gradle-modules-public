
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationIntensityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PrecipitationIntensityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noPhenomena"/&gt;
 *     &lt;enumeration value="light"/&gt;
 *     &lt;enumeration value="moderate"/&gt;
 *     &lt;enumeration value="heavy"/&gt;
 *     &lt;enumeration value="violent"/&gt;
 *     &lt;enumeration value="severe"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrecipitationIntensityEnum")
@XmlEnum
public enum PrecipitationIntensityEnum2 {


    /**
     * No precipitation phenomena.
     * 
     */
    @XmlEnumValue("noPhenomena")
    NO_PHENOMENA("noPhenomena"),

    /**
     * Light precipitation.
     * 
     */
    @XmlEnumValue("light")
    LIGHT("light"),

    /**
     * Moderate precipitation.
     * 
     */
    @XmlEnumValue("moderate")
    MODERATE("moderate"),

    /**
     * Heavy precipitation.
     * 
     */
    @XmlEnumValue("heavy")
    HEAVY("heavy"),

    /**
     * Violent precipitation.
     * 
     */
    @XmlEnumValue("violent")
    VIOLENT("violent"),

    /**
     * #
     * 
     */
    @XmlEnumValue("severe")
    SEVERE("severe"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PrecipitationIntensityEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrecipitationIntensityEnum2 fromValue(String v) {
        for (PrecipitationIntensityEnum2 c: PrecipitationIntensityEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
