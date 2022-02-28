
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFacilityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceFacilityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="hotel"/&gt;
 *     &lt;enumeration value="motel"/&gt;
 *     &lt;enumeration value="overnightAccommodation"/&gt;
 *     &lt;enumeration value="shop"/&gt;
 *     &lt;enumeration value="kiosk"/&gt;
 *     &lt;enumeration value="foodShopping"/&gt;
 *     &lt;enumeration value="cafe"/&gt;
 *     &lt;enumeration value="restaurant"/&gt;
 *     &lt;enumeration value="restaurantSelfService"/&gt;
 *     &lt;enumeration value="motorwayRestaurant"/&gt;
 *     &lt;enumeration value="motorwayRestaurantSmall"/&gt;
 *     &lt;enumeration value="sparePartsShopping"/&gt;
 *     &lt;enumeration value="petrolStation"/&gt;
 *     &lt;enumeration value="vehicleMaintenance"/&gt;
 *     &lt;enumeration value="tyreRepair"/&gt;
 *     &lt;enumeration value="truckRepair"/&gt;
 *     &lt;enumeration value="truckWash"/&gt;
 *     &lt;enumeration value="carWash"/&gt;
 *     &lt;enumeration value="pharmacy"/&gt;
 *     &lt;enumeration value="medicalFacility"/&gt;
 *     &lt;enumeration value="police"/&gt;
 *     &lt;enumeration value="touristInformation"/&gt;
 *     &lt;enumeration value="bikeSharing"/&gt;
 *     &lt;enumeration value="docstop"/&gt;
 *     &lt;enumeration value="laundry"/&gt;
 *     &lt;enumeration value="leisureActivities"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceFacilityTypeEnum")
@XmlEnum
public enum ServiceFacilityTypeEnum {

    @XmlEnumValue("hotel")
    HOTEL("hotel"),
    @XmlEnumValue("motel")
    MOTEL("motel"),
    @XmlEnumValue("overnightAccommodation")
    OVERNIGHT_ACCOMMODATION("overnightAccommodation"),
    @XmlEnumValue("shop")
    SHOP("shop"),
    @XmlEnumValue("kiosk")
    KIOSK("kiosk"),
    @XmlEnumValue("foodShopping")
    FOOD_SHOPPING("foodShopping"),
    @XmlEnumValue("cafe")
    CAFE("cafe"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("restaurantSelfService")
    RESTAURANT_SELF_SERVICE("restaurantSelfService"),
    @XmlEnumValue("motorwayRestaurant")
    MOTORWAY_RESTAURANT("motorwayRestaurant"),
    @XmlEnumValue("motorwayRestaurantSmall")
    MOTORWAY_RESTAURANT_SMALL("motorwayRestaurantSmall"),
    @XmlEnumValue("sparePartsShopping")
    SPARE_PARTS_SHOPPING("sparePartsShopping"),
    @XmlEnumValue("petrolStation")
    PETROL_STATION("petrolStation"),
    @XmlEnumValue("vehicleMaintenance")
    VEHICLE_MAINTENANCE("vehicleMaintenance"),
    @XmlEnumValue("tyreRepair")
    TYRE_REPAIR("tyreRepair"),
    @XmlEnumValue("truckRepair")
    TRUCK_REPAIR("truckRepair"),
    @XmlEnumValue("truckWash")
    TRUCK_WASH("truckWash"),
    @XmlEnumValue("carWash")
    CAR_WASH("carWash"),
    @XmlEnumValue("pharmacy")
    PHARMACY("pharmacy"),
    @XmlEnumValue("medicalFacility")
    MEDICAL_FACILITY("medicalFacility"),
    @XmlEnumValue("police")
    POLICE("police"),
    @XmlEnumValue("touristInformation")
    TOURIST_INFORMATION("touristInformation"),
    @XmlEnumValue("bikeSharing")
    BIKE_SHARING("bikeSharing"),
    @XmlEnumValue("docstop")
    DOCSTOP("docstop"),
    @XmlEnumValue("laundry")
    LAUNDRY("laundry"),
    @XmlEnumValue("leisureActivities")
    LEISURE_ACTIVITIES("leisureActivities"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ServiceFacilityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceFacilityTypeEnum fromValue(String v) {
        for (ServiceFacilityTypeEnum c: ServiceFacilityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
