
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnimalPresenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AnimalPresenceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="animalsOnTheRoad"/&gt;
 *     &lt;enumeration value="herdOfAnimalsOnTheRoad"/&gt;
 *     &lt;enumeration value="largeAnimalsOnTheRoad"/&gt;
 *     &lt;enumeration value="smallAnimalsOnTheRoad"/&gt;
 *     &lt;enumeration value="wildAnimalsOnTheRoad"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnimalPresenceTypeEnum")
@XmlEnum
public enum AnimalPresenceTypeEnum2 {


    /**
     * Traffic may be disrupted due to animals on the roadway.
     * 
     */
    @XmlEnumValue("animalsOnTheRoad")
    ANIMALS_ON_THE_ROAD("animalsOnTheRoad"),

    /**
     * Traffic may be disrupted due to a herd of animals on the roadway.
     *           
     * 
     */
    @XmlEnumValue("herdOfAnimalsOnTheRoad")
    HERD_OF_ANIMALS_ON_THE_ROAD("herdOfAnimalsOnTheRoad"),

    /**
     * Traffic may be disrupted due to large animals on the roadway.
     * 
     */
    @XmlEnumValue("largeAnimalsOnTheRoad")
    LARGE_ANIMALS_ON_THE_ROAD("largeAnimalsOnTheRoad"),

    /**
     * Small animals (that may fit underneath vehicle frames) are on the road
     *           
     * 
     */
    @XmlEnumValue("smallAnimalsOnTheRoad")
    SMALL_ANIMALS_ON_THE_ROAD("smallAnimalsOnTheRoad"),

    /**
     * Wild animals (not controlled by humans) are on the road
     * 
     */
    @XmlEnumValue("wildAnimalsOnTheRoad")
    WILD_ANIMALS_ON_THE_ROAD("wildAnimalsOnTheRoad"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    AnimalPresenceTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnimalPresenceTypeEnum2 fromValue(String v) {
        for (AnimalPresenceTypeEnum2 c: AnimalPresenceTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
