
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbnormalTrafficTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AbnormalTrafficTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stationaryTraffic"/&gt;
 *     &lt;enumeration value="queuingTraffic"/&gt;
 *     &lt;enumeration value="slowTraffic"/&gt;
 *     &lt;enumeration value="heavyTraffic"/&gt;
 *     &lt;enumeration value="unspecifiedAbnormalTraffic"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AbnormalTrafficTypeEnum")
@XmlEnum
public enum AbnormalTrafficTypeEnum {

    @XmlEnumValue("stationaryTraffic")
    STATIONARY_TRAFFIC("stationaryTraffic"),
    @XmlEnumValue("queuingTraffic")
    QUEUING_TRAFFIC("queuingTraffic"),
    @XmlEnumValue("slowTraffic")
    SLOW_TRAFFIC("slowTraffic"),
    @XmlEnumValue("heavyTraffic")
    HEAVY_TRAFFIC("heavyTraffic"),
    @XmlEnumValue("unspecifiedAbnormalTraffic")
    UNSPECIFIED_ABNORMAL_TRAFFIC("unspecifiedAbnormalTraffic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AbnormalTrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbnormalTrafficTypeEnum fromValue(String v) {
        for (AbnormalTrafficTypeEnum c: AbnormalTrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
