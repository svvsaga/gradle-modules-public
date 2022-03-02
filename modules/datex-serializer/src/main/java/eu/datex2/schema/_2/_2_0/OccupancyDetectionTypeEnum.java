
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OccupancyDetectionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OccupancyDetectionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="balancing"/&gt;
 *     &lt;enumeration value="singleSpaceDetection"/&gt;
 *     &lt;enumeration value="modelBased"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OccupancyDetectionTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum OccupancyDetectionTypeEnum {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("balancing")
    BALANCING("balancing"),
    @XmlEnumValue("singleSpaceDetection")
    SINGLE_SPACE_DETECTION("singleSpaceDetection"),
    @XmlEnumValue("modelBased")
    MODEL_BASED("modelBased"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    OccupancyDetectionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyDetectionTypeEnum fromValue(String v) {
        for (OccupancyDetectionTypeEnum c: OccupancyDetectionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
