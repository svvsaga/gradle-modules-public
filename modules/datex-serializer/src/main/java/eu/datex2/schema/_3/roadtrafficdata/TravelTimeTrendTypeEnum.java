
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTimeTrendTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TravelTimeTrendTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="decreasing"/&gt;
 *     &lt;enumeration value="increasing"/&gt;
 *     &lt;enumeration value="stable"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTrendTypeEnum")
@XmlEnum
public enum TravelTimeTrendTypeEnum {


    /**
     * Travel times are decreasing.
     * 
     */
    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),

    /**
     * Travel times are increasing.
     * 
     */
    @XmlEnumValue("increasing")
    INCREASING("increasing"),

    /**
     * Travel times are stable.
     * 
     */
    @XmlEnumValue("stable")
    STABLE("stable"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TravelTimeTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTrendTypeEnum fromValue(String v) {
        for (TravelTimeTrendTypeEnum c: TravelTimeTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
