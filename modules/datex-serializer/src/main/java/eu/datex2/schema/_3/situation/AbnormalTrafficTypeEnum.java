
package eu.datex2.schema._3.situation;

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
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AbnormalTrafficTypeEnum")
@XmlEnum
public enum AbnormalTrafficTypeEnum {


    /**
     * Traffic is stationary, or very near stationary, at the specified location (i.e.
     *             average speed is less than 10% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("stationaryTraffic")
    STATIONARY_TRAFFIC("stationaryTraffic"),

    /**
     * Traffic is queuing at the specified location, although there is still some traffic
     *             movement (i.e. average speed is between 10% and 25% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("queuingTraffic")
    QUEUING_TRAFFIC("queuingTraffic"),

    /**
     * Traffic is slow moving at the specified location, but not yet forming queues (i.e.
     *             average speed is between 25% and 75% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("slowTraffic")
    SLOW_TRAFFIC("slowTraffic"),

    /**
     * Traffic is heavy at the specified location (i.e. average speed is between 75% and
     *             90% of its free-flow level).
     *           
     * 
     */
    @XmlEnumValue("heavyTraffic")
    HEAVY_TRAFFIC("heavyTraffic"),

    /**
     * There are abnormal traffic conditions of an unspecified nature at the specified
     *             location.
     *           
     * 
     */
    @XmlEnumValue("unspecifiedAbnormalTraffic")
    UNSPECIFIED_ABNORMAL_TRAFFIC("unspecifiedAbnormalTraffic"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
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
