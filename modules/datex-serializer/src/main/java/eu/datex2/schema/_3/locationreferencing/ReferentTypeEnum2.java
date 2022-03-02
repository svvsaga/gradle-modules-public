
package eu.datex2.schema._3.locationreferencing;

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
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReferentTypeEnum")
@XmlEnum
public enum ReferentTypeEnum2 {


    /**
     * A boundary between two jurisdictional or administrative areas. These may be legal
     *             boundaries such as between counties or countries, maintenance responsibility boundaries or
     *             control boundaries.
     *           
     * 
     */
    @XmlEnumValue("boundary")
    BOUNDARY("boundary"),

    /**
     * A crossing of two or more roads where the precise point of intersection is defined
     *             according to specific business rules.
     *           
     * 
     */
    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),

    /**
     * A marker which is usually but not necessarily physical that is one of a sequence
     *             which are spaced out along the linear object (road) to provide a location reference. The spacing
     *             of markers is not necessarily even.
     *           
     * 
     */
    @XmlEnumValue("referenceMarker")
    REFERENCE_MARKER("referenceMarker"),

    /**
     * A visible identifiable physical landmark either alongside or close to the linear
     *             object.
     *           
     * 
     */
    @XmlEnumValue("landmark")
    LANDMARK("landmark"),

    /**
     * A topological node defined on a road network. Such nodes may delineate the
     *             segmentation of the road network according to defined business rules or may constitute a purely
     *             topological representation of a road network.
     *           
     * 
     */
    @XmlEnumValue("roadNode")
    ROAD_NODE("roadNode"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ReferentTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferentTypeEnum2 fromValue(String v) {
        for (ReferentTypeEnum2 c: ReferentTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
