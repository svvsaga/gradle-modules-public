
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
@XmlType(name = "SpecialDayTypeEnum")
@XmlEnum
public enum SpecialDayTypeEnum2 {

    @XmlEnumValue("dayBeforePublicHoliday")
    DAY_BEFORE_PUBLIC_HOLIDAY("dayBeforePublicHoliday"),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),
    @XmlEnumValue("dayFollowingPublicHoliday")
    DAY_FOLLOWING_PUBLIC_HOLIDAY("dayFollowingPublicHoliday"),
    @XmlEnumValue("longWeekendDay")
    LONG_WEEKEND_DAY("longWeekendDay"),
    @XmlEnumValue("inLieuOfPublicHoliday")
    IN_LIEU_OF_PUBLIC_HOLIDAY("inLieuOfPublicHoliday"),
    @XmlEnumValue("schoolDay")
    SCHOOL_DAY("schoolDay"),
    @XmlEnumValue("schoolHolidays")
    SCHOOL_HOLIDAYS("schoolHolidays"),
    @XmlEnumValue("publicEventDay")
    PUBLIC_EVENT_DAY("publicEventDay"),
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
