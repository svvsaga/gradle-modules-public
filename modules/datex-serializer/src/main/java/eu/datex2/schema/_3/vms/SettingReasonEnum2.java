
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettingReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SettingReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="situation"/&gt;
 *     &lt;enumeration value="operatorCreated"/&gt;
 *     &lt;enumeration value="trafficManagement"/&gt;
 *     &lt;enumeration value="travelTime"/&gt;
 *     &lt;enumeration value="campaign"/&gt;
 *     &lt;enumeration value="default"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettingReasonEnum", namespace = "http://datex2.eu/schema/3/vms")
@XmlEnum
public enum SettingReasonEnum2 {


    /**
     * Message selected as the result of a situation occuring either on or off the road
     *             which might affect road users.
     *           
     * 
     */
    @XmlEnumValue("situation")
    SITUATION("situation"),

    /**
     * Message selected by operator as the result of an unmanaged event or situation.
     *           
     * 
     */
    @XmlEnumValue("operatorCreated")
    OPERATOR_CREATED("operatorCreated"),

    /**
     * Message selected as part of the implementation of a traffic management action.
     *             This can be part of a specific traffic management or diversion plan.
     *           
     * 
     */
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),

    /**
     * The VMS is currently selected to display travel times.
     * 
     */
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),

    /**
     * The VMS is currently selected to display a campaign message.
     * 
     */
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),

    /**
     * The VMS is currently selected to display default information (e.g. time, date,
     *             temperature).
     *           
     * 
     */
    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    SettingReasonEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettingReasonEnum2 fromValue(String v) {
        for (SettingReasonEnum2 c: SettingReasonEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
