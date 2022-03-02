
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrgencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UrgencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="extremelyUrgent"/&gt;
 *     &lt;enumeration value="urgent"/&gt;
 *     &lt;enumeration value="normalUrgency"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrgencyEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum UrgencyEnum {

    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),
    @XmlEnumValue("urgent")
    URGENT("urgent"),
    @XmlEnumValue("normalUrgency")
    NORMAL_URGENCY("normalUrgency");
    private final String value;

    UrgencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrgencyEnum fromValue(String v) {
        for (UrgencyEnum c: UrgencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
