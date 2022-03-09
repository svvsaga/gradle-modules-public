
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aligned"/&gt;
 *     &lt;enumeration value="allDirections"/&gt;
 *     &lt;enumeration value="anticlockwise"/&gt;
 *     &lt;enumeration value="bothWays"/&gt;
 *     &lt;enumeration value="clockwise"/&gt;
 *     &lt;enumeration value="innerRing"/&gt;
 *     &lt;enumeration value="outerRing"/&gt;
 *     &lt;enumeration value="eastBound"/&gt;
 *     &lt;enumeration value="northBound"/&gt;
 *     &lt;enumeration value="northEastBound"/&gt;
 *     &lt;enumeration value="northWestBound"/&gt;
 *     &lt;enumeration value="southBound"/&gt;
 *     &lt;enumeration value="southEastBound"/&gt;
 *     &lt;enumeration value="southWestBound"/&gt;
 *     &lt;enumeration value="westBound"/&gt;
 *     &lt;enumeration value="inboundTowardsTown"/&gt;
 *     &lt;enumeration value="outboundFromTown"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DirectionEnum")
@XmlEnum
public enum DirectionEnum {

    @XmlEnumValue("aligned")
    ALIGNED("aligned"),
    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("inboundTowardsTown")
    INBOUND_TOWARDS_TOWN("inboundTowardsTown"),
    @XmlEnumValue("outboundFromTown")
    OUTBOUND_FROM_TOWN("outboundFromTown"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum c: DirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
