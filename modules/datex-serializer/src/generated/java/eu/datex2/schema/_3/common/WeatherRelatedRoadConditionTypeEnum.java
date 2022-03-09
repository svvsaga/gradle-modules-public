
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeatherRelatedRoadConditionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blackIce"/&gt;
 *     &lt;enumeration value="deepSnow"/&gt;
 *     &lt;enumeration value="dry"/&gt;
 *     &lt;enumeration value="freezingOfWetRoads"/&gt;
 *     &lt;enumeration value="freezingPavements"/&gt;
 *     &lt;enumeration value="freezingRain"/&gt;
 *     &lt;enumeration value="freshSnow"/&gt;
 *     &lt;enumeration value="glaze"/&gt;
 *     &lt;enumeration value="ice"/&gt;
 *     &lt;enumeration value="iceBuildUp"/&gt;
 *     &lt;enumeration value="iceWithWheelBarTracks"/&gt;
 *     &lt;enumeration value="icyPatches"/&gt;
 *     &lt;enumeration value="looseSnow"/&gt;
 *     &lt;enumeration value="moist"/&gt;
 *     &lt;enumeration value="normalWinterConditionsForPedestrians"/&gt;
 *     &lt;enumeration value="notDry"/&gt;
 *     &lt;enumeration value="packedSnow"/&gt;
 *     &lt;enumeration value="rime"/&gt;
 *     &lt;enumeration value="roadSurfaceMelting"/&gt;
 *     &lt;enumeration value="slippery"/&gt;
 *     &lt;enumeration value="slushOnRoad"/&gt;
 *     &lt;enumeration value="slushStrings"/&gt;
 *     &lt;enumeration value="snow"/&gt;
 *     &lt;enumeration value="snowDrifts"/&gt;
 *     &lt;enumeration value="snowOnPavement"/&gt;
 *     &lt;enumeration value="wetAndIcyRoad"/&gt;
 *     &lt;enumeration value="snowOnTheRoad"/&gt;
 *     &lt;enumeration value="wetIcyPavement"/&gt;
 *     &lt;enumeration value="streamingWater"/&gt;
 *     &lt;enumeration value="surfaceWater"/&gt;
 *     &lt;enumeration value="wet"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeatherRelatedRoadConditionTypeEnum")
@XmlEnum
public enum WeatherRelatedRoadConditionTypeEnum {

    @XmlEnumValue("blackIce")
    BLACK_ICE("blackIce"),
    @XmlEnumValue("deepSnow")
    DEEP_SNOW("deepSnow"),
    @XmlEnumValue("dry")
    DRY("dry"),
    @XmlEnumValue("freezingOfWetRoads")
    FREEZING_OF_WET_ROADS("freezingOfWetRoads"),
    @XmlEnumValue("freezingPavements")
    FREEZING_PAVEMENTS("freezingPavements"),
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),
    @XmlEnumValue("freshSnow")
    FRESH_SNOW("freshSnow"),
    @XmlEnumValue("glaze")
    GLAZE("glaze"),
    @XmlEnumValue("ice")
    ICE("ice"),
    @XmlEnumValue("iceBuildUp")
    ICE_BUILD_UP("iceBuildUp"),
    @XmlEnumValue("iceWithWheelBarTracks")
    ICE_WITH_WHEEL_BAR_TRACKS("iceWithWheelBarTracks"),
    @XmlEnumValue("icyPatches")
    ICY_PATCHES("icyPatches"),
    @XmlEnumValue("looseSnow")
    LOOSE_SNOW("looseSnow"),
    @XmlEnumValue("moist")
    MOIST("moist"),
    @XmlEnumValue("normalWinterConditionsForPedestrians")
    NORMAL_WINTER_CONDITIONS_FOR_PEDESTRIANS("normalWinterConditionsForPedestrians"),
    @XmlEnumValue("notDry")
    NOT_DRY("notDry"),
    @XmlEnumValue("packedSnow")
    PACKED_SNOW("packedSnow"),
    @XmlEnumValue("rime")
    RIME("rime"),
    @XmlEnumValue("roadSurfaceMelting")
    ROAD_SURFACE_MELTING("roadSurfaceMelting"),
    @XmlEnumValue("slippery")
    SLIPPERY("slippery"),
    @XmlEnumValue("slushOnRoad")
    SLUSH_ON_ROAD("slushOnRoad"),
    @XmlEnumValue("slushStrings")
    SLUSH_STRINGS("slushStrings"),
    @XmlEnumValue("snow")
    SNOW("snow"),
    @XmlEnumValue("snowDrifts")
    SNOW_DRIFTS("snowDrifts"),
    @XmlEnumValue("snowOnPavement")
    SNOW_ON_PAVEMENT("snowOnPavement"),
    @XmlEnumValue("wetAndIcyRoad")
    WET_AND_ICY_ROAD("wetAndIcyRoad"),
    @XmlEnumValue("snowOnTheRoad")
    SNOW_ON_THE_ROAD("snowOnTheRoad"),
    @XmlEnumValue("wetIcyPavement")
    WET_ICY_PAVEMENT("wetIcyPavement"),
    @XmlEnumValue("streamingWater")
    STREAMING_WATER("streamingWater"),
    @XmlEnumValue("surfaceWater")
    SURFACE_WATER("surfaceWater"),
    @XmlEnumValue("wet")
    WET("wet"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    WeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (WeatherRelatedRoadConditionTypeEnum c: WeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
