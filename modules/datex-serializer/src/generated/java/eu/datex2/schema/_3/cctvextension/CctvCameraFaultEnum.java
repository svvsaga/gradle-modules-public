
package eu.datex2.schema._3.cctvextension;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CctvCameraFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="communicationsFailure"/&gt;
 *     &lt;enumeration value="controlFailure"/&gt;
 *     &lt;enumeration value="outOfService"/&gt;
 *     &lt;enumeration value="powerFailure"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraFaultEnum")
@XmlEnum
public enum CctvCameraFaultEnum {

    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),
    @XmlEnumValue("controlFailure")
    CONTROL_FAILURE("controlFailure"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    CctvCameraFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraFaultEnum fromValue(String v) {
        for (CctvCameraFaultEnum c: CctvCameraFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
