
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardTypesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentCardTypesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="creditCard"/&gt;
 *     &lt;enumeration value="debitCard"/&gt;
 *     &lt;enumeration value="chargeCard"/&gt;
 *     &lt;enumeration value="fleetCard"/&gt;
 *     &lt;enumeration value="storedValueCard"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardTypesEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PaymentCardTypesEnum {

    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("debitCard")
    DEBIT_CARD("debitCard"),
    @XmlEnumValue("chargeCard")
    CHARGE_CARD("chargeCard"),
    @XmlEnumValue("fleetCard")
    FLEET_CARD("fleetCard"),
    @XmlEnumValue("storedValueCard")
    STORED_VALUE_CARD("storedValueCard"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PaymentCardTypesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardTypesEnum fromValue(String v) {
        for (PaymentCardTypesEnum c: PaymentCardTypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
