
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObstructionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airCrash"/&gt;
 *     &lt;enumeration value="childrenOnRoadway"/&gt;
 *     &lt;enumeration value="clearanceWork"/&gt;
 *     &lt;enumeration value="craneOperating"/&gt;
 *     &lt;enumeration value="cyclistsOnRoadway"/&gt;
 *     &lt;enumeration value="debris"/&gt;
 *     &lt;enumeration value="explosion"/&gt;
 *     &lt;enumeration value="explosionHazard"/&gt;
 *     &lt;enumeration value="hazardsOnTheRoad"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="industrialAccident"/&gt;
 *     &lt;enumeration value="objectOnTheRoad"/&gt;
 *     &lt;enumeration value="objectsFallingFromMovingVehicle"/&gt;
 *     &lt;enumeration value="obstructionOnTheRoad"/&gt;
 *     &lt;enumeration value="peopleOnRoadway"/&gt;
 *     &lt;enumeration value="railCrash"/&gt;
 *     &lt;enumeration value="rescueAndRecoveryWork"/&gt;
 *     &lt;enumeration value="severeFrostDamagedRoadway"/&gt;
 *     &lt;enumeration value="shedLoad"/&gt;
 *     &lt;enumeration value="snowAndIceDebris"/&gt;
 *     &lt;enumeration value="spillageOccurringFromMovingVehicle"/&gt;
 *     &lt;enumeration value="spillageOnTheRoad"/&gt;
 *     &lt;enumeration value="unprotectedAccidentArea"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObstructionTypeEnum")
@XmlEnum
public enum ObstructionTypeEnum2 {


    /**
     * An air crash adjacent to the roadway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("airCrash")
    AIR_CRASH("airCrash"),

    /**
     * Children on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("childrenOnRoadway")
    CHILDREN_ON_ROADWAY("childrenOnRoadway"),

    /**
     * Clearance work associated with an earlier traffic problem which may cause traffic
     *             disruption.
     *           
     * 
     */
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),

    /**
     * A crane is operating either on or adjacent to the road which may cause an
     *             obstruction to traffic.
     *           
     * 
     */
    @XmlEnumValue("craneOperating")
    CRANE_OPERATING("craneOperating"),

    /**
     * Cyclists on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("cyclistsOnRoadway")
    CYCLISTS_ON_ROADWAY("cyclistsOnRoadway"),

    /**
     * Scattered fragments of wreckage or other material on the road.
     * 
     */
    @XmlEnumValue("debris")
    DEBRIS("debris"),

    /**
     * A situation where an explosive or incendiary device has gone off.
     *           
     * 
     */
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),

    /**
     * A situation where there is danger of an explosion which may cause disruption to
     *             traffic.
     *           
     * 
     */
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),

    /**
     * Unspecified hazard(s) on the road which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("hazardsOnTheRoad")
    HAZARDS_ON_THE_ROAD("hazardsOnTheRoad"),

    /**
     * Incidents are chance occurrences involving vehicles from the traffic stream, which
     *             could present potential hazards to road users. This item excludes accidents.
     *           
     * 
     */
    @XmlEnumValue("incident")
    INCIDENT("incident"),

    /**
     * Industrial accident near the roadway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("industrialAccident")
    INDUSTRIAL_ACCIDENT("industrialAccident"),

    /**
     * The road may be obstructed or traffic hindered due to objects laying on the
     *             roadway.
     *           
     * 
     */
    @XmlEnumValue("objectOnTheRoad")
    OBJECT_ON_THE_ROAD("objectOnTheRoad"),

    /**
     * Objects falling from moving vehicles which are presenting a hazard to other
     *             vehicles.
     *           
     * 
     */
    @XmlEnumValue("objectsFallingFromMovingVehicle")
    OBJECTS_FALLING_FROM_MOVING_VEHICLE("objectsFallingFromMovingVehicle"),

    /**
     * Unspecified obstruction on the roadway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("obstructionOnTheRoad")
    OBSTRUCTION_ON_THE_ROAD("obstructionOnTheRoad"),

    /**
     * People on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("peopleOnRoadway")
    PEOPLE_ON_ROADWAY("peopleOnRoadway"),

    /**
     * A rail crash adjacent to the roadway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("railCrash")
    RAIL_CRASH("railCrash"),

    /**
     * Work is being undertaken by emergency services which may present a hazard to road
     *             users.
     *           
     * 
     */
    @XmlEnumValue("rescueAndRecoveryWork")
    RESCUE_AND_RECOVERY_WORK("rescueAndRecoveryWork"),

    /**
     * Severe frost damage to the roadway causing an obstruction to traffic.
     *           
     * 
     */
    @XmlEnumValue("severeFrostDamagedRoadway")
    SEVERE_FROST_DAMAGED_ROADWAY("severeFrostDamagedRoadway"),

    /**
     * Spillage of transported goods on the roadway which may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("shedLoad")
    SHED_LOAD("shedLoad"),

    /**
     * Snow and ice debris on the roadway which may present a hazard to road users.
     *           
     * 
     */
    @XmlEnumValue("snowAndIceDebris")
    SNOW_AND_ICE_DEBRIS("snowAndIceDebris"),

    /**
     * Substances are spilling out from a moving vehicle which is presenting a hazard to
     *             other road users.
     *           
     * 
     */
    @XmlEnumValue("spillageOccurringFromMovingVehicle")
    SPILLAGE_OCCURRING_FROM_MOVING_VEHICLE("spillageOccurringFromMovingVehicle"),

    /**
     * Includes all situations where a spillage has occurred on the roadway due to an
     *             earlier incident.
     *           
     * 
     */
    @XmlEnumValue("spillageOnTheRoad")
    SPILLAGE_ON_THE_ROAD("spillageOnTheRoad"),

    /**
     * An accident area which has not been protected and may present a hazard to road
     *             users.
     *           
     * 
     */
    @XmlEnumValue("unprotectedAccidentArea")
    UNPROTECTED_ACCIDENT_AREA("unprotectedAccidentArea"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ObstructionTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObstructionTypeEnum2 fromValue(String v) {
        for (ObstructionTypeEnum2 c: ObstructionTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
