
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousGoodsRegulationsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DangerousGoodsRegulationsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="adr"/&gt;
 *     &lt;enumeration value="iataIcao"/&gt;
 *     &lt;enumeration value="imoImdg"/&gt;
 *     &lt;enumeration value="railroadDangerousGoodsBook"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsRegulationsEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum DangerousGoodsRegulationsEnum {

    @XmlEnumValue("adr")
    ADR("adr"),
    @XmlEnumValue("iataIcao")
    IATA_ICAO("iataIcao"),
    @XmlEnumValue("imoImdg")
    IMO_IMDG("imoImdg"),
    @XmlEnumValue("railroadDangerousGoodsBook")
    RAILROAD_DANGEROUS_GOODS_BOOK("railroadDangerousGoodsBook");
    private final String value;

    DangerousGoodsRegulationsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DangerousGoodsRegulationsEnum fromValue(String v) {
        for (DangerousGoodsRegulationsEnum c: DangerousGoodsRegulationsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
