
package eu.datex2.schema._2._2_0;

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
 *     &lt;enumeration value="highSidedVehicle"/&gt;
 *     &lt;enumeration value="lorry"/&gt;
 *     &lt;enumeration value="moped"/&gt;
 *     &lt;enumeration value="motorcycle"/&gt;
 *     &lt;enumeration value="motorcycleWithSideCar"/&gt;
 *     &lt;enumeration value="motorscooter"/&gt;
 *     &lt;enumeration value="tanker"/&gt;
 *     &lt;enumeration value="threeWheeledVehicle"/&gt;
 *     &lt;enumeration value="trailer"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="twoWheeledVehicle"/&gt;
 *     &lt;enumeration value="van"/&gt;
 *     &lt;enumeration value="vehicleWithCatalyticConverter"/&gt;
 *     &lt;enumeration value="vehicleWithoutCatalyticConverter"/&gt;
 *     &lt;enumeration value="vehicleWithCaravan"/&gt;
 *     &lt;enumeration value="vehicleWithTrailer"/&gt;
 *     &lt;enumeration value="withEvenNumberedRegistrationPlates"/&gt;
 *     &lt;enumeration value="withOddNumberedRegistrationPlates"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum VehicleTypeEnum {

    @XmlEnumValue("agriculturalVehicle")
    AGRICULTURAL_VEHICLE("agriculturalVehicle"),
    @XmlEnumValue("anyVehicle")
    ANY_VEHICLE("anyVehicle"),
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
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),
    @XmlEnumValue("lorry")
    LORRY("lorry"),
    @XmlEnumValue("moped")
    MOPED("moped"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("motorcycleWithSideCar")
    MOTORCYCLE_WITH_SIDE_CAR("motorcycleWithSideCar"),
    @XmlEnumValue("motorscooter")
    MOTORSCOOTER("motorscooter"),
    @XmlEnumValue("tanker")
    TANKER("tanker"),
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),
    @XmlEnumValue("trailer")
    TRAILER("trailer"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),
    @XmlEnumValue("van")
    VAN("van"),
    @XmlEnumValue("vehicleWithCatalyticConverter")
    VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),
    @XmlEnumValue("vehicleWithoutCatalyticConverter")
    VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),
    @XmlEnumValue("vehicleWithCaravan")
    VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
    @XmlEnumValue("withEvenNumberedRegistrationPlates")
    WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),
    @XmlEnumValue("withOddNumberedRegistrationPlates")
    WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),
    @XmlEnumValue("other")
    OTHER("other");
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
