
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfrastructureDescriptorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InfrastructureDescriptorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="atMotorwayInterchange"/&gt;
 *     &lt;enumeration value="atRestArea"/&gt;
 *     &lt;enumeration value="atServiceArea"/&gt;
 *     &lt;enumeration value="atTollPlaza"/&gt;
 *     &lt;enumeration value="atTunnelEntryOrExit"/&gt;
 *     &lt;enumeration value="inGallery"/&gt;
 *     &lt;enumeration value="inTunnel"/&gt;
 *     &lt;enumeration value="onBridge"/&gt;
 *     &lt;enumeration value="onConnector"/&gt;
 *     &lt;enumeration value="onElevatedSection"/&gt;
 *     &lt;enumeration value="onFlyover"/&gt;
 *     &lt;enumeration value="onIceRoad"/&gt;
 *     &lt;enumeration value="onLevelCrossing"/&gt;
 *     &lt;enumeration value="onLinkRoad"/&gt;
 *     &lt;enumeration value="onRoundabout"/&gt;
 *     &lt;enumeration value="onTheRoadway"/&gt;
 *     &lt;enumeration value="onUndergroundSection"/&gt;
 *     &lt;enumeration value="onUnderpass"/&gt;
 *     &lt;enumeration value="withinJunction"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InfrastructureDescriptorEnum")
@XmlEnum
public enum InfrastructureDescriptorEnum2 {

    @XmlEnumValue("atMotorwayInterchange")
    AT_MOTORWAY_INTERCHANGE("atMotorwayInterchange"),
    @XmlEnumValue("atRestArea")
    AT_REST_AREA("atRestArea"),
    @XmlEnumValue("atServiceArea")
    AT_SERVICE_AREA("atServiceArea"),
    @XmlEnumValue("atTollPlaza")
    AT_TOLL_PLAZA("atTollPlaza"),
    @XmlEnumValue("atTunnelEntryOrExit")
    AT_TUNNEL_ENTRY_OR_EXIT("atTunnelEntryOrExit"),
    @XmlEnumValue("inGallery")
    IN_GALLERY("inGallery"),
    @XmlEnumValue("inTunnel")
    IN_TUNNEL("inTunnel"),
    @XmlEnumValue("onBridge")
    ON_BRIDGE("onBridge"),
    @XmlEnumValue("onConnector")
    ON_CONNECTOR("onConnector"),
    @XmlEnumValue("onElevatedSection")
    ON_ELEVATED_SECTION("onElevatedSection"),
    @XmlEnumValue("onFlyover")
    ON_FLYOVER("onFlyover"),
    @XmlEnumValue("onIceRoad")
    ON_ICE_ROAD("onIceRoad"),
    @XmlEnumValue("onLevelCrossing")
    ON_LEVEL_CROSSING("onLevelCrossing"),
    @XmlEnumValue("onLinkRoad")
    ON_LINK_ROAD("onLinkRoad"),
    @XmlEnumValue("onRoundabout")
    ON_ROUNDABOUT("onRoundabout"),
    @XmlEnumValue("onTheRoadway")
    ON_THE_ROADWAY("onTheRoadway"),
    @XmlEnumValue("onUndergroundSection")
    ON_UNDERGROUND_SECTION("onUndergroundSection"),
    @XmlEnumValue("onUnderpass")
    ON_UNDERPASS("onUnderpass"),
    @XmlEnumValue("withinJunction")
    WITHIN_JUNCTION("withinJunction"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InfrastructureDescriptorEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfrastructureDescriptorEnum2 fromValue(String v) {
        for (InfrastructureDescriptorEnum2 c: InfrastructureDescriptorEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
