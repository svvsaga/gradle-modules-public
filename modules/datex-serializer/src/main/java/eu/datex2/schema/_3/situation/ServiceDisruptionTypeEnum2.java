
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDisruptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceDisruptionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="barClosed"/&gt;
 *     &lt;enumeration value="dieselShortage"/&gt;
 *     &lt;enumeration value="fuelShortage"/&gt;
 *     &lt;enumeration value="lpgShortage"/&gt;
 *     &lt;enumeration value="methaneShortage"/&gt;
 *     &lt;enumeration value="noDieselForHeavyVehicles"/&gt;
 *     &lt;enumeration value="noDieselForLightVehicles"/&gt;
 *     &lt;enumeration value="noParkingAvailability"/&gt;
 *     &lt;enumeration value="noPublicTelephones"/&gt;
 *     &lt;enumeration value="noToiletFacilities"/&gt;
 *     &lt;enumeration value="noVehicleRepairFacilities"/&gt;
 *     &lt;enumeration value="petrolShortage"/&gt;
 *     &lt;enumeration value="restAreaBusy"/&gt;
 *     &lt;enumeration value="restAreaClosed"/&gt;
 *     &lt;enumeration value="restAreaOvercrowdedDriveToAnotherRestArea"/&gt;
 *     &lt;enumeration value="serviceAreaBusy"/&gt;
 *     &lt;enumeration value="serviceAreaClosed"/&gt;
 *     &lt;enumeration value="serviceAreaFuelStationClosed"/&gt;
 *     &lt;enumeration value="serviceAreaOvercrowdedDriveToAnotherServiceArea"/&gt;
 *     &lt;enumeration value="serviceAreaRestaurantClosed"/&gt;
 *     &lt;enumeration value="someCommercialServicesClosed"/&gt;
 *     &lt;enumeration value="waterShortage"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceDisruptionTypeEnum")
@XmlEnum
public enum ServiceDisruptionTypeEnum2 {


    /**
     * Bar closed.
     * 
     */
    @XmlEnumValue("barClosed")
    BAR_CLOSED("barClosed"),

    /**
     * There is a shortage of diesel at the specified location.
     * 
     */
    @XmlEnumValue("dieselShortage")
    DIESEL_SHORTAGE("dieselShortage"),

    /**
     * There is a shortage of fuel (of one or more types) at the specified location.
     *           
     * 
     */
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),

    /**
     * There is a shortage of liquid petroleum gas at the specified location.
     *           
     * 
     */
    @XmlEnumValue("lpgShortage")
    LPG_SHORTAGE("lpgShortage"),

    /**
     * There is a shortage of methane at the specified location.
     * 
     */
    @XmlEnumValue("methaneShortage")
    METHANE_SHORTAGE("methaneShortage"),

    /**
     * There is no diesel available for heavy goods vehicles at the specified location.
     *           
     * 
     */
    @XmlEnumValue("noDieselForHeavyVehicles")
    NO_DIESEL_FOR_HEAVY_VEHICLES("noDieselForHeavyVehicles"),

    /**
     * There is no diesel available for light vehicles at the specified location.
     *           
     * 
     */
    @XmlEnumValue("noDieselForLightVehicles")
    NO_DIESEL_FOR_LIGHT_VEHICLES("noDieselForLightVehicles"),

    /**
     * There is little or no availbility of parking
     * 
     */
    @XmlEnumValue("noParkingAvailability")
    NO_PARKING_AVAILABILITY("noParkingAvailability"),

    /**
     * There are no available public telephones at the specified location.
     *           
     * 
     */
    @XmlEnumValue("noPublicTelephones")
    NO_PUBLIC_TELEPHONES("noPublicTelephones"),

    /**
     * There are no available public toilet facilities at the specified location.
     *           
     * 
     */
    @XmlEnumValue("noToiletFacilities")
    NO_TOILET_FACILITIES("noToiletFacilities"),

    /**
     * There are no available vehicle repair facilities at the specified location.
     *           
     * 
     */
    @XmlEnumValue("noVehicleRepairFacilities")
    NO_VEHICLE_REPAIR_FACILITIES("noVehicleRepairFacilities"),

    /**
     * There is a shortage of petrol at the specified location.
     * 
     */
    @XmlEnumValue("petrolShortage")
    PETROL_SHORTAGE("petrolShortage"),

    /**
     * The rest area at the specified location is busy.
     * 
     */
    @XmlEnumValue("restAreaBusy")
    REST_AREA_BUSY("restAreaBusy"),

    /**
     * The rest area at the specified location is closed.
     * 
     */
    @XmlEnumValue("restAreaClosed")
    REST_AREA_CLOSED("restAreaClosed"),

    /**
     * The rest area at the specified location is close to capacity and motorists are
     *             advised to seek an alternative.
     *           
     * 
     */
    @XmlEnumValue("restAreaOvercrowdedDriveToAnotherRestArea")
    REST_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_REST_AREA("restAreaOvercrowdedDriveToAnotherRestArea"),

    /**
     * The service area at the specified location is close to capacity.
     *           
     * 
     */
    @XmlEnumValue("serviceAreaBusy")
    SERVICE_AREA_BUSY("serviceAreaBusy"),

    /**
     * The service area at the specified location is closed.
     * 
     */
    @XmlEnumValue("serviceAreaClosed")
    SERVICE_AREA_CLOSED("serviceAreaClosed"),

    /**
     * The fuel station at the specified service area is closed.
     * 
     */
    @XmlEnumValue("serviceAreaFuelStationClosed")
    SERVICE_AREA_FUEL_STATION_CLOSED("serviceAreaFuelStationClosed"),

    /**
     * The service area at the specified location is close to capacity and motorists are
     *             advised to seek an alternative.
     *           
     * 
     */
    @XmlEnumValue("serviceAreaOvercrowdedDriveToAnotherServiceArea")
    SERVICE_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_SERVICE_AREA("serviceAreaOvercrowdedDriveToAnotherServiceArea"),

    /**
     * The restaurant at the specified service area is closed.
     * 
     */
    @XmlEnumValue("serviceAreaRestaurantClosed")
    SERVICE_AREA_RESTAURANT_CLOSED("serviceAreaRestaurantClosed"),

    /**
     * Some commercial services are closed at the specified location.
     * 
     */
    @XmlEnumValue("someCommercialServicesClosed")
    SOME_COMMERCIAL_SERVICES_CLOSED("someCommercialServicesClosed"),

    /**
     * There is a shortage of water at the specified location.
     * 
     */
    @XmlEnumValue("waterShortage")
    WATER_SHORTAGE("waterShortage"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ServiceDisruptionTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceDisruptionTypeEnum2 fromValue(String v) {
        for (ServiceDisruptionTypeEnum2 c: ServiceDisruptionTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
