
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
@XmlType(name = "RoadworksDurationEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum RoadworksDurationEnum2 {


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
    EXTENDED("_extended");
    private final String value;

    RoadworksDurationEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksDurationEnum2 fromValue(String v) {
        for (RoadworksDurationEnum2 c: RoadworksDurationEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
