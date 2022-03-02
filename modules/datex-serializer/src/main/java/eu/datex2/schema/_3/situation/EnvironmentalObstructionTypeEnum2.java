
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalObstructionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnvironmentalObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="avalanches"/&gt;
 *     &lt;enumeration value="earthquakeDamage"/&gt;
 *     &lt;enumeration value="fallenTrees"/&gt;
 *     &lt;enumeration value="fallingIce"/&gt;
 *     &lt;enumeration value="fallingLightIceOrSnow"/&gt;
 *     &lt;enumeration value="flashFloods"/&gt;
 *     &lt;enumeration value="flooding"/&gt;
 *     &lt;enumeration value="forestFire"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *     &lt;enumeration value="landslips"/&gt;
 *     &lt;enumeration value="mudSlide"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="rockfalls"/&gt;
 *     &lt;enumeration value="seriousFire"/&gt;
 *     &lt;enumeration value="smokeOrFumes"/&gt;
 *     &lt;enumeration value="stormDamage"/&gt;
 *     &lt;enumeration value="subsidence"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentalObstructionTypeEnum")
@XmlEnum
public enum EnvironmentalObstructionTypeEnum2 {


    /**
     * The road may be obstructed or partially obstructed due to snow slides.
     *           
     * 
     */
    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),

    /**
     * The road may be obstructed or partially obstructed because of damage caused by an
     *             earthquake.
     *           
     * 
     */
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),

    /**
     * The road is obstructed or partially obstructed by one or more fallen trees.
     *           
     * 
     */
    @XmlEnumValue("fallenTrees")
    FALLEN_TREES("fallenTrees"),

    /**
     * Falling ice off trees, power lines or structures which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("fallingIce")
    FALLING_ICE("fallingIce"),

    /**
     * Falling light ice or snow off trees, power lines or structures which may cause
     *             traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("fallingLightIceOrSnow")
    FALLING_LIGHT_ICE_OR_SNOW("fallingLightIceOrSnow"),

    /**
     * The road may become quickly inundated by powerful floodwaters due to heavy rain
     *             nearby.
     *           
     * 
     */
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),

    /**
     * The road is obstructed or partially obstructed by flood water.
     * 
     */
    @XmlEnumValue("flooding")
    FLOODING("flooding"),

    /**
     * Traffic may be disrupted due to a forest fire adjacent to the roadway.
     *           
     * 
     */
    @XmlEnumValue("forestFire")
    FOREST_FIRE("forestFire"),

    /**
     * Traffic may be disrupted due to a grass fire adjacent to the roadway.
     *           
     * 
     */
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),

    /**
     * The road may be obstructed or partially obstructed due to landslides.
     *           
     * 
     */
    @XmlEnumValue("landslips")
    LANDSLIPS("landslips"),

    /**
     * The road may be obstructed or partially obstructed due to mudslides.
     *           
     * 
     */
    @XmlEnumValue("mudSlide")
    MUD_SLIDE("mudSlide"),

    /**
     * The road is obstructed or partially obstructed by overflows from one or more
     *             sewers.
     *           
     * 
     */
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),

    /**
     * The road may be obstructed or partially obstructed due to fallen rocks.
     *           
     * 
     */
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),

    /**
     * Traffic may be disrupted due to a fire (other than a vehicle fire) adjacent to the
     *             roadway.
     *           
     * 
     */
    @XmlEnumValue("seriousFire")
    SERIOUS_FIRE("seriousFire"),

    /**
     * Smoke or fumes which may hinder driving conditions or distract drivers.
     *           
     * 
     */
    @XmlEnumValue("smokeOrFumes")
    SMOKE_OR_FUMES("smokeOrFumes"),

    /**
     * The road may be obstructed or partially obstructed by debris caused by strong
     *             winds.
     *           
     * 
     */
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),

    /**
     * The road surface has sunken or collapsed in places.
     * 
     */
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    EnvironmentalObstructionTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalObstructionTypeEnum2 fromValue(String v) {
        for (EnvironmentalObstructionTypeEnum2 c: EnvironmentalObstructionTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
