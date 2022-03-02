
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.PublicEventTypeEnum;
import eu.datex2.schema._3.common.WeatherRelatedRoadConditionTypeEnum;
import eu.datex2.schema._3.common.WinterEquipmentManagementTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of influence that may be the cause of components of a situation. At least one
 *         attribute must be populated.
 *       
 * 
 * <p>Java class for DetailedCauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedCauseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abnormalTrafficType" type="{http://datex2.eu/schema/3/situation}_AbnormalTrafficTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="accidentType" type="{http://datex2.eu/schema/3/situation}_AccidentTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="animalPresenceType" type="{http://datex2.eu/schema/3/situation}_AnimalPresenceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="authorityOperationType" type="{http://datex2.eu/schema/3/situation}_AuthorityOperationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="constructionWorkType" type="{http://datex2.eu/schema/3/situation}_ConstructionWorkTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="disturbanceActivityType" type="{http://datex2.eu/schema/3/situation}_DisturbanceActivityTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="drivingConditionType" type="{http://datex2.eu/schema/3/situation}_DrivingConditionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="environmentalObstructionType" type="{http://datex2.eu/schema/3/situation}_EnvironmentalObstructionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="equipmentOrSystemFaultType" type="{http://datex2.eu/schema/3/situation}_EquipmentOrSystemFaultTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/3/situation}_GeneralInstructionToRoadUsersTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="generalNetworkManagementType" type="{http://datex2.eu/schema/3/situation}_GeneralNetworkManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/3/situation}_InfrastructureDamageTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="nonWeatherRelatedRoadConditionType" type="{http://datex2.eu/schema/3/situation}_NonWeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="obstructionType" type="{http://datex2.eu/schema/3/situation}_ObstructionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="poorEnvironmentType" type="{http://datex2.eu/schema/3/situation}_PoorEnvironmentTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publicEventType" type="{http://datex2.eu/schema/3/common}_PublicEventTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="reroutingManagementType" type="{http://datex2.eu/schema/3/situation}_ReroutingManagementTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadMaintenanceType" type="{http://datex2.eu/schema/3/situation}_RoadMaintenanceTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadOperatorServiceDisruptionType" type="{http://datex2.eu/schema/3/situation}_RoadOperatorServiceDisruptionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadOrCarriagewayOrLaneManagementType" type="{http://datex2.eu/schema/3/situation}_RoadOrCarriagewayOrLaneManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="roadsideAssistanceType" type="{http://datex2.eu/schema/3/situation}_RoadsideAssistanceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="roadsideServiceDisruptionType" type="{http://datex2.eu/schema/3/situation}_ServiceDisruptionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="speedManagementType" type="{http://datex2.eu/schema/3/situation}_SpeedManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="transitServiceInformation" type="{http://datex2.eu/schema/3/situation}_TransitServiceInformationEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleObstructionType" type="{http://datex2.eu/schema/3/situation}_VehicleObstructionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/3/common}_WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/3/common}_WinterEquipmentManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_detailedCauseTypeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedCauseType", propOrder = {
    "abnormalTrafficType",
    "accidentType",
    "animalPresenceType",
    "authorityOperationType",
    "constructionWorkType",
    "disturbanceActivityType",
    "drivingConditionType",
    "environmentalObstructionType",
    "equipmentOrSystemFaultType",
    "generalInstructionToRoadUsersType",
    "generalNetworkManagementType",
    "infrastructureDamageType",
    "nonWeatherRelatedRoadConditionType",
    "obstructionType",
    "poorEnvironmentType",
    "publicEventType",
    "reroutingManagementType",
    "roadMaintenanceType",
    "roadOperatorServiceDisruptionType",
    "roadOrCarriagewayOrLaneManagementType",
    "roadsideAssistanceType",
    "roadsideServiceDisruptionType",
    "speedManagementType",
    "transitServiceInformation",
    "vehicleObstructionType",
    "weatherRelatedRoadConditionType",
    "winterEquipmentManagementType",
    "detailedCauseTypeExtension"
})
public class DetailedCauseType {

    protected AbnormalTrafficTypeEnum abnormalTrafficType;
    protected List<AccidentTypeEnum> accidentType;
    protected AnimalPresenceTypeEnum animalPresenceType;
    protected AuthorityOperationTypeEnum authorityOperationType;
    protected ConstructionWorkTypeEnum constructionWorkType;
    protected DisturbanceActivityTypeEnum disturbanceActivityType;
    protected DrivingConditionTypeEnum drivingConditionType;
    protected EnvironmentalObstructionTypeEnum environmentalObstructionType;
    protected EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    protected InfrastructureDamageTypeEnum infrastructureDamageType;
    protected List<NonWeatherRelatedRoadConditionTypeEnum> nonWeatherRelatedRoadConditionType;
    protected List<ObstructionTypeEnum> obstructionType;
    protected List<PoorEnvironmentTypeEnum> poorEnvironmentType;
    protected PublicEventTypeEnum publicEventType;
    protected List<ReroutingManagementTypeEnum> reroutingManagementType;
    protected List<RoadMaintenanceTypeEnum> roadMaintenanceType;
    protected List<RoadOperatorServiceDisruptionTypeEnum> roadOperatorServiceDisruptionType;
    protected RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    protected RoadsideAssistanceTypeEnum roadsideAssistanceType;
    protected List<ServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    protected SpeedManagementTypeEnum speedManagementType;
    protected TransitServiceInformationEnum transitServiceInformation;
    protected VehicleObstructionTypeEnum vehicleObstructionType;
    protected List<WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    @XmlElement(name = "_detailedCauseTypeExtension")
    protected ExtensionType detailedCauseTypeExtension;

    /**
     * Gets the value of the abnormalTrafficType property.
     * 
     * @return
     *     possible object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Sets the value of the abnormalTrafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficType = value;
    }

    /**
     * Gets the value of the accidentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accidentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentTypeEnum }
     * 
     * 
     */
    public List<AccidentTypeEnum> getAccidentType() {
        if (accidentType == null) {
            accidentType = new ArrayList<AccidentTypeEnum>();
        }
        return this.accidentType;
    }

    /**
     * Gets the value of the animalPresenceType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public AnimalPresenceTypeEnum getAnimalPresenceType() {
        return animalPresenceType;
    }

    /**
     * Sets the value of the animalPresenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceType(AnimalPresenceTypeEnum value) {
        this.animalPresenceType = value;
    }

    /**
     * Gets the value of the authorityOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Sets the value of the authorityOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationType(AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    /**
     * Gets the value of the constructionWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Sets the value of the constructionWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    /**
     * Gets the value of the disturbanceActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public DisturbanceActivityTypeEnum getDisturbanceActivityType() {
        return disturbanceActivityType;
    }

    /**
     * Sets the value of the disturbanceActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityType(DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityType = value;
    }

    /**
     * Gets the value of the drivingConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public DrivingConditionTypeEnum getDrivingConditionType() {
        return drivingConditionType;
    }

    /**
     * Sets the value of the drivingConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public void setDrivingConditionType(DrivingConditionTypeEnum value) {
        this.drivingConditionType = value;
    }

    /**
     * Gets the value of the environmentalObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Sets the value of the environmentalObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    /**
     * Gets the value of the equipmentOrSystemFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public void setEquipmentOrSystemFaultType(EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    /**
     * Gets the value of the generalInstructionToRoadUsersType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    /**
     * Gets the value of the generalNetworkManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Sets the value of the generalNetworkManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public void setGeneralNetworkManagementType(GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    /**
     * Gets the value of the infrastructureDamageType property.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Sets the value of the infrastructureDamageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    /**
     * Gets the value of the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonWeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<NonWeatherRelatedRoadConditionTypeEnum> getNonWeatherRelatedRoadConditionType() {
        if (nonWeatherRelatedRoadConditionType == null) {
            nonWeatherRelatedRoadConditionType = new ArrayList<NonWeatherRelatedRoadConditionTypeEnum>();
        }
        return this.nonWeatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the obstructionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obstructionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionTypeEnum }
     * 
     * 
     */
    public List<ObstructionTypeEnum> getObstructionType() {
        if (obstructionType == null) {
            obstructionType = new ArrayList<ObstructionTypeEnum>();
        }
        return this.obstructionType;
    }

    /**
     * Gets the value of the poorEnvironmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poorEnvironmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoorEnvironmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoorEnvironmentTypeEnum }
     * 
     * 
     */
    public List<PoorEnvironmentTypeEnum> getPoorEnvironmentType() {
        if (poorEnvironmentType == null) {
            poorEnvironmentType = new ArrayList<PoorEnvironmentTypeEnum>();
        }
        return this.poorEnvironmentType;
    }

    /**
     * Gets the value of the publicEventType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Sets the value of the publicEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(PublicEventTypeEnum value) {
        this.publicEventType = value;
    }

    /**
     * Gets the value of the reroutingManagementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reroutingManagementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReroutingManagementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReroutingManagementTypeEnum }
     * 
     * 
     */
    public List<ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<ReroutingManagementTypeEnum>();
        }
        return this.reroutingManagementType;
    }

    /**
     * Gets the value of the roadMaintenanceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadMaintenanceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadMaintenanceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadMaintenanceTypeEnum }
     * 
     * 
     */
    public List<RoadMaintenanceTypeEnum> getRoadMaintenanceType() {
        if (roadMaintenanceType == null) {
            roadMaintenanceType = new ArrayList<RoadMaintenanceTypeEnum>();
        }
        return this.roadMaintenanceType;
    }

    /**
     * Gets the value of the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadOperatorServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadOperatorServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadOperatorServiceDisruptionTypeEnum> getRoadOperatorServiceDisruptionType() {
        if (roadOperatorServiceDisruptionType == null) {
            roadOperatorServiceDisruptionType = new ArrayList<RoadOperatorServiceDisruptionTypeEnum>();
        }
        return this.roadOperatorServiceDisruptionType;
    }

    /**
     * Gets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        this.roadOrCarriagewayOrLaneManagementType = value;
    }

    /**
     * Gets the value of the roadsideAssistanceType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Sets the value of the roadsideAssistanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceType(RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceType = value;
    }

    /**
     * Gets the value of the roadsideServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<ServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<ServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    /**
     * Gets the value of the speedManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Sets the value of the speedManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    /**
     * Gets the value of the transitServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public TransitServiceInformationEnum getTransitServiceInformation() {
        return transitServiceInformation;
    }

    /**
     * Sets the value of the transitServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformation(TransitServiceInformationEnum value) {
        this.transitServiceInformation = value;
    }

    /**
     * Gets the value of the vehicleObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public VehicleObstructionTypeEnum getVehicleObstructionType() {
        return vehicleObstructionType;
    }

    /**
     * Sets the value of the vehicleObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionType(VehicleObstructionTypeEnum value) {
        this.vehicleObstructionType = value;
    }

    /**
     * Gets the value of the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Sets the value of the winterEquipmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Gets the value of the detailedCauseTypeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDetailedCauseTypeExtension() {
        return detailedCauseTypeExtension;
    }

    /**
     * Sets the value of the detailedCauseTypeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDetailedCauseTypeExtension(ExtensionType value) {
        this.detailedCauseTypeExtension = value;
    }

}
