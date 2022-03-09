
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProbabilityOfOccurrenceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProbabilityOfOccurrenceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="certain"/&gt;
 *     &lt;enumeration value="probable"/&gt;
 *     &lt;enumeration value="riskOf"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProbabilityOfOccurrenceEnum")
@XmlEnum
public enum ProbabilityOfOccurrenceEnum {

    @XmlEnumValue("certain")
    CERTAIN("certain"),
    @XmlEnumValue("probable")
    PROBABLE("probable"),
    @XmlEnumValue("riskOf")
    RISK_OF("riskOf"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ProbabilityOfOccurrenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbabilityOfOccurrenceEnum fromValue(String v) {
        for (ProbabilityOfOccurrenceEnum c: ProbabilityOfOccurrenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
