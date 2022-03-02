
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionYRelativeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PositionYRelativeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="above"/&gt;
 *     &lt;enumeration value="alignedOnTheTopSide"/&gt;
 *     &lt;enumeration value="centred"/&gt;
 *     &lt;enumeration value="alignedOnTheBottomSide"/&gt;
 *     &lt;enumeration value="below"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionYRelativeEnum", namespace = "http://datex2.eu/schema/3/vms")
@XmlEnum
public enum PositionYRelativeEnum2 {


    /**
     * Positioned above relative item.
     * 
     */
    @XmlEnumValue("above")
    ABOVE("above"),

    /**
     * The top side of the area is aligned on the top side of the relative area.
     *           
     * 
     */
    @XmlEnumValue("alignedOnTheTopSide")
    ALIGNED_ON_THE_TOP_SIDE("alignedOnTheTopSide"),

    /**
     * The area is horizontally centred on the relative area.
     * 
     */
    @XmlEnumValue("centred")
    CENTRED("centred"),

    /**
     * The bottom side of the area is aligned on the bottom side of the relative area.
     *           
     * 
     */
    @XmlEnumValue("alignedOnTheBottomSide")
    ALIGNED_ON_THE_BOTTOM_SIDE("alignedOnTheBottomSide"),

    /**
     * Positioned below relative item.
     * 
     */
    @XmlEnumValue("below")
    BELOW("below"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PositionYRelativeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionYRelativeEnum2 fromValue(String v) {
        for (PositionYRelativeEnum2 c: PositionYRelativeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
