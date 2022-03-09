
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
public enum ComparisonOperatorEnum {

    @XmlEnumValue("equalTo")
    EQUAL_TO("equalTo"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("greaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ComparisonOperatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperatorEnum fromValue(String v) {
        for (ComparisonOperatorEnum c: ComparisonOperatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
