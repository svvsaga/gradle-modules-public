
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasuredOrDerivedDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MeasuredOrDerivedDataTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="humidityInformation"/&gt;
 *     &lt;enumeration value="individualVehicleMeasurements"/&gt;
 *     &lt;enumeration value="pollutionInformation"/&gt;
 *     &lt;enumeration value="precipitationInformation"/&gt;
 *     &lt;enumeration value="pressureInformation"/&gt;
 *     &lt;enumeration value="roadSurfaceConditionInformation"/&gt;
 *     &lt;enumeration value="temperatureInformation"/&gt;
 *     &lt;enumeration value="trafficConcentration"/&gt;
 *     &lt;enumeration value="trafficFlow"/&gt;
 *     &lt;enumeration value="trafficGap"/&gt;
 *     &lt;enumeration value="trafficHeadway"/&gt;
 *     &lt;enumeration value="trafficSpeed"/&gt;
 *     &lt;enumeration value="trafficStatusInformation"/&gt;
 *     &lt;enumeration value="travelTimeInformation"/&gt;
 *     &lt;enumeration value="visibilityInformation"/&gt;
 *     &lt;enumeration value="windInformation"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasuredOrDerivedDataTypeEnum")
@XmlEnum
public enum MeasuredOrDerivedDataTypeEnum2 {

    @XmlEnumValue("humidityInformation")
    HUMIDITY_INFORMATION("humidityInformation"),
    @XmlEnumValue("individualVehicleMeasurements")
    INDIVIDUAL_VEHICLE_MEASUREMENTS("individualVehicleMeasurements"),
    @XmlEnumValue("pollutionInformation")
    POLLUTION_INFORMATION("pollutionInformation"),
    @XmlEnumValue("precipitationInformation")
    PRECIPITATION_INFORMATION("precipitationInformation"),
    @XmlEnumValue("pressureInformation")
    PRESSURE_INFORMATION("pressureInformation"),
    @XmlEnumValue("roadSurfaceConditionInformation")
    ROAD_SURFACE_CONDITION_INFORMATION("roadSurfaceConditionInformation"),
    @XmlEnumValue("temperatureInformation")
    TEMPERATURE_INFORMATION("temperatureInformation"),
    @XmlEnumValue("trafficConcentration")
    TRAFFIC_CONCENTRATION("trafficConcentration"),
    @XmlEnumValue("trafficFlow")
    TRAFFIC_FLOW("trafficFlow"),
    @XmlEnumValue("trafficGap")
    TRAFFIC_GAP("trafficGap"),
    @XmlEnumValue("trafficHeadway")
    TRAFFIC_HEADWAY("trafficHeadway"),
    @XmlEnumValue("trafficSpeed")
    TRAFFIC_SPEED("trafficSpeed"),
    @XmlEnumValue("trafficStatusInformation")
    TRAFFIC_STATUS_INFORMATION("trafficStatusInformation"),
    @XmlEnumValue("travelTimeInformation")
    TRAVEL_TIME_INFORMATION("travelTimeInformation"),
    @XmlEnumValue("visibilityInformation")
    VISIBILITY_INFORMATION("visibilityInformation"),
    @XmlEnumValue("windInformation")
    WIND_INFORMATION("windInformation"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    MeasuredOrDerivedDataTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasuredOrDerivedDataTypeEnum2 fromValue(String v) {
        for (MeasuredOrDerivedDataTypeEnum2 c: MeasuredOrDerivedDataTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
