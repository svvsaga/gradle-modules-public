
package eu.datex2.schema._3.cctvextension;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CctvCameraTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="colourCcd"/&gt;
 *     &lt;enumeration value="blackAndWhiteCcd"/&gt;
 *     &lt;enumeration value="colourTube"/&gt;
 *     &lt;enumeration value="blackAndWhiteTube"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraTypeEnum")
@XmlEnum
public enum CctvCameraTypeEnum2 {

    @XmlEnumValue("colourCcd")
    COLOUR_CCD("colourCcd"),
    @XmlEnumValue("blackAndWhiteCcd")
    BLACK_AND_WHITE_CCD("blackAndWhiteCcd"),
    @XmlEnumValue("colourTube")
    COLOUR_TUBE("colourTube"),
    @XmlEnumValue("blackAndWhiteTube")
    BLACK_AND_WHITE_TUBE("blackAndWhiteTube"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    CctvCameraTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraTypeEnum2 fromValue(String v) {
        for (CctvCameraTypeEnum2 c: CctvCameraTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
