
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardBrandsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentCardBrandsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="americanExpress"/&gt;
 *     &lt;enumeration value="cirrus"/&gt;
 *     &lt;enumeration value="dinersClub"/&gt;
 *     &lt;enumeration value="discoverCard"/&gt;
 *     &lt;enumeration value="giroCard"/&gt;
 *     &lt;enumeration value="maestro"/&gt;
 *     &lt;enumeration value="masterCard"/&gt;
 *     &lt;enumeration value="visa"/&gt;
 *     &lt;enumeration value="vPay"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardBrandsEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PaymentCardBrandsEnum {

    @XmlEnumValue("americanExpress")
    AMERICAN_EXPRESS("americanExpress"),
    @XmlEnumValue("cirrus")
    CIRRUS("cirrus"),
    @XmlEnumValue("dinersClub")
    DINERS_CLUB("dinersClub"),
    @XmlEnumValue("discoverCard")
    DISCOVER_CARD("discoverCard"),
    @XmlEnumValue("giroCard")
    GIRO_CARD("giroCard"),
    @XmlEnumValue("maestro")
    MAESTRO("maestro"),
    @XmlEnumValue("masterCard")
    MASTER_CARD("masterCard"),
    @XmlEnumValue("visa")
    VISA("visa"),
    @XmlEnumValue("vPay")
    V_PAY("vPay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PaymentCardBrandsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardBrandsEnum fromValue(String v) {
        for (PaymentCardBrandsEnum c: PaymentCardBrandsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
