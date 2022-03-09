
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

    @XmlEnumValue("cancellations")
    CANCELLATIONS("cancellations"),
    @XmlEnumValue("delayDueToBadWeather")
    DELAY_DUE_TO_BAD_WEATHER("delayDueToBadWeather"),
    @XmlEnumValue("delayDueToRepairs")
    DELAY_DUE_TO_REPAIRS("delayDueToRepairs"),
    @XmlEnumValue("delayedUntilFurtherNotice")
    DELAYED_UNTIL_FURTHER_NOTICE("delayedUntilFurtherNotice"),
    @XmlEnumValue("delaysDueToFlotsam")
    DELAYS_DUE_TO_FLOTSAM("delaysDueToFlotsam"),
    @XmlEnumValue("departureOnSchedule")
    DEPARTURE_ON_SCHEDULE("departureOnSchedule"),
    @XmlEnumValue("ferryReplacedByIceRoad")
    FERRY_REPLACED_BY_ICE_ROAD("ferryReplacedByIceRoad"),
    @XmlEnumValue("freeShuttleServiceOperating")
    FREE_SHUTTLE_SERVICE_OPERATING("freeShuttleServiceOperating"),
    @XmlEnumValue("informationServiceNotAvailable")
    INFORMATION_SERVICE_NOT_AVAILABLE("informationServiceNotAvailable"),
    @XmlEnumValue("irregularServiceDelays")
    IRREGULAR_SERVICE_DELAYS("irregularServiceDelays"),
    @XmlEnumValue("loadCapacityChanged")
    LOAD_CAPACITY_CHANGED("loadCapacityChanged"),
    @XmlEnumValue("restrictionsForLongerVehicles")
    RESTRICTIONS_FOR_LONGER_VEHICLES("restrictionsForLongerVehicles"),
    @XmlEnumValue("serviceDelays")
    SERVICE_DELAYS("serviceDelays"),
    @XmlEnumValue("serviceDelaysOfUncertainDuration")
    SERVICE_DELAYS_OF_UNCERTAIN_DURATION("serviceDelaysOfUncertainDuration"),
    @XmlEnumValue("serviceFullyBooked")
    SERVICE_FULLY_BOOKED("serviceFullyBooked"),
    @XmlEnumValue("serviceNotOperating")
    SERVICE_NOT_OPERATING("serviceNotOperating"),
    @XmlEnumValue("serviceNotOperatingSubstituteServiceAvailable")
    SERVICE_NOT_OPERATING_SUBSTITUTE_SERVICE_AVAILABLE("serviceNotOperatingSubstituteServiceAvailable"),
    @XmlEnumValue("serviceSuspended")
    SERVICE_SUSPENDED("serviceSuspended"),
    @XmlEnumValue("serviceWithdrawn")
    SERVICE_WITHDRAWN("serviceWithdrawn"),
    @XmlEnumValue("shuttleServiceOperating")
    SHUTTLE_SERVICE_OPERATING("shuttleServiceOperating"),
    @XmlEnumValue("temporaryChangesToTimetables")
    TEMPORARY_CHANGES_TO_TIMETABLES("temporaryChangesToTimetables"),
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
