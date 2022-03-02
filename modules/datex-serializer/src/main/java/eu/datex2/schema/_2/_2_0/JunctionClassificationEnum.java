
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JunctionClassificationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="JunctionClassificationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="threeWayInterchange"/&gt;
 *     &lt;enumeration value="interchange"/&gt;
 *     &lt;enumeration value="motorwayConnection"/&gt;
 *     &lt;enumeration value="junction"/&gt;
 *     &lt;enumeration value="temporaryJunction"/&gt;
 *     &lt;enumeration value="borderCrossing"/&gt;
 *     &lt;enumeration value="junctionInOneDirection"/&gt;
 *     &lt;enumeration value="operationalServiceJunction"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JunctionClassificationEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum JunctionClassificationEnum {

    @XmlEnumValue("threeWayInterchange")
    THREE_WAY_INTERCHANGE("threeWayInterchange"),
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),
    @XmlEnumValue("motorwayConnection")
    MOTORWAY_CONNECTION("motorwayConnection"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("temporaryJunction")
    TEMPORARY_JUNCTION("temporaryJunction"),
    @XmlEnumValue("borderCrossing")
    BORDER_CROSSING("borderCrossing"),
    @XmlEnumValue("junctionInOneDirection")
    JUNCTION_IN_ONE_DIRECTION("junctionInOneDirection"),
    @XmlEnumValue("operationalServiceJunction")
    OPERATIONAL_SERVICE_JUNCTION("operationalServiceJunction"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    JunctionClassificationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JunctionClassificationEnum fromValue(String v) {
        for (JunctionClassificationEnum c: JunctionClassificationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
