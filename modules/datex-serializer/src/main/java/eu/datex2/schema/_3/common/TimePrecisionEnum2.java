
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePrecisionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimePrecisionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tenthsOfSecond"/&gt;
 *     &lt;enumeration value="second"/&gt;
 *     &lt;enumeration value="minute"/&gt;
 *     &lt;enumeration value="quarterHour"/&gt;
 *     &lt;enumeration value="halfHour"/&gt;
 *     &lt;enumeration value="hour"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimePrecisionEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum TimePrecisionEnum2 {


    /**
     * Time given to the nearest tenth of a second.
     * 
     */
    @XmlEnumValue("tenthsOfSecond")
    TENTHS_OF_SECOND("tenthsOfSecond"),

    /**
     * Time given to the nearest second.
     * 
     */
    @XmlEnumValue("second")
    SECOND("second"),

    /**
     * Time given to the nearest minute.
     * 
     */
    @XmlEnumValue("minute")
    MINUTE("minute"),

    /**
     * Time given to the nearest quarter hour.
     * 
     */
    @XmlEnumValue("quarterHour")
    QUARTER_HOUR("quarterHour"),

    /**
     * Time given to the nearest half hour.
     * 
     */
    @XmlEnumValue("halfHour")
    HALF_HOUR("halfHour"),

    /**
     * Time given to the nearest hour.
     * 
     */
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TimePrecisionEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimePrecisionEnum2 fromValue(String v) {
        for (TimePrecisionEnum2 c: TimePrecisionEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
