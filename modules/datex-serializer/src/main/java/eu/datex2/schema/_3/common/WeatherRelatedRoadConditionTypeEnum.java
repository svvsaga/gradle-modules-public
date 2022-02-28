
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


    /**
     * Severe skid risk due to black ice (i.e. clear ice, which is impossible or very
     *             difficult to see).
     *           
     * 
     */
    @XmlEnumValue("blackIce")
    BLACK_ICE("blackIce"),

    /**
     * Deep snow on the roadway.
     * 
     */
    @XmlEnumValue("deepSnow")
    DEEP_SNOW("deepSnow"),

    /**
     * There is no humidity over the sensor.
     * 
     */
    @XmlEnumValue("dry")
    DRY("dry"),

    /**
     * The wet road surface is subject to freezing.
     * 
     */
    @XmlEnumValue("freezingOfWetRoads")
    FREEZING_OF_WET_ROADS("freezingOfWetRoads"),

    /**
     * The pavements for pedestrians are subject to freezing.
     * 
     */
    @XmlEnumValue("freezingPavements")
    FREEZING_PAVEMENTS("freezingPavements"),

    /**
     * Severe skid risk due to rain falling on sub-zero temperature road surface and
     *             freezing.
     *           
     * 
     */
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),

    /**
     * Fresh snow (with little or no traffic yet) on the roadway.
     * 
     */
    @XmlEnumValue("freshSnow")
    FRESH_SNOW("freshSnow"),

    /**
     * Glaze of the road surface.
     * 
     */
    @XmlEnumValue("glaze")
    GLAZE("glaze"),

    /**
     * Increased skid risk due to ice (of any kind).
     * 
     */
    @XmlEnumValue("ice")
    ICE("ice"),

    /**
     * Ice is building up on the roadway causing a serious skid hazard.
     *           
     * 
     */
    @XmlEnumValue("iceBuildUp")
    ICE_BUILD_UP("iceBuildUp"),

    /**
     * Ice on the road frozen in the form of wheel tracks.
     * 
     */
    @XmlEnumValue("iceWithWheelBarTracks")
    ICE_WITH_WHEEL_BAR_TRACKS("iceWithWheelBarTracks"),

    /**
     * Severe skid risk due to icy patches (i.e. intermittent ice on roadway).
     *           
     * 
     */
    @XmlEnumValue("icyPatches")
    ICY_PATCHES("icyPatches"),

    /**
     * Powdery snow on the road which is subject to being blown by the wind.
     *           
     * 
     */
    @XmlEnumValue("looseSnow")
    LOOSE_SNOW("looseSnow"),

    /**
     * From (0,01 mm) water film thickness over the sensor
     * 
     */
    @XmlEnumValue("moist")
    MOIST("moist"),

    /**
     * Conditions for pedestrians are consistent with those normally expected in
     *             winter.
     *           
     * 
     */
    @XmlEnumValue("normalWinterConditionsForPedestrians")
    NORMAL_WINTER_CONDITIONS_FOR_PEDESTRIANS("normalWinterConditionsForPedestrians"),

    /**
     * The road surface is not dry.
     * 
     */
    @XmlEnumValue("notDry")
    NOT_DRY("notDry"),

    /**
     * Packed snow (heavily trafficked) on the roadway.
     * 
     */
    @XmlEnumValue("packedSnow")
    PACKED_SNOW("packedSnow"),

    /**
     * Fresh snow (with little or no traffic yet) on the roadway.
     * 
     */
    @XmlEnumValue("rime")
    RIME("rime"),

    /**
     * The road surface is melting, or has melted due to abnormally high temperatures.
     *           
     * 
     */
    @XmlEnumValue("roadSurfaceMelting")
    ROAD_SURFACE_MELTING("roadSurfaceMelting"),

    /**
     * Detection at least of the presence of partly or wholly solidified aqueous solution
     *             over the sensor.
     *           
     * 
     */
    @XmlEnumValue("slippery")
    SLIPPERY("slippery"),

    /**
     * Increased skid risk due to melting snow (slush) on road.
     * 
     */
    @XmlEnumValue("slushOnRoad")
    SLUSH_ON_ROAD("slushOnRoad"),

    /**
     * Melting snow (slush) on the roadway is formed into wheel tracks.
     *           
     * 
     */
    @XmlEnumValue("slushStrings")
    SLUSH_STRINGS("slushStrings"),

    /**
     * Fresh snow (with little or no traffic yet) on the roadway.
     * 
     */
    @XmlEnumValue("snow")
    SNOW("snow"),

    /**
     * Snow drifting is in progress or patches of deep snow are present due to earlier
     *             drifting.
     *           
     * 
     */
    @XmlEnumValue("snowDrifts")
    SNOW_DRIFTS("snowDrifts"),

    /**
     * Snow is on the pedestrian pavement.
     * 
     */
    @XmlEnumValue("snowOnPavement")
    SNOW_ON_PAVEMENT("snowOnPavement"),

    /**
     * Increased skid risk due to partly thawed, wet road with packed snow and ice, or
     *             rain falling on packed snow and ice.
     *           
     * 
     */
    @XmlEnumValue("wetAndIcyRoad")
    WET_AND_ICY_ROAD("wetAndIcyRoad"),

    /**
     * Snow is lying on the road surface.
     * 
     */
    @XmlEnumValue("snowOnTheRoad")
    SNOW_ON_THE_ROAD("snowOnTheRoad"),

    /**
     * Partly thawed, wet pedestrian pavement with packed snow and ice, or rain falling
     *             on packed snow and ice.
     *           
     * 
     */
    @XmlEnumValue("wetIcyPavement")
    WET_ICY_PAVEMENT("wetIcyPavement"),

    /**
     * From (2 mm) water film thickness over the sensor.
     * 
     */
    @XmlEnumValue("streamingWater")
    STREAMING_WATER("streamingWater"),

    /**
     * Water is resting on the roadway which provides an increased hazard to vehicles.
     *           
     * 
     */
    @XmlEnumValue("surfaceWater")
    SURFACE_WATER("surfaceWater"),

    /**
     * From (0,2 mm) water film thickness over the sensor
     * 
     */
    @XmlEnumValue("wet")
    WET("wet"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
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
