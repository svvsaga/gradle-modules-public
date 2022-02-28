
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRouteTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingRouteTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pedestrian"/&gt;
 *     &lt;enumeration value="bicycle"/&gt;
 *     &lt;enumeration value="lorry"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingRouteTypeEnum")
@XmlEnum
public enum ParkingRouteTypeEnum {

    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("lorry")
    LORRY("lorry"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingRouteTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingRouteTypeEnum fromValue(String v) {
        for (ParkingRouteTypeEnum c: ParkingRouteTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
