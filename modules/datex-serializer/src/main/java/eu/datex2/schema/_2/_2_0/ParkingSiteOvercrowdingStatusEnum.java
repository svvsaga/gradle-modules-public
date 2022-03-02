
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSiteOvercrowdingStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSiteOvercrowdingStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="overcrowding"/&gt;
 *     &lt;enumeration value="noOvercrowding"/&gt;
 *     &lt;enumeration value="overcrowdingLevel1"/&gt;
 *     &lt;enumeration value="overcrowdingLevel2"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSiteOvercrowdingStatusEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingSiteOvercrowdingStatusEnum {

    @XmlEnumValue("overcrowding")
    OVERCROWDING("overcrowding"),
    @XmlEnumValue("noOvercrowding")
    NO_OVERCROWDING("noOvercrowding"),
    @XmlEnumValue("overcrowdingLevel1")
    OVERCROWDING_LEVEL_1("overcrowdingLevel1"),
    @XmlEnumValue("overcrowdingLevel2")
    OVERCROWDING_LEVEL_2("overcrowdingLevel2"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSiteOvercrowdingStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSiteOvercrowdingStatusEnum fromValue(String v) {
        for (ParkingSiteOvercrowdingStatusEnum c: ParkingSiteOvercrowdingStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
