
package eu.datex2.schema._3.situation;

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
 *     &lt;enumeration value="roadworksName"/&gt;
 *     &lt;enumeration value="warning"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeEnum")
@XmlEnum
public enum CommentTypeEnum {


    /**
     * A free text human oriented note describing details of abnormal load movements
     *             associated with the SituationRecord.
     *           
     * 
     */
    @XmlEnumValue("abnormalLoadMovementNote")
    ABNORMAL_LOAD_MOVEMENT_NOTE("abnormalLoadMovementNote"),

    /**
     * A free text human oriented note describing the way the information in the
     *             SituationRecord has been or should be processed.
     *           
     * 
     */
    @XmlEnumValue("dataProcessingNote")
    DATA_PROCESSING_NOTE("dataProcessingNote"),

    /**
     * A free text human oriented description of the situation element defined by the
     *             SituationRecord.
     *           
     * 
     */
    @XmlEnumValue("description")
    DESCRIPTION("description"),

    /**
     * A free text human oriented note that supports internal traffic control operations
     *             relating to the situation element defined by the SituationRecord.
     *           
     * 
     */
    @XmlEnumValue("internalNote")
    INTERNAL_NOTE("internalNote"),

    /**
     * Human-readable name by which the associated roadworks is known
     * 
     */
    @XmlEnumValue("roadworksName")
    ROADWORKS_NAME("roadworksName"),

    /**
     * A free text human oriented warning relating to the SituationRecord, such as
     *             advising the recipient that an advanced warning on VMS should be activated.
     *           
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
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
