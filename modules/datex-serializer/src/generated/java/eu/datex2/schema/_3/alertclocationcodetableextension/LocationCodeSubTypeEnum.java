
package eu.datex2.schema._3.alertclocationcodetableextension;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCodeSubTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationCodeSubTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="continent"/&gt;
 *     &lt;enumeration value="countryGroup"/&gt;
 *     &lt;enumeration value="country"/&gt;
 *     &lt;enumeration value="waterArea"/&gt;
 *     &lt;enumeration value="sea"/&gt;
 *     &lt;enumeration value="lake"/&gt;
 *     &lt;enumeration value="fuzzyArea"/&gt;
 *     &lt;enumeration value="touristArea"/&gt;
 *     &lt;enumeration value="metropolitanArea"/&gt;
 *     &lt;enumeration value="industrialArea"/&gt;
 *     &lt;enumeration value="trafficArea"/&gt;
 *     &lt;enumeration value="metrologicalArea"/&gt;
 *     &lt;enumeration value="carpoolArea"/&gt;
 *     &lt;enumeration value="parkAndRideSite"/&gt;
 *     &lt;enumeration value="carParkArea"/&gt;
 *     &lt;enumeration value="firstOrderArea"/&gt;
 *     &lt;enumeration value="secondOrderArea"/&gt;
 *     &lt;enumeration value="thirdOrderArea"/&gt;
 *     &lt;enumeration value="ruralCountry"/&gt;
 *     &lt;enumeration value="urbanCountry"/&gt;
 *     &lt;enumeration value="fourthOrderArea"/&gt;
 *     &lt;enumeration value="fifthOrderArea"/&gt;
 *     &lt;enumeration value="applicationRegion"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="motorway"/&gt;
 *     &lt;enumeration value="firstClassRoad"/&gt;
 *     &lt;enumeration value="secondClassRoad"/&gt;
 *     &lt;enumeration value="thirdClassRoad"/&gt;
 *     &lt;enumeration value="ringRoad"/&gt;
 *     &lt;enumeration value="ringMotorway"/&gt;
 *     &lt;enumeration value="otherRingRoad"/&gt;
 *     &lt;enumeration value="firstOrderSegment"/&gt;
 *     &lt;enumeration value="secondOrderSegment"/&gt;
 *     &lt;enumeration value="urbanStreet"/&gt;
 *     &lt;enumeration value="vehicularLink"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="vehicularRailLink"/&gt;
 *     &lt;enumeration value="junction"/&gt;
 *     &lt;enumeration value="motorwayIntersection"/&gt;
 *     &lt;enumeration value="motorwayTriangle"/&gt;
 *     &lt;enumeration value="motorwayJunction"/&gt;
 *     &lt;enumeration value="motorwayExit"/&gt;
 *     &lt;enumeration value="motorwayEntrance"/&gt;
 *     &lt;enumeration value="flyover"/&gt;
 *     &lt;enumeration value="underpass"/&gt;
 *     &lt;enumeration value="roundabout"/&gt;
 *     &lt;enumeration value="trafficLight"/&gt;
 *     &lt;enumeration value="crossroads"/&gt;
 *     &lt;enumeration value="tJunction"/&gt;
 *     &lt;enumeration value="intermediateNode"/&gt;
 *     &lt;enumeration value="connection"/&gt;
 *     &lt;enumeration value="exit"/&gt;
 *     &lt;enumeration value="intermediatePoint"/&gt;
 *     &lt;enumeration value="distanceMarker"/&gt;
 *     &lt;enumeration value="trafficMonitoringStation"/&gt;
 *     &lt;enumeration value="otherLandmark"/&gt;
 *     &lt;enumeration value="tunnel"/&gt;
 *     &lt;enumeration value="bridge"/&gt;
 *     &lt;enumeration value="serviceArea"/&gt;
 *     &lt;enumeration value="restArea"/&gt;
 *     &lt;enumeration value="viewPoint"/&gt;
 *     &lt;enumeration value="carpoolPoint"/&gt;
 *     &lt;enumeration value="parkAndRideSitePoint"/&gt;
 *     &lt;enumeration value="carParkPoint"/&gt;
 *     &lt;enumeration value="kiosk"/&gt;
 *     &lt;enumeration value="kioskWithWC"/&gt;
 *     &lt;enumeration value="petrolStation"/&gt;
 *     &lt;enumeration value="petrolStationWithKiosk"/&gt;
 *     &lt;enumeration value="motel"/&gt;
 *     &lt;enumeration value="border"/&gt;
 *     &lt;enumeration value="customsPost"/&gt;
 *     &lt;enumeration value="tollPlaza"/&gt;
 *     &lt;enumeration value="ferryTerminal"/&gt;
 *     &lt;enumeration value="harbour"/&gt;
 *     &lt;enumeration value="square"/&gt;
 *     &lt;enumeration value="fair"/&gt;
 *     &lt;enumeration value="garage"/&gt;
 *     &lt;enumeration value="undergroundGarage"/&gt;
 *     &lt;enumeration value="retailPark"/&gt;
 *     &lt;enumeration value="themePark"/&gt;
 *     &lt;enumeration value="touristAttraction"/&gt;
 *     &lt;enumeration value="university"/&gt;
 *     &lt;enumeration value="airport"/&gt;
 *     &lt;enumeration value="station"/&gt;
 *     &lt;enumeration value="hospital"/&gt;
 *     &lt;enumeration value="church"/&gt;
 *     &lt;enumeration value="stadium"/&gt;
 *     &lt;enumeration value="castle"/&gt;
 *     &lt;enumeration value="townHall"/&gt;
 *     &lt;enumeration value="exhibitionCentre"/&gt;
 *     &lt;enumeration value="communities"/&gt;
 *     &lt;enumeration value="placeName"/&gt;
 *     &lt;enumeration value="dam"/&gt;
 *     &lt;enumeration value="dike"/&gt;
 *     &lt;enumeration value="aqueduct"/&gt;
 *     &lt;enumeration value="lock"/&gt;
 *     &lt;enumeration value="mountainCrossing"/&gt;
 *     &lt;enumeration value="railRoadCrossing"/&gt;
 *     &lt;enumeration value="wade"/&gt;
 *     &lt;enumeration value="ferryPoint"/&gt;
 *     &lt;enumeration value="industrialAreaPoint"/&gt;
 *     &lt;enumeration value="viaduct"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCodeSubTypeEnum")
@XmlEnum
public enum LocationCodeSubTypeEnum {

    @XmlEnumValue("continent")
    CONTINENT("continent"),
    @XmlEnumValue("countryGroup")
    COUNTRY_GROUP("countryGroup"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("waterArea")
    WATER_AREA("waterArea"),
    @XmlEnumValue("sea")
    SEA("sea"),
    @XmlEnumValue("lake")
    LAKE("lake"),
    @XmlEnumValue("fuzzyArea")
    FUZZY_AREA("fuzzyArea"),
    @XmlEnumValue("touristArea")
    TOURIST_AREA("touristArea"),
    @XmlEnumValue("metropolitanArea")
    METROPOLITAN_AREA("metropolitanArea"),
    @XmlEnumValue("industrialArea")
    INDUSTRIAL_AREA("industrialArea"),
    @XmlEnumValue("trafficArea")
    TRAFFIC_AREA("trafficArea"),
    @XmlEnumValue("metrologicalArea")
    METROLOGICAL_AREA("metrologicalArea"),
    @XmlEnumValue("carpoolArea")
    CARPOOL_AREA("carpoolArea"),
    @XmlEnumValue("parkAndRideSite")
    PARK_AND_RIDE_SITE("parkAndRideSite"),
    @XmlEnumValue("carParkArea")
    CAR_PARK_AREA("carParkArea"),
    @XmlEnumValue("firstOrderArea")
    FIRST_ORDER_AREA("firstOrderArea"),
    @XmlEnumValue("secondOrderArea")
    SECOND_ORDER_AREA("secondOrderArea"),
    @XmlEnumValue("thirdOrderArea")
    THIRD_ORDER_AREA("thirdOrderArea"),
    @XmlEnumValue("ruralCountry")
    RURAL_COUNTRY("ruralCountry"),
    @XmlEnumValue("urbanCountry")
    URBAN_COUNTRY("urbanCountry"),
    @XmlEnumValue("fourthOrderArea")
    FOURTH_ORDER_AREA("fourthOrderArea"),
    @XmlEnumValue("fifthOrderArea")
    FIFTH_ORDER_AREA("fifthOrderArea"),
    @XmlEnumValue("applicationRegion")
    APPLICATION_REGION("applicationRegion"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("firstClassRoad")
    FIRST_CLASS_ROAD("firstClassRoad"),
    @XmlEnumValue("secondClassRoad")
    SECOND_CLASS_ROAD("secondClassRoad"),
    @XmlEnumValue("thirdClassRoad")
    THIRD_CLASS_ROAD("thirdClassRoad"),
    @XmlEnumValue("ringRoad")
    RING_ROAD("ringRoad"),
    @XmlEnumValue("ringMotorway")
    RING_MOTORWAY("ringMotorway"),
    @XmlEnumValue("otherRingRoad")
    OTHER_RING_ROAD("otherRingRoad"),
    @XmlEnumValue("firstOrderSegment")
    FIRST_ORDER_SEGMENT("firstOrderSegment"),
    @XmlEnumValue("secondOrderSegment")
    SECOND_ORDER_SEGMENT("secondOrderSegment"),
    @XmlEnumValue("urbanStreet")
    URBAN_STREET("urbanStreet"),
    @XmlEnumValue("vehicularLink")
    VEHICULAR_LINK("vehicularLink"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("vehicularRailLink")
    VEHICULAR_RAIL_LINK("vehicularRailLink"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("motorwayIntersection")
    MOTORWAY_INTERSECTION("motorwayIntersection"),
    @XmlEnumValue("motorwayTriangle")
    MOTORWAY_TRIANGLE("motorwayTriangle"),
    @XmlEnumValue("motorwayJunction")
    MOTORWAY_JUNCTION("motorwayJunction"),
    @XmlEnumValue("motorwayExit")
    MOTORWAY_EXIT("motorwayExit"),
    @XmlEnumValue("motorwayEntrance")
    MOTORWAY_ENTRANCE("motorwayEntrance"),
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("trafficLight")
    TRAFFIC_LIGHT("trafficLight"),
    @XmlEnumValue("crossroads")
    CROSSROADS("crossroads"),
    @XmlEnumValue("tJunction")
    T_JUNCTION("tJunction"),
    @XmlEnumValue("intermediateNode")
    INTERMEDIATE_NODE("intermediateNode"),
    @XmlEnumValue("connection")
    CONNECTION("connection"),
    @XmlEnumValue("exit")
    EXIT("exit"),
    @XmlEnumValue("intermediatePoint")
    INTERMEDIATE_POINT("intermediatePoint"),
    @XmlEnumValue("distanceMarker")
    DISTANCE_MARKER("distanceMarker"),
    @XmlEnumValue("trafficMonitoringStation")
    TRAFFIC_MONITORING_STATION("trafficMonitoringStation"),
    @XmlEnumValue("otherLandmark")
    OTHER_LANDMARK("otherLandmark"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("bridge")
    BRIDGE("bridge"),
    @XmlEnumValue("serviceArea")
    SERVICE_AREA("serviceArea"),
    @XmlEnumValue("restArea")
    REST_AREA("restArea"),
    @XmlEnumValue("viewPoint")
    VIEW_POINT("viewPoint"),
    @XmlEnumValue("carpoolPoint")
    CARPOOL_POINT("carpoolPoint"),
    @XmlEnumValue("parkAndRideSitePoint")
    PARK_AND_RIDE_SITE_POINT("parkAndRideSitePoint"),
    @XmlEnumValue("carParkPoint")
    CAR_PARK_POINT("carParkPoint"),
    @XmlEnumValue("kiosk")
    KIOSK("kiosk"),
    @XmlEnumValue("kioskWithWC")
    KIOSK_WITH_WC("kioskWithWC"),
    @XmlEnumValue("petrolStation")
    PETROL_STATION("petrolStation"),
    @XmlEnumValue("petrolStationWithKiosk")
    PETROL_STATION_WITH_KIOSK("petrolStationWithKiosk"),
    @XmlEnumValue("motel")
    MOTEL("motel"),
    @XmlEnumValue("border")
    BORDER("border"),
    @XmlEnumValue("customsPost")
    CUSTOMS_POST("customsPost"),
    @XmlEnumValue("tollPlaza")
    TOLL_PLAZA("tollPlaza"),
    @XmlEnumValue("ferryTerminal")
    FERRY_TERMINAL("ferryTerminal"),
    @XmlEnumValue("harbour")
    HARBOUR("harbour"),
    @XmlEnumValue("square")
    SQUARE("square"),
    @XmlEnumValue("fair")
    FAIR("fair"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("undergroundGarage")
    UNDERGROUND_GARAGE("undergroundGarage"),
    @XmlEnumValue("retailPark")
    RETAIL_PARK("retailPark"),
    @XmlEnumValue("themePark")
    THEME_PARK("themePark"),
    @XmlEnumValue("touristAttraction")
    TOURIST_ATTRACTION("touristAttraction"),
    @XmlEnumValue("university")
    UNIVERSITY("university"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("station")
    STATION("station"),
    @XmlEnumValue("hospital")
    HOSPITAL("hospital"),
    @XmlEnumValue("church")
    CHURCH("church"),
    @XmlEnumValue("stadium")
    STADIUM("stadium"),
    @XmlEnumValue("castle")
    CASTLE("castle"),
    @XmlEnumValue("townHall")
    TOWN_HALL("townHall"),
    @XmlEnumValue("exhibitionCentre")
    EXHIBITION_CENTRE("exhibitionCentre"),
    @XmlEnumValue("communities")
    COMMUNITIES("communities"),
    @XmlEnumValue("placeName")
    PLACE_NAME("placeName"),
    @XmlEnumValue("dam")
    DAM("dam"),
    @XmlEnumValue("dike")
    DIKE("dike"),
    @XmlEnumValue("aqueduct")
    AQUEDUCT("aqueduct"),
    @XmlEnumValue("lock")
    LOCK("lock"),
    @XmlEnumValue("mountainCrossing")
    MOUNTAIN_CROSSING("mountainCrossing"),
    @XmlEnumValue("railRoadCrossing")
    RAIL_ROAD_CROSSING("railRoadCrossing"),
    @XmlEnumValue("wade")
    WADE("wade"),
    @XmlEnumValue("ferryPoint")
    FERRY_POINT("ferryPoint"),
    @XmlEnumValue("industrialAreaPoint")
    INDUSTRIAL_AREA_POINT("industrialAreaPoint"),
    @XmlEnumValue("viaduct")
    VIADUCT("viaduct"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    LocationCodeSubTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCodeSubTypeEnum fromValue(String v) {
        for (LocationCodeSubTypeEnum c: LocationCodeSubTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
