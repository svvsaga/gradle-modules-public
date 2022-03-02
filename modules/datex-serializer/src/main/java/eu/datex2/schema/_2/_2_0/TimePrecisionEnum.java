
package eu.datex2.schema._2._2_0;

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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimePrecisionEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum TimePrecisionEnum {

    @XmlEnumValue("tenthsOfSecond")
    TENTHS_OF_SECOND("tenthsOfSecond"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("minute")
    MINUTE("minute"),
    @XmlEnumValue("quarterHour")
    QUARTER_HOUR("quarterHour"),
    @XmlEnumValue("halfHour")
    HALF_HOUR("halfHour"),
    @XmlEnumValue("hour")
    HOUR("hour");
    private final String value;

    TimePrecisionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimePrecisionEnum fromValue(String v) {
        for (TimePrecisionEnum c: TimePrecisionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
