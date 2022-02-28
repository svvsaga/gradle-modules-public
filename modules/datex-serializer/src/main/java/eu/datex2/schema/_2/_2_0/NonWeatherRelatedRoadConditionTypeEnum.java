
package eu.datex2.schema._2._2_0;

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
 *     &lt;enumeration value="roadSurfaceInPoorCondition"/&gt;
 *     &lt;enumeration value="slipperyRoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonWeatherRelatedRoadConditionTypeEnum")
@XmlEnum
public enum NonWeatherRelatedRoadConditionTypeEnum {

    @XmlEnumValue("dieselOnRoad")
    DIESEL_ON_ROAD("dieselOnRoad"),
    @XmlEnumValue("leavesOnRoad")
    LEAVES_ON_ROAD("leavesOnRoad"),
    @XmlEnumValue("looseChippings")
    LOOSE_CHIPPINGS("looseChippings"),
    @XmlEnumValue("looseSandOnRoad")
    LOOSE_SAND_ON_ROAD("looseSandOnRoad"),
    @XmlEnumValue("mudOnRoad")
    MUD_ON_ROAD("mudOnRoad"),
    @XmlEnumValue("oilOnRoad")
    OIL_ON_ROAD("oilOnRoad"),
    @XmlEnumValue("petrolOnRoad")
    PETROL_ON_ROAD("petrolOnRoad"),
    @XmlEnumValue("roadSurfaceInPoorCondition")
    ROAD_SURFACE_IN_POOR_CONDITION("roadSurfaceInPoorCondition"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NonWeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonWeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (NonWeatherRelatedRoadConditionTypeEnum c: NonWeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
