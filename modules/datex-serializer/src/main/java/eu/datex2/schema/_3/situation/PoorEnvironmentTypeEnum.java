
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoorEnvironmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PoorEnvironmentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="badWeather"/&gt;
 *     &lt;enumeration value="blizzard"/&gt;
 *     &lt;enumeration value="blowingDust"/&gt;
 *     &lt;enumeration value="blowingSnow"/&gt;
 *     &lt;enumeration value="crosswinds"/&gt;
 *     &lt;enumeration value="damagingHail"/&gt;
 *     &lt;enumeration value="denseFog"/&gt;
 *     &lt;enumeration value="eclipse"/&gt;
 *     &lt;enumeration value="extremeCold"/&gt;
 *     &lt;enumeration value="extremeHeat"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="freezingFog"/&gt;
 *     &lt;enumeration value="frost"/&gt;
 *     &lt;enumeration value="gales"/&gt;
 *     &lt;enumeration value="gustyWinds"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="heavyFrost"/&gt;
 *     &lt;enumeration value="heavyRain"/&gt;
 *     &lt;enumeration value="heavySnowfall"/&gt;
 *     &lt;enumeration value="hurricaneForceWinds"/&gt;
 *     &lt;enumeration value="lowSunGlare"/&gt;
 *     &lt;enumeration value="moderateFog"/&gt;
 *     &lt;enumeration value="nearbyFire"/&gt;
 *     &lt;enumeration value="nearbyFlooding"/&gt;
 *     &lt;enumeration value="ozonePollution"/&gt;
 *     &lt;enumeration value="pollution"/&gt;
 *     &lt;enumeration value="patchyFog"/&gt;
 *     &lt;enumeration value="precipitationInTheArea"/&gt;
 *     &lt;enumeration value="rain"/&gt;
 *     &lt;enumeration value="rainChangingToSnow"/&gt;
 *     &lt;enumeration value="sandStorms"/&gt;
 *     &lt;enumeration value="severeExhaustPollution"/&gt;
 *     &lt;enumeration value="severeSmog"/&gt;
 *     &lt;enumeration value="showers"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="smogAlert"/&gt;
 *     &lt;enumeration value="smokeHazard"/&gt;
 *     &lt;enumeration value="snowChangingToRain"/&gt;
 *     &lt;enumeration value="snowfall"/&gt;
 *     &lt;enumeration value="sprayHazard"/&gt;
 *     &lt;enumeration value="stormForceWinds"/&gt;
 *     &lt;enumeration value="strongGustsOfWind"/&gt;
 *     &lt;enumeration value="strongWinds"/&gt;
 *     &lt;enumeration value="swarmsOfInsects"/&gt;
 *     &lt;enumeration value="temperatureFalling"/&gt;
 *     &lt;enumeration value="thunderstorms"/&gt;
 *     &lt;enumeration value="tornadoes"/&gt;
 *     &lt;enumeration value="veryStrongGustsOfWind"/&gt;
 *     &lt;enumeration value="visibilityReduced"/&gt;
 *     &lt;enumeration value="whiteOut"/&gt;
 *     &lt;enumeration value="winterStorm"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PoorEnvironmentTypeEnum")
@XmlEnum
public enum PoorEnvironmentTypeEnum {


    /**
     * Adverse weather conditions are affecting driving conditions.
     * 
     */
    @XmlEnumValue("badWeather")
    BAD_WEATHER("badWeather"),

    /**
     * Heavy snowfall in combination with strong winds, limiting visibility to 50m or
     *             less.
     *           
     * 
     */
    @XmlEnumValue("blizzard")
    BLIZZARD("blizzard"),

    /**
     * Dust blowing across the roadway causing significantly reduced visibility.
     *           
     * 
     */
    @XmlEnumValue("blowingDust")
    BLOWING_DUST("blowingDust"),

    /**
     * Fallen snow moving due to the forces of wind.
     * 
     */
    @XmlEnumValue("blowingSnow")
    BLOWING_SNOW("blowingSnow"),

    /**
     * Strong cross winds across the direction of the roadway (e.g. on a ridge or
     *             bridge).
     *           
     * 
     */
    @XmlEnumValue("crosswinds")
    CROSSWINDS("crosswinds"),

    /**
     * Large falling ice pellets or frozen rain capable of causing injury or damage to
     *             property.
     *           
     * 
     */
    @XmlEnumValue("damagingHail")
    DAMAGING_HAIL("damagingHail"),

    /**
     * Dense fog, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("denseFog")
    DENSE_FOG("denseFog"),

    /**
     * Eclipse, either partial or full, of the sun causing low light levels during normal
     *             daylight period.
     *           
     * 
     */
    @XmlEnumValue("eclipse")
    ECLIPSE("eclipse"),

    /**
     * Abnormally low temperatures.
     * 
     */
    @XmlEnumValue("extremeCold")
    EXTREME_COLD("extremeCold"),

    /**
     * Abnormally high expected maximum temperature.
     * 
     */
    @XmlEnumValue("extremeHeat")
    EXTREME_HEAT("extremeHeat"),

    /**
     * Fog, visibility more than 50m.
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),

    /**
     * Fog, in conjunction with sub-zero air temperatures causing possible freezing of
     *             road surface.
     *           
     * 
     */
    @XmlEnumValue("freezingFog")
    FREEZING_FOG("freezingFog"),

    /**
     * Frost can be expected.
     * 
     */
    @XmlEnumValue("frost")
    FROST("frost"),

    /**
     * Winds between 60 km/h and 90 km/h.
     * 
     */
    @XmlEnumValue("gales")
    GALES("gales"),

    /**
     * Constantly varying winds, significant at times.
     * 
     */
    @XmlEnumValue("gustyWinds")
    GUSTY_WINDS("gustyWinds"),

    /**
     * Falling ice pellets or frozen rain.
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),

    /**
     * A thick coating of frost can be expected.
     * 
     */
    @XmlEnumValue("heavyFrost")
    HEAVY_FROST("heavyFrost"),

    /**
     * Heavy rainfall, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),

    /**
     * Dense falling snow, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("heavySnowfall")
    HEAVY_SNOWFALL("heavySnowfall"),

    /**
     * Winds over 120 km/h.
     * 
     */
    @XmlEnumValue("hurricaneForceWinds")
    HURRICANE_FORCE_WINDS("hurricaneForceWinds"),

    /**
     * Difficult visibility conditions created by low elevation sunlight.
     *           
     * 
     */
    @XmlEnumValue("lowSunGlare")
    LOW_SUN_GLARE("lowSunGlare"),

    /**
     * Misty conditions impairing vision over 100m.
     * 
     */
    @XmlEnumValue("moderateFog")
    MODERATE_FOG("moderateFog"),

    /**
     * Fire near the road affecting driving conditions and/or significantly reduced
     *             visibility
     *           
     * 
     */
    @XmlEnumValue("nearbyFire")
    NEARBY_FIRE("nearbyFire"),

    /**
     * Flooding near the road risking to affect driving conditions
     * 
     */
    @XmlEnumValue("nearbyFlooding")
    NEARBY_FLOODING("nearbyFlooding"),

    /**
     * High concentrations of ozone are present.
     * 
     */
    @XmlEnumValue("ozonePollution")
    OZONE_POLLUTION("ozonePollution"),

    /**
     * Pollution of an unspecified nature.
     * 
     */
    @XmlEnumValue("pollution")
    POLLUTION("pollution"),

    /**
     * Fog, in which intermittent areas of dense fog may be encountered.
     *           
     * 
     */
    @XmlEnumValue("patchyFog")
    PATCHY_FOG("patchyFog"),

    /**
     * Unspecified precipitation is falling on the area.
     * 
     */
    @XmlEnumValue("precipitationInTheArea")
    PRECIPITATION_IN_THE_AREA("precipitationInTheArea"),

    /**
     * Rain, visibility more than 50m.
     * 
     */
    @XmlEnumValue("rain")
    RAIN("rain"),

    /**
     * Falling rain is changing to snow.
     * 
     */
    @XmlEnumValue("rainChangingToSnow")
    RAIN_CHANGING_TO_SNOW("rainChangingToSnow"),

    /**
     * Sand blowing across the roadway causing significantly reduced visibility.
     *           
     * 
     */
    @XmlEnumValue("sandStorms")
    SAND_STORMS("sandStorms"),

    /**
     * Pollution from exhaust fumes has reached a level sufficient to cause concern.
     *           
     * 
     */
    @XmlEnumValue("severeExhaustPollution")
    SEVERE_EXHAUST_POLLUTION("severeExhaustPollution"),

    /**
     * Environmental warning of very poor air quality resulting from smog.
     *           
     * 
     */
    @XmlEnumValue("severeSmog")
    SEVERE_SMOG("severeSmog"),

    /**
     * Light rain or intermittent rain.
     * 
     */
    @XmlEnumValue("showers")
    SHOWERS("showers"),

    /**
     * Rain mingled with snow or hail.
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),

    /**
     * Environmental warning of poor air quality resulting from smog.
     * 
     */
    @XmlEnumValue("smogAlert")
    SMOG_ALERT("smogAlert"),

    /**
     * Smoke drifting across the roadway causing significantly reduced visibility.
     *           
     * 
     */
    @XmlEnumValue("smokeHazard")
    SMOKE_HAZARD("smokeHazard"),

    /**
     * Falling snow is changing to rain.
     * 
     */
    @XmlEnumValue("snowChangingToRain")
    SNOW_CHANGING_TO_RAIN("snowChangingToRain"),

    /**
     * Falling snow, visibility more than 50m.
     * 
     */
    @XmlEnumValue("snowfall")
    SNOWFALL("snowfall"),

    /**
     * Reduced visibility resulting from spray created by moving vehicles on a wet
     *             roadway.
     *           
     * 
     */
    @XmlEnumValue("sprayHazard")
    SPRAY_HAZARD("sprayHazard"),

    /**
     * Winds between 90 km/h and 120 km/h.
     * 
     */
    @XmlEnumValue("stormForceWinds")
    STORM_FORCE_WINDS("stormForceWinds"),

    /**
     * Constantly varying winds, strong at times.
     * 
     */
    @XmlEnumValue("strongGustsOfWind")
    STRONG_GUSTS_OF_WIND("strongGustsOfWind"),

    /**
     * Winds between 40 km/h and 60 km/h.
     * 
     */
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),

    /**
     * Large numbers of insects which create a hazard for road users through reduced
     *             visibility.
     *           
     * 
     */
    @XmlEnumValue("swarmsOfInsects")
    SWARMS_OF_INSECTS("swarmsOfInsects"),

    /**
     * The temperature is falling significantly.
     * 
     */
    @XmlEnumValue("temperatureFalling")
    TEMPERATURE_FALLING("temperatureFalling"),

    /**
     * Electrical storms, generally with heavy rain.
     * 
     */
    @XmlEnumValue("thunderstorms")
    THUNDERSTORMS("thunderstorms"),

    /**
     * Very violent, whirling windstorms affecting narrow strips of country.
     *           
     * 
     */
    @XmlEnumValue("tornadoes")
    TORNADOES("tornadoes"),

    /**
     * Constantly varying winds, very strong at times.
     * 
     */
    @XmlEnumValue("veryStrongGustsOfWind")
    VERY_STRONG_GUSTS_OF_WIND("veryStrongGustsOfWind"),

    /**
     * Environmental conditions causing reduced visibility.
     * 
     */
    @XmlEnumValue("visibilityReduced")
    VISIBILITY_REDUCED("visibilityReduced"),

    /**
     * Falling snow in blizzard conditions resulting in very reduced visibility.
     *           
     * 
     */
    @XmlEnumValue("whiteOut")
    WHITE_OUT("whiteOut"),

    /**
     * Heavy rain, sleet, hail and/or snow in combination with strong winds, limiting
     *             visibility to 50m or less.
     *           
     * 
     */
    @XmlEnumValue("winterStorm")
    WINTER_STORM("winterStorm"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PoorEnvironmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoorEnvironmentTypeEnum fromValue(String v) {
        for (PoorEnvironmentTypeEnum c: PoorEnvironmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
