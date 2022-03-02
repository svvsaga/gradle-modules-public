
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStillImageFormatEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CctvStillImageFormatEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="jpeg"/&gt;
 *     &lt;enumeration value="gif"/&gt;
 *     &lt;enumeration value="png"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CctvStillImageFormatEnum")
@XmlEnum
public enum CctvStillImageFormatEnum {

    @XmlEnumValue("jpeg")
    JPEG("jpeg"),
    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("png")
    PNG("png");
    private final String value;

    CctvStillImageFormatEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvStillImageFormatEnum fromValue(String v) {
        for (CctvStillImageFormatEnum c: CctvStillImageFormatEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
