
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionConfidenceCodedErrorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PositionConfidenceCodedErrorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="outOfRange"/&gt;
 *     &lt;enumeration value="unavailable"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionConfidenceCodedErrorEnum")
@XmlEnum
public enum PositionConfidenceCodedErrorEnum {

    @XmlEnumValue("outOfRange")
    OUT_OF_RANGE("outOfRange"),
    @XmlEnumValue("unavailable")
    UNAVAILABLE("unavailable"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PositionConfidenceCodedErrorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionConfidenceCodedErrorEnum fromValue(String v) {
        for (PositionConfidenceCodedErrorEnum c: PositionConfidenceCodedErrorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
