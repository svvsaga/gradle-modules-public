
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
public enum UnitOfMeasureEnum2 {

    @XmlEnumValue("feet")
    FEET("feet"),
    @XmlEnumValue("feetAndInches")
    FEET_AND_INCHES("feetAndInches"),
    @XmlEnumValue("kilometres")
    KILOMETRES("kilometres"),
    @XmlEnumValue("kilometresPerHour")
    KILOMETRES_PER_HOUR("kilometresPerHour"),
    @XmlEnumValue("metres")
    METRES("metres"),
    @XmlEnumValue("miles")
    MILES("miles"),
    @XmlEnumValue("milesPerHour")
    MILES_PER_HOUR("milesPerHour"),
    @XmlEnumValue("percentage")
    PERCENTAGE("percentage"),
    @XmlEnumValue("tonnes")
    TONNES("tonnes"),
    @XmlEnumValue("yards")
    YARDS("yards"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    UnitOfMeasureEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfMeasureEnum2 fromValue(String v) {
        for (UnitOfMeasureEnum2 c: UnitOfMeasureEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
