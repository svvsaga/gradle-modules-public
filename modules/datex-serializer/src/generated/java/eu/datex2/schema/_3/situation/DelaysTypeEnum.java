
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
@XmlType(name = "DelaysTypeEnum")
@XmlEnum
public enum DelaysTypeEnum {

    @XmlEnumValue("delays")
    DELAYS("delays"),
    @XmlEnumValue("delaysOfUncertainDuration")
    DELAYS_OF_UNCERTAIN_DURATION("delaysOfUncertainDuration"),
    @XmlEnumValue("longDelays")
    LONG_DELAYS("longDelays"),
    @XmlEnumValue("veryLongDelays")
    VERY_LONG_DELAYS("veryLongDelays"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DelaysTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelaysTypeEnum fromValue(String v) {
        for (DelaysTypeEnum c: DelaysTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
