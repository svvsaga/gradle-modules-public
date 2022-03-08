
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
public enum UrlLinkTypeEnum2 {

    @XmlEnumValue("documentPdf")
    DOCUMENT_PDF("documentPdf"),
    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("rss")
    RSS("rss"),
    @XmlEnumValue("videoStream")
    VIDEO_STREAM("videoStream"),
    @XmlEnumValue("voiceStream")
    VOICE_STREAM("voiceStream"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    UrlLinkTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlLinkTypeEnum2 fromValue(String v) {
        for (UrlLinkTypeEnum2 c: UrlLinkTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
