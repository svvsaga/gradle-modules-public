
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
public enum CauseTypeEnum2 {


    /**
     * A traffic condition that is not normal.
     * 
     */
    @XmlEnumValue("abnormalTraffic")
    ABNORMAL_TRAFFIC("abnormalTraffic"),

    /**
     * Accident.
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * An obstruction on the road resulting from the presence of animals
     *           
     * 
     */
    @XmlEnumValue("animalPresence")
    ANIMAL_PRESENCE("animalPresence"),

    /**
     * Authority initiated operation or activity
     * 
     */
    @XmlEnumValue("authorityOperation")
    AUTHORITY_OPERATION("authorityOperation"),

    /**
     * Roadworks involving the construction of new infrastructure.
     * 
     */
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),

    /**
     * Deliberate human action of either a public disorder nature or of a situation alert
     *             type which could disrupt traffic.
     *           
     * 
     */
    @XmlEnumValue("disturbance")
    DISTURBANCE("disturbance"),

    /**
     * Degraded driving conditions.
     * 
     */
    @XmlEnumValue("drivingConditions")
    DRIVING_CONDITIONS("drivingConditions"),

    /**
     * An obstruction on the road resulting from an environmental cause
     *           
     * 
     */
    @XmlEnumValue("environmentalObstruction")
    ENVIRONMENTAL_OBSTRUCTION("environmentalObstruction"),

    /**
     * Equipment or system which is faulty, malfunctioning or not in a fully operational
     *             state
     *           
     * 
     */
    @XmlEnumValue("equipmentOrSystemFault")
    EQUIPMENT_OR_SYSTEM_FAULT("equipmentOrSystemFault"),

    /**
     * An obstruction on the road resulting from the failure or damage of infrastructure
     *             on, under, above or close to the road
     *           
     * 
     */
    @XmlEnumValue("infrastructureDamageObstruction")
    INFRASTRUCTURE_DAMAGE_OBSTRUCTION("infrastructureDamageObstruction"),

    /**
     * Instruction and/or message issued by the network/road operator
     * 
     */
    @XmlEnumValue("instructionToRoadUsers")
    INSTRUCTION_TO_ROAD_USERS("instructionToRoadUsers"),

    /**
     * Network management action which is applicable to the road network and its users.
     *           
     * 
     */
    @XmlEnumValue("networkManagement")
    NETWORK_MANAGEMENT("networkManagement"),

    /**
     * Road surface conditions that are not related to the weather
     * 
     */
    @XmlEnumValue("nonWeatherRelatedRoadConditions")
    NON_WEATHER_RELATED_ROAD_CONDITIONS("nonWeatherRelatedRoadConditions"),

    /**
     * Obstruction on the roadway.
     * 
     */
    @XmlEnumValue("obstruction")
    OBSTRUCTION("obstruction"),

    /**
     * Poor environmental conditions
     * 
     */
    @XmlEnumValue("poorEnvironment")
    POOR_ENVIRONMENT("poorEnvironment"),

    /**
     * Organised public event
     * 
     */
    @XmlEnumValue("publicEvent")
    PUBLIC_EVENT("publicEvent"),

    /**
     * Rerouting management action issued by the network/road operator
     * 
     */
    @XmlEnumValue("rerouting")
    REROUTING("rerouting"),

    /**
     * Roadworks involving the maintenance or installation of infrastructure
     *           
     * 
     */
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),

    /**
     * Disruption to normal road operator services
     * 
     */
    @XmlEnumValue("roadOperatorServiceDisruption")
    ROAD_OPERATOR_SERVICE_DISRUPTION("roadOperatorServiceDisruption"),

    /**
     * Road, carriageway or lane management action instigated by the network/road
     *             operator
     *           
     * 
     */
    @XmlEnumValue("roadOrCarriagewayOrLaneManagement")
    ROAD_OR_CARRIAGEWAY_OR_LANE_MANAGEMENT("roadOrCarriagewayOrLaneManagement"),

    /**
     * Road side assistance
     * 
     */
    @XmlEnumValue("roadsideAssistance")
    ROADSIDE_ASSISTANCE("roadsideAssistance"),

    /**
     * Disruption to normal roadside services
     * 
     */
    @XmlEnumValue("roadsideServiceDisruption")
    ROADSIDE_SERVICE_DISRUPTION("roadsideServiceDisruption"),

    /**
     * Speed management action instigated by the network/road operator
     * 
     */
    @XmlEnumValue("speedManagement")
    SPEED_MANAGEMENT("speedManagement"),

    /**
     * Disruption to transit services of direct relevance to road users, e.g. connecting
     *             rail or ferry services
     *           
     * 
     */
    @XmlEnumValue("transitServiceDisruption")
    TRANSIT_SERVICE_DISRUPTION("transitServiceDisruption"),

    /**
     * An obstruction on the road caused by one or more vehicles.
     * 
     */
    @XmlEnumValue("vehicleObstruction")
    VEHICLE_OBSTRUCTION("vehicleObstruction"),

    /**
     * Road surface conditions related to the weather
     * 
     */
    @XmlEnumValue("weatherRelatedRoadConditions")
    WEATHER_RELATED_ROAD_CONDITIONS("weatherRelatedRoadConditions"),

    /**
     * Winter driving management action instigated by the network/road operator
     *           
     * 
     */
    @XmlEnumValue("winterEquipmentManagement")
    WINTER_EQUIPMENT_MANAGEMENT("winterEquipmentManagement"),

    /**
     * An earlier event.
     * 
     */
    @XmlEnumValue("earlierEvent")
    EARLIER_EVENT("earlierEvent"),

    /**
     * An earlier incident.
     * 
     */
    @XmlEnumValue("earlierIncident")
    EARLIER_INCIDENT("earlierIncident"),

    /**
     * Holiday traffic.
     * 
     */
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),

    /**
     * Problems at the border crossing.
     * 
     */
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),

    /**
     * Problems at the customs post on the border.
     * 
     */
    @XmlEnumValue("problemsAtCustomPost")
    PROBLEMS_AT_CUSTOM_POST("problemsAtCustomPost"),

    /**
     * Problems (of an unspecified nature) on the local roads.
     * 
     */
    @XmlEnumValue("problemsOnLocalRoads")
    PROBLEMS_ON_LOCAL_ROADS("problemsOnLocalRoads"),

    /**
     * A roadside event (of unspecified nature) whether planned or not.
     *           
     * 
     */
    @XmlEnumValue("roadsideEvent")
    ROADSIDE_EVENT("roadsideEvent"),

    /**
     * Drivers being distracted and turning to look at an accident or other roadside
     *             event.
     *           
     * 
     */
    @XmlEnumValue("rubberNecking")
    RUBBER_NECKING("rubberNecking"),

    /**
     * Technical problems.
     * 
     */
    @XmlEnumValue("technicalProblems")
    TECHNICAL_PROBLEMS("technicalProblems"),

    /**
     * A vandalism incident.
     * 
     */
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    CauseTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CauseTypeEnum2 fromValue(String v) {
        for (CauseTypeEnum2 c: CauseTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
