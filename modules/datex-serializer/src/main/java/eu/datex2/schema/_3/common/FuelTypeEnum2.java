
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
public enum FuelTypeEnum2 {


    /**
     * All sort of fuel is accepted.
     * 
     */
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * Battery.
     * 
     */
    @XmlEnumValue("battery")
    BATTERY("battery"),

    /**
     * Biodiesel.
     * 
     */
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),

    /**
     * Fuel used for compression-ignition (CI) engines.
     * 
     */
    @XmlEnumValue("diesel")
    DIESEL("diesel"),

    /**
     * Diesel and battery hybrid.
     * 
     */
    @XmlEnumValue("dieselBatteryHybrid")
    DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),

    /**
     * Ethanol.
     * 
     */
    @XmlEnumValue("ethanol")
    ETHANOL("ethanol"),

    /**
     * Hydrogen.
     * 
     */
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),

    /**
     * Liquid gas of any type including LPG.
     * 
     */
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),

    /**
     * Liquid petroleum gas.
     * 
     */
    @XmlEnumValue("lpg")
    LPG("lpg"),

    /**
     * Methane gas.
     * 
     */
    @XmlEnumValue("methane")
    METHANE("methane"),

    /**
     * Fuel used for positive-ignition (PI) engines.
     * 
     */
    @XmlEnumValue("petrol")
    PETROL("petrol"),

    /**
     * Petrol with 95 octane.
     * 
     */
    @XmlEnumValue("petrol95Octane")
    PETROL_95_OCTANE("petrol95Octane"),

    /**
     * Petrol with 98 octane.
     * 
     */
    @XmlEnumValue("petrol98Octane")
    PETROL_98_OCTANE("petrol98Octane"),

    /**
     * Petrol and battery hybrid.
     * 
     */
    @XmlEnumValue("petrolBatteryHybrid")
    PETROL_BATTERY_HYBRID("petrolBatteryHybrid"),

    /**
     * Leaded petrol.
     * 
     */
    @XmlEnumValue("petrolLeaded")
    PETROL_LEADED("petrolLeaded"),

    /**
     * Unleaded petrol.
     * 
     */
    @XmlEnumValue("petrolUnleaded")
    PETROL_UNLEADED("petrolUnleaded"),

    /**
     * The sort of fuel is not known.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    FuelTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnum2 fromValue(String v) {
        for (FuelTypeEnum2 c: FuelTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
