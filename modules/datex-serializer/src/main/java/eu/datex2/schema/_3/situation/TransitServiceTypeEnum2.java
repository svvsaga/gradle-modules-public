
package eu.datex2.schema._3.situation;

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
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitServiceTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum TransitServiceTypeEnum2 {


    /**
     * Air service.
     * 
     */
    @XmlEnumValue("air")
    AIR("air"),

    /**
     * Bus service.
     * 
     */
    @XmlEnumValue("bus")
    BUS("bus"),

    /**
     * Ferry service.
     * 
     */
    @XmlEnumValue("ferry")
    FERRY("ferry"),

    /**
     * Hydrofoil service.
     * 
     */
    @XmlEnumValue("hydrofoil")
    HYDROFOIL("hydrofoil"),

    /**
     * Rail service.
     * 
     */
    @XmlEnumValue("rail")
    RAIL("rail"),

    /**
     * Tram service.
     * 
     */
    @XmlEnumValue("tram")
    TRAM("tram"),

    /**
     * Underground or metro service.
     * 
     */
    @XmlEnumValue("undergroundMetro")
    UNDERGROUND_METRO("undergroundMetro"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TransitServiceTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitServiceTypeEnum2 fromValue(String v) {
        for (TransitServiceTypeEnum2 c: TransitServiceTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
