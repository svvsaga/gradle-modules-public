
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarWeekWithinMonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CalendarWeekWithinMonthEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="firstWeek"/&gt;
 *     &lt;enumeration value="secondWeek"/&gt;
 *     &lt;enumeration value="thirdWeek"/&gt;
 *     &lt;enumeration value="fourthWeek"/&gt;
 *     &lt;enumeration value="fifthWeek"/&gt;
 *     &lt;enumeration value="sixthWeek"/&gt;
 *     &lt;enumeration value="lastWeek"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarWeekWithinMonthEnum")
@XmlEnum
public enum CalendarWeekWithinMonthEnum2 {

    @XmlEnumValue("firstWeek")
    FIRST_WEEK("firstWeek"),
    @XmlEnumValue("secondWeek")
    SECOND_WEEK("secondWeek"),
    @XmlEnumValue("thirdWeek")
    THIRD_WEEK("thirdWeek"),
    @XmlEnumValue("fourthWeek")
    FOURTH_WEEK("fourthWeek"),
    @XmlEnumValue("fifthWeek")
    FIFTH_WEEK("fifthWeek"),
    @XmlEnumValue("sixthWeek")
    SIXTH_WEEK("sixthWeek"),
    @XmlEnumValue("lastWeek")
    LAST_WEEK("lastWeek"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    CalendarWeekWithinMonthEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarWeekWithinMonthEnum2 fromValue(String v) {
        for (CalendarWeekWithinMonthEnum2 c: CalendarWeekWithinMonthEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
