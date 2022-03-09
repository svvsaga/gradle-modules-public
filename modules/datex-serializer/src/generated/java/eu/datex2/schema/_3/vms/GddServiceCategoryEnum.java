
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
public enum GddServiceCategoryEnum {

    @XmlEnumValue("dangerWarning")
    DANGER_WARNING("dangerWarning"),
    @XmlEnumValue("regulatory")
    REGULATORY("regulatory"),
    @XmlEnumValue("informative")
    INFORMATIVE("informative"),
    @XmlEnumValue("publicFacilities")
    PUBLIC_FACILITIES("publicFacilities"),
    @XmlEnumValue("ambientConditions")
    AMBIENT_CONDITIONS("ambientConditions"),
    @XmlEnumValue("roadConditions")
    ROAD_CONDITIONS("roadConditions"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    GddServiceCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GddServiceCategoryEnum fromValue(String v) {
        for (GddServiceCategoryEnum c: GddServiceCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
