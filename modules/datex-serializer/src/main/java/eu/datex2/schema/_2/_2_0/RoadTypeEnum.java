
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="motorway"/&gt;
 *     &lt;enumeration value="trunkRoad"/&gt;
 *     &lt;enumeration value="mainRoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RoadTypeEnum {

    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("trunkRoad")
    TRUNK_ROAD("trunkRoad"),
    @XmlEnumValue("mainRoad")
    MAIN_ROAD("mainRoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadTypeEnum fromValue(String v) {
        for (RoadTypeEnum c: RoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
