
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExchangeStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="closingSession"/&gt;
 *     &lt;enumeration value="offline"/&gt;
 *     &lt;enumeration value="online"/&gt;
 *     &lt;enumeration value="openingSession"/&gt;
 *     &lt;enumeration value="resuming"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeStatusEnum")
@XmlEnum
public enum ExchangeStatusEnum {

    @XmlEnumValue("closingSession")
    CLOSING_SESSION("closingSession"),
    @XmlEnumValue("offline")
    OFFLINE("offline"),
    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("openingSession")
    OPENING_SESSION("openingSession"),
    @XmlEnumValue("resuming")
    RESUMING("resuming"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ExchangeStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeStatusEnum fromValue(String v) {
        for (ExchangeStatusEnum c: ExchangeStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
