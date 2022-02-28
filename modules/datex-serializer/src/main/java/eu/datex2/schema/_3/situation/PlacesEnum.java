
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PlacesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aroundBendsInTheRoad"/&gt;
 *     &lt;enumeration value="atCustomsPosts"/&gt;
 *     &lt;enumeration value="atHighAltitudes"/&gt;
 *     &lt;enumeration value="atRestAreas"/&gt;
 *     &lt;enumeration value="atServiceAreas"/&gt;
 *     &lt;enumeration value="atTollPlazas"/&gt;
 *     &lt;enumeration value="inBuiltUpAreas"/&gt;
 *     &lt;enumeration value="inContraflowSections"/&gt;
 *     &lt;enumeration value="inForestedAreas"/&gt;
 *     &lt;enumeration value="inGalleries"/&gt;
 *     &lt;enumeration value="inLowLyingAreas"/&gt;
 *     &lt;enumeration value="inRoadworksAreas"/&gt;
 *     &lt;enumeration value="inRuralAreas"/&gt;
 *     &lt;enumeration value="inShadedAreas"/&gt;
 *     &lt;enumeration value="inTheInnerCityAreas"/&gt;
 *     &lt;enumeration value="inTheCityCentre"/&gt;
 *     &lt;enumeration value="inTunnels"/&gt;
 *     &lt;enumeration value="onBridges"/&gt;
 *     &lt;enumeration value="onDownHillSections"/&gt;
 *     &lt;enumeration value="onDualCarriagewaySections"/&gt;
 *     &lt;enumeration value="onElevatedSections"/&gt;
 *     &lt;enumeration value="onEnteringOrLeavingTunnels"/&gt;
 *     &lt;enumeration value="onEnteringTheCountry"/&gt;
 *     &lt;enumeration value="onFlyovers"/&gt;
 *     &lt;enumeration value="onLeavingTheCountry"/&gt;
 *     &lt;enumeration value="onMotorways"/&gt;
 *     &lt;enumeration value="onNonMotorways"/&gt;
 *     &lt;enumeration value="onPasses"/&gt;
 *     &lt;enumeration value="onRoundabouts"/&gt;
 *     &lt;enumeration value="onSingleCarriagewaySections"/&gt;
 *     &lt;enumeration value="onSlipRoads"/&gt;
 *     &lt;enumeration value="onUndergroundSections"/&gt;
 *     &lt;enumeration value="onUnderpasses"/&gt;
 *     &lt;enumeration value="onUpHillSections"/&gt;
 *     &lt;enumeration value="overTheCrestOfHills"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlacesEnum")
@XmlEnum
public enum PlacesEnum {


    /**
     * Around bends in the road.
     * 
     */
    @XmlEnumValue("aroundBendsInTheRoad")
    AROUND_BENDS_IN_THE_ROAD("aroundBendsInTheRoad"),

    /**
     * At customs posts.
     * 
     */
    @XmlEnumValue("atCustomsPosts")
    AT_CUSTOMS_POSTS("atCustomsPosts"),

    /**
     * At high altitudes.
     * 
     */
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),

    /**
     * At rest areas
     * 
     */
    @XmlEnumValue("atRestAreas")
    AT_REST_AREAS("atRestAreas"),

    /**
     * At service areas
     * 
     */
    @XmlEnumValue("atServiceAreas")
    AT_SERVICE_AREAS("atServiceAreas"),

    /**
     * At toll plazas.
     * 
     */
    @XmlEnumValue("atTollPlazas")
    AT_TOLL_PLAZAS("atTollPlazas"),

    /**
     * In built up areas, i.e. villages, towns and cities.
     * 
     */
    @XmlEnumValue("inBuiltUpAreas")
    IN_BUILT_UP_AREAS("inBuiltUpAreas"),

    /**
     * In sections of the road where contraflow is in operation.
     * 
     */
    @XmlEnumValue("inContraflowSections")
    IN_CONTRAFLOW_SECTIONS("inContraflowSections"),

    /**
     * On sections of the road where it runs through or adjacent to forested areas.
     *           
     * 
     */
    @XmlEnumValue("inForestedAreas")
    IN_FORESTED_AREAS("inForestedAreas"),

    /**
     * In galleries.
     * 
     */
    @XmlEnumValue("inGalleries")
    IN_GALLERIES("inGalleries"),

    /**
     * In low lying areas.
     * 
     */
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),

    /**
     * In roadworks areas.
     * 
     */
    @XmlEnumValue("inRoadworksAreas")
    IN_ROADWORKS_AREAS("inRoadworksAreas"),

    /**
     * In rural areas, i.e. outside villages, towns and cities.
     * 
     */
    @XmlEnumValue("inRuralAreas")
    IN_RURAL_AREAS("inRuralAreas"),

    /**
     * In shaded areas.
     * 
     */
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),

    /**
     * In the inner city areas.
     * 
     */
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),

    /**
     * In the city centre.
     * 
     */
    @XmlEnumValue("inTheCityCentre")
    IN_THE_CITY_CENTRE("inTheCityCentre"),

    /**
     * In tunnels.
     * 
     */
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),

    /**
     * On bridges.
     * 
     */
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),

    /**
     * On down hill sections of the road.
     * 
     */
    @XmlEnumValue("onDownHillSections")
    ON_DOWN_HILL_SECTIONS("onDownHillSections"),

    /**
     * On dual carriageway sections of the road.
     * 
     */
    @XmlEnumValue("onDualCarriagewaySections")
    ON_DUAL_CARRIAGEWAY_SECTIONS("onDualCarriagewaySections"),

    /**
     * On elevated sections of the road.
     * 
     */
    @XmlEnumValue("onElevatedSections")
    ON_ELEVATED_SECTIONS("onElevatedSections"),

    /**
     * On entering or leaving tunnels.
     * 
     */
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),

    /**
     * On entry into the country.
     * 
     */
    @XmlEnumValue("onEnteringTheCountry")
    ON_ENTERING_THE_COUNTRY("onEnteringTheCountry"),

    /**
     * On flyover sections of the road, i.e. sections of the road which pass over another
     *             road.
     *           
     * 
     */
    @XmlEnumValue("onFlyovers")
    ON_FLYOVERS("onFlyovers"),

    /**
     * On leaving the country.
     * 
     */
    @XmlEnumValue("onLeavingTheCountry")
    ON_LEAVING_THE_COUNTRY("onLeavingTheCountry"),

    /**
     * On motorways.
     * 
     */
    @XmlEnumValue("onMotorways")
    ON_MOTORWAYS("onMotorways"),

    /**
     * On non motorways.
     * 
     */
    @XmlEnumValue("onNonMotorways")
    ON_NON_MOTORWAYS("onNonMotorways"),

    /**
     * On mountain passes.
     * 
     */
    @XmlEnumValue("onPasses")
    ON_PASSES("onPasses"),

    /**
     * On roundabouts.
     * 
     */
    @XmlEnumValue("onRoundabouts")
    ON_ROUNDABOUTS("onRoundabouts"),

    /**
     * On single carriageway sections of the road.
     * 
     */
    @XmlEnumValue("onSingleCarriagewaySections")
    ON_SINGLE_CARRIAGEWAY_SECTIONS("onSingleCarriagewaySections"),

    /**
     * On slip roads.
     * 
     */
    @XmlEnumValue("onSlipRoads")
    ON_SLIP_ROADS("onSlipRoads"),

    /**
     * On underground sections of the road.
     * 
     */
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),

    /**
     * On underpasses, i.e. sections of the road which pass under another road.
     *           
     * 
     */
    @XmlEnumValue("onUnderpasses")
    ON_UNDERPASSES("onUnderpasses"),

    /**
     * On hill sections of the road.
     * 
     */
    @XmlEnumValue("onUpHillSections")
    ON_UP_HILL_SECTIONS("onUpHillSections"),

    /**
     * Over the crest of hills.
     * 
     */
    @XmlEnumValue("overTheCrestOfHills")
    OVER_THE_CREST_OF_HILLS("overTheCrestOfHills"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PlacesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacesEnum fromValue(String v) {
        for (PlacesEnum c: PlacesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
