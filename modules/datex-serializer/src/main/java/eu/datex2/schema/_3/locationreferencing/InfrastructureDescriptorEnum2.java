
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


    /**
     * At a motorway interchange.
     * 
     */
    @XmlEnumValue("atMotorwayInterchange")
    AT_MOTORWAY_INTERCHANGE("atMotorwayInterchange"),

    /**
     * At rest area off the carriageway.
     * 
     */
    @XmlEnumValue("atRestArea")
    AT_REST_AREA("atRestArea"),

    /**
     * At service area.
     * 
     */
    @XmlEnumValue("atServiceArea")
    AT_SERVICE_AREA("atServiceArea"),

    /**
     * At toll plaza.
     * 
     */
    @XmlEnumValue("atTollPlaza")
    AT_TOLL_PLAZA("atTollPlaza"),

    /**
     * At entry or exit of tunnel.
     * 
     */
    @XmlEnumValue("atTunnelEntryOrExit")
    AT_TUNNEL_ENTRY_OR_EXIT("atTunnelEntryOrExit"),

    /**
     * In gallery.
     * 
     */
    @XmlEnumValue("inGallery")
    IN_GALLERY("inGallery"),

    /**
     * In tunnel.
     * 
     */
    @XmlEnumValue("inTunnel")
    IN_TUNNEL("inTunnel"),

    /**
     * On bridge.
     * 
     */
    @XmlEnumValue("onBridge")
    ON_BRIDGE("onBridge"),

    /**
     * On connecting carriageway between two different roads or road sections.
     *           
     * 
     */
    @XmlEnumValue("onConnector")
    ON_CONNECTOR("onConnector"),

    /**
     * On elevated section of road.
     * 
     */
    @XmlEnumValue("onElevatedSection")
    ON_ELEVATED_SECTION("onElevatedSection"),

    /**
     * On flyover, i.e. on section of road over another road.
     * 
     */
    @XmlEnumValue("onFlyover")
    ON_FLYOVER("onFlyover"),

    /**
     * On ice road.
     * 
     */
    @XmlEnumValue("onIceRoad")
    ON_ICE_ROAD("onIceRoad"),

    /**
     * On level-crossing.
     * 
     */
    @XmlEnumValue("onLevelCrossing")
    ON_LEVEL_CROSSING("onLevelCrossing"),

    /**
     * On road section linking two different roads.
     * 
     */
    @XmlEnumValue("onLinkRoad")
    ON_LINK_ROAD("onLinkRoad"),

    /**
     * On roundabout.
     * 
     */
    @XmlEnumValue("onRoundabout")
    ON_ROUNDABOUT("onRoundabout"),

    /**
     * On the roadway.
     * 
     */
    @XmlEnumValue("onTheRoadway")
    ON_THE_ROADWAY("onTheRoadway"),

    /**
     * On underground section of road.
     * 
     */
    @XmlEnumValue("onUndergroundSection")
    ON_UNDERGROUND_SECTION("onUndergroundSection"),

    /**
     * On underpass, i.e. section of road which passes under another road.
     *           
     * 
     */
    @XmlEnumValue("onUnderpass")
    ON_UNDERPASS("onUnderpass"),

    /**
     * On the main carriageway within a junction between exit slip road and entry slip
     *             road.
     *           
     * 
     */
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
