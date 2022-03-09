
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
@XmlType(name = "SubdivisionTypeEnum")
@XmlEnum
public enum SubdivisionTypeEnum {

    @XmlEnumValue("administrativeAtoll")
    ADMINISTRATIVE_ATOLL("administrativeAtoll"),
    @XmlEnumValue("administrativeRegion")
    ADMINISTRATIVE_REGION("administrativeRegion"),
    @XmlEnumValue("administrativeTerritory")
    ADMINISTRATIVE_TERRITORY("administrativeTerritory"),
    @XmlEnumValue("arcticRegion")
    ARCTIC_REGION("arcticRegion"),
    @XmlEnumValue("autonomousCity")
    AUTONOMOUS_CITY("autonomousCity"),
    @XmlEnumValue("autonomousCityInNorthAfrica")
    AUTONOMOUS_CITY_IN_NORTH_AFRICA("autonomousCityInNorthAfrica"),
    @XmlEnumValue("autonomousCommunity")
    AUTONOMOUS_COMMUNITY("autonomousCommunity"),
    @XmlEnumValue("autonomousDistrict")
    AUTONOMOUS_DISTRICT("autonomousDistrict"),
    @XmlEnumValue("autonomousProvince")
    AUTONOMOUS_PROVINCE("autonomousProvince"),
    @XmlEnumValue("autonomousRegion")
    AUTONOMOUS_REGION("autonomousRegion"),
    @XmlEnumValue("canton")
    CANTON("canton"),
    @XmlEnumValue("capitalCity")
    CAPITAL_CITY("capitalCity"),
    @XmlEnumValue("city")
    CITY("city"),
    @XmlEnumValue("cityMunicipality")
    CITY_MUNICIPALITY("cityMunicipality"),
    @XmlEnumValue("cityOfCountyRight")
    CITY_OF_COUNTY_RIGHT("cityOfCountyRight"),
    @XmlEnumValue("commune")
    COMMUNE("commune"),
    @XmlEnumValue("councilArea")
    COUNCIL_AREA("councilArea"),
    @XmlEnumValue("county")
    COUNTY("county"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("department")
    DEPARTMENT("department"),
    @XmlEnumValue("dependency")
    DEPENDENCY("dependency"),
    @XmlEnumValue("district")
    DISTRICT("district"),
    @XmlEnumValue("districtMunicipality")
    DISTRICT_MUNICIPALITY("districtMunicipality"),
    @XmlEnumValue("districtWithSpecialStatus")
    DISTRICT_WITH_SPECIAL_STATUS("districtWithSpecialStatus"),
    @XmlEnumValue("entity")
    ENTITY("entity"),
    @XmlEnumValue("geographicalEntity")
    GEOGRAPHICAL_ENTITY("geographicalEntity"),
    @XmlEnumValue("governorate")
    GOVERNORATE("governorate"),
    @XmlEnumValue("laender")
    LAENDER("laender"),
    @XmlEnumValue("localCouncil")
    LOCAL_COUNCIL("localCouncil"),
    @XmlEnumValue("londonBorough")
    LONDON_BOROUGH("londonBorough"),
    @XmlEnumValue("metropolitanArea")
    METROPOLITAN_AREA("metropolitanArea"),
    @XmlEnumValue("metropolitanDepartment")
    METROPOLITAN_DEPARTMENT("metropolitanDepartment"),
    @XmlEnumValue("metropolitanDistrict")
    METROPOLITAN_DISTRICT("metropolitanDistrict"),
    @XmlEnumValue("metropolitanRegion")
    METROPOLITAN_REGION("metropolitanRegion"),
    @XmlEnumValue("municipality")
    MUNICIPALITY("municipality"),
    @XmlEnumValue("overseasDepartment")
    OVERSEAS_DEPARTMENT("overseasDepartment"),
    @XmlEnumValue("overseasRegion")
    OVERSEAS_REGION("overseasRegion"),
    @XmlEnumValue("overseasTerritorialCollectivity")
    OVERSEAS_TERRITORIAL_COLLECTIVITY("overseasTerritorialCollectivity"),
    @XmlEnumValue("parish")
    PARISH("parish"),
    @XmlEnumValue("province")
    PROVINCE("province"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("region")
    REGION("region"),
    @XmlEnumValue("republic")
    REPUBLIC("republic"),
    @XmlEnumValue("republicanCity")
    REPUBLICAN_CITY("republicanCity"),
    @XmlEnumValue("selfGovernedPart")
    SELF_GOVERNED_PART("selfGovernedPart"),
    @XmlEnumValue("specialMunicipality")
    SPECIAL_MUNICIPALITY("specialMunicipality"),
    @XmlEnumValue("state")
    STATE("state"),
    @XmlEnumValue("territorialUnit")
    TERRITORIAL_UNIT("territorialUnit"),
    @XmlEnumValue("territory")
    TERRITORY("territory"),
    @XmlEnumValue("twoTierCounty")
    TWO_TIER_COUNTY("twoTierCounty"),
    @XmlEnumValue("unitaryAuthority")
    UNITARY_AUTHORITY("unitaryAuthority"),
    @XmlEnumValue("ward")
    WARD("ward"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    SubdivisionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubdivisionTypeEnum fromValue(String v) {
        for (SubdivisionTypeEnum c: SubdivisionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
