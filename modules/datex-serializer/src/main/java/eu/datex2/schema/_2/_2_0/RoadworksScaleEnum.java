
package eu.datex2.schema._2._2_0;

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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadworksScaleEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RoadworksScaleEnum {

    @XmlEnumValue("major")
    MAJOR("major"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("minor")
    MINOR("minor");
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
