
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelType2Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FuelType2Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="petrol95Octane"/&gt;
 *     &lt;enumeration value="petrol98Octane"/&gt;
 *     &lt;enumeration value="petrolLeaded"/&gt;
 *     &lt;enumeration value="petrolUnleaded"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelType2Enum")
@XmlEnum
public enum FuelType2Enum {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("petrol95Octane")
    PETROL_95_OCTANE("petrol95Octane"),
    @XmlEnumValue("petrol98Octane")
    PETROL_98_OCTANE("petrol98Octane"),
    @XmlEnumValue("petrolLeaded")
    PETROL_LEADED("petrolLeaded"),
    @XmlEnumValue("petrolUnleaded")
    PETROL_UNLEADED("petrolUnleaded"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FuelType2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelType2Enum fromValue(String v) {
        for (FuelType2Enum c: FuelType2Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
