
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc03AreaDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc03AreaDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="administrativeAreaName"/&gt;
 *     &lt;enumeration value="administrativeReferenceName"/&gt;
 *     &lt;enumeration value="areaName"/&gt;
 *     &lt;enumeration value="countyName"/&gt;
 *     &lt;enumeration value="lakeName"/&gt;
 *     &lt;enumeration value="nationName"/&gt;
 *     &lt;enumeration value="policeForceControlAreaName"/&gt;
 *     &lt;enumeration value="regionName"/&gt;
 *     &lt;enumeration value="seaName"/&gt;
 *     &lt;enumeration value="townName"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03AreaDescriptorSubtypeEnum", namespace = "http://datex2.eu/schema/3/locationReferencing")
@XmlEnum
public enum TpegLoc03AreaDescriptorSubtypeEnum2 {


    /**
     * Name of an administrative area.
     * 
     */
    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),

    /**
     * Reference name by which administrative area is known.
     * 
     */
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),

    /**
     * Name of an area.
     * 
     */
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),

    /**
     * Name of a county (administrative sub-division).
     * 
     */
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),

    /**
     * Name of a lake.
     * 
     */
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),

    /**
     * Name of a nation (e.g. Wales) which is a sub-division of a ISO recognised
     *             country.
     *           
     * 
     */
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),

    /**
     * Name of a police force control area.
     * 
     */
    @XmlEnumValue("policeForceControlAreaName")
    POLICE_FORCE_CONTROL_AREA_NAME("policeForceControlAreaName"),

    /**
     * Name of a geographic region.
     * 
     */
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),

    /**
     * Name of a sea.
     * 
     */
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),

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

    TpegLoc03AreaDescriptorSubtypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03AreaDescriptorSubtypeEnum2 fromValue(String v) {
        for (TpegLoc03AreaDescriptorSubtypeEnum2 c: TpegLoc03AreaDescriptorSubtypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
