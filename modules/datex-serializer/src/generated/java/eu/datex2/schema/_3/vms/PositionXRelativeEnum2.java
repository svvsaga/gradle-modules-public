
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
public enum PositionXRelativeEnum2 {

    @XmlEnumValue("toTheLeft")
    TO_THE_LEFT("toTheLeft"),
    @XmlEnumValue("alignedOnTheLeftSide")
    ALIGNED_ON_THE_LEFT_SIDE("alignedOnTheLeftSide"),
    @XmlEnumValue("centred")
    CENTRED("centred"),
    @XmlEnumValue("alignedOnTheRightSide")
    ALIGNED_ON_THE_RIGHT_SIDE("alignedOnTheRightSide"),
    @XmlEnumValue("toTheRight")
    TO_THE_RIGHT("toTheRight"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PositionXRelativeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionXRelativeEnum2 fromValue(String v) {
        for (PositionXRelativeEnum2 c: PositionXRelativeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
