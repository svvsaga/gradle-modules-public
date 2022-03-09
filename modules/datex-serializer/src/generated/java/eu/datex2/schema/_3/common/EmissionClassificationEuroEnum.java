
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmissionClassificationEuroEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EmissionClassificationEuroEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="euro5"/&gt;
 *     &lt;enumeration value="euro5a"/&gt;
 *     &lt;enumeration value="euro5b"/&gt;
 *     &lt;enumeration value="euro6"/&gt;
 *     &lt;enumeration value="euro6a"/&gt;
 *     &lt;enumeration value="euro6b"/&gt;
 *     &lt;enumeration value="euro6c"/&gt;
 *     &lt;enumeration value="euroV"/&gt;
 *     &lt;enumeration value="euroVI"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmissionClassificationEuroEnum")
@XmlEnum
public enum EmissionClassificationEuroEnum {

    @XmlEnumValue("euro5")
    EURO_5("euro5"),
    @XmlEnumValue("euro5a")
    EURO_5_A("euro5a"),
    @XmlEnumValue("euro5b")
    EURO_5_B("euro5b"),
    @XmlEnumValue("euro6")
    EURO_6("euro6"),
    @XmlEnumValue("euro6a")
    EURO_6_A("euro6a"),
    @XmlEnumValue("euro6b")
    EURO_6_B("euro6b"),
    @XmlEnumValue("euro6c")
    EURO_6_C("euro6c"),
    @XmlEnumValue("euroV")
    EURO_V("euroV"),
    @XmlEnumValue("euroVI")
    EURO_VI("euroVI"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    EmissionClassificationEuroEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmissionClassificationEuroEnum fromValue(String v) {
        for (EmissionClassificationEuroEnum c: EmissionClassificationEuroEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
