
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc01SimplePointLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc01SimplePointLocationSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intersection"/&gt;
 *     &lt;enumeration value="nonLinkedPoint"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01SimplePointLocationSubtypeEnum", namespace = "http://datex2.eu/schema/3/locationReferencing")
@XmlEnum
public enum TpegLoc01SimplePointLocationSubtypeEnum2 {


    /**
     * An point on the road network at which one or more roads intersect.
     *           
     * 
     */
    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),

    /**
     * A point on the road network which is not at a junction or intersection.
     *           
     * 
     */
    @XmlEnumValue("nonLinkedPoint")
    NON_LINKED_POINT("nonLinkedPoint"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TpegLoc01SimplePointLocationSubtypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01SimplePointLocationSubtypeEnum2 fromValue(String v) {
        for (TpegLoc01SimplePointLocationSubtypeEnum2 c: TpegLoc01SimplePointLocationSubtypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
