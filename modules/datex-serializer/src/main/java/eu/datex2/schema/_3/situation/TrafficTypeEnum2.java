
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
public enum TrafficTypeEnum2 {


    /**
     * Traffic destined for local access only.
     * 
     */
    @XmlEnumValue("accessOnlyTraffic")
    ACCESS_ONLY_TRAFFIC("accessOnlyTraffic"),

    /**
     * Traffic destined for the airport.
     * 
     */
    @XmlEnumValue("destinedForAirport")
    DESTINED_FOR_AIRPORT("destinedForAirport"),

    /**
     * Traffic destined for airport arrivals.
     * 
     */
    @XmlEnumValue("destinedForAirportArrivals")
    DESTINED_FOR_AIRPORT_ARRIVALS("destinedForAirportArrivals"),

    /**
     * Traffic destined for airport departures.
     * 
     */
    @XmlEnumValue("destinedForAirportDepartures")
    DESTINED_FOR_AIRPORT_DEPARTURES("destinedForAirportDepartures"),

    /**
     * Traffic destined for the ferry service.
     * 
     */
    @XmlEnumValue("destinedForFerryService")
    DESTINED_FOR_FERRY_SERVICE("destinedForFerryService"),

    /**
     * Traffic destined for the rail service.
     * 
     */
    @XmlEnumValue("destinedForRailService")
    DESTINED_FOR_RAIL_SERVICE("destinedForRailService"),

    /**
     * Traffic heading towards holiday destinations.
     * 
     */
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),

    /**
     * Traffic heading towards local destinations.
     * 
     */
    @XmlEnumValue("localTraffic")
    LOCAL_TRAFFIC("localTraffic"),

    /**
     * Traffic heading towards destinations which are a long distance away.
     *           
     * 
     */
    @XmlEnumValue("longDistanceTraffic")
    LONG_DISTANCE_TRAFFIC("longDistanceTraffic"),

    /**
     * Traffic heading towards local regional destinations.
     * 
     */
    @XmlEnumValue("regionalTraffic")
    REGIONAL_TRAFFIC("regionalTraffic"),

    /**
     * Local residents only traffic.
     * 
     */
    @XmlEnumValue("residentsOnlyTraffic")
    RESIDENTS_ONLY_TRAFFIC("residentsOnlyTraffic"),

    /**
     * Traffic which is not for local access, i.e. traffic not destined for local town,
     *             city or built up area but for transit though the area.
     *           
     * 
     */
    @XmlEnumValue("throughTraffic")
    THROUGH_TRAFFIC("throughTraffic"),

    /**
     * Traffic heading towards local visitor attraction.
     * 
     */
    @XmlEnumValue("visitorTraffic")
    VISITOR_TRAFFIC("visitorTraffic"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TrafficTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTypeEnum2 fromValue(String v) {
        for (TrafficTypeEnum2 c: TrafficTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
