
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeMeaningEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimeMeaningEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="beginTime"/&gt;
 *     &lt;enumeration value="endTime"/&gt;
 *     &lt;enumeration value="middleTime"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeMeaningEnum")
@XmlEnum
public enum TimeMeaningEnum2 {


    /**
     * Meaning the beginning of a period
     * 
     */
    @XmlEnumValue("beginTime")
    BEGIN_TIME("beginTime"),

    /**
     * Meaning the end of a period
     * 
     */
    @XmlEnumValue("endTime")
    END_TIME("endTime"),

    /**
     * Meaning the mid-point of a period
     * 
     */
    @XmlEnumValue("middleTime")
    MIDDLE_TIME("middleTime"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TimeMeaningEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeMeaningEnum2 fromValue(String v) {
        for (TimeMeaningEnum2 c: TimeMeaningEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
