
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


    /**
     * Calendar week containing the first of the month. Several days of the first week of
     *             the month may occur in the previous calendar month. By construction, the last week of a
     *             preceding month can also be the first week of a subsequent month.
     *           
     * 
     */
    @XmlEnumValue("firstWeek")
    FIRST_WEEK("firstWeek"),

    /**
     * Second week of the month.
     * 
     */
    @XmlEnumValue("secondWeek")
    SECOND_WEEK("secondWeek"),

    /**
     * Third week of the month.
     * 
     */
    @XmlEnumValue("thirdWeek")
    THIRD_WEEK("thirdWeek"),

    /**
     * Fourth week of the month.
     * 
     */
    @XmlEnumValue("fourthWeek")
    FOURTH_WEEK("fourthWeek"),

    /**
     * Fifth week of the month.
     * 
     */
    @XmlEnumValue("fifthWeek")
    FIFTH_WEEK("fifthWeek"),

    /**
     * Sixth week of the month.
     * 
     */
    @XmlEnumValue("sixthWeek")
    SIXTH_WEEK("sixthWeek"),

    /**
     * Last calendar week within month, regardless of its actual number. The last
     *             calendar week is the week beginning with Monday and containing the last of the month.
     *           
     * 
     */
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
