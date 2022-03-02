
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChargeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="minimum"/&gt;
 *     &lt;enumeration value="maximum"/&gt;
 *     &lt;enumeration value="additionalIntervalPrice"/&gt;
 *     &lt;enumeration value="seasonTicket"/&gt;
 *     &lt;enumeration value="temporaryPrice"/&gt;
 *     &lt;enumeration value="firstIntervalPrice"/&gt;
 *     &lt;enumeration value="freeParking"/&gt;
 *     &lt;enumeration value="flat"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ChargeTypeEnum {

    @XmlEnumValue("minimum")
    MINIMUM("minimum"),
    @XmlEnumValue("maximum")
    MAXIMUM("maximum"),
    @XmlEnumValue("additionalIntervalPrice")
    ADDITIONAL_INTERVAL_PRICE("additionalIntervalPrice"),
    @XmlEnumValue("seasonTicket")
    SEASON_TICKET("seasonTicket"),
    @XmlEnumValue("temporaryPrice")
    TEMPORARY_PRICE("temporaryPrice"),
    @XmlEnumValue("firstIntervalPrice")
    FIRST_INTERVAL_PRICE("firstIntervalPrice"),
    @XmlEnumValue("freeParking")
    FREE_PARKING("freeParking"),
    @XmlEnumValue("flat")
    FLAT("flat"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ChargeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeTypeEnum fromValue(String v) {
        for (ChargeTypeEnum c: ChargeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
