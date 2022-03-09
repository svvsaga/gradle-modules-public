
package eu.datex2.schema._3.cctvextension;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraVideoOrImageAvailabilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CctvCameraVideoOrImageAvailabilityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="videoOrImagesAvailable"/&gt;
 *     &lt;enumeration value="videoOrImagesUnavailableDueToCameraFault"/&gt;
 *     &lt;enumeration value="videoOrImagesBlankedByOperator"/&gt;
 *     &lt;enumeration value="videoOrImagesBlankedByPolice"/&gt;
 *     &lt;enumeration value="videoOrImagesBlankedBySystem"/&gt;
 *     &lt;enumeration value="videoOrImagesBlankedBySystemAdministrator"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraVideoOrImageAvailabilityEnum")
@XmlEnum
public enum CctvCameraVideoOrImageAvailabilityEnum {

    @XmlEnumValue("videoOrImagesAvailable")
    VIDEO_OR_IMAGES_AVAILABLE("videoOrImagesAvailable"),
    @XmlEnumValue("videoOrImagesUnavailableDueToCameraFault")
    VIDEO_OR_IMAGES_UNAVAILABLE_DUE_TO_CAMERA_FAULT("videoOrImagesUnavailableDueToCameraFault"),
    @XmlEnumValue("videoOrImagesBlankedByOperator")
    VIDEO_OR_IMAGES_BLANKED_BY_OPERATOR("videoOrImagesBlankedByOperator"),
    @XmlEnumValue("videoOrImagesBlankedByPolice")
    VIDEO_OR_IMAGES_BLANKED_BY_POLICE("videoOrImagesBlankedByPolice"),
    @XmlEnumValue("videoOrImagesBlankedBySystem")
    VIDEO_OR_IMAGES_BLANKED_BY_SYSTEM("videoOrImagesBlankedBySystem"),
    @XmlEnumValue("videoOrImagesBlankedBySystemAdministrator")
    VIDEO_OR_IMAGES_BLANKED_BY_SYSTEM_ADMINISTRATOR("videoOrImagesBlankedBySystemAdministrator"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    CctvCameraVideoOrImageAvailabilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraVideoOrImageAvailabilityEnum fromValue(String v) {
        for (CctvCameraVideoOrImageAvailabilityEnum c: CctvCameraVideoOrImageAvailabilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
