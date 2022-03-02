
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingDurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingDurationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pickUpDropOff"/&gt;
 *     &lt;enumeration value="shortTerm"/&gt;
 *     &lt;enumeration value="shortTerm24hours"/&gt;
 *     &lt;enumeration value="shortTerm48hours"/&gt;
 *     &lt;enumeration value="shortTerm72hours"/&gt;
 *     &lt;enumeration value="shortTerm96hours"/&gt;
 *     &lt;enumeration value="longTerm"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingDurationEnum")
@XmlEnum
public enum ParkingDurationEnum {

    @XmlEnumValue("pickUpDropOff")
    PICK_UP_DROP_OFF("pickUpDropOff"),
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm"),
    @XmlEnumValue("shortTerm24hours")
    SHORT_TERM_24_HOURS("shortTerm24hours"),
    @XmlEnumValue("shortTerm48hours")
    SHORT_TERM_48_HOURS("shortTerm48hours"),
    @XmlEnumValue("shortTerm72hours")
    SHORT_TERM_72_HOURS("shortTerm72hours"),
    @XmlEnumValue("shortTerm96hours")
    SHORT_TERM_96_HOURS("shortTerm96hours"),
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingDurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingDurationEnum fromValue(String v) {
        for (ParkingDurationEnum c: ParkingDurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
