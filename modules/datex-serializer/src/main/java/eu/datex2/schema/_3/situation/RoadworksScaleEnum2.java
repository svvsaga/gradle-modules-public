
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksScaleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadworksScaleEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="major"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="minor"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadworksScaleEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum RoadworksScaleEnum2 {


    /**
     * The roadworks scale is major according to the responsible road operator.
     *           
     * 
     */
    @XmlEnumValue("major")
    MAJOR("major"),

    /**
     * The roadworks scale is medium according to the responsible road operator.
     *           
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * The roadworks scale is minor according to the responsible road operator.
     *           
     * 
     */
    @XmlEnumValue("minor")
    MINOR("minor"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    RoadworksScaleEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksScaleEnum2 fromValue(String v) {
        for (RoadworksScaleEnum2 c: RoadworksScaleEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
