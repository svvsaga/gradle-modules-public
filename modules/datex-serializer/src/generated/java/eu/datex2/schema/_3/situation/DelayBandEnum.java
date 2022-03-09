
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelayBandEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DelayBandEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="negligible"/&gt;
 *     &lt;enumeration value="upToTenMinutes"/&gt;
 *     &lt;enumeration value="betweenTenMinutesAndThirtyMinutes"/&gt;
 *     &lt;enumeration value="betweenThirtyMinutesAndOneHour"/&gt;
 *     &lt;enumeration value="betweenOneHourAndThreeHours"/&gt;
 *     &lt;enumeration value="betweenThreeHoursAndSixHours"/&gt;
 *     &lt;enumeration value="longerThanSixHours"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelayBandEnum")
@XmlEnum
public enum DelayBandEnum {

    @XmlEnumValue("negligible")
    NEGLIGIBLE("negligible"),
    @XmlEnumValue("upToTenMinutes")
    UP_TO_TEN_MINUTES("upToTenMinutes"),
    @XmlEnumValue("betweenTenMinutesAndThirtyMinutes")
    BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES("betweenTenMinutesAndThirtyMinutes"),
    @XmlEnumValue("betweenThirtyMinutesAndOneHour")
    BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR("betweenThirtyMinutesAndOneHour"),
    @XmlEnumValue("betweenOneHourAndThreeHours")
    BETWEEN_ONE_HOUR_AND_THREE_HOURS("betweenOneHourAndThreeHours"),
    @XmlEnumValue("betweenThreeHoursAndSixHours")
    BETWEEN_THREE_HOURS_AND_SIX_HOURS("betweenThreeHoursAndSixHours"),
    @XmlEnumValue("longerThanSixHours")
    LONGER_THAN_SIX_HOURS("longerThanSixHours"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DelayBandEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelayBandEnum fromValue(String v) {
        for (DelayBandEnum c: DelayBandEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
