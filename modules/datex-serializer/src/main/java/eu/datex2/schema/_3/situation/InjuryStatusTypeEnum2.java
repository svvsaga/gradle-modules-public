
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InjuryStatusTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InjuryStatusTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dead"/&gt;
 *     &lt;enumeration value="injured"/&gt;
 *     &lt;enumeration value="seriouslyInjured"/&gt;
 *     &lt;enumeration value="slightlyInjured"/&gt;
 *     &lt;enumeration value="uninjured"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InjuryStatusTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum InjuryStatusTypeEnum2 {


    /**
     * Dead.
     * 
     */
    @XmlEnumValue("dead")
    DEAD("dead"),

    /**
     * Injured requiring medical treatment.
     * 
     */
    @XmlEnumValue("injured")
    INJURED("injured"),

    /**
     * Seriously injured requiring urgent hospital treatment.
     * 
     */
    @XmlEnumValue("seriouslyInjured")
    SERIOUSLY_INJURED("seriouslyInjured"),

    /**
     * Slightly injured requiring medical treatment.
     * 
     */
    @XmlEnumValue("slightlyInjured")
    SLIGHTLY_INJURED("slightlyInjured"),

    /**
     * Uninjured.
     * 
     */
    @XmlEnumValue("uninjured")
    UNINJURED("uninjured"),

    /**
     * Injury status unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InjuryStatusTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryStatusTypeEnum2 fromValue(String v) {
        for (InjuryStatusTypeEnum2 c: InjuryStatusTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
