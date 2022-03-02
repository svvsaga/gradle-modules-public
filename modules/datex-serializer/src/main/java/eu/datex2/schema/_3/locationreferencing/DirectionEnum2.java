
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
@XmlType(name = "DirectionEnum", namespace = "http://datex2.eu/schema/3/locationReferencing")
@XmlEnum
public enum DirectionEnum2 {


    /**
     * Same direction as the normal direction of flow at this point on the road
     *             network.
     *           
     * 
     */
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),

    /**
     * All directions (where more than two are applicable) at this point on the road
     *             network.
     *           
     * 
     */
    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),

    /**
     * Anti-clockwise.
     * 
     */
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),

    /**
     * Both directions that are applicable at this point on the road network.
     *           
     * 
     */
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),

    /**
     * Clockwise.
     * 
     */
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),

    /**
     * Inner ring direction.
     * 
     */
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),

    /**
     * Outer ring direction.
     * 
     */
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),

    /**
     * East bound general direction.
     * 
     */
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),

    /**
     * North bound general direction.
     * 
     */
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),

    /**
     * North east bound general direction.
     * 
     */
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),

    /**
     * North west bound general direction.
     * 
     */
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),

    /**
     * South bound general direction.
     * 
     */
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),

    /**
     * South east bound general direction.
     * 
     */
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),

    /**
     * South west bound general direction.
     * 
     */
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),

    /**
     * West bound general direction.
     * 
     */
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),

    /**
     * Heading towards town centre direction of travel.
     * 
     */
    @XmlEnumValue("inboundTowardsTown")
    INBOUND_TOWARDS_TOWN("inboundTowardsTown"),

    /**
     * Heading out of or away from the town centre direction of travel.
     *           
     * 
     */
    @XmlEnumValue("outboundFromTown")
    OUTBOUND_FROM_TOWN("outboundFromTown"),

    /**
     * Opposite direction to the normal direction of flow at this point on the road
     *             network.
     *           
     * 
     */
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),

    /**
     * Direction is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DirectionEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum2 fromValue(String v) {
        for (DirectionEnum2 c: DirectionEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
