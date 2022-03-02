
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelaysTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DelaysTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="delays"/&gt;
 *     &lt;enumeration value="delaysOfUncertainDuration"/&gt;
 *     &lt;enumeration value="longDelays"/&gt;
 *     &lt;enumeration value="veryLongDelays"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelaysTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum DelaysTypeEnum2 {


    /**
     * Delays on the road network as a result of any situation which causes hold-ups.
     *           
     * 
     */
    @XmlEnumValue("delays")
    DELAYS("delays"),

    /**
     * Delays on the road network whose predicted duration cannot be estimated.
     *           
     * 
     */
    @XmlEnumValue("delaysOfUncertainDuration")
    DELAYS_OF_UNCERTAIN_DURATION("delaysOfUncertainDuration"),

    /**
     * Delays on the road network of unusual severity.
     * 
     */
    @XmlEnumValue("longDelays")
    LONG_DELAYS("longDelays"),

    /**
     * Delays on the road network of abnormally unusual severity.
     * 
     */
    @XmlEnumValue("veryLongDelays")
    VERY_LONG_DELAYS("veryLongDelays"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DelaysTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelaysTypeEnum2 fromValue(String v) {
        for (DelaysTypeEnum2 c: DelaysTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
