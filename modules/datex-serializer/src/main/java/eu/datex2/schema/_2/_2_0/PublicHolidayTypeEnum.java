
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicHolidayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PublicHolidayTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="betweenChristmasAndNewYear"/&gt;
 *     &lt;enumeration value="boxingDay"/&gt;
 *     &lt;enumeration value="bridgeHoliday"/&gt;
 *     &lt;enumeration value="christmasEve"/&gt;
 *     &lt;enumeration value="christmasDayAndBoxingDay"/&gt;
 *     &lt;enumeration value="christmasHolidayPeriod"/&gt;
 *     &lt;enumeration value="dayFollowingPublicHoliday"/&gt;
 *     &lt;enumeration value="easterFridayHoliday"/&gt;
 *     &lt;enumeration value="easterHolidayPeriod"/&gt;
 *     &lt;enumeration value="easterMondayHoliday"/&gt;
 *     &lt;enumeration value="easterSaturday"/&gt;
 *     &lt;enumeration value="easterSunday"/&gt;
 *     &lt;enumeration value="eveOfPublicHoliday"/&gt;
 *     &lt;enumeration value="holidayPeriod"/&gt;
 *     &lt;enumeration value="inLieuOfPublicHoliday"/&gt;
 *     &lt;enumeration value="january2ndHoliday"/&gt;
 *     &lt;enumeration value="newYearsDay"/&gt;
 *     &lt;enumeration value="newYearsEve"/&gt;
 *     &lt;enumeration value="notPublicHoliday"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PublicHolidayTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PublicHolidayTypeEnum {

    @XmlEnumValue("betweenChristmasAndNewYear")
    BETWEEN_CHRISTMAS_AND_NEW_YEAR("betweenChristmasAndNewYear"),
    @XmlEnumValue("boxingDay")
    BOXING_DAY("boxingDay"),
    @XmlEnumValue("bridgeHoliday")
    BRIDGE_HOLIDAY("bridgeHoliday"),
    @XmlEnumValue("christmasEve")
    CHRISTMAS_EVE("christmasEve"),
    @XmlEnumValue("christmasDayAndBoxingDay")
    CHRISTMAS_DAY_AND_BOXING_DAY("christmasDayAndBoxingDay"),
    @XmlEnumValue("christmasHolidayPeriod")
    CHRISTMAS_HOLIDAY_PERIOD("christmasHolidayPeriod"),
    @XmlEnumValue("dayFollowingPublicHoliday")
    DAY_FOLLOWING_PUBLIC_HOLIDAY("dayFollowingPublicHoliday"),
    @XmlEnumValue("easterFridayHoliday")
    EASTER_FRIDAY_HOLIDAY("easterFridayHoliday"),
    @XmlEnumValue("easterHolidayPeriod")
    EASTER_HOLIDAY_PERIOD("easterHolidayPeriod"),
    @XmlEnumValue("easterMondayHoliday")
    EASTER_MONDAY_HOLIDAY("easterMondayHoliday"),
    @XmlEnumValue("easterSaturday")
    EASTER_SATURDAY("easterSaturday"),
    @XmlEnumValue("easterSunday")
    EASTER_SUNDAY("easterSunday"),
    @XmlEnumValue("eveOfPublicHoliday")
    EVE_OF_PUBLIC_HOLIDAY("eveOfPublicHoliday"),
    @XmlEnumValue("holidayPeriod")
    HOLIDAY_PERIOD("holidayPeriod"),
    @XmlEnumValue("inLieuOfPublicHoliday")
    IN_LIEU_OF_PUBLIC_HOLIDAY("inLieuOfPublicHoliday"),
    @XmlEnumValue("january2ndHoliday")
    JANUARY_2_ND_HOLIDAY("january2ndHoliday"),
    @XmlEnumValue("newYearsDay")
    NEW_YEARS_DAY("newYearsDay"),
    @XmlEnumValue("newYearsEve")
    NEW_YEARS_EVE("newYearsEve"),
    @XmlEnumValue("notPublicHoliday")
    NOT_PUBLIC_HOLIDAY("notPublicHoliday"),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PublicHolidayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicHolidayTypeEnum fromValue(String v) {
        for (PublicHolidayTypeEnum c: PublicHolidayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
