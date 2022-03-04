
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc01LinearLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc01LinearLocationSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="segment"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01LinearLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01LinearLocationSubtypeEnum2 {

    @XmlEnumValue("segment")
    SEGMENT("segment"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TpegLoc01LinearLocationSubtypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01LinearLocationSubtypeEnum2 fromValue(String v) {
        for (TpegLoc01LinearLocationSubtypeEnum2 c: TpegLoc01LinearLocationSubtypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
