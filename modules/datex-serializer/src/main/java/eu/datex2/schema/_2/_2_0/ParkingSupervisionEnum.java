
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSupervisionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSupervisionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="remote"/&gt;
 *     &lt;enumeration value="onSite"/&gt;
 *     &lt;enumeration value="controlCentreOnSite"/&gt;
 *     &lt;enumeration value="controlCentreOffSite"/&gt;
 *     &lt;enumeration value="patrol"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSupervisionEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ParkingSupervisionEnum {

    @XmlEnumValue("remote")
    REMOTE("remote"),
    @XmlEnumValue("onSite")
    ON_SITE("onSite"),
    @XmlEnumValue("controlCentreOnSite")
    CONTROL_CENTRE_ON_SITE("controlCentreOnSite"),
    @XmlEnumValue("controlCentreOffSite")
    CONTROL_CENTRE_OFF_SITE("controlCentreOffSite"),
    @XmlEnumValue("patrol")
    PATROL("patrol"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSupervisionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSupervisionEnum fromValue(String v) {
        for (ParkingSupervisionEnum c: ParkingSupervisionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
