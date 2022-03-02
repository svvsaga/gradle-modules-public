
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionCompassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DirectionCompassEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="east"/&gt;
 *     &lt;enumeration value="eastNorthEast"/&gt;
 *     &lt;enumeration value="eastSouthEast"/&gt;
 *     &lt;enumeration value="north"/&gt;
 *     &lt;enumeration value="northEast"/&gt;
 *     &lt;enumeration value="northNorthEast"/&gt;
 *     &lt;enumeration value="northNorthWest"/&gt;
 *     &lt;enumeration value="northWest"/&gt;
 *     &lt;enumeration value="south"/&gt;
 *     &lt;enumeration value="southEast"/&gt;
 *     &lt;enumeration value="southSouthEast"/&gt;
 *     &lt;enumeration value="southSouthWest"/&gt;
 *     &lt;enumeration value="southWest"/&gt;
 *     &lt;enumeration value="west"/&gt;
 *     &lt;enumeration value="westNorthWest"/&gt;
 *     &lt;enumeration value="westSouthWest"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DirectionCompassEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum DirectionCompassEnum2 {


    /**
     * East.
     * 
     */
    @XmlEnumValue("east")
    EAST("east"),

    /**
     * East north east.
     * 
     */
    @XmlEnumValue("eastNorthEast")
    EAST_NORTH_EAST("eastNorthEast"),

    /**
     * East south east.
     * 
     */
    @XmlEnumValue("eastSouthEast")
    EAST_SOUTH_EAST("eastSouthEast"),

    /**
     * North.
     * 
     */
    @XmlEnumValue("north")
    NORTH("north"),

    /**
     * North east.
     * 
     */
    @XmlEnumValue("northEast")
    NORTH_EAST("northEast"),

    /**
     * North north east.
     * 
     */
    @XmlEnumValue("northNorthEast")
    NORTH_NORTH_EAST("northNorthEast"),

    /**
     * North north west.
     * 
     */
    @XmlEnumValue("northNorthWest")
    NORTH_NORTH_WEST("northNorthWest"),

    /**
     * North west.
     * 
     */
    @XmlEnumValue("northWest")
    NORTH_WEST("northWest"),

    /**
     * South.
     * 
     */
    @XmlEnumValue("south")
    SOUTH("south"),

    /**
     * South east.
     * 
     */
    @XmlEnumValue("southEast")
    SOUTH_EAST("southEast"),

    /**
     * South south east.
     * 
     */
    @XmlEnumValue("southSouthEast")
    SOUTH_SOUTH_EAST("southSouthEast"),

    /**
     * South south west.
     * 
     */
    @XmlEnumValue("southSouthWest")
    SOUTH_SOUTH_WEST("southSouthWest"),

    /**
     * South west.
     * 
     */
    @XmlEnumValue("southWest")
    SOUTH_WEST("southWest"),

    /**
     * West.
     * 
     */
    @XmlEnumValue("west")
    WEST("west"),

    /**
     * West north west.
     * 
     */
    @XmlEnumValue("westNorthWest")
    WEST_NORTH_WEST("westNorthWest"),

    /**
     * West south west.
     * 
     */
    @XmlEnumValue("westSouthWest")
    WEST_SOUTH_WEST("westSouthWest"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DirectionCompassEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionCompassEnum2 fromValue(String v) {
        for (DirectionCompassEnum2 c: DirectionCompassEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
