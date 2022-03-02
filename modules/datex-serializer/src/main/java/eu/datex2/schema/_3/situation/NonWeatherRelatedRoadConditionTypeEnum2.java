
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonWeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NonWeatherRelatedRoadConditionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dieselOnRoad"/&gt;
 *     &lt;enumeration value="leavesOnRoad"/&gt;
 *     &lt;enumeration value="looseChippings"/&gt;
 *     &lt;enumeration value="looseSandOnRoad"/&gt;
 *     &lt;enumeration value="mudOnRoad"/&gt;
 *     &lt;enumeration value="oilOnRoad"/&gt;
 *     &lt;enumeration value="petrolOnRoad"/&gt;
 *     &lt;enumeration value="roadMarkingNotPresent"/&gt;
 *     &lt;enumeration value="roadSurfaceInPoorCondition"/&gt;
 *     &lt;enumeration value="slipperyRoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonWeatherRelatedRoadConditionTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum NonWeatherRelatedRoadConditionTypeEnum2 {


    /**
     * Increased skid risk due to diesel on the road.
     * 
     */
    @XmlEnumValue("dieselOnRoad")
    DIESEL_ON_ROAD("dieselOnRoad"),

    /**
     * Increased skid risk due to leaves on road.
     * 
     */
    @XmlEnumValue("leavesOnRoad")
    LEAVES_ON_ROAD("leavesOnRoad"),

    /**
     * Increased skid risk and injury risk due to loose chippings on road.
     *           
     * 
     */
    @XmlEnumValue("looseChippings")
    LOOSE_CHIPPINGS("looseChippings"),

    /**
     * Increased skid risk due to loose sand on road.
     * 
     */
    @XmlEnumValue("looseSandOnRoad")
    LOOSE_SAND_ON_ROAD("looseSandOnRoad"),

    /**
     * Increased skid risk due to mud on road.
     * 
     */
    @XmlEnumValue("mudOnRoad")
    MUD_ON_ROAD("mudOnRoad"),

    /**
     * Increased skid risk due to oil on road.
     * 
     */
    @XmlEnumValue("oilOnRoad")
    OIL_ON_ROAD("oilOnRoad"),

    /**
     * Increased skid risk due to petrol on road.
     * 
     */
    @XmlEnumValue("petrolOnRoad")
    PETROL_ON_ROAD("petrolOnRoad"),

    /**
     * Road markings are not present due to maintenance works in progress
     *           
     * 
     */
    @XmlEnumValue("roadMarkingNotPresent")
    ROAD_MARKING_NOT_PRESENT("roadMarkingNotPresent"),

    /**
     * The road surface is damaged, severely rutted or potholed (i.e. it is in a poor
     *             state of repair).
     *           
     * 
     */
    @XmlEnumValue("roadSurfaceInPoorCondition")
    ROAD_SURFACE_IN_POOR_CONDITION("roadSurfaceInPoorCondition"),

    /**
     * The road surface is slippery due to an unspecified non-weather related cause.
     *           
     * 
     */
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    NonWeatherRelatedRoadConditionTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonWeatherRelatedRoadConditionTypeEnum2 fromValue(String v) {
        for (NonWeatherRelatedRoadConditionTypeEnum2 c: NonWeatherRelatedRoadConditionTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
