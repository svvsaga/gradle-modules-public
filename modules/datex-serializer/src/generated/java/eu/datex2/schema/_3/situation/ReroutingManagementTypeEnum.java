
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

    @XmlEnumValue("doNotFollowDiversionSigns")
    DO_NOT_FOLLOW_DIVERSION_SIGNS("doNotFollowDiversionSigns"),
    @XmlEnumValue("doNotUseEntry")
    DO_NOT_USE_ENTRY("doNotUseEntry"),
    @XmlEnumValue("doNotUseExit")
    DO_NOT_USE_EXIT("doNotUseExit"),
    @XmlEnumValue("doNotUseIntersectionOrJunction")
    DO_NOT_USE_INTERSECTION_OR_JUNCTION("doNotUseIntersectionOrJunction"),
    @XmlEnumValue("followDiversionSigns")
    FOLLOW_DIVERSION_SIGNS("followDiversionSigns"),
    @XmlEnumValue("followLocalDiversion")
    FOLLOW_LOCAL_DIVERSION("followLocalDiversion"),
    @XmlEnumValue("followSpecialMarkers")
    FOLLOW_SPECIAL_MARKERS("followSpecialMarkers"),
    @XmlEnumValue("useEntry")
    USE_ENTRY("useEntry"),
    @XmlEnumValue("useExit")
    USE_EXIT("useExit"),
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
