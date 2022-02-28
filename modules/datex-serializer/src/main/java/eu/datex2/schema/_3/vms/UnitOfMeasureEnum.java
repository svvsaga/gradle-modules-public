
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasureEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UnitOfMeasureEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="feet"/&gt;
 *     &lt;enumeration value="feetAndInches"/&gt;
 *     &lt;enumeration value="kilometres"/&gt;
 *     &lt;enumeration value="kilometresPerHour"/&gt;
 *     &lt;enumeration value="metres"/&gt;
 *     &lt;enumeration value="miles"/&gt;
 *     &lt;enumeration value="milesPerHour"/&gt;
 *     &lt;enumeration value="percentage"/&gt;
 *     &lt;enumeration value="tonnes"/&gt;
 *     &lt;enumeration value="yards"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasureEnum")
@XmlEnum
public enum UnitOfMeasureEnum {


    /**
     * The imperial unit feet
     * 
     */
    @XmlEnumValue("feet")
    FEET("feet"),

    /**
     * The imperial units feet and inches
     * 
     */
    @XmlEnumValue("feetAndInches")
    FEET_AND_INCHES("feetAndInches"),

    /**
     * The metric unit kilometres
     * 
     */
    @XmlEnumValue("kilometres")
    KILOMETRES("kilometres"),

    /**
     * The unit kilometres per hour
     * 
     */
    @XmlEnumValue("kilometresPerHour")
    KILOMETRES_PER_HOUR("kilometresPerHour"),

    /**
     * The metric unit metres
     * 
     */
    @XmlEnumValue("metres")
    METRES("metres"),

    /**
     * The imperial unit miles
     * 
     */
    @XmlEnumValue("miles")
    MILES("miles"),

    /**
     * The unit miles per hour
     * 
     */
    @XmlEnumValue("milesPerHour")
    MILES_PER_HOUR("milesPerHour"),

    /**
     * A percentage
     * 
     */
    @XmlEnumValue("percentage")
    PERCENTAGE("percentage"),

    /**
     * The metric unit tonnes
     * 
     */
    @XmlEnumValue("tonnes")
    TONNES("tonnes"),

    /**
     * The imperial unit yards
     * 
     */
    @XmlEnumValue("yards")
    YARDS("yards"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    UnitOfMeasureEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfMeasureEnum fromValue(String v) {
        for (UnitOfMeasureEnum c: UnitOfMeasureEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
