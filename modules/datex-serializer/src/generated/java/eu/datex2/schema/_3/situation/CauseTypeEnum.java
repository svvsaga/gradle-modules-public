
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CauseTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abnormalTraffic"/&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="animalPresence"/&gt;
 *     &lt;enumeration value="authorityOperation"/&gt;
 *     &lt;enumeration value="constructionWork"/&gt;
 *     &lt;enumeration value="disturbance"/&gt;
 *     &lt;enumeration value="drivingConditions"/&gt;
 *     &lt;enumeration value="environmentalObstruction"/&gt;
 *     &lt;enumeration value="equipmentOrSystemFault"/&gt;
 *     &lt;enumeration value="infrastructureDamageObstruction"/&gt;
 *     &lt;enumeration value="instructionToRoadUsers"/&gt;
 *     &lt;enumeration value="networkManagement"/&gt;
 *     &lt;enumeration value="nonWeatherRelatedRoadConditions"/&gt;
 *     &lt;enumeration value="obstruction"/&gt;
 *     &lt;enumeration value="poorEnvironment"/&gt;
 *     &lt;enumeration value="publicEvent"/&gt;
 *     &lt;enumeration value="rerouting"/&gt;
 *     &lt;enumeration value="roadMaintenance"/&gt;
 *     &lt;enumeration value="roadOperatorServiceDisruption"/&gt;
 *     &lt;enumeration value="roadOrCarriagewayOrLaneManagement"/&gt;
 *     &lt;enumeration value="roadsideAssistance"/&gt;
 *     &lt;enumeration value="roadsideServiceDisruption"/&gt;
 *     &lt;enumeration value="speedManagement"/&gt;
 *     &lt;enumeration value="transitServiceDisruption"/&gt;
 *     &lt;enumeration value="vehicleObstruction"/&gt;
 *     &lt;enumeration value="weatherRelatedRoadConditions"/&gt;
 *     &lt;enumeration value="winterEquipmentManagement"/&gt;
 *     &lt;enumeration value="earlierEvent"/&gt;
 *     &lt;enumeration value="earlierIncident"/&gt;
 *     &lt;enumeration value="holidayTraffic"/&gt;
 *     &lt;enumeration value="problemsAtBorderPost"/&gt;
 *     &lt;enumeration value="problemsAtCustomPost"/&gt;
 *     &lt;enumeration value="problemsOnLocalRoads"/&gt;
 *     &lt;enumeration value="roadsideEvent"/&gt;
 *     &lt;enumeration value="rubberNecking"/&gt;
 *     &lt;enumeration value="technicalProblems"/&gt;
 *     &lt;enumeration value="vandalism"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CauseTypeEnum")
@XmlEnum
public enum CauseTypeEnum {

    @XmlEnumValue("abnormalTraffic")
    ABNORMAL_TRAFFIC("abnormalTraffic"),
    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("animalPresence")
    ANIMAL_PRESENCE("animalPresence"),
    @XmlEnumValue("authorityOperation")
    AUTHORITY_OPERATION("authorityOperation"),
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("disturbance")
    DISTURBANCE("disturbance"),
    @XmlEnumValue("drivingConditions")
    DRIVING_CONDITIONS("drivingConditions"),
    @XmlEnumValue("environmentalObstruction")
    ENVIRONMENTAL_OBSTRUCTION("environmentalObstruction"),
    @XmlEnumValue("equipmentOrSystemFault")
    EQUIPMENT_OR_SYSTEM_FAULT("equipmentOrSystemFault"),
    @XmlEnumValue("infrastructureDamageObstruction")
    INFRASTRUCTURE_DAMAGE_OBSTRUCTION("infrastructureDamageObstruction"),
    @XmlEnumValue("instructionToRoadUsers")
    INSTRUCTION_TO_ROAD_USERS("instructionToRoadUsers"),
    @XmlEnumValue("networkManagement")
    NETWORK_MANAGEMENT("networkManagement"),
    @XmlEnumValue("nonWeatherRelatedRoadConditions")
    NON_WEATHER_RELATED_ROAD_CONDITIONS("nonWeatherRelatedRoadConditions"),
    @XmlEnumValue("obstruction")
    OBSTRUCTION("obstruction"),
    @XmlEnumValue("poorEnvironment")
    POOR_ENVIRONMENT("poorEnvironment"),
    @XmlEnumValue("publicEvent")
    PUBLIC_EVENT("publicEvent"),
    @XmlEnumValue("rerouting")
    REROUTING("rerouting"),
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),
    @XmlEnumValue("roadOperatorServiceDisruption")
    ROAD_OPERATOR_SERVICE_DISRUPTION("roadOperatorServiceDisruption"),
    @XmlEnumValue("roadOrCarriagewayOrLaneManagement")
    ROAD_OR_CARRIAGEWAY_OR_LANE_MANAGEMENT("roadOrCarriagewayOrLaneManagement"),
    @XmlEnumValue("roadsideAssistance")
    ROADSIDE_ASSISTANCE("roadsideAssistance"),
    @XmlEnumValue("roadsideServiceDisruption")
    ROADSIDE_SERVICE_DISRUPTION("roadsideServiceDisruption"),
    @XmlEnumValue("speedManagement")
    SPEED_MANAGEMENT("speedManagement"),
    @XmlEnumValue("transitServiceDisruption")
    TRANSIT_SERVICE_DISRUPTION("transitServiceDisruption"),
    @XmlEnumValue("vehicleObstruction")
    VEHICLE_OBSTRUCTION("vehicleObstruction"),
    @XmlEnumValue("weatherRelatedRoadConditions")
    WEATHER_RELATED_ROAD_CONDITIONS("weatherRelatedRoadConditions"),
    @XmlEnumValue("winterEquipmentManagement")
    WINTER_EQUIPMENT_MANAGEMENT("winterEquipmentManagement"),
    @XmlEnumValue("earlierEvent")
    EARLIER_EVENT("earlierEvent"),
    @XmlEnumValue("earlierIncident")
    EARLIER_INCIDENT("earlierIncident"),
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue("problemsAtCustomPost")
    PROBLEMS_AT_CUSTOM_POST("problemsAtCustomPost"),
    @XmlEnumValue("problemsOnLocalRoads")
    PROBLEMS_ON_LOCAL_ROADS("problemsOnLocalRoads"),
    @XmlEnumValue("roadsideEvent")
    ROADSIDE_EVENT("roadsideEvent"),
    @XmlEnumValue("rubberNecking")
    RUBBER_NECKING("rubberNecking"),
    @XmlEnumValue("technicalProblems")
    TECHNICAL_PROBLEMS("technicalProblems"),
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    CauseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CauseTypeEnum fromValue(String v) {
        for (CauseTypeEnum c: CauseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
