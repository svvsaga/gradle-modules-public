
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficConstrictionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrafficConstrictionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="carriagewayBlocked"/&gt;
 *     &lt;enumeration value="carriagewayPartiallyObstructed"/&gt;
 *     &lt;enumeration value="lanesBlocked"/&gt;
 *     &lt;enumeration value="lanesPartiallyObstructed"/&gt;
 *     &lt;enumeration value="roadBlocked"/&gt;
 *     &lt;enumeration value="roadPartiallyObstructed"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficConstrictionTypeEnum")
@XmlEnum
public enum TrafficConstrictionTypeEnum {

    @XmlEnumValue("carriagewayBlocked")
    CARRIAGEWAY_BLOCKED("carriagewayBlocked"),
    @XmlEnumValue("carriagewayPartiallyObstructed")
    CARRIAGEWAY_PARTIALLY_OBSTRUCTED("carriagewayPartiallyObstructed"),
    @XmlEnumValue("lanesBlocked")
    LANES_BLOCKED("lanesBlocked"),
    @XmlEnumValue("lanesPartiallyObstructed")
    LANES_PARTIALLY_OBSTRUCTED("lanesPartiallyObstructed"),
    @XmlEnumValue("roadBlocked")
    ROAD_BLOCKED("roadBlocked"),
    @XmlEnumValue("roadPartiallyObstructed")
    ROAD_PARTIALLY_OBSTRUCTED("roadPartiallyObstructed"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TrafficConstrictionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficConstrictionTypeEnum fromValue(String v) {
        for (TrafficConstrictionTypeEnum c: TrafficConstrictionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
