
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicEventTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PublicEventTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agriculturalShow"/&gt;
 *     &lt;enumeration value="airShow"/&gt;
 *     &lt;enumeration value="artEvent"/&gt;
 *     &lt;enumeration value="athleticsMeeting"/&gt;
 *     &lt;enumeration value="commercialEvent"/&gt;
 *     &lt;enumeration value="culturalEvent"/&gt;
 *     &lt;enumeration value="ballGame"/&gt;
 *     &lt;enumeration value="baseballGame"/&gt;
 *     &lt;enumeration value="basketballGame"/&gt;
 *     &lt;enumeration value="beerFestival"/&gt;
 *     &lt;enumeration value="bicycleRace"/&gt;
 *     &lt;enumeration value="boatRace"/&gt;
 *     &lt;enumeration value="boatShow"/&gt;
 *     &lt;enumeration value="boxingTournament"/&gt;
 *     &lt;enumeration value="bullFight"/&gt;
 *     &lt;enumeration value="ceremonialEvent"/&gt;
 *     &lt;enumeration value="concert"/&gt;
 *     &lt;enumeration value="cricketMatch"/&gt;
 *     &lt;enumeration value="exhibition"/&gt;
 *     &lt;enumeration value="fair"/&gt;
 *     &lt;enumeration value="festival"/&gt;
 *     &lt;enumeration value="filmFestival"/&gt;
 *     &lt;enumeration value="filmTVMaking"/&gt;
 *     &lt;enumeration value="fireworkDisplay"/&gt;
 *     &lt;enumeration value="flowerEvent"/&gt;
 *     &lt;enumeration value="foodFestival"/&gt;
 *     &lt;enumeration value="footballMatch"/&gt;
 *     &lt;enumeration value="funfair"/&gt;
 *     &lt;enumeration value="gardeningOrFlowerShow"/&gt;
 *     &lt;enumeration value="golfTournament"/&gt;
 *     &lt;enumeration value="hockeyGame"/&gt;
 *     &lt;enumeration value="horseRaceMeeting"/&gt;
 *     &lt;enumeration value="internationalSportsMeeting"/&gt;
 *     &lt;enumeration value="majorEvent"/&gt;
 *     &lt;enumeration value="marathon"/&gt;
 *     &lt;enumeration value="market"/&gt;
 *     &lt;enumeration value="match"/&gt;
 *     &lt;enumeration value="motorShow"/&gt;
 *     &lt;enumeration value="motorSportRaceMeeting"/&gt;
 *     &lt;enumeration value="openAirConcert"/&gt;
 *     &lt;enumeration value="parade"/&gt;
 *     &lt;enumeration value="procession"/&gt;
 *     &lt;enumeration value="raceMeeting"/&gt;
 *     &lt;enumeration value="rugbyMatch"/&gt;
 *     &lt;enumeration value="severalMajorEvents"/&gt;
 *     &lt;enumeration value="show"/&gt;
 *     &lt;enumeration value="showJumping"/&gt;
 *     &lt;enumeration value="soundAndLightShow"/&gt;
 *     &lt;enumeration value="sportsMeeting"/&gt;
 *     &lt;enumeration value="stateOccasion"/&gt;
 *     &lt;enumeration value="streetFestival"/&gt;
 *     &lt;enumeration value="tennisTournament"/&gt;
 *     &lt;enumeration value="theatricalEvent"/&gt;
 *     &lt;enumeration value="tournament"/&gt;
 *     &lt;enumeration value="tradeFair"/&gt;
 *     &lt;enumeration value="waterSportsMeeting"/&gt;
 *     &lt;enumeration value="wineFestival"/&gt;
 *     &lt;enumeration value="winterSportsMeeting"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PublicEventTypeEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum PublicEventTypeEnum2 {


    /**
     * Agricultural show or event which could disrupt traffic.
     * 
     */
    @XmlEnumValue("agriculturalShow")
    AGRICULTURAL_SHOW("agriculturalShow"),

    /**
     * Air show or other aeronautical event which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("airShow")
    AIR_SHOW("airShow"),

    /**
     * Art event
     * 
     */
    @XmlEnumValue("artEvent")
    ART_EVENT("artEvent"),

    /**
     * Athletics event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("athleticsMeeting")
    ATHLETICS_MEETING("athleticsMeeting"),

    /**
     * Commercial event which could disrupt traffic.
     * 
     */
    @XmlEnumValue("commercialEvent")
    COMMERCIAL_EVENT("commercialEvent"),

    /**
     * Cultural event which could disrupt traffic.
     * 
     */
    @XmlEnumValue("culturalEvent")
    CULTURAL_EVENT("culturalEvent"),

    /**
     * Ball game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("ballGame")
    BALL_GAME("ballGame"),

    /**
     * Baseball game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("baseballGame")
    BASEBALL_GAME("baseballGame"),

    /**
     * Basketball game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("basketballGame")
    BASKETBALL_GAME("basketballGame"),

    /**
     * Beer festival
     * 
     */
    @XmlEnumValue("beerFestival")
    BEER_FESTIVAL("beerFestival"),

    /**
     * Bicycle race that could disrupt traffic.
     * 
     */
    @XmlEnumValue("bicycleRace")
    BICYCLE_RACE("bicycleRace"),

    /**
     * Regatta (boat race event of sailing, powerboat or rowing) that could disrupt
     *             traffic.
     *           
     * 
     */
    @XmlEnumValue("boatRace")
    BOAT_RACE("boatRace"),

    /**
     * Boat show which could disrupt traffic.
     * 
     */
    @XmlEnumValue("boatShow")
    BOAT_SHOW("boatShow"),

    /**
     * Boxing event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("boxingTournament")
    BOXING_TOURNAMENT("boxingTournament"),

    /**
     * Bull fighting event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("bullFight")
    BULL_FIGHT("bullFight"),

    /**
     * Formal or religious act, rite or ceremony that could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("ceremonialEvent")
    CEREMONIAL_EVENT("ceremonialEvent"),

    /**
     * Concert event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("concert")
    CONCERT("concert"),

    /**
     * Cricket match that could disrupt traffic.
     * 
     */
    @XmlEnumValue("cricketMatch")
    CRICKET_MATCH("cricketMatch"),

    /**
     * Major display or trade show which could disrupt traffic.
     * 
     */
    @XmlEnumValue("exhibition")
    EXHIBITION("exhibition"),

    /**
     * Periodic (e.g. annual), often traditional, gathering for entertainment or trade
     *             promotion, which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("fair")
    FAIR("fair"),

    /**
     * Celebratory event or series of events which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("festival")
    FESTIVAL("festival"),

    /**
     * Film festival
     * 
     */
    @XmlEnumValue("filmFestival")
    FILM_FESTIVAL("filmFestival"),

    /**
     * Film or TV making event which could disrupt traffic.
     * 
     */
    @XmlEnumValue("filmTVMaking")
    FILM_TV_MAKING("filmTVMaking"),

    /**
     * Firework display
     * 
     */
    @XmlEnumValue("fireworkDisplay")
    FIREWORK_DISPLAY("fireworkDisplay"),

    /**
     * Flower event
     * 
     */
    @XmlEnumValue("flowerEvent")
    FLOWER_EVENT("flowerEvent"),

    /**
     * Food festival
     * 
     */
    @XmlEnumValue("foodFestival")
    FOOD_FESTIVAL("foodFestival"),

    /**
     * Football match that could disrupt traffic.
     * 
     */
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),

    /**
     * Periodic (e.g. annual), often traditional, gathering for entertainment, which
     *             could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("funfair")
    FUNFAIR("funfair"),

    /**
     * Gardening and/or flower show or event which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("gardeningOrFlowerShow")
    GARDENING_OR_FLOWER_SHOW("gardeningOrFlowerShow"),

    /**
     * Golf tournament event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("golfTournament")
    GOLF_TOURNAMENT("golfTournament"),

    /**
     * Hockey game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("hockeyGame")
    HOCKEY_GAME("hockeyGame"),

    /**
     * Horse race meeting that could disrupt traffic.
     * 
     */
    @XmlEnumValue("horseRaceMeeting")
    HORSE_RACE_MEETING("horseRaceMeeting"),

    /**
     * Large sporting event of an international nature that could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("internationalSportsMeeting")
    INTERNATIONAL_SPORTS_MEETING("internationalSportsMeeting"),

    /**
     * Significant organised event either on or near the roadway which could disrupt
     *             traffic.
     *           
     * 
     */
    @XmlEnumValue("majorEvent")
    MAJOR_EVENT("majorEvent"),

    /**
     * Marathon, cross-country or road running event that could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("marathon")
    MARATHON("marathon"),

    /**
     * Periodic (e.g. weekly) gathering for buying and selling, which could disrupt
     *             traffic.
     *           
     * 
     */
    @XmlEnumValue("market")
    MARKET("market"),

    /**
     * Sports match of unspecified type that could disrupt traffic.
     * 
     */
    @XmlEnumValue("match")
    MATCH("match"),

    /**
     * Motor show which could disrupt traffic.
     * 
     */
    @XmlEnumValue("motorShow")
    MOTOR_SHOW("motorShow"),

    /**
     * Motor sport race meeting that could disrupt traffic.
     * 
     */
    @XmlEnumValue("motorSportRaceMeeting")
    MOTOR_SPORT_RACE_MEETING("motorSportRaceMeeting"),

    /**
     * Open air concert
     * 
     */
    @XmlEnumValue("openAirConcert")
    OPEN_AIR_CONCERT("openAirConcert"),

    /**
     * Formal display or organised procession which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("parade")
    PARADE("parade"),

    /**
     * An organised procession which could disrupt traffic.
     * 
     */
    @XmlEnumValue("procession")
    PROCESSION("procession"),

    /**
     * Race meeting (other than horse or motor sport) that could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("raceMeeting")
    RACE_MEETING("raceMeeting"),

    /**
     * Rugby match that could disrupt traffic.
     * 
     */
    @XmlEnumValue("rugbyMatch")
    RUGBY_MATCH("rugbyMatch"),

    /**
     * A series of significant organised events either on or near the roadway which could
     *             disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("severalMajorEvents")
    SEVERAL_MAJOR_EVENTS("severalMajorEvents"),

    /**
     * Entertainment event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("show")
    SHOW("show"),

    /**
     * Horse showing jumping and tournament event that could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("showJumping")
    SHOW_JUMPING("showJumping"),

    /**
     * Sound and light show.
     * 
     */
    @XmlEnumValue("soundAndLightShow")
    SOUND_AND_LIGHT_SHOW("soundAndLightShow"),

    /**
     * Sports event of unspecified type that could disrupt traffic.
     * 
     */
    @XmlEnumValue("sportsMeeting")
    SPORTS_MEETING("sportsMeeting"),

    /**
     * Public ceremony or visit of national or international significance which could
     *             disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("stateOccasion")
    STATE_OCCASION("stateOccasion"),

    /**
     * Street festival
     * 
     */
    @XmlEnumValue("streetFestival")
    STREET_FESTIVAL("streetFestival"),

    /**
     * Tennis tournament that could disrupt traffic.
     * 
     */
    @XmlEnumValue("tennisTournament")
    TENNIS_TOURNAMENT("tennisTournament"),

    /**
     * Theatrical event
     * 
     */
    @XmlEnumValue("theatricalEvent")
    THEATRICAL_EVENT("theatricalEvent"),

    /**
     * Sporting event or series of events of unspecified type lasting more than one day
     *             which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("tournament")
    TOURNAMENT("tournament"),

    /**
     * A periodic (e.g. annual), often traditional, gathering for trade promotion, which
     *             could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("tradeFair")
    TRADE_FAIR("tradeFair"),

    /**
     * Water sports meeting that could disrupt traffic.
     * 
     */
    @XmlEnumValue("waterSportsMeeting")
    WATER_SPORTS_MEETING("waterSportsMeeting"),

    /**
     * Wine festival
     * 
     */
    @XmlEnumValue("wineFestival")
    WINE_FESTIVAL("wineFestival"),

    /**
     * Winter sports meeting or event (e.g. skiing, ski jumping, skating) that could
     *             disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("winterSportsMeeting")
    WINTER_SPORTS_MEETING("winterSportsMeeting"),

    /**
     * Service provider does not know at time of message generation.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PublicEventTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicEventTypeEnum2 fromValue(String v) {
        for (PublicEventTypeEnum2 c: PublicEventTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
