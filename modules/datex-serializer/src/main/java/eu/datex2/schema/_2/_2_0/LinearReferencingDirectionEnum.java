
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearReferencingDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LinearReferencingDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="aligned"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinearReferencingDirectionEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum LinearReferencingDirectionEnum {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LinearReferencingDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearReferencingDirectionEnum fromValue(String v) {
        for (LinearReferencingDirectionEnum c: LinearReferencingDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
