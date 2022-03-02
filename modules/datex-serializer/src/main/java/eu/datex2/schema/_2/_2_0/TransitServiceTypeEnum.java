
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitServiceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransitServiceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="hydrofoil"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="undergroundMetro"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitServiceTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum TransitServiceTypeEnum {

    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("hydrofoil")
    HYDROFOIL("hydrofoil"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("undergroundMetro")
    UNDERGROUND_METRO("undergroundMetro");
    private final String value;

    TransitServiceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitServiceTypeEnum fromValue(String v) {
        for (TransitServiceTypeEnum c: TransitServiceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
