
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GddServiceCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GddServiceCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dangerWarning"/&gt;
 *     &lt;enumeration value="regulatory"/&gt;
 *     &lt;enumeration value="informative"/&gt;
 *     &lt;enumeration value="publicFacilities"/&gt;
 *     &lt;enumeration value="ambientConditions"/&gt;
 *     &lt;enumeration value="roadConditions"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GddServiceCategoryEnum")
@XmlEnum
public enum GddServiceCategoryEnum2 {


    /**
     * Danger warning sign information (GDD service category 11).
     * 
     */
    @XmlEnumValue("dangerWarning")
    DANGER_WARNING("dangerWarning"),

    /**
     * Informing of special obligations, restrictions or prohibitions (GDD service
     *             category 12).
     *           
     * 
     */
    @XmlEnumValue("regulatory")
    REGULATORY("regulatory"),

    /**
     * Informative, advisory, or guiding (GDD service category 13).
     * 
     */
    @XmlEnumValue("informative")
    INFORMATIVE("informative"),

    /**
     * Informing of a certain public facility and its service (GDD service category
     *             21).
     *           
     * 
     */
    @XmlEnumValue("publicFacilities")
    PUBLIC_FACILITIES("publicFacilities"),

    /**
     * Notifying of road-related ambient conditions and events on route (GDD service
     *             category 31).
     *           
     * 
     */
    @XmlEnumValue("ambientConditions")
    AMBIENT_CONDITIONS("ambientConditions"),

    /**
     * Notifying of road-related conditions and events on route (GDD service category
     *             32).
     *           
     * 
     */
    @XmlEnumValue("roadConditions")
    ROAD_CONDITIONS("roadConditions"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    GddServiceCategoryEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GddServiceCategoryEnum2 fromValue(String v) {
        for (GddServiceCategoryEnum2 c: GddServiceCategoryEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
