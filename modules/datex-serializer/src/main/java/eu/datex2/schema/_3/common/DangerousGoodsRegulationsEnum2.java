
package eu.datex2.schema._3.common;

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
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsRegulationsEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum DangerousGoodsRegulationsEnum2 {


    /**
     * European agreement on the international carriage of dangerous goods on road.
     *           
     * 
     */
    @XmlEnumValue("adr")
    ADR("adr"),

    /**
     * Regulations covering the international transportation of dangerous goods issued by
     *             the International Air Transport Association and the International Civil Aviation Organisation.
     *           
     * 
     */
    @XmlEnumValue("iataIcao")
    IATA_ICAO("iataIcao"),

    /**
     * Regulations regarding the transportation of dangerous goods on ocean-going vessels
     *             issued by the International Maritime Organisation.
     *           
     * 
     */
    @XmlEnumValue("imoImdg")
    IMO_IMDG("imoImdg"),

    /**
     * International regulations concerning the international carriage of dangerous goods
     *             by rail.
     *           
     * 
     */
    @XmlEnumValue("railroadDangerousGoodsBook")
    RAILROAD_DANGEROUS_GOODS_BOOK("railroadDangerousGoodsBook"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DangerousGoodsRegulationsEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DangerousGoodsRegulationsEnum2 fromValue(String v) {
        for (DangerousGoodsRegulationsEnum2 c: DangerousGoodsRegulationsEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
