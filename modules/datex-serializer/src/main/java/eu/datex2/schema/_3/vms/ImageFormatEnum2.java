
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageFormatEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageFormatEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bmp"/&gt;
 *     &lt;enumeration value="gif"/&gt;
 *     &lt;enumeration value="jpeg"/&gt;
 *     &lt;enumeration value="png"/&gt;
 *     &lt;enumeration value="tiff"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageFormatEnum")
@XmlEnum
public enum ImageFormatEnum2 {


    /**
     * The bmp image format
     * 
     */
    @XmlEnumValue("bmp")
    BMP("bmp"),

    /**
     * The gif image format
     * 
     */
    @XmlEnumValue("gif")
    GIF("gif"),

    /**
     * The jpeg image format
     * 
     */
    @XmlEnumValue("jpeg")
    JPEG("jpeg"),

    /**
     * The png image format
     * 
     */
    @XmlEnumValue("png")
    PNG("png"),

    /**
     * The TIFF image format
     * 
     */
    @XmlEnumValue("tiff")
    TIFF("tiff"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ImageFormatEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageFormatEnum2 fromValue(String v) {
        for (ImageFormatEnum2 c: ImageFormatEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
