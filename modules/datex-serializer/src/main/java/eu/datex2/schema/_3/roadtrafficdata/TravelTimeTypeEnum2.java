
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
public enum TravelTimeTypeEnum2 {


    /**
     * Travel time is derived from the best out of a monitored sample.
     * 
     */
    @XmlEnumValue("best")
    BEST("best"),

    /**
     * Travel time is an automated estimate.
     * 
     */
    @XmlEnumValue("estimated")
    ESTIMATED("estimated"),

    /**
     * Travel time is derived from instantaneous measurements.
     * 
     */
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),

    /**
     * Travel time is reconstituted from other measurements.
     * 
     */
    @XmlEnumValue("reconstituted")
    RECONSTITUTED("reconstituted"),

    /**
     * Travel time is the output of a predictor, for example a blend of current and
     *             historical data, or a traffic flow model using current measurements.
     *           
     * 
     */
    @XmlEnumValue("predictor")
    PREDICTOR("predictor"),

    /**
     * Travel time is based on past observations, without use of current measurements.
     *           
     * 
     */
    @XmlEnumValue("profile")
    PROFILE("profile"),

    /**
     * Travel time is the sum of current travel times on subsections of the specified
     *             location.
     *           
     * 
     */
    @XmlEnumValue("sum")
    SUM("sum"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    TravelTimeTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTypeEnum2 fromValue(String v) {
        for (TravelTimeTypeEnum2 c: TravelTimeTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
