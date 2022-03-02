
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccidentCauseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccidentCauseEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="avoidanceOfObstacles"/&gt;
 *     &lt;enumeration value="driverDistraction"/&gt;
 *     &lt;enumeration value="driverDrugAbuse"/&gt;
 *     &lt;enumeration value="driverIllness"/&gt;
 *     &lt;enumeration value="exceedingSpeedsLimits"/&gt;
 *     &lt;enumeration value="excessAlcohol"/&gt;
 *     &lt;enumeration value="excessiveDriverTiredness"/&gt;
 *     &lt;enumeration value="impermissibleManoeuvre"/&gt;
 *     &lt;enumeration value="limitedVisibility"/&gt;
 *     &lt;enumeration value="notKeepingASafeDistance"/&gt;
 *     &lt;enumeration value="onTheWrongSideOfTheRoad"/&gt;
 *     &lt;enumeration value="pedestrianInRoad"/&gt;
 *     &lt;enumeration value="poorLaneAdherence"/&gt;
 *     &lt;enumeration value="poorMergeEntryOrExitJudgement"/&gt;
 *     &lt;enumeration value="poorRoadSurfaceCondition"/&gt;
 *     &lt;enumeration value="poorSurfaceAdherence"/&gt;
 *     &lt;enumeration value="undisclosed"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="vehicleFailure"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccidentCauseEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum AccidentCauseEnum2 {


    /**
     * Avoidance of obstacles on the roadway.
     * 
     */
    @XmlEnumValue("avoidanceOfObstacles")
    AVOIDANCE_OF_OBSTACLES("avoidanceOfObstacles"),

    /**
     * Driver distraction.
     * 
     */
    @XmlEnumValue("driverDistraction")
    DRIVER_DISTRACTION("driverDistraction"),

    /**
     * Driver under the influence of drugs.
     * 
     */
    @XmlEnumValue("driverDrugAbuse")
    DRIVER_DRUG_ABUSE("driverDrugAbuse"),

    /**
     * Driver illness.
     * 
     */
    @XmlEnumValue("driverIllness")
    DRIVER_ILLNESS("driverIllness"),

    /**
     * Loss of vehicle control due to excessive vehicle speed.
     * 
     */
    @XmlEnumValue("exceedingSpeedsLimits")
    EXCEEDING_SPEEDS_LIMITS("exceedingSpeedsLimits"),

    /**
     * Driver abilities reduced due to driving under the influence of alcohol. Alcohol
     *             levels above nationally accepted limit.
     *           
     * 
     */
    @XmlEnumValue("excessAlcohol")
    EXCESS_ALCOHOL("excessAlcohol"),

    /**
     * Excessive tiredness of the driver.
     * 
     */
    @XmlEnumValue("excessiveDriverTiredness")
    EXCESSIVE_DRIVER_TIREDNESS("excessiveDriverTiredness"),

    /**
     * A driving manoeuvre which was not permitted.
     * 
     */
    @XmlEnumValue("impermissibleManoeuvre")
    IMPERMISSIBLE_MANOEUVRE("impermissibleManoeuvre"),

    /**
     * Limited or impaired visibility.
     * 
     */
    @XmlEnumValue("limitedVisibility")
    LIMITED_VISIBILITY("limitedVisibility"),

    /**
     * Not keeping a safe distance from the vehicle in front.
     * 
     */
    @XmlEnumValue("notKeepingASafeDistance")
    NOT_KEEPING_A_SAFE_DISTANCE("notKeepingASafeDistance"),

    /**
     * Driving on the wrong side of the road.
     * 
     */
    @XmlEnumValue("onTheWrongSideOfTheRoad")
    ON_THE_WRONG_SIDE_OF_THE_ROAD("onTheWrongSideOfTheRoad"),

    /**
     * Pedestrian in the roadway.
     * 
     */
    @XmlEnumValue("pedestrianInRoad")
    PEDESTRIAN_IN_ROAD("pedestrianInRoad"),

    /**
     * Not keeping to lane.
     * 
     */
    @XmlEnumValue("poorLaneAdherence")
    POOR_LANE_ADHERENCE("poorLaneAdherence"),

    /**
     * Poor judgement when merging at an entry or exit point of a carriageway or
     *             junction.
     *           
     * 
     */
    @XmlEnumValue("poorMergeEntryOrExitJudgement")
    POOR_MERGE_ENTRY_OR_EXIT_JUDGEMENT("poorMergeEntryOrExitJudgement"),

    /**
     * Poor road surface condition.
     * 
     */
    @XmlEnumValue("poorRoadSurfaceCondition")
    POOR_ROAD_SURFACE_CONDITION("poorRoadSurfaceCondition"),

    /**
     * Poor road surface adherence.
     * 
     */
    @XmlEnumValue("poorSurfaceAdherence")
    POOR_SURFACE_ADHERENCE("poorSurfaceAdherence"),

    /**
     * Undisclosed cause.
     * 
     */
    @XmlEnumValue("undisclosed")
    UNDISCLOSED("undisclosed"),

    /**
     * Unknown cause.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Malfunction or failure of vehicle function.
     * 
     */
    @XmlEnumValue("vehicleFailure")
    VEHICLE_FAILURE("vehicleFailure"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    AccidentCauseEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentCauseEnum2 fromValue(String v) {
        for (AccidentCauseEnum2 c: AccidentCauseEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
