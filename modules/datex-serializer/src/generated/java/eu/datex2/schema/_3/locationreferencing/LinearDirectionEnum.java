
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LinearDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="aligned"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinearDirectionEnum")
@XmlEnum
public enum LinearDirectionEnum {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    LinearDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearDirectionEnum fromValue(String v) {
        for (LinearDirectionEnum c: LinearDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
