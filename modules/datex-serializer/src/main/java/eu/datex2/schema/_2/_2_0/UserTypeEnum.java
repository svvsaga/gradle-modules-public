
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UserTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allUsers"/&gt;
 *     &lt;enumeration value="shoppers"/&gt;
 *     &lt;enumeration value="hotelGuests"/&gt;
 *     &lt;enumeration value="subscribers"/&gt;
 *     &lt;enumeration value="reservationHolders"/&gt;
 *     &lt;enumeration value="seasonTicketHolders"/&gt;
 *     &lt;enumeration value="registeredDisabledUsers"/&gt;
 *     &lt;enumeration value="disabled"/&gt;
 *     &lt;enumeration value="handicapped"/&gt;
 *     &lt;enumeration value="hearingImpaired"/&gt;
 *     &lt;enumeration value="visuallyImpaired"/&gt;
 *     &lt;enumeration value="wheelchairUsers"/&gt;
 *     &lt;enumeration value="elderlyUsers"/&gt;
 *     &lt;enumeration value="families"/&gt;
 *     &lt;enumeration value="men"/&gt;
 *     &lt;enumeration value="women"/&gt;
 *     &lt;enumeration value="pregnantWomen"/&gt;
 *     &lt;enumeration value="pensioners"/&gt;
 *     &lt;enumeration value="students"/&gt;
 *     &lt;enumeration value="staff"/&gt;
 *     &lt;enumeration value="employees"/&gt;
 *     &lt;enumeration value="customers"/&gt;
 *     &lt;enumeration value="visitors"/&gt;
 *     &lt;enumeration value="members"/&gt;
 *     &lt;enumeration value="shortTermParker"/&gt;
 *     &lt;enumeration value="longTermParker"/&gt;
 *     &lt;enumeration value="overnightParker"/&gt;
 *     &lt;enumeration value="sportEventAwaySupporters"/&gt;
 *     &lt;enumeration value="sportEventHomeSupporters"/&gt;
 *     &lt;enumeration value="residents"/&gt;
 *     &lt;enumeration value="commuters"/&gt;
 *     &lt;enumeration value="parkAndRideUsers"/&gt;
 *     &lt;enumeration value="parkAndWalkUser"/&gt;
 *     &lt;enumeration value="parkAndCycleUser"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserTypeEnum")
@XmlEnum
public enum UserTypeEnum {

    @XmlEnumValue("allUsers")
    ALL_USERS("allUsers"),
    @XmlEnumValue("shoppers")
    SHOPPERS("shoppers"),
    @XmlEnumValue("hotelGuests")
    HOTEL_GUESTS("hotelGuests"),
    @XmlEnumValue("subscribers")
    SUBSCRIBERS("subscribers"),
    @XmlEnumValue("reservationHolders")
    RESERVATION_HOLDERS("reservationHolders"),
    @XmlEnumValue("seasonTicketHolders")
    SEASON_TICKET_HOLDERS("seasonTicketHolders"),
    @XmlEnumValue("registeredDisabledUsers")
    REGISTERED_DISABLED_USERS("registeredDisabledUsers"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("handicapped")
    HANDICAPPED("handicapped"),
    @XmlEnumValue("hearingImpaired")
    HEARING_IMPAIRED("hearingImpaired"),
    @XmlEnumValue("visuallyImpaired")
    VISUALLY_IMPAIRED("visuallyImpaired"),
    @XmlEnumValue("wheelchairUsers")
    WHEELCHAIR_USERS("wheelchairUsers"),
    @XmlEnumValue("elderlyUsers")
    ELDERLY_USERS("elderlyUsers"),
    @XmlEnumValue("families")
    FAMILIES("families"),
    @XmlEnumValue("men")
    MEN("men"),
    @XmlEnumValue("women")
    WOMEN("women"),
    @XmlEnumValue("pregnantWomen")
    PREGNANT_WOMEN("pregnantWomen"),
    @XmlEnumValue("pensioners")
    PENSIONERS("pensioners"),
    @XmlEnumValue("students")
    STUDENTS("students"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("employees")
    EMPLOYEES("employees"),
    @XmlEnumValue("customers")
    CUSTOMERS("customers"),
    @XmlEnumValue("visitors")
    VISITORS("visitors"),
    @XmlEnumValue("members")
    MEMBERS("members"),
    @XmlEnumValue("shortTermParker")
    SHORT_TERM_PARKER("shortTermParker"),
    @XmlEnumValue("longTermParker")
    LONG_TERM_PARKER("longTermParker"),
    @XmlEnumValue("overnightParker")
    OVERNIGHT_PARKER("overnightParker"),
    @XmlEnumValue("sportEventAwaySupporters")
    SPORT_EVENT_AWAY_SUPPORTERS("sportEventAwaySupporters"),
    @XmlEnumValue("sportEventHomeSupporters")
    SPORT_EVENT_HOME_SUPPORTERS("sportEventHomeSupporters"),
    @XmlEnumValue("residents")
    RESIDENTS("residents"),
    @XmlEnumValue("commuters")
    COMMUTERS("commuters"),
    @XmlEnumValue("parkAndRideUsers")
    PARK_AND_RIDE_USERS("parkAndRideUsers"),
    @XmlEnumValue("parkAndWalkUser")
    PARK_AND_WALK_USER("parkAndWalkUser"),
    @XmlEnumValue("parkAndCycleUser")
    PARK_AND_CYCLE_USER("parkAndCycleUser"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    UserTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTypeEnum fromValue(String v) {
        for (UserTypeEnum c: UserTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
