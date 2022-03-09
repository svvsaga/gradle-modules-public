
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AlertCDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="negative"/&gt;
 *     &lt;enumeration value="positive"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlertCDirectionEnum")
@XmlEnum
public enum AlertCDirectionEnum {

    @XmlEnumValue("negative")
    NEGATIVE("negative"),
    @XmlEnumValue("positive")
    POSITIVE("positive"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    AlertCDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertCDirectionEnum fromValue(String v) {
        for (AlertCDirectionEnum c: AlertCDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
