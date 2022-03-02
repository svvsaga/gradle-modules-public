
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubdivisionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SubdivisionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="administrativeAtoll"/&gt;
 *     &lt;enumeration value="administrativeRegion"/&gt;
 *     &lt;enumeration value="administrativeTerritory"/&gt;
 *     &lt;enumeration value="arcticRegion"/&gt;
 *     &lt;enumeration value="autonomousCity"/&gt;
 *     &lt;enumeration value="autonomousCityInNorthAfrica"/&gt;
 *     &lt;enumeration value="autonomousCommunity"/&gt;
 *     &lt;enumeration value="autonomousDistrict"/&gt;
 *     &lt;enumeration value="autonomousProvince"/&gt;
 *     &lt;enumeration value="autonomousRegion"/&gt;
 *     &lt;enumeration value="canton"/&gt;
 *     &lt;enumeration value="capitalCity"/&gt;
 *     &lt;enumeration value="city"/&gt;
 *     &lt;enumeration value="cityMunicipality"/&gt;
 *     &lt;enumeration value="cityOfCountyRight"/&gt;
 *     &lt;enumeration value="commune"/&gt;
 *     &lt;enumeration value="councilArea"/&gt;
 *     &lt;enumeration value="county"/&gt;
 *     &lt;enumeration value="country"/&gt;
 *     &lt;enumeration value="department"/&gt;
 *     &lt;enumeration value="dependency"/&gt;
 *     &lt;enumeration value="district"/&gt;
 *     &lt;enumeration value="districtMunicipality"/&gt;
 *     &lt;enumeration value="districtWithSpecialStatus"/&gt;
 *     &lt;enumeration value="entity"/&gt;
 *     &lt;enumeration value="geographicalEntity"/&gt;
 *     &lt;enumeration value="governorate"/&gt;
 *     &lt;enumeration value="laender"/&gt;
 *     &lt;enumeration value="localCouncil"/&gt;
 *     &lt;enumeration value="londonBorough"/&gt;
 *     &lt;enumeration value="metropolitanArea"/&gt;
 *     &lt;enumeration value="metropolitanDepartment"/&gt;
 *     &lt;enumeration value="metropolitanDistrict"/&gt;
 *     &lt;enumeration value="metropolitanRegion"/&gt;
 *     &lt;enumeration value="municipality"/&gt;
 *     &lt;enumeration value="overseasDepartment"/&gt;
 *     &lt;enumeration value="overseasRegion"/&gt;
 *     &lt;enumeration value="overseasTerritorialCollectivity"/&gt;
 *     &lt;enumeration value="parish"/&gt;
 *     &lt;enumeration value="province"/&gt;
 *     &lt;enumeration value="quarter"/&gt;
 *     &lt;enumeration value="region"/&gt;
 *     &lt;enumeration value="republic"/&gt;
 *     &lt;enumeration value="republicanCity"/&gt;
 *     &lt;enumeration value="selfGovernedPart"/&gt;
 *     &lt;enumeration value="specialMunicipality"/&gt;
 *     &lt;enumeration value="state"/&gt;
 *     &lt;enumeration value="territorialUnit"/&gt;
 *     &lt;enumeration value="territory"/&gt;
 *     &lt;enumeration value="twoTierCounty"/&gt;
 *     &lt;enumeration value="unitaryAuthority"/&gt;
 *     &lt;enumeration value="ward"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubdivisionTypeEnum", namespace = "http://datex2.eu/schema/3/locationReferencing")
@XmlEnum
public enum SubdivisionTypeEnum2 {


    /**
     * Administrative atoll
     * 
     */
    @XmlEnumValue("administrativeAtoll")
    ADMINISTRATIVE_ATOLL("administrativeAtoll"),

    /**
     * Administrative region
     * 
     */
    @XmlEnumValue("administrativeRegion")
    ADMINISTRATIVE_REGION("administrativeRegion"),

    /**
     * Administrative territory
     * 
     */
    @XmlEnumValue("administrativeTerritory")
    ADMINISTRATIVE_TERRITORY("administrativeTerritory"),

    /**
     * Arctic region
     * 
     */
    @XmlEnumValue("arcticRegion")
    ARCTIC_REGION("arcticRegion"),

    /**
     * Autonomous city
     * 
     */
    @XmlEnumValue("autonomousCity")
    AUTONOMOUS_CITY("autonomousCity"),

    /**
     * Autonomous city in North Africa
     * 
     */
    @XmlEnumValue("autonomousCityInNorthAfrica")
    AUTONOMOUS_CITY_IN_NORTH_AFRICA("autonomousCityInNorthAfrica"),

    /**
     * Autonomous community
     * 
     */
    @XmlEnumValue("autonomousCommunity")
    AUTONOMOUS_COMMUNITY("autonomousCommunity"),

    /**
     * Autonomous district
     * 
     */
    @XmlEnumValue("autonomousDistrict")
    AUTONOMOUS_DISTRICT("autonomousDistrict"),

    /**
     * Autonomous province
     * 
     */
    @XmlEnumValue("autonomousProvince")
    AUTONOMOUS_PROVINCE("autonomousProvince"),

    /**
     * Autonomous region
     * 
     */
    @XmlEnumValue("autonomousRegion")
    AUTONOMOUS_REGION("autonomousRegion"),

    /**
     * Canton
     * 
     */
    @XmlEnumValue("canton")
    CANTON("canton"),

    /**
     * Capital city
     * 
     */
    @XmlEnumValue("capitalCity")
    CAPITAL_CITY("capitalCity"),

    /**
     * City
     * 
     */
    @XmlEnumValue("city")
    CITY("city"),

    /**
     * City municipality
     * 
     */
    @XmlEnumValue("cityMunicipality")
    CITY_MUNICIPALITY("cityMunicipality"),

    /**
     * City of county right
     * 
     */
    @XmlEnumValue("cityOfCountyRight")
    CITY_OF_COUNTY_RIGHT("cityOfCountyRight"),

    /**
     * Commune
     * 
     */
    @XmlEnumValue("commune")
    COMMUNE("commune"),

    /**
     * Council area
     * 
     */
    @XmlEnumValue("councilArea")
    COUNCIL_AREA("councilArea"),

    /**
     * County
     * 
     */
    @XmlEnumValue("county")
    COUNTY("county"),

    /**
     * Country
     * 
     */
    @XmlEnumValue("country")
    COUNTRY("country"),

    /**
     * Department
     * 
     */
    @XmlEnumValue("department")
    DEPARTMENT("department"),

    /**
     * Dependency
     * 
     */
    @XmlEnumValue("dependency")
    DEPENDENCY("dependency"),

    /**
     * District
     * 
     */
    @XmlEnumValue("district")
    DISTRICT("district"),

    /**
     * District municipality
     * 
     */
    @XmlEnumValue("districtMunicipality")
    DISTRICT_MUNICIPALITY("districtMunicipality"),

    /**
     * District with special status
     * 
     */
    @XmlEnumValue("districtWithSpecialStatus")
    DISTRICT_WITH_SPECIAL_STATUS("districtWithSpecialStatus"),

    /**
     * Entity
     * 
     */
    @XmlEnumValue("entity")
    ENTITY("entity"),

    /**
     * Geographical entity
     * 
     */
    @XmlEnumValue("geographicalEntity")
    GEOGRAPHICAL_ENTITY("geographicalEntity"),

    /**
     * Governorate
     * 
     */
    @XmlEnumValue("governorate")
    GOVERNORATE("governorate"),

    /**
     * Länder
     * 
     */
    @XmlEnumValue("laender")
    LAENDER("laender"),

    /**
     * Local Council
     * 
     */
    @XmlEnumValue("localCouncil")
    LOCAL_COUNCIL("localCouncil"),

    /**
     * London borough
     * 
     */
    @XmlEnumValue("londonBorough")
    LONDON_BOROUGH("londonBorough"),

    /**
     * Metropolitan area
     * 
     */
    @XmlEnumValue("metropolitanArea")
    METROPOLITAN_AREA("metropolitanArea"),

    /**
     * Metropolitan department
     * 
     */
    @XmlEnumValue("metropolitanDepartment")
    METROPOLITAN_DEPARTMENT("metropolitanDepartment"),

    /**
     * Metropolitan district
     * 
     */
    @XmlEnumValue("metropolitanDistrict")
    METROPOLITAN_DISTRICT("metropolitanDistrict"),

    /**
     * Metropolitan region
     * 
     */
    @XmlEnumValue("metropolitanRegion")
    METROPOLITAN_REGION("metropolitanRegion"),

    /**
     * Municipality
     * 
     */
    @XmlEnumValue("municipality")
    MUNICIPALITY("municipality"),

    /**
     * Overseas department
     * 
     */
    @XmlEnumValue("overseasDepartment")
    OVERSEAS_DEPARTMENT("overseasDepartment"),

    /**
     * Overseas region
     * 
     */
    @XmlEnumValue("overseasRegion")
    OVERSEAS_REGION("overseasRegion"),

    /**
     * Overseas territorial collectivity
     * 
     */
    @XmlEnumValue("overseasTerritorialCollectivity")
    OVERSEAS_TERRITORIAL_COLLECTIVITY("overseasTerritorialCollectivity"),

    /**
     * Parish
     * 
     */
    @XmlEnumValue("parish")
    PARISH("parish"),

    /**
     * Province
     * 
     */
    @XmlEnumValue("province")
    PROVINCE("province"),

    /**
     * Quarter
     * 
     */
    @XmlEnumValue("quarter")
    QUARTER("quarter"),

    /**
     * Region
     * 
     */
    @XmlEnumValue("region")
    REGION("region"),

    /**
     * Republic
     * 
     */
    @XmlEnumValue("republic")
    REPUBLIC("republic"),

    /**
     * Republic city
     * 
     */
    @XmlEnumValue("republicanCity")
    REPUBLICAN_CITY("republicanCity"),

    /**
     * Self-governed part
     * 
     */
    @XmlEnumValue("selfGovernedPart")
    SELF_GOVERNED_PART("selfGovernedPart"),

    /**
     * Special Municipality
     * 
     */
    @XmlEnumValue("specialMunicipality")
    SPECIAL_MUNICIPALITY("specialMunicipality"),

    /**
     * State
     * 
     */
    @XmlEnumValue("state")
    STATE("state"),

    /**
     * Territorial unit
     * 
     */
    @XmlEnumValue("territorialUnit")
    TERRITORIAL_UNIT("territorialUnit"),

    /**
     * Territory
     * 
     */
    @XmlEnumValue("territory")
    TERRITORY("territory"),

    /**
     * Two tier country
     * 
     */
    @XmlEnumValue("twoTierCounty")
    TWO_TIER_COUNTY("twoTierCounty"),

    /**
     * Unitary Authority
     * 
     */
    @XmlEnumValue("unitaryAuthority")
    UNITARY_AUTHORITY("unitaryAuthority"),

    /**
     * Ward
     * 
     */
    @XmlEnumValue("ward")
    WARD("ward"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    SubdivisionTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubdivisionTypeEnum2 fromValue(String v) {
        for (SubdivisionTypeEnum2 c: SubdivisionTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
