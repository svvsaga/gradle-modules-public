
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOperatorServiceDisruptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadOperatorServiceDisruptionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="emergencyTelephoneNumberOutOfService"/&gt;
 *     &lt;enumeration value="informationServiceTelephoneNumberOutOfService"/&gt;
 *     &lt;enumeration value="noTrafficOfficerPatrolService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadOperatorServiceDisruptionTypeEnum")
@XmlEnum
public enum RoadOperatorServiceDisruptionTypeEnum {

    @XmlEnumValue("emergencyTelephoneNumberOutOfService")
    EMERGENCY_TELEPHONE_NUMBER_OUT_OF_SERVICE("emergencyTelephoneNumberOutOfService"),
    @XmlEnumValue("informationServiceTelephoneNumberOutOfService")
    INFORMATION_SERVICE_TELEPHONE_NUMBER_OUT_OF_SERVICE("informationServiceTelephoneNumberOutOfService"),
    @XmlEnumValue("noTrafficOfficerPatrolService")
    NO_TRAFFIC_OFFICER_PATROL_SERVICE("noTrafficOfficerPatrolService");
    private final String value;

    RoadOperatorServiceDisruptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadOperatorServiceDisruptionTypeEnum fromValue(String v) {
        for (RoadOperatorServiceDisruptionTypeEnum c: RoadOperatorServiceDisruptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
