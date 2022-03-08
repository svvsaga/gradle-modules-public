
package eu.datex2.schema._2._2_0;

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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraTypeEnum")
@XmlEnum
public enum CctvCameraTypeEnum {

    @XmlEnumValue("colourCcd")
    COLOUR_CCD("colourCcd"),
    @XmlEnumValue("blackAndWhiteCcd")
    BLACK_AND_WHITE_CCD("blackAndWhiteCcd"),
    @XmlEnumValue("colourTube")
    COLOUR_TUBE("colourTube"),
    @XmlEnumValue("blackAndWhiteTube")
    BLACK_AND_WHITE_TUBE("blackAndWhiteTube");
    private final String value;

    CctvCameraTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraTypeEnum fromValue(String v) {
        for (CctvCameraTypeEnum c: CctvCameraTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
