
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingStationUsageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChargingStationUsageTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="electricVehicle"/&gt;
 *     &lt;enumeration value="motorhomeOrCaravanSupply"/&gt;
 *     &lt;enumeration value="electricBikeOrMotorcycle"/&gt;
 *     &lt;enumeration value="lorryPowerConsumption"/&gt;
 *     &lt;enumeration value="electricalDevices"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargingStationUsageTypeEnum")
@XmlEnum
public enum ChargingStationUsageTypeEnum {

    @XmlEnumValue("electricVehicle")
    ELECTRIC_VEHICLE("electricVehicle"),
    @XmlEnumValue("motorhomeOrCaravanSupply")
    MOTORHOME_OR_CARAVAN_SUPPLY("motorhomeOrCaravanSupply"),
    @XmlEnumValue("electricBikeOrMotorcycle")
    ELECTRIC_BIKE_OR_MOTORCYCLE("electricBikeOrMotorcycle"),
    @XmlEnumValue("lorryPowerConsumption")
    LORRY_POWER_CONSUMPTION("lorryPowerConsumption"),
    @XmlEnumValue("electricalDevices")
    ELECTRICAL_DEVICES("electricalDevices"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ChargingStationUsageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingStationUsageTypeEnum fromValue(String v) {
        for (ChargingStationUsageTypeEnum c: ChargingStationUsageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
