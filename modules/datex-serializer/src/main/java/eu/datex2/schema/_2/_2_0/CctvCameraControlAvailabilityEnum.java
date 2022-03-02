
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraControlAvailabilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CctvCameraControlAvailabilityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="controlAvailable"/&gt;
 *     &lt;enumeration value="controlBlocked"/&gt;
 *     &lt;enumeration value="controlCurrentlyAssigned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraControlAvailabilityEnum")
@XmlEnum
public enum CctvCameraControlAvailabilityEnum {

    @XmlEnumValue("controlAvailable")
    CONTROL_AVAILABLE("controlAvailable"),
    @XmlEnumValue("controlBlocked")
    CONTROL_BLOCKED("controlBlocked"),
    @XmlEnumValue("controlCurrentlyAssigned")
    CONTROL_CURRENTLY_ASSIGNED("controlCurrentlyAssigned");
    private final String value;

    CctvCameraControlAvailabilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraControlAvailabilityEnum fromValue(String v) {
        for (CctvCameraControlAvailabilityEnum c: CctvCameraControlAvailabilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
