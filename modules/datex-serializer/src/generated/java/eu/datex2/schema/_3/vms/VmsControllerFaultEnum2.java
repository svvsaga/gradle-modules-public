
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsControllerFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VmsControllerFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="communicationsFailure"/&gt;
 *     &lt;enumeration value="powerFailure"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsControllerFaultEnum")
@XmlEnum
public enum VmsControllerFaultEnum2 {

    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VmsControllerFaultEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsControllerFaultEnum2 fromValue(String v) {
        for (VmsControllerFaultEnum2 c: VmsControllerFaultEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
