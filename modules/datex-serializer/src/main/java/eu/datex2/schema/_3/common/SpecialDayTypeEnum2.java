
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialDayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpecialDayTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dayBeforePublicHoliday"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="dayFollowingPublicHoliday"/&gt;
 *     &lt;enumeration value="longWeekendDay"/&gt;
 *     &lt;enumeration value="inLieuOfPublicHoliday"/&gt;
 *     &lt;enumeration value="schoolDay"/&gt;
 *     &lt;enumeration value="schoolHolidays"/&gt;
 *     &lt;enumeration value="publicEventDay"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialDayTypeEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum SpecialDayTypeEnum2 {


    /**
     * The day preceding a public holiday.
     * 
     */
    @XmlEnumValue("dayBeforePublicHoliday")
    DAY_BEFORE_PUBLIC_HOLIDAY("dayBeforePublicHoliday"),

    /**
     * A public holiday in general. You may use the PublicHoliday class to refer on a
     *             specific public holiday.
     *           
     * 
     */
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),

    /**
     * A day following a public holiday.
     * 
     */
    @XmlEnumValue("dayFollowingPublicHoliday")
    DAY_FOLLOWING_PUBLIC_HOLIDAY("dayFollowingPublicHoliday"),

    /**
     * A day between a public holiday and the weekend.
     * 
     */
    @XmlEnumValue("longWeekendDay")
    LONG_WEEKEND_DAY("longWeekendDay"),

    /**
     * A holiday in lieu of a public holiday that falls on a weekend.
     * 
     */
    @XmlEnumValue("inLieuOfPublicHoliday")
    IN_LIEU_OF_PUBLIC_HOLIDAY("inLieuOfPublicHoliday"),

    /**
     * A school day.
     * 
     */
    @XmlEnumValue("schoolDay")
    SCHOOL_DAY("schoolDay"),

    /**
     * A day within the school holidays.
     * 
     */
    @XmlEnumValue("schoolHolidays")
    SCHOOL_HOLIDAYS("schoolHolidays"),

    /**
     * A day of a public event. You may use the publicEvent attribute to specify the
     *             corresponding event.
     *           
     * 
     */
    @XmlEnumValue("publicEventDay")
    PUBLIC_EVENT_DAY("publicEventDay"),

    /**
     * Some other special day.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    SpecialDayTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialDayTypeEnum2 fromValue(String v) {
        for (SpecialDayTypeEnum2 c: SpecialDayTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
