
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTimeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TravelTimeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="best"/&gt;
 *     &lt;enumeration value="estimated"/&gt;
 *     &lt;enumeration value="instantaneous"/&gt;
 *     &lt;enumeration value="reconstituted"/&gt;
 *     &lt;enumeration value="predictor"/&gt;
 *     &lt;enumeration value="profile"/&gt;
 *     &lt;enumeration value="sum"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTypeEnum")
@XmlEnum
public enum TravelTimeTypeEnum {

    @XmlEnumValue("best")
    BEST("best"),
    @XmlEnumValue("estimated")
    ESTIMATED("estimated"),
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("reconstituted")
    RECONSTITUTED("reconstituted"),
    @XmlEnumValue("predictor")
    PREDICTOR("predictor"),
    @XmlEnumValue("profile")
    PROFILE("profile"),
    @XmlEnumValue("sum")
    SUM("sum"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TravelTimeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTypeEnum fromValue(String v) {
        for (TravelTimeTypeEnum c: TravelTimeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
