
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrivingConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DrivingConditionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="impossible"/&gt;
 *     &lt;enumeration value="hazardous"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="passableWithCare"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="veryHazardous"/&gt;
 *     &lt;enumeration value="winterConditions"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrivingConditionTypeEnum")
@XmlEnum
public enum DrivingConditionTypeEnum {


    /**
     * Current conditions are making driving impossible.
     * 
     */
    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),

    /**
     * Driving conditions are hazardous due to environmental conditions.
     *           
     * 
     */
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),

    /**
     * Driving conditions are normal.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * The roadway is passable to vehicles with driver care.
     * 
     */
    @XmlEnumValue("passableWithCare")
    PASSABLE_WITH_CARE("passableWithCare"),

    /**
     * Driving conditions are unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Driving conditions are very hazardous due to environmental conditions.
     *           
     * 
     */
    @XmlEnumValue("veryHazardous")
    VERY_HAZARDOUS("veryHazardous"),

    /**
     * Driving conditions are consistent with those expected in winter.
     *           
     * 
     */
    @XmlEnumValue("winterConditions")
    WINTER_CONDITIONS("winterConditions"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DrivingConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrivingConditionTypeEnum fromValue(String v) {
        for (DrivingConditionTypeEnum c: DrivingConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
