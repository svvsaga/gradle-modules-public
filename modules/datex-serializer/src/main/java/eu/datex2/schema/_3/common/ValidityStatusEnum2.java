
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidityStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ValidityStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="planned"/&gt;
 *     &lt;enumeration value="suspended"/&gt;
 *     &lt;enumeration value="definedByValidityTimeSpec"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidityStatusEnum")
@XmlEnum
public enum ValidityStatusEnum2 {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("planned")
    PLANNED("planned"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("definedByValidityTimeSpec")
    DEFINED_BY_VALIDITY_TIME_SPEC("definedByValidityTimeSpec"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ValidityStatusEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidityStatusEnum2 fromValue(String v) {
        for (ValidityStatusEnum2 c: ValidityStatusEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
