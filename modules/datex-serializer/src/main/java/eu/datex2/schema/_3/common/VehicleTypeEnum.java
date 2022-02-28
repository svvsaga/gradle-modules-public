
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
public enum VehicleTypeEnum {


    /**
     * Vehicle normally used for agricultural purposes, e.g. tractor, combined harvester
     *             etc.
     *           
     * 
     */
    @XmlEnumValue("agriculturalVehicle")
    AGRICULTURAL_VEHICLE("agriculturalVehicle"),

    /**
     * Vehicle of any type.
     * 
     */
    @XmlEnumValue("anyVehicle")
    ANY_VEHICLE("anyVehicle"),

    /**
     * Articulated bus
     * 
     */
    @XmlEnumValue("articulatedBus")
    ARTICULATED_BUS("articulatedBus"),

    /**
     * Articulated trolley bus
     * 
     */
    @XmlEnumValue("articulatedTrolleyBus")
    ARTICULATED_TROLLEY_BUS("articulatedTrolleyBus"),

    /**
     * Articulated vehicle.
     * 
     */
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),

    /**
     * Bicycle.
     * 
     */
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),

    /**
     * Bus.
     * 
     */
    @XmlEnumValue("bus")
    BUS("bus"),

    /**
     * Vehicles designed and constructed for the carriage of passengers and comprising no
     *             more than eight seats in addition to the driver’s seat, and having a maximum mass (“technically
     *             permissible maximum laden mass”) not exceeding 3.5 tons (M1).
     *           
     * 
     */
    @XmlEnumValue("car")
    CAR("car"),

    /**
     * Caravan.
     * 
     */
    @XmlEnumValue("caravan")
    CARAVAN("caravan"),

    /**
     * Car or light vehicle.
     * 
     */
    @XmlEnumValue("carOrLightVehicle")
    CAR_OR_LIGHT_VEHICLE("carOrLightVehicle"),

    /**
     * Car towing a caravan.
     * 
     */
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),

    /**
     * Car towing a trailer.
     * 
     */
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),

    /**
     * Vehicle normally used for construction or maintenance purposes, e.g. digger,
     *             excavator, bulldozer, lorry mounted crane etc.
     *           
     * 
     */
    @XmlEnumValue("constructionOrMaintenanceVehicle")
    CONSTRUCTION_OR_MAINTENANCE_VEHICLE("constructionOrMaintenanceVehicle"),

    /**
     * Four wheel drive vehicle.
     * 
     */
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),

    /**
     * Vehicles with a total weight above 3,500 kg (vehicle and load).
     * 
     */
    @XmlEnumValue("heavyGoodsVehicle")
    HEAVY_GOODS_VEHICLE("heavyGoodsVehicle"),

    /**
     * Heavy goods vehicle with trailer
     * 
     */
    @XmlEnumValue("heavyGoodsVehicleWithTrailer")
    HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer"),

    /**
     * A transporter for heavy duty (usually with abnormal dimensions).
     *           
     * 
     */
    @XmlEnumValue("heavyDutyTransporter")
    HEAVY_DUTY_TRANSPORTER("heavyDutyTransporter"),

    /**
     * Vehicle whose weight means it should be classed as a heavy vehicle
     *           
     * 
     */
    @XmlEnumValue("heavyVehicle")
    HEAVY_VEHICLE("heavyVehicle"),

    /**
     * High sided vehicle.
     * 
     */
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),

    /**
     * Vehicles for the carriage of goods and having a maximum mass not exceeding 3.5
     *             tonnes (class N1).
     *           
     * 
     */
    @XmlEnumValue("lightCommercialVehicle")
    LIGHT_COMMERCIAL_VEHICLE("lightCommercialVehicle"),

    /**
     * Large car
     * 
     */
    @XmlEnumValue("largeCar")
    LARGE_CAR("largeCar"),

    /**
     * Vehicles for the carriage of goods and having a maximum mass exceeding 3.5 tonnes
     *             (belonging to class N2 when not exceeding 12 tonnes, otherwise class N3).
     *           
     * 
     */
    @XmlEnumValue("largeGoodsVehicle")
    LARGE_GOODS_VEHICLE("largeGoodsVehicle"),

    /**
     * Light goods vehicle with trailer
     * 
     */
    @XmlEnumValue("lightCommercialVehicleWithTrailer")
    LIGHT_COMMERCIAL_VEHICLE_WITH_TRAILER("lightCommercialVehicleWithTrailer"),

    /**
     * A heavy lorry that is longer than normal.
     * 
     */
    @XmlEnumValue("longHeavyLorry")
    LONG_HEAVY_LORRY("longHeavyLorry"),

    /**
     * Lorry of any type.
     * 
     */
    @XmlEnumValue("lorry")
    LORRY("lorry"),

    /**
     * Metro
     * 
     */
    @XmlEnumValue("metro")
    METRO("metro"),

    /**
     * Vehicles designed and constructed for the carriage of passengers, comprising more
     *             than eight seats in addition to the driver’s seat, and having a maximum mass not exceeding 5
     *             tonnes (class M2).
     *           
     * 
     */
    @XmlEnumValue("minibus")
    MINIBUS("minibus"),

    /**
     * Moped (a two wheeled motor vehicle characterized by a small engine typically less
     *             than 50cc and by normally having pedals).
     *           
     * 
     */
    @XmlEnumValue("moped")
    MOPED("moped"),

    /**
     * Motorcycle.
     * 
     */
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),

    /**
     * Three wheeled vehicle comprising a motorcycle with an attached side car.
     *           
     * 
     */
    @XmlEnumValue("motorcycleWithSideCar")
    MOTORCYCLE_WITH_SIDE_CAR("motorcycleWithSideCar"),

    /**
     * Motorhome
     * 
     */
    @XmlEnumValue("motorhome")
    MOTORHOME("motorhome"),

    /**
     * Motorscooter (a two wheeled motor vehicle characterized by a step-through frame
     *             and small diameter wheels).
     *           
     * 
     */
    @XmlEnumValue("motorscooter")
    MOTORSCOOTER("motorscooter"),

    /**
     * Passenger car
     * 
     */
    @XmlEnumValue("passengerCar")
    PASSENGER_CAR("passengerCar"),

    /**
     * Small car
     * 
     */
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),

    /**
     * Vehicle with large tank for carrying bulk liquids.
     * 
     */
    @XmlEnumValue("tanker")
    TANKER("tanker"),

    /**
     * Three wheeled vehicle of unspecified type.
     * 
     */
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),

    /**
     * Trailer.
     * 
     */
    @XmlEnumValue("trailer")
    TRAILER("trailer"),

    /**
     * Tram.
     * 
     */
    @XmlEnumValue("tram")
    TRAM("tram"),

    /**
     * Trolley bus
     * 
     */
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),

    /**
     * Two wheeled vehicle of unspecified type.
     * 
     */
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),

    /**
     * Van.
     * 
     */
    @XmlEnumValue("van")
    VAN("van"),

    /**
     * Vehicle (of unspecified type) towing a caravan.
     * 
     */
    @XmlEnumValue("vehicleWithCaravan")
    VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),

    /**
     * Vehicle with catalytic converter.
     * 
     */
    @XmlEnumValue("vehicleWithCatalyticConverter")
    VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),

    /**
     * Vehicle without catalytic converter.
     * 
     */
    @XmlEnumValue("vehicleWithoutCatalyticConverter")
    VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),

    /**
     * Vehicle (of unspecified type) towing a trailer.
     * 
     */
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),

    /**
     * Vehicle with even numbered registration plate.
     * 
     */
    @XmlEnumValue("withEvenNumberedRegistrationPlates")
    WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),

    /**
     * Vehicle with odd numbered registration plate.
     * 
     */
    @XmlEnumValue("withOddNumberedRegistrationPlates")
    WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),

    /**
     * Unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    VehicleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTypeEnum fromValue(String v) {
        for (VehicleTypeEnum c: VehicleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
