
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceOptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ComplianceOptionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="advisory"/&gt;
 *     &lt;enumeration value="mandatory"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceOptionEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum ComplianceOptionEnum2 {


    /**
     * Advisory compliance.
     * 
     */
    @XmlEnumValue("advisory")
    ADVISORY("advisory"),

    /**
     * Mandatory compliance.
     * 
     */
    @XmlEnumValue("mandatory")
    MANDATORY("mandatory"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ComplianceOptionEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceOptionEnum2 fromValue(String v) {
        for (ComplianceOptionEnum2 c: ComplianceOptionEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
