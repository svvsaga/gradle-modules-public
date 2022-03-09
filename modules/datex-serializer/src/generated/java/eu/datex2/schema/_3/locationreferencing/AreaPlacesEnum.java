
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
public enum AreaPlacesEnum {

    @XmlEnumValue("atBorders")
    AT_BORDERS("atBorders"),
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),
    @XmlEnumValue("inBuiltUpAreas")
    IN_BUILT_UP_AREAS("inBuiltUpAreas"),
    @XmlEnumValue("inForestedAreas")
    IN_FORESTED_AREAS("inForestedAreas"),
    @XmlEnumValue("inGalleries")
    IN_GALLERIES("inGalleries"),
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),
    @XmlEnumValue("inRuralAreas")
    IN_RURAL_AREAS("inRuralAreas"),
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),
    @XmlEnumValue("onDownhillSections")
    ON_DOWNHILL_SECTIONS("onDownhillSections"),
    @XmlEnumValue("onElevatedSections")
    ON_ELEVATED_SECTIONS("onElevatedSections"),
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),
    @XmlEnumValue("onFlyovers")
    ON_FLYOVERS("onFlyovers"),
    @XmlEnumValue("onPasses")
    ON_PASSES("onPasses"),
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),
    @XmlEnumValue("onUnderpasses")
    ON_UNDERPASSES("onUnderpasses"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    AreaPlacesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaPlacesEnum fromValue(String v) {
        for (AreaPlacesEnum c: AreaPlacesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
