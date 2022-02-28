
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionXRelativeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PositionXRelativeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="toTheLeft"/&gt;
 *     &lt;enumeration value="alignedOnTheLeftSide"/&gt;
 *     &lt;enumeration value="centred"/&gt;
 *     &lt;enumeration value="alignedOnTheRightSide"/&gt;
 *     &lt;enumeration value="toTheRight"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionXRelativeEnum")
@XmlEnum
public enum PositionXRelativeEnum {


    /**
     * Positioned to the left of relative item.
     * 
     */
    @XmlEnumValue("toTheLeft")
    TO_THE_LEFT("toTheLeft"),

    /**
     * The left side of the area is aligned on the left side of the relative area.
     *           
     * 
     */
    @XmlEnumValue("alignedOnTheLeftSide")
    ALIGNED_ON_THE_LEFT_SIDE("alignedOnTheLeftSide"),

    /**
     * The area is vertically centred on the relative area.
     * 
     */
    @XmlEnumValue("centred")
    CENTRED("centred"),

    /**
     * The right side of the area is aligned on the right side of the relative area.
     *           
     * 
     */
    @XmlEnumValue("alignedOnTheRightSide")
    ALIGNED_ON_THE_RIGHT_SIDE("alignedOnTheRightSide"),

    /**
     * Positioned to the right of relative item.
     * 
     */
    @XmlEnumValue("toTheRight")
    TO_THE_RIGHT("toTheRight"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PositionXRelativeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionXRelativeEnum fromValue(String v) {
        for (PositionXRelativeEnum c: PositionXRelativeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
