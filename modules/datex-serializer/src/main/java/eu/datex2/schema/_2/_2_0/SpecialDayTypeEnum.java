
package eu.datex2.schema._2._2_0;

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
 *     &lt;enumeration value="bicycleRaceDay"/&gt;
 *     &lt;enumeration value="bullFightDay"/&gt;
 *     &lt;enumeration value="carnivalDay"/&gt;
 *     &lt;enumeration value="exhibitionDay"/&gt;
 *     &lt;enumeration value="festivalDay"/&gt;
 *     &lt;enumeration value="gamesDay"/&gt;
 *     &lt;enumeration value="horseRaceMeetingDay"/&gt;
 *     &lt;enumeration value="huntMeetingDay"/&gt;
 *     &lt;enumeration value="marathonRaceDay"/&gt;
 *     &lt;enumeration value="marketDay"/&gt;
 *     &lt;enumeration value="motorSportRaceMeetingDay"/&gt;
 *     &lt;enumeration value="nonWorkingDay"/&gt;
 *     &lt;enumeration value="raceMeetingDay"/&gt;
 *     &lt;enumeration value="regattaDay"/&gt;
 *     &lt;enumeration value="showDay"/&gt;
 *     &lt;enumeration value="sportsMeetingDay"/&gt;
 *     &lt;enumeration value="workingDay"/&gt;
 *     &lt;enumeration value="schoolDay"/&gt;
 *     &lt;enumeration value="electionDay"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="holidays"/&gt;
 *     &lt;enumeration value="undefinedDayType"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialDayTypeEnum")
@XmlEnum
public enum SpecialDayTypeEnum {

    @XmlEnumValue("bicycleRaceDay")
    BICYCLE_RACE_DAY("bicycleRaceDay"),
    @XmlEnumValue("bullFightDay")
    BULL_FIGHT_DAY("bullFightDay"),
    @XmlEnumValue("carnivalDay")
    CARNIVAL_DAY("carnivalDay"),
    @XmlEnumValue("exhibitionDay")
    EXHIBITION_DAY("exhibitionDay"),
    @XmlEnumValue("festivalDay")
    FESTIVAL_DAY("festivalDay"),
    @XmlEnumValue("gamesDay")
    GAMES_DAY("gamesDay"),
    @XmlEnumValue("horseRaceMeetingDay")
    HORSE_RACE_MEETING_DAY("horseRaceMeetingDay"),
    @XmlEnumValue("huntMeetingDay")
    HUNT_MEETING_DAY("huntMeetingDay"),
    @XmlEnumValue("marathonRaceDay")
    MARATHON_RACE_DAY("marathonRaceDay"),
    @XmlEnumValue("marketDay")
    MARKET_DAY("marketDay"),
    @XmlEnumValue("motorSportRaceMeetingDay")
    MOTOR_SPORT_RACE_MEETING_DAY("motorSportRaceMeetingDay"),
    @XmlEnumValue("nonWorkingDay")
    NON_WORKING_DAY("nonWorkingDay"),
    @XmlEnumValue("raceMeetingDay")
    RACE_MEETING_DAY("raceMeetingDay"),
    @XmlEnumValue("regattaDay")
    REGATTA_DAY("regattaDay"),
    @XmlEnumValue("showDay")
    SHOW_DAY("showDay"),
    @XmlEnumValue("sportsMeetingDay")
    SPORTS_MEETING_DAY("sportsMeetingDay"),
    @XmlEnumValue("workingDay")
    WORKING_DAY("workingDay"),
    @XmlEnumValue("schoolDay")
    SCHOOL_DAY("schoolDay"),
    @XmlEnumValue("electionDay")
    ELECTION_DAY("electionDay"),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),
    @XmlEnumValue("holidays")
    HOLIDAYS("holidays"),
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE("undefinedDayType"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpecialDayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialDayTypeEnum fromValue(String v) {
        for (SpecialDayTypeEnum c: SpecialDayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
