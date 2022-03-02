
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperatingModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="conditionTriggered"/&gt;
 *     &lt;enumeration value="onOccurrence"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="periodic"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatingModeEnum")
@XmlEnum
public enum OperatingModeEnum2 {

    @XmlEnumValue("conditionTriggered")
    CONDITION_TRIGGERED("conditionTriggered"),
    @XmlEnumValue("onOccurrence")
    ON_OCCURRENCE("onOccurrence"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("periodic")
    PERIODIC("periodic"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    OperatingModeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingModeEnum2 fromValue(String v) {
        for (OperatingModeEnum2 c: OperatingModeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
