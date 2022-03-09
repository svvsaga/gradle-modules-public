
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColourEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ColourEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="amber"/&gt;
 *     &lt;enumeration value="blue"/&gt;
 *     &lt;enumeration value="green"/&gt;
 *     &lt;enumeration value="red"/&gt;
 *     &lt;enumeration value="white"/&gt;
 *     &lt;enumeration value="whiteYellow"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColourEnum")
@XmlEnum
public enum ColourEnum {

    @XmlEnumValue("amber")
    AMBER("amber"),
    @XmlEnumValue("blue")
    BLUE("blue"),
    @XmlEnumValue("green")
    GREEN("green"),
    @XmlEnumValue("red")
    RED("red"),
    @XmlEnumValue("white")
    WHITE("white"),
    @XmlEnumValue("whiteYellow")
    WHITE_YELLOW("whiteYellow"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ColourEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColourEnum fromValue(String v) {
        for (ColourEnum c: ColourEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
