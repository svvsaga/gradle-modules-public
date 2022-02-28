
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc03JunctionPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc03JunctionPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="junctionName"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03JunctionPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03JunctionPointDescriptorSubtypeEnum {


    /**
     * Name of a road network junction where two or more roads join.
     * 
     */
    @XmlEnumValue("junctionName")
    JUNCTION_NAME("junctionName"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TpegLoc03JunctionPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03JunctionPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03JunctionPointDescriptorSubtypeEnum c: TpegLoc03JunctionPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
