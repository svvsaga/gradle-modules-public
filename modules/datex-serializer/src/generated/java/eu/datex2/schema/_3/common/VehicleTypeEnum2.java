
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agriculturalVehicle"/&gt;
 *     &lt;enumeration value="anyVehicle"/&gt;
 *     &lt;enumeration value="articulatedBus"/&gt;
 *     &lt;enumeration value="articulatedTrolleyBus"/&gt;
 *     &lt;enumeration value="articulatedVehicle"/&gt;
 *     &lt;enumeration value="bicycle"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="caravan"/&gt;
 *     &lt;enumeration value="carOrLightVehicle"/&gt;
 *     &lt;enumeration value="carWithCaravan"/&gt;
 *     &lt;enumeration value="carWithTrailer"/&gt;
 *     &lt;enumeration value="constructionOrMaintenanceVehicle"/&gt;
 *     &lt;enumeration value="fourWheelDrive"/&gt;
 *     &lt;enumeration value="heavyGoodsVehicle"/&gt;
 *     &lt;enumeration value="heavyGoodsVehicleWithTrailer"/&gt;
 *     &lt;enumeration value="heavyDutyTransporter"/&gt;
 *     &lt;enumeration value="heavyVehicle"/&gt;
 *     &lt;enumeration value="highSidedVehicle"/&gt;
 *     &lt;enumeration value="lightCommercialVehicle"/&gt;
 *     &lt;enumeration value="largeCar"/&gt;
 *     &lt;enumeration value="largeGoodsVehicle"/&gt;
 *     &lt;enumeration value="lightCommercialVehicleWithTrailer"/&gt;
 *     &lt;enumeration value="longHeavyLorry"/&gt;
 *     &lt;enumeration value="lorry"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="minibus"/&gt;
 *     &lt;enumeration value="moped"/&gt;
 *     &lt;enumeration value="motorcycle"/&gt;
 *     &lt;enumeration value="motorcycleWithSideCar"/&gt;
 *     &lt;enumeration value="motorhome"/&gt;
 *     &lt;enumeration value="motorscooter"/&gt;
 *     &lt;enumeration value="passengerCar"/&gt;
 *     &lt;enumeration value="smallCar"/&gt;
 *     &lt;enumeration value="tanker"/&gt;
 *     &lt;enumeration value="threeWheeledVehicle"/&gt;
 *     &lt;enumeration value="trailer"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="trolleyBus"/&gt;
 *     &lt;enumeration value="twoWheeledVehicle"/&gt;
 *     &lt;enumeration value="van"/&gt;
 *     &lt;enumeration value="vehicleWithCaravan"/&gt;
 *     &lt;enumeration value="vehicleWithCatalyticConverter"/&gt;
 *     &lt;enumeration value="vehicleWithoutCatalyticConverter"/&gt;
 *     &lt;enumeration value="vehicleWithTrailer"/&gt;
 *     &lt;enumeration value="withEvenNumberedRegistrationPlates"/&gt;
 *     &lt;enumeration value="withOddNumberedRegistrationPlates"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeEnum")
@XmlEnum
public enum VehicleTypeEnum2 {

    @XmlEnumValue("agriculturalVehicle")
    AGRICULTURAL_VEHICLE("agriculturalVehicle"),
    @XmlEnumValue("anyVehicle")
    ANY_VEHICLE("anyVehicle"),
    @XmlEnumValue("articulatedBus")
    ARTICULATED_BUS("articulatedBus"),
    @XmlEnumValue("articulatedTrolleyBus")
    ARTICULATED_TROLLEY_BUS("articulatedTrolleyBus"),
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("caravan")
    CARAVAN("caravan"),
    @XmlEnumValue("carOrLightVehicle")
    CAR_OR_LIGHT_VEHICLE("carOrLightVehicle"),
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),
    @XmlEnumValue("constructionOrMaintenanceVehicle")
    CONSTRUCTION_OR_MAINTENANCE_VEHICLE("constructionOrMaintenanceVehicle"),
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),
    @XmlEnumValue("heavyGoodsVehicle")
    HEAVY_GOODS_VEHICLE("heavyGoodsVehicle"),
    @XmlEnumValue("heavyGoodsVehicleWithTrailer")
    HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer"),
    @XmlEnumValue("heavyDutyTransporter")
    HEAVY_DUTY_TRANSPORTER("heavyDutyTransporter"),
    @XmlEnumValue("heavyVehicle")
    HEAVY_VEHICLE("heavyVehicle"),
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),
    @XmlEnumValue("lightCommercialVehicle")
    LIGHT_COMMERCIAL_VEHICLE("lightCommercialVehicle"),
    @XmlEnumValue("largeCar")
    LARGE_CAR("largeCar"),
    @XmlEnumValue("largeGoodsVehicle")
    LARGE_GOODS_VEHICLE("largeGoodsVehicle"),
    @XmlEnumValue("lightCommercialVehicleWithTrailer")
    LIGHT_COMMERCIAL_VEHICLE_WITH_TRAILER("lightCommercialVehicleWithTrailer"),
    @XmlEnumValue("longHeavyLorry")
    LONG_HEAVY_LORRY("longHeavyLorry"),
    @XmlEnumValue("lorry")
    LORRY("lorry"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("minibus")
    MINIBUS("minibus"),
    @XmlEnumValue("moped")
    MOPED("moped"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("motorcycleWithSideCar")
    MOTORCYCLE_WITH_SIDE_CAR("motorcycleWithSideCar"),
    @XmlEnumValue("motorhome")
    MOTORHOME("motorhome"),
    @XmlEnumValue("motorscooter")
    MOTORSCOOTER("motorscooter"),
    @XmlEnumValue("passengerCar")
    PASSENGER_CAR("passengerCar"),
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),
    @XmlEnumValue("tanker")
    TANKER("tanker"),
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),
    @XmlEnumValue("trailer")
    TRAILER("trailer"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),
    @XmlEnumValue("van")
    VAN("van"),
    @XmlEnumValue("vehicleWithCaravan")
    VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),
    @XmlEnumValue("vehicleWithCatalyticConverter")
    VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),
    @XmlEnumValue("vehicleWithoutCatalyticConverter")
    VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
    @XmlEnumValue("withEvenNumberedRegistrationPlates")
    WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),
    @XmlEnumValue("withOddNumberedRegistrationPlates")
    WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VehicleTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTypeEnum2 fromValue(String v) {
        for (VehicleTypeEnum2 c: VehicleTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
