
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc03OtherPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc03OtherPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="administrativeAreaName"/&gt;
 *     &lt;enumeration value="administrativeReferenceName"/&gt;
 *     &lt;enumeration value="airportName"/&gt;
 *     &lt;enumeration value="areaName"/&gt;
 *     &lt;enumeration value="buildingName"/&gt;
 *     &lt;enumeration value="busStopIdentifier"/&gt;
 *     &lt;enumeration value="busStopName"/&gt;
 *     &lt;enumeration value="canalName"/&gt;
 *     &lt;enumeration value="countyName"/&gt;
 *     &lt;enumeration value="ferryPortName"/&gt;
 *     &lt;enumeration value="intersectionName"/&gt;
 *     &lt;enumeration value="lakeName"/&gt;
 *     &lt;enumeration value="linkName"/&gt;
 *     &lt;enumeration value="localLinkName"/&gt;
 *     &lt;enumeration value="metroStationName"/&gt;
 *     &lt;enumeration value="nationName"/&gt;
 *     &lt;enumeration value="nonLinkedPointName"/&gt;
 *     &lt;enumeration value="parkingFacilityName"/&gt;
 *     &lt;enumeration value="pointName"/&gt;
 *     &lt;enumeration value="pointOfInterestName"/&gt;
 *     &lt;enumeration value="railwayStation"/&gt;
 *     &lt;enumeration value="regionName"/&gt;
 *     &lt;enumeration value="riverName"/&gt;
 *     &lt;enumeration value="seaName"/&gt;
 *     &lt;enumeration value="serviceAreaName"/&gt;
 *     &lt;enumeration value="tidalRiverName"/&gt;
 *     &lt;enumeration value="townName"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03OtherPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03OtherPointDescriptorSubtypeEnum2 {


    /**
     * Name of an administrative area.
     * 
     */
    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),

    /**
     * Reference name by which an administrative area is known.
     * 
     */
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),

    /**
     * Name of an airport.
     * 
     */
    @XmlEnumValue("airportName")
    AIRPORT_NAME("airportName"),

    /**
     * Name of an area.
     * 
     */
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),

    /**
     * Name of a building.
     * 
     */
    @XmlEnumValue("buildingName")
    BUILDING_NAME("buildingName"),

    /**
     * Identifier of a bus stop on the road network.
     * 
     */
    @XmlEnumValue("busStopIdentifier")
    BUS_STOP_IDENTIFIER("busStopIdentifier"),

    /**
     * Name of a bus stop on the road network.
     * 
     */
    @XmlEnumValue("busStopName")
    BUS_STOP_NAME("busStopName"),

    /**
     * Name of a canal.
     * 
     */
    @XmlEnumValue("canalName")
    CANAL_NAME("canalName"),

    /**
     * Name of a county (administrative sub-division).
     * 
     */
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),

    /**
     * Name of a ferry port.
     * 
     */
    @XmlEnumValue("ferryPortName")
    FERRY_PORT_NAME("ferryPortName"),

    /**
     * Name of a road network intersection.
     * 
     */
    @XmlEnumValue("intersectionName")
    INTERSECTION_NAME("intersectionName"),

    /**
     * Name of a lake.
     * 
     */
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),

    /**
     * Name of a road link.
     * 
     */
    @XmlEnumValue("linkName")
    LINK_NAME("linkName"),

    /**
     * Local name of a road link.
     * 
     */
    @XmlEnumValue("localLinkName")
    LOCAL_LINK_NAME("localLinkName"),

    /**
     * Name of a metro/underground station.
     * 
     */
    @XmlEnumValue("metroStationName")
    METRO_STATION_NAME("metroStationName"),

    /**
     * Name of a nation (e.g. Wales) which is a sub-division of a ISO recognised
     *             country.
     *           
     * 
     */
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),

    /**
     * Name of a point on the road network which is not at a junction or intersection.
     *           
     * 
     */
    @XmlEnumValue("nonLinkedPointName")
    NON_LINKED_POINT_NAME("nonLinkedPointName"),

    /**
     * Name of a parking facility.
     * 
     */
    @XmlEnumValue("parkingFacilityName")
    PARKING_FACILITY_NAME("parkingFacilityName"),

    /**
     * Name of a specific point.
     * 
     */
    @XmlEnumValue("pointName")
    POINT_NAME("pointName"),

    /**
     * Name of a general point of interest.
     * 
     */
    @XmlEnumValue("pointOfInterestName")
    POINT_OF_INTEREST_NAME("pointOfInterestName"),

    /**
     * Name of a railway station.
     * 
     */
    @XmlEnumValue("railwayStation")
    RAILWAY_STATION("railwayStation"),

    /**
     * Name of a geographic region.
     * 
     */
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),

    /**
     * Name of a river.
     * 
     */
    @XmlEnumValue("riverName")
    RIVER_NAME("riverName"),

    /**
     * Name of a sea.
     * 
     */
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),

    /**
     * Name of a service area on a road network.
     * 
     */
    @XmlEnumValue("serviceAreaName")
    SERVICE_AREA_NAME("serviceAreaName"),

    /**
     * Name of a river which is of a tidal nature.
     * 
     */
    @XmlEnumValue("tidalRiverName")
    TIDAL_RIVER_NAME("tidalRiverName"),

    /**
     * Name of a town.
     * 
     */
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TpegLoc03OtherPointDescriptorSubtypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03OtherPointDescriptorSubtypeEnum2 fromValue(String v) {
        for (TpegLoc03OtherPointDescriptorSubtypeEnum2 c: TpegLoc03OtherPointDescriptorSubtypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
