
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfidentialityValueEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfidentialityValueEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="internalUse"/&gt;
 *     &lt;enumeration value="noRestriction"/&gt;
 *     &lt;enumeration value="restrictedToAuthorities"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesAndTrafficOperators"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndPublishers"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndVms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityValueEnum")
@XmlEnum
public enum ConfidentialityValueEnum {

    @XmlEnumValue("internalUse")
    INTERNAL_USE("internalUse"),
    @XmlEnumValue("noRestriction")
    NO_RESTRICTION("noRestriction"),
    @XmlEnumValue("restrictedToAuthorities")
    RESTRICTED_TO_AUTHORITIES("restrictedToAuthorities"),
    @XmlEnumValue("restrictedToAuthoritiesAndTrafficOperators")
    RESTRICTED_TO_AUTHORITIES_AND_TRAFFIC_OPERATORS("restrictedToAuthoritiesAndTrafficOperators"),
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndPublishers")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_PUBLISHERS("restrictedToAuthoritiesTrafficOperatorsAndPublishers"),
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndVms")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_VMS("restrictedToAuthoritiesTrafficOperatorsAndVms");
    private final String value;

    ConfidentialityValueEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfidentialityValueEnum fromValue(String v) {
        for (ConfidentialityValueEnum c: ConfidentialityValueEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
