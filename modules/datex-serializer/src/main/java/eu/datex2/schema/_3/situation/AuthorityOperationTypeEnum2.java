
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
@XmlType(name = "AuthorityOperationTypeEnum")
@XmlEnum
public enum AuthorityOperationTypeEnum2 {

    @XmlEnumValue("accidentInvestigationWork")
    ACCIDENT_INVESTIGATION_WORK("accidentInvestigationWork"),
    @XmlEnumValue("bombSquadInAction")
    BOMB_SQUAD_IN_ACTION("bombSquadInAction"),
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),
    @XmlEnumValue("customsOperation")
    CUSTOMS_OPERATION("customsOperation"),
    @XmlEnumValue("juridicalReconstruction")
    JURIDICAL_RECONSTRUCTION("juridicalReconstruction"),
    @XmlEnumValue("policeCheckPoint")
    POLICE_CHECK_POINT("policeCheckPoint"),
    @XmlEnumValue("policeInvestigation")
    POLICE_INVESTIGATION("policeInvestigation"),
    @XmlEnumValue("roadOperatorCheckPoint")
    ROAD_OPERATOR_CHECK_POINT("roadOperatorCheckPoint"),
    @XmlEnumValue("snowChainOnBoardOrSnowTyresMountedCheck")
    SNOW_CHAIN_ON_BOARD_OR_SNOW_TYRES_MOUNTED_CHECK("snowChainOnBoardOrSnowTyresMountedCheck"),
    @XmlEnumValue("snowChainOrSnowTyresMountedCheck")
    SNOW_CHAIN_OR_SNOW_TYRES_MOUNTED_CHECK("snowChainOrSnowTyresMountedCheck"),
    @XmlEnumValue("survey")
    SURVEY("survey"),
    @XmlEnumValue("transportOfVip")
    TRANSPORT_OF_VIP("transportOfVip"),
    @XmlEnumValue("undefinedAuthorityActivity")
    UNDEFINED_AUTHORITY_ACTIVITY("undefinedAuthorityActivity"),
    @XmlEnumValue("vehicleInspectionCheckPoint")
    VEHICLE_INSPECTION_CHECK_POINT("vehicleInspectionCheckPoint"),
    @XmlEnumValue("vehicleWeighing")
    VEHICLE_WEIGHING("vehicleWeighing"),
    @XmlEnumValue("weighInMotion")
    WEIGH_IN_MOTION("weighInMotion"),
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
