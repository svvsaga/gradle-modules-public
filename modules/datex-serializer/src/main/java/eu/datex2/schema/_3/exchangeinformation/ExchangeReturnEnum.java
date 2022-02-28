
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeReturnEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExchangeReturnEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ack"/&gt;
 *     &lt;enumeration value="closeSessionRequest"/&gt;
 *     &lt;enumeration value="fail"/&gt;
 *     &lt;enumeration value="snapshotSynchronisationRequest"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeReturnEnum")
@XmlEnum
public enum ExchangeReturnEnum {

    @XmlEnumValue("ack")
    ACK("ack"),
    @XmlEnumValue("closeSessionRequest")
    CLOSE_SESSION_REQUEST("closeSessionRequest"),
    @XmlEnumValue("fail")
    FAIL("fail"),
    @XmlEnumValue("snapshotSynchronisationRequest")
    SNAPSHOT_SYNCHRONISATION_REQUEST("snapshotSynchronisationRequest"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ExchangeReturnEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeReturnEnum fromValue(String v) {
        for (ExchangeReturnEnum c: ExchangeReturnEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
