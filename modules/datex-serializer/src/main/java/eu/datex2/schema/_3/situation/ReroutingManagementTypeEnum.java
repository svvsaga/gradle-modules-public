
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReroutingManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReroutingManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="doNotFollowDiversionSigns"/&gt;
 *     &lt;enumeration value="doNotUseEntry"/&gt;
 *     &lt;enumeration value="doNotUseExit"/&gt;
 *     &lt;enumeration value="doNotUseIntersectionOrJunction"/&gt;
 *     &lt;enumeration value="followDiversionSigns"/&gt;
 *     &lt;enumeration value="followLocalDiversion"/&gt;
 *     &lt;enumeration value="followSpecialMarkers"/&gt;
 *     &lt;enumeration value="useEntry"/&gt;
 *     &lt;enumeration value="useExit"/&gt;
 *     &lt;enumeration value="useIntersectionOrJunction"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReroutingManagementTypeEnum")
@XmlEnum
public enum ReroutingManagementTypeEnum {


    /**
     * Do not follow diversion signs.
     * 
     */
    @XmlEnumValue("doNotFollowDiversionSigns")
    DO_NOT_FOLLOW_DIVERSION_SIGNS("doNotFollowDiversionSigns"),

    /**
     * Rerouted traffic is not to use the specified entry onto the identified road to
     *             commence the alternative route.
     *           
     * 
     */
    @XmlEnumValue("doNotUseEntry")
    DO_NOT_USE_ENTRY("doNotUseEntry"),

    /**
     * Rerouted traffic is not to use the specified exit from the identified road to
     *             commence the alternative route.
     *           
     * 
     */
    @XmlEnumValue("doNotUseExit")
    DO_NOT_USE_EXIT("doNotUseExit"),

    /**
     * Rerouted traffic is not to use the specified intersection or junction.
     *           
     * 
     */
    @XmlEnumValue("doNotUseIntersectionOrJunction")
    DO_NOT_USE_INTERSECTION_OR_JUNCTION("doNotUseIntersectionOrJunction"),

    /**
     * Rerouted traffic is to follow the diversion signs.
     * 
     */
    @XmlEnumValue("followDiversionSigns")
    FOLLOW_DIVERSION_SIGNS("followDiversionSigns"),

    /**
     * Rerouted traffic is to follow local diversion.
     * 
     */
    @XmlEnumValue("followLocalDiversion")
    FOLLOW_LOCAL_DIVERSION("followLocalDiversion"),

    /**
     * Rerouted traffic is to follow the special diversion markers.
     * 
     */
    @XmlEnumValue("followSpecialMarkers")
    FOLLOW_SPECIAL_MARKERS("followSpecialMarkers"),

    /**
     * Rerouted traffic is to use the specified entry onto the identified road to
     *             commence the alternative route.
     *           
     * 
     */
    @XmlEnumValue("useEntry")
    USE_ENTRY("useEntry"),

    /**
     * Rerouted traffic is to use the specified exit from the identified road to commence
     *             the alternative route.
     *           
     * 
     */
    @XmlEnumValue("useExit")
    USE_EXIT("useExit"),

    /**
     * Rerouted traffic is to use the specified intersection or junction to commence the
     *             alternative route.
     *           
     * 
     */
    @XmlEnumValue("useIntersectionOrJunction")
    USE_INTERSECTION_OR_JUNCTION("useIntersectionOrJunction"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ReroutingManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReroutingManagementTypeEnum fromValue(String v) {
        for (ReroutingManagementTypeEnum c: ReroutingManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
