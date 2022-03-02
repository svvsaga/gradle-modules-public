
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfParkingSitesTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GroupOfParkingSitesTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="parkingArea"/&gt;
 *     &lt;enumeration value="truckParkingPriorityZone"/&gt;
 *     &lt;enumeration value="aggregationOfInformation"/&gt;
 *     &lt;enumeration value="inhabitantZone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupOfParkingSitesTypeEnum")
@XmlEnum
public enum GroupOfParkingSitesTypeEnum {

    @XmlEnumValue("parkingArea")
    PARKING_AREA("parkingArea"),
    @XmlEnumValue("truckParkingPriorityZone")
    TRUCK_PARKING_PRIORITY_ZONE("truckParkingPriorityZone"),
    @XmlEnumValue("aggregationOfInformation")
    AGGREGATION_OF_INFORMATION("aggregationOfInformation"),
    @XmlEnumValue("inhabitantZone")
    INHABITANT_ZONE("inhabitantZone");
    private final String value;

    GroupOfParkingSitesTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupOfParkingSitesTypeEnum fromValue(String v) {
        for (GroupOfParkingSitesTypeEnum c: GroupOfParkingSitesTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
