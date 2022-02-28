
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitServiceInformationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransitServiceInformationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cancellations"/&gt;
 *     &lt;enumeration value="delayDueToBadWeather"/&gt;
 *     &lt;enumeration value="delayDueToRepairs"/&gt;
 *     &lt;enumeration value="delayedUntilFurtherNotice"/&gt;
 *     &lt;enumeration value="delaysDueToFlotsam"/&gt;
 *     &lt;enumeration value="departureOnSchedule"/&gt;
 *     &lt;enumeration value="ferryReplacedByIceRoad"/&gt;
 *     &lt;enumeration value="freeShuttleServiceOperating"/&gt;
 *     &lt;enumeration value="informationServiceNotAvailable"/&gt;
 *     &lt;enumeration value="irregularServiceDelays"/&gt;
 *     &lt;enumeration value="loadCapacityChanged"/&gt;
 *     &lt;enumeration value="restrictionsForLongerVehicles"/&gt;
 *     &lt;enumeration value="serviceDelays"/&gt;
 *     &lt;enumeration value="serviceDelaysOfUncertainDuration"/&gt;
 *     &lt;enumeration value="serviceFullyBooked"/&gt;
 *     &lt;enumeration value="serviceNotOperating"/&gt;
 *     &lt;enumeration value="serviceNotOperatingSubstituteServiceAvailable"/&gt;
 *     &lt;enumeration value="serviceSuspended"/&gt;
 *     &lt;enumeration value="serviceWithdrawn"/&gt;
 *     &lt;enumeration value="shuttleServiceOperating"/&gt;
 *     &lt;enumeration value="temporaryChangesToTimetables"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitServiceInformationEnum")
@XmlEnum
public enum TransitServiceInformationEnum {


    /**
     * Public transport, park-and-ride, rail or bus services are cancelled.
     *           
     * 
     */
    @XmlEnumValue("cancellations")
    CANCELLATIONS("cancellations"),

    /**
     * The specified service is delayed due to bad weather.
     * 
     */
    @XmlEnumValue("delayDueToBadWeather")
    DELAY_DUE_TO_BAD_WEATHER("delayDueToBadWeather"),

    /**
     * The specified service is delayed due to the need for repairs.
     * 
     */
    @XmlEnumValue("delayDueToRepairs")
    DELAY_DUE_TO_REPAIRS("delayDueToRepairs"),

    /**
     * The specified public transport service will be delayed until further notice.
     *           
     * 
     */
    @XmlEnumValue("delayedUntilFurtherNotice")
    DELAYED_UNTIL_FURTHER_NOTICE("delayedUntilFurtherNotice"),

    /**
     * The departure of the specified ferry service is delayed due to flotsam.
     *           
     * 
     */
    @XmlEnumValue("delaysDueToFlotsam")
    DELAYS_DUE_TO_FLOTSAM("delaysDueToFlotsam"),

    /**
     * The departure of the specified service is on schedule.
     * 
     */
    @XmlEnumValue("departureOnSchedule")
    DEPARTURE_ON_SCHEDULE("departureOnSchedule"),

    /**
     * The ferry service has been replaced by an ice road.
     * 
     */
    @XmlEnumValue("ferryReplacedByIceRoad")
    FERRY_REPLACED_BY_ICE_ROAD("ferryReplacedByIceRoad"),

    /**
     * A shuttle service is operating at no charge between specified locations.
     *           
     * 
     */
    @XmlEnumValue("freeShuttleServiceOperating")
    FREE_SHUTTLE_SERVICE_OPERATING("freeShuttleServiceOperating"),

    /**
     * The information service relating to the specified transport system is not
     *             currently available.
     *           
     * 
     */
    @XmlEnumValue("informationServiceNotAvailable")
    INFORMATION_SERVICE_NOT_AVAILABLE("informationServiceNotAvailable"),

    /**
     * The specified service is subject to irregular delays.
     * 
     */
    @XmlEnumValue("irregularServiceDelays")
    IRREGULAR_SERVICE_DELAYS("irregularServiceDelays"),

    /**
     * The load capacity for the specified service has been changed.
     * 
     */
    @XmlEnumValue("loadCapacityChanged")
    LOAD_CAPACITY_CHANGED("loadCapacityChanged"),

    /**
     * Long vehicles are subject to restrictions on the specified service.
     *           
     * 
     */
    @XmlEnumValue("restrictionsForLongerVehicles")
    RESTRICTIONS_FOR_LONGER_VEHICLES("restrictionsForLongerVehicles"),

    /**
     * The specified service is subject to delays.
     * 
     */
    @XmlEnumValue("serviceDelays")
    SERVICE_DELAYS("serviceDelays"),

    /**
     * The specified service is subject to delays whose predicted duration cannot be
     *             estimated accurately.
     *           
     * 
     */
    @XmlEnumValue("serviceDelaysOfUncertainDuration")
    SERVICE_DELAYS_OF_UNCERTAIN_DURATION("serviceDelaysOfUncertainDuration"),

    /**
     * The departure of the specified service is fully booked.
     * 
     */
    @XmlEnumValue("serviceFullyBooked")
    SERVICE_FULLY_BOOKED("serviceFullyBooked"),

    /**
     * The specified service is not operating.
     * 
     */
    @XmlEnumValue("serviceNotOperating")
    SERVICE_NOT_OPERATING("serviceNotOperating"),

    /**
     * The specified service is not operating but an alternative service is available.
     *           
     * 
     */
    @XmlEnumValue("serviceNotOperatingSubstituteServiceAvailable")
    SERVICE_NOT_OPERATING_SUBSTITUTE_SERVICE_AVAILABLE("serviceNotOperatingSubstituteServiceAvailable"),

    /**
     * The specified service has been suspended.
     * 
     */
    @XmlEnumValue("serviceSuspended")
    SERVICE_SUSPENDED("serviceSuspended"),

    /**
     * The specified service has been cancelled.
     * 
     */
    @XmlEnumValue("serviceWithdrawn")
    SERVICE_WITHDRAWN("serviceWithdrawn"),

    /**
     * A shuttle service is operating between the specified locations.
     * 
     */
    @XmlEnumValue("shuttleServiceOperating")
    SHUTTLE_SERVICE_OPERATING("shuttleServiceOperating"),

    /**
     * The timetable for the specified service is subject to temporary changes.
     *           
     * 
     */
    @XmlEnumValue("temporaryChangesToTimetables")
    TEMPORARY_CHANGES_TO_TIMETABLES("temporaryChangesToTimetables"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TransitServiceInformationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitServiceInformationEnum fromValue(String v) {
        for (TransitServiceInformationEnum c: TransitServiceInformationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
