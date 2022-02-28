
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultSeverityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FaultSeverityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultSeverityEnum")
@XmlEnum
public enum FaultSeverityEnum {

    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    FaultSeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultSeverityEnum fromValue(String v) {
        for (FaultSeverityEnum c: FaultSeverityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
