
package eu.datex2.schema._3.informationmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManagementTypeEnum")
@XmlEnum
public enum ManagementTypeEnum {

    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagementTypeEnum fromValue(String v) {
        for (ManagementTypeEnum c: ManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
