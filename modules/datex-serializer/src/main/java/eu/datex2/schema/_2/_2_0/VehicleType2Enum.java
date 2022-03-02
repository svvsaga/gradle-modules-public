
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleType2Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleType2Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="motorhome"/&gt;
 *     &lt;enumeration value="lightGoodsVehicle"/&gt;
 *     &lt;enumeration value="heavyGoodsVehicle"/&gt;
 *     &lt;enumeration value="minibus"/&gt;
 *     &lt;enumeration value="smallCar"/&gt;
 *     &lt;enumeration value="largeCar"/&gt;
 *     &lt;enumeration value="lightGoodsVehicleWithTrailer"/&gt;
 *     &lt;enumeration value="heavyGoodsVehicleWithTrailer"/&gt;
 *     &lt;enumeration value="heavyHaulageVehicle"/&gt;
 *     &lt;enumeration value="passengerCar"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleType2Enum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum VehicleType2Enum {

    @XmlEnumValue("motorhome")
    MOTORHOME("motorhome"),
    @XmlEnumValue("lightGoodsVehicle")
    LIGHT_GOODS_VEHICLE("lightGoodsVehicle"),
    @XmlEnumValue("heavyGoodsVehicle")
    HEAVY_GOODS_VEHICLE("heavyGoodsVehicle"),
    @XmlEnumValue("minibus")
    MINIBUS("minibus"),
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),
    @XmlEnumValue("largeCar")
    LARGE_CAR("largeCar"),
    @XmlEnumValue("lightGoodsVehicleWithTrailer")
    LIGHT_GOODS_VEHICLE_WITH_TRAILER("lightGoodsVehicleWithTrailer"),
    @XmlEnumValue("heavyGoodsVehicleWithTrailer")
    HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer"),
    @XmlEnumValue("heavyHaulageVehicle")
    HEAVY_HAULAGE_VEHICLE("heavyHaulageVehicle"),
    @XmlEnumValue("passengerCar")
    PASSENGER_CAR("passengerCar"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VehicleType2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleType2Enum fromValue(String v) {
        for (VehicleType2Enum c: VehicleType2Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
