
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodedReasonForSettingMessageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CodedReasonForSettingMessageEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="situation"/&gt;
 *     &lt;enumeration value="operatorCreated"/&gt;
 *     &lt;enumeration value="trafficManagement"/&gt;
 *     &lt;enumeration value="travelTime"/&gt;
 *     &lt;enumeration value="campaign"/&gt;
 *     &lt;enumeration value="default"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodedReasonForSettingMessageEnum")
@XmlEnum
public enum CodedReasonForSettingMessageEnum {

    @XmlEnumValue("situation")
    SITUATION("situation"),
    @XmlEnumValue("operatorCreated")
    OPERATOR_CREATED("operatorCreated"),
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    CodedReasonForSettingMessageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodedReasonForSettingMessageEnum fromValue(String v) {
        for (CodedReasonForSettingMessageEnum c: CodedReasonForSettingMessageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
