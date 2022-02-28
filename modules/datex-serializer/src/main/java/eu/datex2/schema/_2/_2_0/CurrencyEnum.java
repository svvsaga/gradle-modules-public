
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CurrencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eur"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="amd"/&gt;
 *     &lt;enumeration value="azn"/&gt;
 *     &lt;enumeration value="bam"/&gt;
 *     &lt;enumeration value="bgn"/&gt;
 *     &lt;enumeration value="byr"/&gt;
 *     &lt;enumeration value="chf"/&gt;
 *     &lt;enumeration value="czk"/&gt;
 *     &lt;enumeration value="dkk"/&gt;
 *     &lt;enumeration value="gbp"/&gt;
 *     &lt;enumeration value="gel"/&gt;
 *     &lt;enumeration value="hrk"/&gt;
 *     &lt;enumeration value="huf"/&gt;
 *     &lt;enumeration value="isk"/&gt;
 *     &lt;enumeration value="ltl"/&gt;
 *     &lt;enumeration value="mdl"/&gt;
 *     &lt;enumeration value="mkd"/&gt;
 *     &lt;enumeration value="nok"/&gt;
 *     &lt;enumeration value="pln"/&gt;
 *     &lt;enumeration value="ron"/&gt;
 *     &lt;enumeration value="rsd"/&gt;
 *     &lt;enumeration value="rub"/&gt;
 *     &lt;enumeration value="sek"/&gt;
 *     &lt;enumeration value="try"/&gt;
 *     &lt;enumeration value="uah"/&gt;
 *     &lt;enumeration value="usd"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyEnum")
@XmlEnum
public enum CurrencyEnum {

    @XmlEnumValue("eur")
    EUR("eur"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("amd")
    AMD("amd"),
    @XmlEnumValue("azn")
    AZN("azn"),
    @XmlEnumValue("bam")
    BAM("bam"),
    @XmlEnumValue("bgn")
    BGN("bgn"),
    @XmlEnumValue("byr")
    BYR("byr"),
    @XmlEnumValue("chf")
    CHF("chf"),
    @XmlEnumValue("czk")
    CZK("czk"),
    @XmlEnumValue("dkk")
    DKK("dkk"),
    @XmlEnumValue("gbp")
    GBP("gbp"),
    @XmlEnumValue("gel")
    GEL("gel"),
    @XmlEnumValue("hrk")
    HRK("hrk"),
    @XmlEnumValue("huf")
    HUF("huf"),
    @XmlEnumValue("isk")
    ISK("isk"),
    @XmlEnumValue("ltl")
    LTL("ltl"),
    @XmlEnumValue("mdl")
    MDL("mdl"),
    @XmlEnumValue("mkd")
    MKD("mkd"),
    @XmlEnumValue("nok")
    NOK("nok"),
    @XmlEnumValue("pln")
    PLN("pln"),
    @XmlEnumValue("ron")
    RON("ron"),
    @XmlEnumValue("rsd")
    RSD("rsd"),
    @XmlEnumValue("rub")
    RUB("rub"),
    @XmlEnumValue("sek")
    SEK("sek"),
    @XmlEnumValue("try")
    TRY("try"),
    @XmlEnumValue("uah")
    UAH("uah"),
    @XmlEnumValue("usd")
    USD("usd"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CurrencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyEnum fromValue(String v) {
        for (CurrencyEnum c: CurrencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
