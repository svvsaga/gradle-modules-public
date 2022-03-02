
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abnormalLoadMovementNote"/&gt;
 *     &lt;enumeration value="dataProcessingNote"/&gt;
 *     &lt;enumeration value="description"/&gt;
 *     &lt;enumeration value="internalNote"/&gt;
 *     &lt;enumeration value="locationDescriptor"/&gt;
 *     &lt;enumeration value="warning"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeEnum")
@XmlEnum
public enum CommentTypeEnum {

    @XmlEnumValue("abnormalLoadMovementNote")
    ABNORMAL_LOAD_MOVEMENT_NOTE("abnormalLoadMovementNote"),
    @XmlEnumValue("dataProcessingNote")
    DATA_PROCESSING_NOTE("dataProcessingNote"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("internalNote")
    INTERNAL_NOTE("internalNote"),
    @XmlEnumValue("locationDescriptor")
    LOCATION_DESCRIPTOR("locationDescriptor"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CommentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentTypeEnum fromValue(String v) {
        for (CommentTypeEnum c: CommentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
