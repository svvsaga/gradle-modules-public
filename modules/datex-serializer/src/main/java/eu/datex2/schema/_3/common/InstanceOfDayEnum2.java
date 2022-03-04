
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceOfDayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstanceOfDayEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="firstInstance"/&gt;
 *     &lt;enumeration value="secondInstance"/&gt;
 *     &lt;enumeration value="thirdInstance"/&gt;
 *     &lt;enumeration value="fourthInstance"/&gt;
 *     &lt;enumeration value="fifthInstance"/&gt;
 *     &lt;enumeration value="lastInstance"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstanceOfDayEnum")
@XmlEnum
public enum InstanceOfDayEnum2 {

    @XmlEnumValue("firstInstance")
    FIRST_INSTANCE("firstInstance"),
    @XmlEnumValue("secondInstance")
    SECOND_INSTANCE("secondInstance"),
    @XmlEnumValue("thirdInstance")
    THIRD_INSTANCE("thirdInstance"),
    @XmlEnumValue("fourthInstance")
    FOURTH_INSTANCE("fourthInstance"),
    @XmlEnumValue("fifthInstance")
    FIFTH_INSTANCE("fifthInstance"),
    @XmlEnumValue("lastInstance")
    LAST_INSTANCE("lastInstance"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InstanceOfDayEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstanceOfDayEnum2 fromValue(String v) {
        for (InstanceOfDayEnum2 c: InstanceOfDayEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
