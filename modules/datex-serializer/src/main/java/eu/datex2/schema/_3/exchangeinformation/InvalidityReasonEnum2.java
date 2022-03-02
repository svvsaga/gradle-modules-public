
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidityReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InvalidityReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="invalidCISInformation"/&gt;
 *     &lt;enumeration value="invalidExchangeContext"/&gt;
 *     &lt;enumeration value="invalidInformationManagement"/&gt;
 *     &lt;enumeration value="invalidMessage"/&gt;
 *     &lt;enumeration value="invalidPayload"/&gt;
 *     &lt;enumeration value="invalidSequencingNumber"/&gt;
 *     &lt;enumeration value="invalidSession"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="invalidClient"/&gt;
 *     &lt;enumeration value="invalidSupplier"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvalidityReasonEnum", namespace = "http://datex2.eu/schema/3/exchangeInformation")
@XmlEnum
public enum InvalidityReasonEnum2 {

    @XmlEnumValue("invalidCISInformation")
    INVALID_CIS_INFORMATION("invalidCISInformation"),
    @XmlEnumValue("invalidExchangeContext")
    INVALID_EXCHANGE_CONTEXT("invalidExchangeContext"),
    @XmlEnumValue("invalidInformationManagement")
    INVALID_INFORMATION_MANAGEMENT("invalidInformationManagement"),
    @XmlEnumValue("invalidMessage")
    INVALID_MESSAGE("invalidMessage"),
    @XmlEnumValue("invalidPayload")
    INVALID_PAYLOAD("invalidPayload"),
    @XmlEnumValue("invalidSequencingNumber")
    INVALID_SEQUENCING_NUMBER("invalidSequencingNumber"),
    @XmlEnumValue("invalidSession")
    INVALID_SESSION("invalidSession"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("invalidClient")
    INVALID_CLIENT("invalidClient"),
    @XmlEnumValue("invalidSupplier")
    INVALID_SUPPLIER("invalidSupplier"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InvalidityReasonEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvalidityReasonEnum2 fromValue(String v) {
        for (InvalidityReasonEnum2 c: InvalidityReasonEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
