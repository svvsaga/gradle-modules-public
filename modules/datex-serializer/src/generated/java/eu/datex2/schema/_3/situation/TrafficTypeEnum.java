
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrafficTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accessOnlyTraffic"/&gt;
 *     &lt;enumeration value="destinedForAirport"/&gt;
 *     &lt;enumeration value="destinedForAirportArrivals"/&gt;
 *     &lt;enumeration value="destinedForAirportDepartures"/&gt;
 *     &lt;enumeration value="destinedForFerryService"/&gt;
 *     &lt;enumeration value="destinedForRailService"/&gt;
 *     &lt;enumeration value="holidayTraffic"/&gt;
 *     &lt;enumeration value="localTraffic"/&gt;
 *     &lt;enumeration value="longDistanceTraffic"/&gt;
 *     &lt;enumeration value="regionalTraffic"/&gt;
 *     &lt;enumeration value="residentsOnlyTraffic"/&gt;
 *     &lt;enumeration value="throughTraffic"/&gt;
 *     &lt;enumeration value="visitorTraffic"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficTypeEnum")
@XmlEnum
public enum TrafficTypeEnum {

    @XmlEnumValue("accessOnlyTraffic")
    ACCESS_ONLY_TRAFFIC("accessOnlyTraffic"),
    @XmlEnumValue("destinedForAirport")
    DESTINED_FOR_AIRPORT("destinedForAirport"),
    @XmlEnumValue("destinedForAirportArrivals")
    DESTINED_FOR_AIRPORT_ARRIVALS("destinedForAirportArrivals"),
    @XmlEnumValue("destinedForAirportDepartures")
    DESTINED_FOR_AIRPORT_DEPARTURES("destinedForAirportDepartures"),
    @XmlEnumValue("destinedForFerryService")
    DESTINED_FOR_FERRY_SERVICE("destinedForFerryService"),
    @XmlEnumValue("destinedForRailService")
    DESTINED_FOR_RAIL_SERVICE("destinedForRailService"),
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),
    @XmlEnumValue("localTraffic")
    LOCAL_TRAFFIC("localTraffic"),
    @XmlEnumValue("longDistanceTraffic")
    LONG_DISTANCE_TRAFFIC("longDistanceTraffic"),
    @XmlEnumValue("regionalTraffic")
    REGIONAL_TRAFFIC("regionalTraffic"),
    @XmlEnumValue("residentsOnlyTraffic")
    RESIDENTS_ONLY_TRAFFIC("residentsOnlyTraffic"),
    @XmlEnumValue("throughTraffic")
    THROUGH_TRAFFIC("throughTraffic"),
    @XmlEnumValue("visitorTraffic")
    VISITOR_TRAFFIC("visitorTraffic"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTypeEnum fromValue(String v) {
        for (TrafficTypeEnum c: TrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
