
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonOperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ComparisonOperatorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="equalTo"/&gt;
 *     &lt;enumeration value="greaterThan"/&gt;
 *     &lt;enumeration value="greaterThanOrEqualTo"/&gt;
 *     &lt;enumeration value="lessThan"/&gt;
 *     &lt;enumeration value="lessThanOrEqualTo"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComparisonOperatorEnum")
@XmlEnum
public enum ComparisonOperatorEnum2 {


    /**
     * Logical comparison operator of "equal to".
     * 
     */
    @XmlEnumValue("equalTo")
    EQUAL_TO("equalTo"),

    /**
     * Logical comparison operator of "greater than".
     * 
     */
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),

    /**
     * Logical comparison operator of "greater than or equal to".
     * 
     */
    @XmlEnumValue("greaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),

    /**
     * Logical comparison operator of "less than".
     * 
     */
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),

    /**
     * Logical comparison operator of "less than or equal to".
     * 
     */
    @XmlEnumValue("lessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ComparisonOperatorEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperatorEnum2 fromValue(String v) {
        for (ComparisonOperatorEnum2 c: ComparisonOperatorEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
