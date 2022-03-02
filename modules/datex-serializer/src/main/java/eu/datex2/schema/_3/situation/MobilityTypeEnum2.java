
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MobilityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mobile"/&gt;
 *     &lt;enumeration value="stationary"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobilityTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum MobilityTypeEnum2 {


    /**
     * The described element of a situation is moving.
     * 
     */
    @XmlEnumValue("mobile")
    MOBILE("mobile"),

    /**
     * The described element of a situation is stationary.
     * 
     */
    @XmlEnumValue("stationary")
    STATIONARY("stationary"),

    /**
     * The mobility of the described element of a situation is unknown.
     *           
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    MobilityTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityTypeEnum2 fromValue(String v) {
        for (MobilityTypeEnum2 c: MobilityTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
