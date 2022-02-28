
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc03IlcPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TpegLoc03IlcPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tpegIlcName1"/&gt;
 *     &lt;enumeration value="tpegIlcName2"/&gt;
 *     &lt;enumeration value="tpegIlcName3"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03IlcPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03IlcPointDescriptorSubtypeEnum {


    /**
     * The name of the road on which the junction point is located.
     * 
     */
    @XmlEnumValue("tpegIlcName1")
    TPEG_ILC_NAME_1("tpegIlcName1"),

    /**
     * The name of the first intersecting road at the junction.
     * 
     */
    @XmlEnumValue("tpegIlcName2")
    TPEG_ILC_NAME_2("tpegIlcName2"),

    /**
     * The name of the second intersecting road (if one exists) at the junction.
     *           
     * 
     */
    @XmlEnumValue("tpegIlcName3")
    TPEG_ILC_NAME_3("tpegIlcName3"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TpegLoc03IlcPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03IlcPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03IlcPointDescriptorSubtypeEnum c: TpegLoc03IlcPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
