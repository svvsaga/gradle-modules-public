
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegulationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="permitted"/&gt;
 *     &lt;enumeration value="prohibited"/&gt;
 *     &lt;enumeration value="punishable"/&gt;
 *     &lt;enumeration value="seasonalHeterogeneous"/&gt;
 *     &lt;enumeration value="permittedOnlyAtParticularTimes"/&gt;
 *     &lt;enumeration value="permittedOnlyOnParticularAreas"/&gt;
 *     &lt;enumeration value="prohibitedAtParticularTimes"/&gt;
 *     &lt;enumeration value="prohibitedOnParticularAreas"/&gt;
 *     &lt;enumeration value="onlyOnRequest"/&gt;
 *     &lt;enumeration value="heterogeneous"/&gt;
 *     &lt;enumeration value="onlyOutsideBuildings"/&gt;
 *     &lt;enumeration value="onlyInsideBuildings"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegulationEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RegulationEnum {

    @XmlEnumValue("permitted")
    PERMITTED("permitted"),
    @XmlEnumValue("prohibited")
    PROHIBITED("prohibited"),
    @XmlEnumValue("punishable")
    PUNISHABLE("punishable"),
    @XmlEnumValue("seasonalHeterogeneous")
    SEASONAL_HETEROGENEOUS("seasonalHeterogeneous"),
    @XmlEnumValue("permittedOnlyAtParticularTimes")
    PERMITTED_ONLY_AT_PARTICULAR_TIMES("permittedOnlyAtParticularTimes"),
    @XmlEnumValue("permittedOnlyOnParticularAreas")
    PERMITTED_ONLY_ON_PARTICULAR_AREAS("permittedOnlyOnParticularAreas"),
    @XmlEnumValue("prohibitedAtParticularTimes")
    PROHIBITED_AT_PARTICULAR_TIMES("prohibitedAtParticularTimes"),
    @XmlEnumValue("prohibitedOnParticularAreas")
    PROHIBITED_ON_PARTICULAR_AREAS("prohibitedOnParticularAreas"),
    @XmlEnumValue("onlyOnRequest")
    ONLY_ON_REQUEST("onlyOnRequest"),
    @XmlEnumValue("heterogeneous")
    HETEROGENEOUS("heterogeneous"),
    @XmlEnumValue("onlyOutsideBuildings")
    ONLY_OUTSIDE_BUILDINGS("onlyOutsideBuildings"),
    @XmlEnumValue("onlyInsideBuildings")
    ONLY_INSIDE_BUILDINGS("onlyInsideBuildings"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RegulationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegulationEnum fromValue(String v) {
        for (RegulationEnum c: RegulationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
