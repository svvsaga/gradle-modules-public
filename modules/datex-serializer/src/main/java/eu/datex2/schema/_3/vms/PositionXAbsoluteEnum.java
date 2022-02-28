
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionXAbsoluteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PositionXAbsoluteEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onLeft"/&gt;
 *     &lt;enumeration value="inTheMiddle"/&gt;
 *     &lt;enumeration value="onRight"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionXAbsoluteEnum")
@XmlEnum
public enum PositionXAbsoluteEnum {


    /**
     * On the left of the assigned space.
     * 
     */
    @XmlEnumValue("onLeft")
    ON_LEFT("onLeft"),

    /**
     * In the middle of the assigned space.
     * 
     */
    @XmlEnumValue("inTheMiddle")
    IN_THE_MIDDLE("inTheMiddle"),

    /**
     * On the right of the assigned space.
     * 
     */
    @XmlEnumValue("onRight")
    ON_RIGHT("onRight"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PositionXAbsoluteEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionXAbsoluteEnum fromValue(String v) {
        for (PositionXAbsoluteEnum c: PositionXAbsoluteEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
