
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingPaymentModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingPaymentModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="payAndDisplay"/&gt;
 *     &lt;enumeration value="payManualAtExitBooth"/&gt;
 *     &lt;enumeration value="payPriorToExit"/&gt;
 *     &lt;enumeration value="payByPrepaidToken"/&gt;
 *     &lt;enumeration value="payAndExit"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingPaymentModeEnum")
@XmlEnum
public enum ParkingPaymentModeEnum {

    @XmlEnumValue("payAndDisplay")
    PAY_AND_DISPLAY("payAndDisplay"),
    @XmlEnumValue("payManualAtExitBooth")
    PAY_MANUAL_AT_EXIT_BOOTH("payManualAtExitBooth"),
    @XmlEnumValue("payPriorToExit")
    PAY_PRIOR_TO_EXIT("payPriorToExit"),
    @XmlEnumValue("payByPrepaidToken")
    PAY_BY_PREPAID_TOKEN("payByPrepaidToken"),
    @XmlEnumValue("payAndExit")
    PAY_AND_EXIT("payAndExit"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingPaymentModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingPaymentModeEnum fromValue(String v) {
        for (ParkingPaymentModeEnum c: ParkingPaymentModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
