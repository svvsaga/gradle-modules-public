
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksDurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadworksDurationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="longTerm"/&gt;
 *     &lt;enumeration value="mediumTerm"/&gt;
 *     &lt;enumeration value="shortTerm"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadworksDurationEnum")
@XmlEnum
public enum RoadworksDurationEnum {


    /**
     * The roadworks are expected to last for a long term (according to a classification
     *             scheme used by the responsible road operator)
     *           
     * 
     */
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),

    /**
     * The roadworks are expected to last for a medium term (according to a
     *             classification scheme used by the responsible road operator)
     *           
     * 
     */
    @XmlEnumValue("mediumTerm")
    MEDIUM_TERM("mediumTerm"),

    /**
     * The roadworks are expected to last for a short term (according to a classification
     *             scheme used by the responsible road operator)
     *           
     * 
     */
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    RoadworksDurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksDurationEnum fromValue(String v) {
        for (RoadworksDurationEnum c: RoadworksDurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
