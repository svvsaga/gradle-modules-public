
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PersonCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="adult"/&gt;
 *     &lt;enumeration value="child"/&gt;
 *     &lt;enumeration value="emergencyServicesPerson"/&gt;
 *     &lt;enumeration value="fireman"/&gt;
 *     &lt;enumeration value="infant"/&gt;
 *     &lt;enumeration value="medicalStaff"/&gt;
 *     &lt;enumeration value="memberOfThePublic"/&gt;
 *     &lt;enumeration value="policeman"/&gt;
 *     &lt;enumeration value="politician"/&gt;
 *     &lt;enumeration value="publicTransportPassenger"/&gt;
 *     &lt;enumeration value="sickPerson"/&gt;
 *     &lt;enumeration value="trafficOfficer"/&gt;
 *     &lt;enumeration value="trafficWarden"/&gt;
 *     &lt;enumeration value="veryImportantPerson"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonCategoryEnum")
@XmlEnum
public enum PersonCategoryEnum2 {

    @XmlEnumValue("adult")
    ADULT("adult"),
    @XmlEnumValue("child")
    CHILD("child"),
    @XmlEnumValue("emergencyServicesPerson")
    EMERGENCY_SERVICES_PERSON("emergencyServicesPerson"),
    @XmlEnumValue("fireman")
    FIREMAN("fireman"),
    @XmlEnumValue("infant")
    INFANT("infant"),
    @XmlEnumValue("medicalStaff")
    MEDICAL_STAFF("medicalStaff"),
    @XmlEnumValue("memberOfThePublic")
    MEMBER_OF_THE_PUBLIC("memberOfThePublic"),
    @XmlEnumValue("policeman")
    POLICEMAN("policeman"),
    @XmlEnumValue("politician")
    POLITICIAN("politician"),
    @XmlEnumValue("publicTransportPassenger")
    PUBLIC_TRANSPORT_PASSENGER("publicTransportPassenger"),
    @XmlEnumValue("sickPerson")
    SICK_PERSON("sickPerson"),
    @XmlEnumValue("trafficOfficer")
    TRAFFIC_OFFICER("trafficOfficer"),
    @XmlEnumValue("trafficWarden")
    TRAFFIC_WARDEN("trafficWarden"),
    @XmlEnumValue("veryImportantPerson")
    VERY_IMPORTANT_PERSON("veryImportantPerson"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PersonCategoryEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonCategoryEnum2 fromValue(String v) {
        for (PersonCategoryEnum2 c: PersonCategoryEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
