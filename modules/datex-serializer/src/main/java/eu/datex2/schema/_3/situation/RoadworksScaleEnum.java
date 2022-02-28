
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
@XmlType(name = "RoadworksScaleEnum")
@XmlEnum
public enum RoadworksScaleEnum {


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
    __EXTENDED("_extended");
    private final String value;

    RoadworksScaleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksScaleEnum fromValue(String v) {
        for (RoadworksScaleEnum c: RoadworksScaleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
