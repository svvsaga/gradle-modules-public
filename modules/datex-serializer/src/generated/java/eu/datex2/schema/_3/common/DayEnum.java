
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DayEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayEnum")
@XmlEnum
public enum DayEnum {

    @XmlEnumValue("monday")
    MONDAY("monday"),
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),
    @XmlEnumValue("friday")
    FRIDAY("friday"),
    @XmlEnumValue("saturday")
    SATURDAY("saturday"),
    @XmlEnumValue("sunday")
    SUNDAY("sunday"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayEnum fromValue(String v) {
        for (DayEnum c: DayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
