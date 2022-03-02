
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityOperationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AuthorityOperationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accidentInvestigationWork"/&gt;
 *     &lt;enumeration value="bombSquadInAction"/&gt;
 *     &lt;enumeration value="civilEmergency"/&gt;
 *     &lt;enumeration value="customsOperation"/&gt;
 *     &lt;enumeration value="juridicalReconstruction"/&gt;
 *     &lt;enumeration value="policeCheckPoint"/&gt;
 *     &lt;enumeration value="policeInvestigation"/&gt;
 *     &lt;enumeration value="roadOperatorCheckPoint"/&gt;
 *     &lt;enumeration value="snowChainOnBoardOrSnowTyresMountedCheck"/&gt;
 *     &lt;enumeration value="snowChainOrSnowTyresMountedCheck"/&gt;
 *     &lt;enumeration value="survey"/&gt;
 *     &lt;enumeration value="transportOfVip"/&gt;
 *     &lt;enumeration value="undefinedAuthorityActivity"/&gt;
 *     &lt;enumeration value="vehicleInspectionCheckPoint"/&gt;
 *     &lt;enumeration value="vehicleWeighing"/&gt;
 *     &lt;enumeration value="weighInMotion"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorityOperationTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum AuthorityOperationTypeEnum2 {


    /**
     * An operation involving authorised investigation work connected to an earlier
     *             reported accident.
     *           
     * 
     */
    @XmlEnumValue("accidentInvestigationWork")
    ACCIDENT_INVESTIGATION_WORK("accidentInvestigationWork"),

    /**
     * An operation where a bomb squad is in action to deal with suspected or actual
     *             explosive or incendiary devices which may cause disruption to traffic.
     *           
     * 
     */
    @XmlEnumValue("bombSquadInAction")
    BOMB_SQUAD_IN_ACTION("bombSquadInAction"),

    /**
     * A situation, perceived or actual, relating to a civil emergency which could
     *             disrupt traffic. This includes large scale destruction, through events such as earthquakes,
     *             insurrection, and civil disobedience.
     *           
     * 
     */
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),

    /**
     * A permanent or temporary operation established by customs and excise authorities
     *             on or adjacent to the carriageway.
     *           
     * 
     */
    @XmlEnumValue("customsOperation")
    CUSTOMS_OPERATION("customsOperation"),

    /**
     * An operation involving the juridical reconstruction of events for the purposes of
     *             judicial or legal proceedings.
     *           
     * 
     */
    @XmlEnumValue("juridicalReconstruction")
    JURIDICAL_RECONSTRUCTION("juridicalReconstruction"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway
     *             for use by police or other authorities.
     *           
     * 
     */
    @XmlEnumValue("policeCheckPoint")
    POLICE_CHECK_POINT("policeCheckPoint"),

    /**
     * A temporary operation established on or adjacent to the carriageway by the police
     *             associated with an ongoing investigation.
     *           
     * 
     */
    @XmlEnumValue("policeInvestigation")
    POLICE_INVESTIGATION("policeInvestigation"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway
     *             for use by the road operator, such as for survey or inspection purposes, but not for traffic
     *             management purposes.
     *           
     * 
     */
    @XmlEnumValue("roadOperatorCheckPoint")
    ROAD_OPERATOR_CHECK_POINT("roadOperatorCheckPoint"),

    /**
     * the police are checking if snow chains are on board vehicles or vehicles have snow
     *             tyres mounted
     *           
     * 
     */
    @XmlEnumValue("snowChainOnBoardOrSnowTyresMountedCheck")
    SNOW_CHAIN_ON_BOARD_OR_SNOW_TYRES_MOUNTED_CHECK("snowChainOnBoardOrSnowTyresMountedCheck"),

    /**
     * the police are checking if snow chains or snow tyres are mounted on vehicles
     *           
     * 
     */
    @XmlEnumValue("snowChainOrSnowTyresMountedCheck")
    SNOW_CHAIN_OR_SNOW_TYRES_MOUNTED_CHECK("snowChainOrSnowTyresMountedCheck"),

    /**
     * A permanent or temporary operation established by authorities on or adjacent to
     *             the carriageway for the purpose of gathering statistics or other traffic related information.
     *           
     * 
     */
    @XmlEnumValue("survey")
    SURVEY("survey"),

    /**
     * An operation to transport one or more VIPs.
     * 
     */
    @XmlEnumValue("transportOfVip")
    TRANSPORT_OF_VIP("transportOfVip"),

    /**
     * An authority activity of undefined type.
     * 
     */
    @XmlEnumValue("undefinedAuthorityActivity")
    UNDEFINED_AUTHORITY_ACTIVITY("undefinedAuthorityActivity"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway
     *             for inspection of vehicles by authorities (e.g. vehicle safety checks and tachograph checks).
     *           
     * 
     */
    @XmlEnumValue("vehicleInspectionCheckPoint")
    VEHICLE_INSPECTION_CHECK_POINT("vehicleInspectionCheckPoint"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway
     *             for weighing of vehicles by authorities.
     *           
     * 
     */
    @XmlEnumValue("vehicleWeighing")
    VEHICLE_WEIGHING("vehicleWeighing"),

    /**
     * A permanent or temporary facility established by authorities on the carriageway
     *             for weighing vehicles while in motion.
     *           
     * 
     */
    @XmlEnumValue("weighInMotion")
    WEIGH_IN_MOTION("weighInMotion"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    AuthorityOperationTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorityOperationTypeEnum2 fromValue(String v) {
        for (AuthorityOperationTypeEnum2 c: AuthorityOperationTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
