
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

    @XmlEnumValue("barClosed")
    BAR_CLOSED("barClosed"),
    @XmlEnumValue("dieselShortage")
    DIESEL_SHORTAGE("dieselShortage"),
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),
    @XmlEnumValue("lpgShortage")
    LPG_SHORTAGE("lpgShortage"),
    @XmlEnumValue("methaneShortage")
    METHANE_SHORTAGE("methaneShortage"),
    @XmlEnumValue("noDieselForHeavyVehicles")
    NO_DIESEL_FOR_HEAVY_VEHICLES("noDieselForHeavyVehicles"),
    @XmlEnumValue("noDieselForLightVehicles")
    NO_DIESEL_FOR_LIGHT_VEHICLES("noDieselForLightVehicles"),
    @XmlEnumValue("noParkingAvailability")
    NO_PARKING_AVAILABILITY("noParkingAvailability"),
    @XmlEnumValue("noPublicTelephones")
    NO_PUBLIC_TELEPHONES("noPublicTelephones"),
    @XmlEnumValue("noToiletFacilities")
    NO_TOILET_FACILITIES("noToiletFacilities"),
    @XmlEnumValue("noVehicleRepairFacilities")
    NO_VEHICLE_REPAIR_FACILITIES("noVehicleRepairFacilities"),
    @XmlEnumValue("petrolShortage")
    PETROL_SHORTAGE("petrolShortage"),
    @XmlEnumValue("restAreaBusy")
    REST_AREA_BUSY("restAreaBusy"),
    @XmlEnumValue("restAreaClosed")
    REST_AREA_CLOSED("restAreaClosed"),
    @XmlEnumValue("restAreaOvercrowdedDriveToAnotherRestArea")
    REST_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_REST_AREA("restAreaOvercrowdedDriveToAnotherRestArea"),
    @XmlEnumValue("serviceAreaBusy")
    SERVICE_AREA_BUSY("serviceAreaBusy"),
    @XmlEnumValue("serviceAreaClosed")
    SERVICE_AREA_CLOSED("serviceAreaClosed"),
    @XmlEnumValue("serviceAreaFuelStationClosed")
    SERVICE_AREA_FUEL_STATION_CLOSED("serviceAreaFuelStationClosed"),
    @XmlEnumValue("serviceAreaOvercrowdedDriveToAnotherServiceArea")
    SERVICE_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_SERVICE_AREA("serviceAreaOvercrowdedDriveToAnotherServiceArea"),
    @XmlEnumValue("serviceAreaRestaurantClosed")
    SERVICE_AREA_RESTAURANT_CLOSED("serviceAreaRestaurantClosed"),
    @XmlEnumValue("someCommercialServicesClosed")
    SOME_COMMERCIAL_SERVICES_CLOSED("someCommercialServicesClosed"),
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
