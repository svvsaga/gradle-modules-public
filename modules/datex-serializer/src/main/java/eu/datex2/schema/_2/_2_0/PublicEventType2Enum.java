
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicEventType2Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PublicEventType2Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="openAirConcert"/&gt;
 *     &lt;enumeration value="soundAndLightShow"/&gt;
 *     &lt;enumeration value="artEvent"/&gt;
 *     &lt;enumeration value="flowerEvent"/&gt;
 *     &lt;enumeration value="beerFestival"/&gt;
 *     &lt;enumeration value="foodFestival"/&gt;
 *     &lt;enumeration value="wineFestival"/&gt;
 *     &lt;enumeration value="theatricalEvent"/&gt;
 *     &lt;enumeration value="fireworkDisplay"/&gt;
 *     &lt;enumeration value="streetFestival"/&gt;
 *     &lt;enumeration value="filmFestival"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PublicEventType2Enum")
@XmlEnum
public enum PublicEventType2Enum {

    @XmlEnumValue("openAirConcert")
    OPEN_AIR_CONCERT("openAirConcert"),
    @XmlEnumValue("soundAndLightShow")
    SOUND_AND_LIGHT_SHOW("soundAndLightShow"),
    @XmlEnumValue("artEvent")
    ART_EVENT("artEvent"),
    @XmlEnumValue("flowerEvent")
    FLOWER_EVENT("flowerEvent"),
    @XmlEnumValue("beerFestival")
    BEER_FESTIVAL("beerFestival"),
    @XmlEnumValue("foodFestival")
    FOOD_FESTIVAL("foodFestival"),
    @XmlEnumValue("wineFestival")
    WINE_FESTIVAL("wineFestival"),
    @XmlEnumValue("theatricalEvent")
    THEATRICAL_EVENT("theatricalEvent"),
    @XmlEnumValue("fireworkDisplay")
    FIREWORK_DISPLAY("fireworkDisplay"),
    @XmlEnumValue("streetFestival")
    STREET_FESTIVAL("streetFestival"),
    @XmlEnumValue("filmFestival")
    FILM_FESTIVAL("filmFestival"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PublicEventType2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicEventType2Enum fromValue(String v) {
        for (PublicEventType2Enum c: PublicEventType2Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
