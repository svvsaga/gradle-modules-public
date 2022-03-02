
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LABELServiceLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LABELServiceLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="serviceLevel1"/&gt;
 *     &lt;enumeration value="serviceLevel2"/&gt;
 *     &lt;enumeration value="serviceLevel3"/&gt;
 *     &lt;enumeration value="serviceLevel4"/&gt;
 *     &lt;enumeration value="serviceLevel5"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LABELServiceLevelEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum LABELServiceLevelEnum {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("serviceLevel1")
    SERVICE_LEVEL_1("serviceLevel1"),
    @XmlEnumValue("serviceLevel2")
    SERVICE_LEVEL_2("serviceLevel2"),
    @XmlEnumValue("serviceLevel3")
    SERVICE_LEVEL_3("serviceLevel3"),
    @XmlEnumValue("serviceLevel4")
    SERVICE_LEVEL_4("serviceLevel4"),
    @XmlEnumValue("serviceLevel5")
    SERVICE_LEVEL_5("serviceLevel5"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LABELServiceLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LABELServiceLevelEnum fromValue(String v) {
        for (LABELServiceLevelEnum c: LABELServiceLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
