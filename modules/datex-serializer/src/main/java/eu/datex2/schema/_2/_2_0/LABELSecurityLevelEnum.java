
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LABELSecurityLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LABELSecurityLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="securityLevel1"/&gt;
 *     &lt;enumeration value="securityLevel2"/&gt;
 *     &lt;enumeration value="securityLevel3"/&gt;
 *     &lt;enumeration value="securityLevel4"/&gt;
 *     &lt;enumeration value="securityLevel5"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LABELSecurityLevelEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum LABELSecurityLevelEnum {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("securityLevel1")
    SECURITY_LEVEL_1("securityLevel1"),
    @XmlEnumValue("securityLevel2")
    SECURITY_LEVEL_2("securityLevel2"),
    @XmlEnumValue("securityLevel3")
    SECURITY_LEVEL_3("securityLevel3"),
    @XmlEnumValue("securityLevel4")
    SECURITY_LEVEL_4("securityLevel4"),
    @XmlEnumValue("securityLevel5")
    SECURITY_LEVEL_5("securityLevel5"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LABELSecurityLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LABELSecurityLevelEnum fromValue(String v) {
        for (LABELSecurityLevelEnum c: LABELSecurityLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
