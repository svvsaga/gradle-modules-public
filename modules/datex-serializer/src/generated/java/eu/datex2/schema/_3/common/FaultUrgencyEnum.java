
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultUrgencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FaultUrgencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="urgent"/&gt;
 *     &lt;enumeration value="extremelyUrgent"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultUrgencyEnum")
@XmlEnum
public enum FaultUrgencyEnum {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("urgent")
    URGENT("urgent"),
    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    FaultUrgencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultUrgencyEnum fromValue(String v) {
        for (FaultUrgencyEnum c: FaultUrgencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
