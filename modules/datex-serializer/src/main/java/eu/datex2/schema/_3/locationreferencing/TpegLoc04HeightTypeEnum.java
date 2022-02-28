
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc04HeightTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc04HeightTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="above"/&gt;
 *     &lt;enumeration value="aboveSeaLevel"/&gt;
 *     &lt;enumeration value="aboveStreetLevel"/&gt;
 *     &lt;enumeration value="at"/&gt;
 *     &lt;enumeration value="atSeaLevel"/&gt;
 *     &lt;enumeration value="atStreetLevel"/&gt;
 *     &lt;enumeration value="below"/&gt;
 *     &lt;enumeration value="belowSeaLevel"/&gt;
 *     &lt;enumeration value="belowStreetLevel"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc04HeightTypeEnum")
@XmlEnum
public enum TpegLoc04HeightTypeEnum {


    /**
     * Height above specified location.
     * 
     */
    @XmlEnumValue("above")
    ABOVE("above"),

    /**
     * Height above mean sea high water level.
     * 
     */
    @XmlEnumValue("aboveSeaLevel")
    ABOVE_SEA_LEVEL("aboveSeaLevel"),

    /**
     * Height above street level.
     * 
     */
    @XmlEnumValue("aboveStreetLevel")
    ABOVE_STREET_LEVEL("aboveStreetLevel"),

    /**
     * At height of specified location.
     * 
     */
    @XmlEnumValue("at")
    AT("at"),

    /**
     * At mean sea high water level.
     * 
     */
    @XmlEnumValue("atSeaLevel")
    AT_SEA_LEVEL("atSeaLevel"),

    /**
     * At street level.
     * 
     */
    @XmlEnumValue("atStreetLevel")
    AT_STREET_LEVEL("atStreetLevel"),

    /**
     * Height below specified location.
     * 
     */
    @XmlEnumValue("below")
    BELOW("below"),

    /**
     * Height below mean sea high water level.
     * 
     */
    @XmlEnumValue("belowSeaLevel")
    BELOW_SEA_LEVEL("belowSeaLevel"),

    /**
     * Height below street level.
     * 
     */
    @XmlEnumValue("belowStreetLevel")
    BELOW_STREET_LEVEL("belowStreetLevel"),

    /**
     * Undefined height reference.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * Unknown height reference.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TpegLoc04HeightTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc04HeightTypeEnum fromValue(String v) {
        for (TpegLoc04HeightTypeEnum c: TpegLoc04HeightTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
