
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlLinkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UrlLinkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="documentPdf"/&gt;
 *     &lt;enumeration value="html"/&gt;
 *     &lt;enumeration value="image"/&gt;
 *     &lt;enumeration value="rss"/&gt;
 *     &lt;enumeration value="videoStream"/&gt;
 *     &lt;enumeration value="voiceStream"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrlLinkTypeEnum")
@XmlEnum
public enum UrlLinkTypeEnum {


    /**
     * URL link to a pdf document.
     * 
     */
    @XmlEnumValue("documentPdf")
    DOCUMENT_PDF("documentPdf"),

    /**
     * URL link to an html page.
     * 
     */
    @XmlEnumValue("html")
    HTML("html"),

    /**
     * URL link to an image.
     * 
     */
    @XmlEnumValue("image")
    IMAGE("image"),

    /**
     * URL link to an RSS feed.
     * 
     */
    @XmlEnumValue("rss")
    RSS("rss"),

    /**
     * URL link to a video stream.
     * 
     */
    @XmlEnumValue("videoStream")
    VIDEO_STREAM("videoStream"),

    /**
     * URL link to a voice stream.
     * 
     */
    @XmlEnumValue("voiceStream")
    VOICE_STREAM("voiceStream"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    UrlLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlLinkTypeEnum fromValue(String v) {
        for (UrlLinkTypeEnum c: UrlLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
