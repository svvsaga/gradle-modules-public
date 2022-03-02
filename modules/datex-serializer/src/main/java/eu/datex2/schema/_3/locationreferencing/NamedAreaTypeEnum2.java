
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedAreaTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NamedAreaTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="applicationRegion"/&gt;
 *     &lt;enumeration value="continent"/&gt;
 *     &lt;enumeration value="country"/&gt;
 *     &lt;enumeration value="countryGroup"/&gt;
 *     &lt;enumeration value="carParkArea"/&gt;
 *     &lt;enumeration value="carpoolArea"/&gt;
 *     &lt;enumeration value="fuzzyArea"/&gt;
 *     &lt;enumeration value="industrialArea"/&gt;
 *     &lt;enumeration value="lake"/&gt;
 *     &lt;enumeration value="meteorologicalArea"/&gt;
 *     &lt;enumeration value="metropolitanArea"/&gt;
 *     &lt;enumeration value="municipality"/&gt;
 *     &lt;enumeration value="parkAndRideSite"/&gt;
 *     &lt;enumeration value="ruralCounty"/&gt;
 *     &lt;enumeration value="sea"/&gt;
 *     &lt;enumeration value="touristArea"/&gt;
 *     &lt;enumeration value="trafficArea"/&gt;
 *     &lt;enumeration value="urbanCounty"/&gt;
 *     &lt;enumeration value="order1AdministrativeArea"/&gt;
 *     &lt;enumeration value="order2AdministrativeArea"/&gt;
 *     &lt;enumeration value="order3AdministrativeArea"/&gt;
 *     &lt;enumeration value="order4AdministrativeArea"/&gt;
 *     &lt;enumeration value="order5AdministrativeArea"/&gt;
 *     &lt;enumeration value="policeForceControlArea"/&gt;
 *     &lt;enumeration value="roadOperatorControlArea"/&gt;
 *     &lt;enumeration value="waterArea"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NamedAreaTypeEnum")
@XmlEnum
public enum NamedAreaTypeEnum2 {


    /**
     * Application region
     * 
     */
    @XmlEnumValue("applicationRegion")
    APPLICATION_REGION("applicationRegion"),

    /**
     * Continent
     * 
     */
    @XmlEnumValue("continent")
    CONTINENT("continent"),

    /**
     * Country
     * 
     */
    @XmlEnumValue("country")
    COUNTRY("country"),

    /**
     * Group of countries.
     * 
     */
    @XmlEnumValue("countryGroup")
    COUNTRY_GROUP("countryGroup"),

    /**
     * Car park area
     * 
     */
    @XmlEnumValue("carParkArea")
    CAR_PARK_AREA("carParkArea"),

    /**
     * Carpool area
     * 
     */
    @XmlEnumValue("carpoolArea")
    CARPOOL_AREA("carpoolArea"),

    /**
     * Fuzzy area
     * 
     */
    @XmlEnumValue("fuzzyArea")
    FUZZY_AREA("fuzzyArea"),

    /**
     * Industrial area
     * 
     */
    @XmlEnumValue("industrialArea")
    INDUSTRIAL_AREA("industrialArea"),

    /**
     * Lake
     * 
     */
    @XmlEnumValue("lake")
    LAKE("lake"),

    /**
     * Meteorological area
     * 
     */
    @XmlEnumValue("meteorologicalArea")
    METEOROLOGICAL_AREA("meteorologicalArea"),

    /**
     * Metropolitan area
     * 
     */
    @XmlEnumValue("metropolitanArea")
    METROPOLITAN_AREA("metropolitanArea"),

    /**
     * Municipality
     * 
     */
    @XmlEnumValue("municipality")
    MUNICIPALITY("municipality"),

    /**
     * A park and ride site
     * 
     */
    @XmlEnumValue("parkAndRideSite")
    PARK_AND_RIDE_SITE("parkAndRideSite"),

    /**
     * Rural county
     * 
     */
    @XmlEnumValue("ruralCounty")
    RURAL_COUNTY("ruralCounty"),

    /**
     * Sea
     * 
     */
    @XmlEnumValue("sea")
    SEA("sea"),

    /**
     * Tourist area
     * 
     */
    @XmlEnumValue("touristArea")
    TOURIST_AREA("touristArea"),

    /**
     * Traffic area
     * 
     */
    @XmlEnumValue("trafficArea")
    TRAFFIC_AREA("trafficArea"),

    /**
     * Urban county
     * 
     */
    @XmlEnumValue("urbanCounty")
    URBAN_COUNTY("urbanCounty"),

    /**
     * Order 1 administrative area
     * 
     */
    @XmlEnumValue("order1AdministrativeArea")
    ORDER_1_ADMINISTRATIVE_AREA("order1AdministrativeArea"),

    /**
     * Order 2 administrative area
     * 
     */
    @XmlEnumValue("order2AdministrativeArea")
    ORDER_2_ADMINISTRATIVE_AREA("order2AdministrativeArea"),

    /**
     * Order 3 administrative area
     * 
     */
    @XmlEnumValue("order3AdministrativeArea")
    ORDER_3_ADMINISTRATIVE_AREA("order3AdministrativeArea"),

    /**
     * Order 4 administrative area
     * 
     */
    @XmlEnumValue("order4AdministrativeArea")
    ORDER_4_ADMINISTRATIVE_AREA("order4AdministrativeArea"),

    /**
     * Order 5 administrative area
     * 
     */
    @XmlEnumValue("order5AdministrativeArea")
    ORDER_5_ADMINISTRATIVE_AREA("order5AdministrativeArea"),

    /**
     * Police force control area
     * 
     */
    @XmlEnumValue("policeForceControlArea")
    POLICE_FORCE_CONTROL_AREA("policeForceControlArea"),

    /**
     * Road operator control area
     * 
     */
    @XmlEnumValue("roadOperatorControlArea")
    ROAD_OPERATOR_CONTROL_AREA("roadOperatorControlArea"),

    /**
     * Water area
     * 
     */
    @XmlEnumValue("waterArea")
    WATER_AREA("waterArea"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    NamedAreaTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamedAreaTypeEnum2 fromValue(String v) {
        for (NamedAreaTypeEnum2 c: NamedAreaTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
