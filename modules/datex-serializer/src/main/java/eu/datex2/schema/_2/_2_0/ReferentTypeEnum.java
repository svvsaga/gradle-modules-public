
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReferentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="boundary"/&gt;
 *     &lt;enumeration value="intersection"/&gt;
 *     &lt;enumeration value="referenceMarker"/&gt;
 *     &lt;enumeration value="landmark"/&gt;
 *     &lt;enumeration value="roadNode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReferentTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ReferentTypeEnum {

    @XmlEnumValue("boundary")
    BOUNDARY("boundary"),
    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),
    @XmlEnumValue("referenceMarker")
    REFERENCE_MARKER("referenceMarker"),
    @XmlEnumValue("landmark")
    LANDMARK("landmark"),
    @XmlEnumValue("roadNode")
    ROAD_NODE("roadNode");
    private final String value;

    ReferentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferentTypeEnum fromValue(String v) {
        for (ReferentTypeEnum c: ReferentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
