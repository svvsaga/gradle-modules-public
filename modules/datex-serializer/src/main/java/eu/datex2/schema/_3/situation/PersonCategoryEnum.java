
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
public enum PersonCategoryEnum {


    /**
     * Adult.
     * 
     */
    @XmlEnumValue("adult")
    ADULT("adult"),

    /**
     * Child (age 4 to 17).
     * 
     */
    @XmlEnumValue("child")
    CHILD("child"),

    /**
     * A member of the emergency services, other than the police.
     * 
     */
    @XmlEnumValue("emergencyServicesPerson")
    EMERGENCY_SERVICES_PERSON("emergencyServicesPerson"),

    /**
     * A member of the fire service.
     * 
     */
    @XmlEnumValue("fireman")
    FIREMAN("fireman"),

    /**
     * Infant (age 0 to 3).
     * 
     */
    @XmlEnumValue("infant")
    INFANT("infant"),

    /**
     * A member of the medical service.
     * 
     */
    @XmlEnumValue("medicalStaff")
    MEDICAL_STAFF("medicalStaff"),

    /**
     * A member of the general public.
     * 
     */
    @XmlEnumValue("memberOfThePublic")
    MEMBER_OF_THE_PUBLIC("memberOfThePublic"),

    /**
     * A member of the police force.
     * 
     */
    @XmlEnumValue("policeman")
    POLICEMAN("policeman"),

    /**
     * A politician.
     * 
     */
    @XmlEnumValue("politician")
    POLITICIAN("politician"),

    /**
     * A passenger on or from a public transport vehicle.
     * 
     */
    @XmlEnumValue("publicTransportPassenger")
    PUBLIC_TRANSPORT_PASSENGER("publicTransportPassenger"),

    /**
     * A sick person.
     * 
     */
    @XmlEnumValue("sickPerson")
    SICK_PERSON("sickPerson"),

    /**
     * A traffic patrol officer of the road authority.
     * 
     */
    @XmlEnumValue("trafficOfficer")
    TRAFFIC_OFFICER("trafficOfficer"),

    /**
     * A member of the local traffic warden service.
     * 
     */
    @XmlEnumValue("trafficWarden")
    TRAFFIC_WARDEN("trafficWarden"),

    /**
     * A very important person.
     * 
     */
    @XmlEnumValue("veryImportantPerson")
    VERY_IMPORTANT_PERSON("veryImportantPerson"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PersonCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonCategoryEnum fromValue(String v) {
        for (PersonCategoryEnum c: PersonCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
