
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NutsCodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NutsCodeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nuts1Code"/&gt;
 *     &lt;enumeration value="nuts2Code"/&gt;
 *     &lt;enumeration value="nuts3Code"/&gt;
 *     &lt;enumeration value="lau1Code"/&gt;
 *     &lt;enumeration value="lau2Code"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NutsCodeTypeEnum")
@XmlEnum
public enum NutsCodeTypeEnum {

    @XmlEnumValue("nuts1Code")
    NUTS_1_CODE("nuts1Code"),
    @XmlEnumValue("nuts2Code")
    NUTS_2_CODE("nuts2Code"),
    @XmlEnumValue("nuts3Code")
    NUTS_3_CODE("nuts3Code"),
    @XmlEnumValue("lau1Code")
    LAU_1_CODE("lau1Code"),
    @XmlEnumValue("lau2Code")
    LAU_2_CODE("lau2Code"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    NutsCodeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NutsCodeTypeEnum fromValue(String v) {
        for (NutsCodeTypeEnum c: NutsCodeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
