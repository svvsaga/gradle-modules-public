
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaPlacesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AreaPlacesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="atBorders"/&gt;
 *     &lt;enumeration value="atHighAltitudes"/&gt;
 *     &lt;enumeration value="inBuiltUpAreas"/&gt;
 *     &lt;enumeration value="inForestedAreas"/&gt;
 *     &lt;enumeration value="inGalleries"/&gt;
 *     &lt;enumeration value="inLowLyingAreas"/&gt;
 *     &lt;enumeration value="inRuralAreas"/&gt;
 *     &lt;enumeration value="inShadedAreas"/&gt;
 *     &lt;enumeration value="inTheInnerCityAreas"/&gt;
 *     &lt;enumeration value="inTunnels"/&gt;
 *     &lt;enumeration value="onBridges"/&gt;
 *     &lt;enumeration value="onDownhillSections"/&gt;
 *     &lt;enumeration value="onElevatedSections"/&gt;
 *     &lt;enumeration value="onEnteringOrLeavingTunnels"/&gt;
 *     &lt;enumeration value="onFlyovers"/&gt;
 *     &lt;enumeration value="onPasses"/&gt;
 *     &lt;enumeration value="onUndergroundSections"/&gt;
 *     &lt;enumeration value="onUnderpasses"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AreaPlacesEnum")
@XmlEnum
public enum AreaPlacesEnum2 {


    /**
     * At national borders
     * 
     */
    @XmlEnumValue("atBorders")
    AT_BORDERS("atBorders"),

    /**
     * At high altitudes
     * 
     */
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),

    /**
     * In built up areas, i.e. villages, towns and cities
     * 
     */
    @XmlEnumValue("inBuiltUpAreas")
    IN_BUILT_UP_AREAS("inBuiltUpAreas"),

    /**
     * On sections of the road where it runs through or adjacent to forested areas
     *           
     * 
     */
    @XmlEnumValue("inForestedAreas")
    IN_FORESTED_AREAS("inForestedAreas"),

    /**
     * In galleries
     * 
     */
    @XmlEnumValue("inGalleries")
    IN_GALLERIES("inGalleries"),

    /**
     * In low-lying areas
     * 
     */
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),

    /**
     * In rural areas, i.e. outside villages, towns and cities
     * 
     */
    @XmlEnumValue("inRuralAreas")
    IN_RURAL_AREAS("inRuralAreas"),

    /**
     * In shaded areas
     * 
     */
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),

    /**
     * In the city centre areas
     * 
     */
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),

    /**
     * In tunnels
     * 
     */
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),

    /**
     * On bridges
     * 
     */
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),

    /**
     * On downhill sections of the road
     * 
     */
    @XmlEnumValue("onDownhillSections")
    ON_DOWNHILL_SECTIONS("onDownhillSections"),

    /**
     * On elevated sections of the road
     * 
     */
    @XmlEnumValue("onElevatedSections")
    ON_ELEVATED_SECTIONS("onElevatedSections"),

    /**
     * On entering or leaving tunnels
     * 
     */
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),

    /**
     * On flyover sections of the road, i.e. sections of the road which pass over another
     *             road
     *           
     * 
     */
    @XmlEnumValue("onFlyovers")
    ON_FLYOVERS("onFlyovers"),

    /**
     * On mountain passes
     * 
     */
    @XmlEnumValue("onPasses")
    ON_PASSES("onPasses"),

    /**
     * On underground sections of the road
     * 
     */
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),

    /**
     * On underpasses, i.e. sections of the road which pass under another road
     *           
     * 
     */
    @XmlEnumValue("onUnderpasses")
    ON_UNDERPASSES("onUnderpasses"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    AreaPlacesEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaPlacesEnum2 fromValue(String v) {
        for (AreaPlacesEnum2 c: AreaPlacesEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
