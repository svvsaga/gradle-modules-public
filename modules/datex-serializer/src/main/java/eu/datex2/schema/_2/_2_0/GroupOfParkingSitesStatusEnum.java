
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfParkingSitesStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GroupOfParkingSitesStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allParkingsFull"/&gt;
 *     &lt;enumeration value="multiStoreyParkingsFull"/&gt;
 *     &lt;enumeration value="noMoreParkingSpacesAvailable"/&gt;
 *     &lt;enumeration value="enoughSpacesAvailable"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupOfParkingSitesStatusEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum GroupOfParkingSitesStatusEnum {

    @XmlEnumValue("allParkingsFull")
    ALL_PARKINGS_FULL("allParkingsFull"),
    @XmlEnumValue("multiStoreyParkingsFull")
    MULTI_STOREY_PARKINGS_FULL("multiStoreyParkingsFull"),
    @XmlEnumValue("noMoreParkingSpacesAvailable")
    NO_MORE_PARKING_SPACES_AVAILABLE("noMoreParkingSpacesAvailable"),
    @XmlEnumValue("enoughSpacesAvailable")
    ENOUGH_SPACES_AVAILABLE("enoughSpacesAvailable"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupOfParkingSitesStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupOfParkingSitesStatusEnum fromValue(String v) {
        for (GroupOfParkingSitesStatusEnum c: GroupOfParkingSitesStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
