
package eu.datex2.schema._2._2_0;

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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01AreaLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01AreaLocationSubtypeEnum {

    @XmlEnumValue("largeArea")
    LARGE_AREA("largeArea"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc01AreaLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01AreaLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01AreaLocationSubtypeEnum c: TpegLoc01AreaLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
