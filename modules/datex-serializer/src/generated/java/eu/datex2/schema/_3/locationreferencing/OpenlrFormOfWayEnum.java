
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrFormOfWayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OpenlrFormOfWayEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="motorway"/&gt;
 *     &lt;enumeration value="multipleCarriageway"/&gt;
 *     &lt;enumeration value="singleCarriageway"/&gt;
 *     &lt;enumeration value="roundabout"/&gt;
 *     &lt;enumeration value="slipRoad"/&gt;
 *     &lt;enumeration value="trafficSquare"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrFormOfWayEnum")
@XmlEnum
public enum OpenlrFormOfWayEnum {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("multipleCarriageway")
    MULTIPLE_CARRIAGEWAY("multipleCarriageway"),
    @XmlEnumValue("singleCarriageway")
    SINGLE_CARRIAGEWAY("singleCarriageway"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("slipRoad")
    SLIP_ROAD("slipRoad"),
    @XmlEnumValue("trafficSquare")
    TRAFFIC_SQUARE("trafficSquare"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    OpenlrFormOfWayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrFormOfWayEnum fromValue(String v) {
        for (OpenlrFormOfWayEnum c: OpenlrFormOfWayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
