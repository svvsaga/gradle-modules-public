
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingTypeOfGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingTypeOfGroup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="adjacentSpaces"/&gt;
 *     &lt;enumeration value="nonAdjacentSpaces"/&gt;
 *     &lt;enumeration value="completeFloor"/&gt;
 *     &lt;enumeration value="mixedUsage"/&gt;
 *     &lt;enumeration value="statisticsOnly"/&gt;
 *     &lt;enumeration value="singleParameters"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingTypeOfGroup", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingTypeOfGroup {

    @XmlEnumValue("adjacentSpaces")
    ADJACENT_SPACES("adjacentSpaces"),
    @XmlEnumValue("nonAdjacentSpaces")
    NON_ADJACENT_SPACES("nonAdjacentSpaces"),
    @XmlEnumValue("completeFloor")
    COMPLETE_FLOOR("completeFloor"),
    @XmlEnumValue("mixedUsage")
    MIXED_USAGE("mixedUsage"),
    @XmlEnumValue("statisticsOnly")
    STATISTICS_ONLY("statisticsOnly"),
    @XmlEnumValue("singleParameters")
    SINGLE_PARAMETERS("singleParameters"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingTypeOfGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingTypeOfGroup fromValue(String v) {
        for (ParkingTypeOfGroup c: ParkingTypeOfGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
