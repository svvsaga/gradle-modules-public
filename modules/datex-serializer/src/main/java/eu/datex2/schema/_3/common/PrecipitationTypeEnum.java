
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PrecipitationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="clearIce"/&gt;
 *     &lt;enumeration value="dew"/&gt;
 *     &lt;enumeration value="diamondDust"/&gt;
 *     &lt;enumeration value="drizzle"/&gt;
 *     &lt;enumeration value="freezingRain"/&gt;
 *     &lt;enumeration value="glaze"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="hardRime"/&gt;
 *     &lt;enumeration value="hoarFrost"/&gt;
 *     &lt;enumeration value="iceCrystals"/&gt;
 *     &lt;enumeration value="icePellets"/&gt;
 *     &lt;enumeration value="liquidFreezing"/&gt;
 *     &lt;enumeration value="liquidNotFreezing"/&gt;
 *     &lt;enumeration value="noPrecipitation"/&gt;
 *     &lt;enumeration value="rain"/&gt;
 *     &lt;enumeration value="rime"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="smallHail"/&gt;
 *     &lt;enumeration value="snow"/&gt;
 *     &lt;enumeration value="snowGrains"/&gt;
 *     &lt;enumeration value="snowPellets"/&gt;
 *     &lt;enumeration value="softRime"/&gt;
 *     &lt;enumeration value="solid"/&gt;
 *     &lt;enumeration value="wetSnow"/&gt;
 *     &lt;enumeration value="whiteDev"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrecipitationTypeEnum")
@XmlEnum
public enum PrecipitationTypeEnum {


    /**
     * Clear ice.
     * 
     */
    @XmlEnumValue("clearIce")
    CLEAR_ICE("clearIce"),

    /**
     * Dew.
     * 
     */
    @XmlEnumValue("dew")
    DEW("dew"),

    /**
     * Diamond dust.
     * 
     */
    @XmlEnumValue("diamondDust")
    DIAMOND_DUST("diamondDust"),

    /**
     * Light, fine rain.
     * 
     */
    @XmlEnumValue("drizzle")
    DRIZZLE("drizzle"),

    /**
     * Freezing rain.
     * 
     */
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),

    /**
     * Glaze.
     * 
     */
    @XmlEnumValue("glaze")
    GLAZE("glaze"),

    /**
     * Small balls of ice and compacted snow.
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),

    /**
     * Hard rime.
     * 
     */
    @XmlEnumValue("hardRime")
    HARD_RIME("hardRime"),

    /**
     * Hoar frost.
     * 
     */
    @XmlEnumValue("hoarFrost")
    HOAR_FROST("hoarFrost"),

    /**
     * Ice crystals.
     * 
     */
    @XmlEnumValue("iceCrystals")
    ICE_CRYSTALS("iceCrystals"),

    /**
     * Ice pellets.
     * 
     */
    @XmlEnumValue("icePellets")
    ICE_PELLETS("icePellets"),

    /**
     * Liquid, freezing precipitation.
     * 
     */
    @XmlEnumValue("liquidFreezing")
    LIQUID_FREEZING("liquidFreezing"),

    /**
     * Liquid precipitation but not freezing.
     * 
     */
    @XmlEnumValue("liquidNotFreezing")
    LIQUID_NOT_FREEZING("liquidNotFreezing"),

    /**
     * No precipitation.
     * 
     */
    @XmlEnumValue("noPrecipitation")
    NO_PRECIPITATION("noPrecipitation"),

    /**
     * Rain.
     * 
     */
    @XmlEnumValue("rain")
    RAIN("rain"),

    /**
     * Rime.
     * 
     */
    @XmlEnumValue("rime")
    RIME("rime"),

    /**
     * Wet snow mixed with rain.
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),

    /**
     * Small Hail.
     * 
     */
    @XmlEnumValue("smallHail")
    SMALL_HAIL("smallHail"),

    /**
     * Snow.
     * 
     */
    @XmlEnumValue("snow")
    SNOW("snow"),

    /**
     * Snow grains.
     * 
     */
    @XmlEnumValue("snowGrains")
    SNOW_GRAINS("snowGrains"),

    /**
     * Snow pellets.
     * 
     */
    @XmlEnumValue("snowPellets")
    SNOW_PELLETS("snowPellets"),

    /**
     * Soft rime.
     * 
     */
    @XmlEnumValue("softRime")
    SOFT_RIME("softRime"),

    /**
     * Solid precipitation.
     * 
     */
    @XmlEnumValue("solid")
    SOLID("solid"),

    /**
     * Wet snow.
     * 
     */
    @XmlEnumValue("wetSnow")
    WET_SNOW("wetSnow"),

    /**
     * White Dev.
     * 
     */
    @XmlEnumValue("whiteDev")
    WHITE_DEV("whiteDev"),

    /**
     * Unknown type of precipitation.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PrecipitationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrecipitationTypeEnum fromValue(String v) {
        for (PrecipitationTypeEnum c: PrecipitationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
