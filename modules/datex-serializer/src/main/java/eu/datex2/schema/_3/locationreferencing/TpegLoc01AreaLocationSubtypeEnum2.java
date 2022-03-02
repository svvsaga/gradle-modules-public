
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc01AreaLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc01AreaLocationSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="largeArea"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01AreaLocationSubtypeEnum", namespace = "http://datex2.eu/schema/3/locationReferencing")
@XmlEnum
public enum TpegLoc01AreaLocationSubtypeEnum2 {


    /**
     * A geographic or geometric large area.
     * 
     */
    @XmlEnumValue("largeArea")
    LARGE_AREA("largeArea"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TpegLoc01AreaLocationSubtypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01AreaLocationSubtypeEnum2 fromValue(String v) {
        for (TpegLoc01AreaLocationSubtypeEnum2 c: TpegLoc01AreaLocationSubtypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
