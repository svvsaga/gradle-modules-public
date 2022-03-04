
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
@XmlType(name = "PositionYRelativeEnum")
@XmlEnum
public enum PositionYRelativeEnum2 {

    @XmlEnumValue("above")
    ABOVE("above"),
    @XmlEnumValue("alignedOnTheTopSide")
    ALIGNED_ON_THE_TOP_SIDE("alignedOnTheTopSide"),
    @XmlEnumValue("centred")
    CENTRED("centred"),
    @XmlEnumValue("alignedOnTheBottomSide")
    ALIGNED_ON_THE_BOTTOM_SIDE("alignedOnTheBottomSide"),
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
