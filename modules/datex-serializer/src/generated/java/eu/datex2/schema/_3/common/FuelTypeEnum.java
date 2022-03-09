
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FuelTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="battery"/&gt;
 *     &lt;enumeration value="biodiesel"/&gt;
 *     &lt;enumeration value="diesel"/&gt;
 *     &lt;enumeration value="dieselBatteryHybrid"/&gt;
 *     &lt;enumeration value="ethanol"/&gt;
 *     &lt;enumeration value="hydrogen"/&gt;
 *     &lt;enumeration value="liquidGas"/&gt;
 *     &lt;enumeration value="lpg"/&gt;
 *     &lt;enumeration value="methane"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="petrol95Octane"/&gt;
 *     &lt;enumeration value="petrol98Octane"/&gt;
 *     &lt;enumeration value="petrolBatteryHybrid"/&gt;
 *     &lt;enumeration value="petrolLeaded"/&gt;
 *     &lt;enumeration value="petrolUnleaded"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeEnum")
@XmlEnum
public enum FuelTypeEnum {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("dieselBatteryHybrid")
    DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),
    @XmlEnumValue("ethanol")
    ETHANOL("ethanol"),
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),
    @XmlEnumValue("lpg")
    LPG("lpg"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("petrol95Octane")
    PETROL_95_OCTANE("petrol95Octane"),
    @XmlEnumValue("petrol98Octane")
    PETROL_98_OCTANE("petrol98Octane"),
    @XmlEnumValue("petrolBatteryHybrid")
    PETROL_BATTERY_HYBRID("petrolBatteryHybrid"),
    @XmlEnumValue("petrolLeaded")
    PETROL_LEADED("petrolLeaded"),
    @XmlEnumValue("petrolUnleaded")
    PETROL_UNLEADED("petrolUnleaded"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    FuelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnum fromValue(String v) {
        for (FuelTypeEnum c: FuelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
