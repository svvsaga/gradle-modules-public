
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
@XmlType(name = "ProbabilityOfOccurrenceEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum ProbabilityOfOccurrenceEnum2 {


    /**
     * The source is completely certain of the occurrence of the situation record version
     *             content.
     *           
     * 
     */
    @XmlEnumValue("certain")
    CERTAIN("certain"),

    /**
     * The source has a reasonably high level of confidence of the occurrence of the
     *             situation record version content.
     *           
     * 
     */
    @XmlEnumValue("probable")
    PROBABLE("probable"),

    /**
     * The source has a moderate level of confidence of the occurrence of the situation
     *             record version content.
     *           
     * 
     */
    @XmlEnumValue("riskOf")
    RISK_OF("riskOf"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ProbabilityOfOccurrenceEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbabilityOfOccurrenceEnum2 fromValue(String v) {
        for (ProbabilityOfOccurrenceEnum2 c: ProbabilityOfOccurrenceEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}