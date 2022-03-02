
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingOccupancyTrendEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingOccupancyTrendEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="decreasing"/&gt;
 *     &lt;enumeration value="increasing"/&gt;
 *     &lt;enumeration value="stable"/&gt;
 *     &lt;enumeration value="increasingQuickly"/&gt;
 *     &lt;enumeration value="increasingSlowly"/&gt;
 *     &lt;enumeration value="decreasingQuickly"/&gt;
 *     &lt;enumeration value="decreasingSlowly"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingOccupancyTrendEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingOccupancyTrendEnum {

    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),
    @XmlEnumValue("increasing")
    INCREASING("increasing"),
    @XmlEnumValue("stable")
    STABLE("stable"),
    @XmlEnumValue("increasingQuickly")
    INCREASING_QUICKLY("increasingQuickly"),
    @XmlEnumValue("increasingSlowly")
    INCREASING_SLOWLY("increasingSlowly"),
    @XmlEnumValue("decreasingQuickly")
    DECREASING_QUICKLY("decreasingQuickly"),
    @XmlEnumValue("decreasingSlowly")
    DECREASING_SLOWLY("decreasingSlowly"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingOccupancyTrendEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingOccupancyTrendEnum fromValue(String v) {
        for (ParkingOccupancyTrendEnum c: ParkingOccupancyTrendEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
