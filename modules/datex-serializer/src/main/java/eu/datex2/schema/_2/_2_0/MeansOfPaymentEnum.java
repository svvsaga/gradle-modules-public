
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeansOfPaymentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MeansOfPaymentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="paymentCard"/&gt;
 *     &lt;enumeration value="cash"/&gt;
 *     &lt;enumeration value="cashCoinsOnly"/&gt;
 *     &lt;enumeration value="directCashTransfer"/&gt;
 *     &lt;enumeration value="electronicSettlement"/&gt;
 *     &lt;enumeration value="rfid"/&gt;
 *     &lt;enumeration value="mobileApp"/&gt;
 *     &lt;enumeration value="payBySMS"/&gt;
 *     &lt;enumeration value="mobilePhone"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeansOfPaymentEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum MeansOfPaymentEnum {

    @XmlEnumValue("paymentCard")
    PAYMENT_CARD("paymentCard"),
    @XmlEnumValue("cash")
    CASH("cash"),
    @XmlEnumValue("cashCoinsOnly")
    CASH_COINS_ONLY("cashCoinsOnly"),
    @XmlEnumValue("directCashTransfer")
    DIRECT_CASH_TRANSFER("directCashTransfer"),
    @XmlEnumValue("electronicSettlement")
    ELECTRONIC_SETTLEMENT("electronicSettlement"),
    @XmlEnumValue("rfid")
    RFID("rfid"),
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),
    @XmlEnumValue("payBySMS")
    PAY_BY_SMS("payBySMS"),
    @XmlEnumValue("mobilePhone")
    MOBILE_PHONE("mobilePhone"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MeansOfPaymentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeansOfPaymentEnum fromValue(String v) {
        for (MeansOfPaymentEnum c: MeansOfPaymentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
