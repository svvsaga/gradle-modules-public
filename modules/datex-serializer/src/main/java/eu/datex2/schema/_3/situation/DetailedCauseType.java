
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._PublicEventTypeEnum;
import eu.datex2.schema._3.common._WeatherRelatedRoadConditionTypeEnum;
import eu.datex2.schema._3.common._WinterEquipmentManagementTypeEnum;
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
    "_DetailedCauseTypeExtension"
})
public class DetailedCauseType {

    protected _AbnormalTrafficTypeEnum abnormalTrafficType;
    protected List<_AccidentTypeEnum> accidentType;
    protected _AnimalPresenceTypeEnum animalPresenceType;
    protected _AuthorityOperationTypeEnum authorityOperationType;
    protected _ConstructionWorkTypeEnum constructionWorkType;
    protected _DisturbanceActivityTypeEnum disturbanceActivityType;
    protected _DrivingConditionTypeEnum drivingConditionType;
    protected _EnvironmentalObstructionTypeEnum environmentalObstructionType;
    protected _EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    protected _GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected _GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    protected _InfrastructureDamageTypeEnum infrastructureDamageType;
    protected List<_NonWeatherRelatedRoadConditionTypeEnum> nonWeatherRelatedRoadConditionType;
    protected List<_ObstructionTypeEnum> obstructionType;
    protected List<_PoorEnvironmentTypeEnum> poorEnvironmentType;
    protected _PublicEventTypeEnum publicEventType;
    protected List<_ReroutingManagementTypeEnum> reroutingManagementType;
    protected List<_RoadMaintenanceTypeEnum> roadMaintenanceType;
    protected List<_RoadOperatorServiceDisruptionTypeEnum> roadOperatorServiceDisruptionType;
    protected _RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    protected _RoadsideAssistanceTypeEnum roadsideAssistanceType;
    protected List<_ServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    protected _SpeedManagementTypeEnum speedManagementType;
    protected _TransitServiceInformationEnum transitServiceInformation;
    protected _VehicleObstructionTypeEnum vehicleObstructionType;
    protected List<_WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected _WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    @XmlElement(name = "_detailedCauseTypeExtension")
    protected _ExtensionType _DetailedCauseTypeExtension;

    /**
     * Gets the value of the abnormalTrafficType property.
     * 
     * @return
     *     possible object is
     *     {@link _AbnormalTrafficTypeEnum }
     *     
     */
    public _AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Sets the value of the abnormalTrafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficType(_AbnormalTrafficTypeEnum value) {
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
     * {@link _AccidentTypeEnum }
     * 
     * 
     */
    public List<_AccidentTypeEnum> getAccidentType() {
        if (accidentType == null) {
            accidentType = new ArrayList<_AccidentTypeEnum>();
        }
        return this.accidentType;
    }

    /**
     * Gets the value of the animalPresenceType property.
     * 
     * @return
     *     possible object is
     *     {@link _AnimalPresenceTypeEnum }
     *     
     */
    public _AnimalPresenceTypeEnum getAnimalPresenceType() {
        return animalPresenceType;
    }

    /**
     * Sets the value of the animalPresenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceType(_AnimalPresenceTypeEnum value) {
        this.animalPresenceType = value;
    }

    /**
     * Gets the value of the authorityOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link _AuthorityOperationTypeEnum }
     *     
     */
    public _AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Sets the value of the authorityOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationType(_AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    /**
     * Gets the value of the constructionWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link _ConstructionWorkTypeEnum }
     *     
     */
    public _ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Sets the value of the constructionWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(_ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    /**
     * Gets the value of the disturbanceActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link _DisturbanceActivityTypeEnum }
     *     
     */
    public _DisturbanceActivityTypeEnum getDisturbanceActivityType() {
        return disturbanceActivityType;
    }

    /**
     * Sets the value of the disturbanceActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityType(_DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityType = value;
    }

    /**
     * Gets the value of the drivingConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link _DrivingConditionTypeEnum }
     *     
     */
    public _DrivingConditionTypeEnum getDrivingConditionType() {
        return drivingConditionType;
    }

    /**
     * Sets the value of the drivingConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DrivingConditionTypeEnum }
     *     
     */
    public void setDrivingConditionType(_DrivingConditionTypeEnum value) {
        this.drivingConditionType = value;
    }

    /**
     * Gets the value of the environmentalObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link _EnvironmentalObstructionTypeEnum }
     *     
     */
    public _EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Sets the value of the environmentalObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(_EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    /**
     * Gets the value of the equipmentOrSystemFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link _EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public _EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public void setEquipmentOrSystemFaultType(_EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    /**
     * Gets the value of the generalInstructionToRoadUsersType property.
     * 
     * @return
     *     possible object is
     *     {@link _GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public _GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(_GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    /**
     * Gets the value of the generalNetworkManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _GeneralNetworkManagementTypeEnum }
     *     
     */
    public _GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Sets the value of the generalNetworkManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _GeneralNetworkManagementTypeEnum }
     *     
     */
    public void setGeneralNetworkManagementType(_GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    /**
     * Gets the value of the infrastructureDamageType property.
     * 
     * @return
     *     possible object is
     *     {@link _InfrastructureDamageTypeEnum }
     *     
     */
    public _InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Sets the value of the infrastructureDamageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(_InfrastructureDamageTypeEnum value) {
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
     * {@link _NonWeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<_NonWeatherRelatedRoadConditionTypeEnum> getNonWeatherRelatedRoadConditionType() {
        if (nonWeatherRelatedRoadConditionType == null) {
            nonWeatherRelatedRoadConditionType = new ArrayList<_NonWeatherRelatedRoadConditionTypeEnum>();
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
     * {@link _ObstructionTypeEnum }
     * 
     * 
     */
    public List<_ObstructionTypeEnum> getObstructionType() {
        if (obstructionType == null) {
            obstructionType = new ArrayList<_ObstructionTypeEnum>();
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
     * {@link _PoorEnvironmentTypeEnum }
     * 
     * 
     */
    public List<_PoorEnvironmentTypeEnum> getPoorEnvironmentType() {
        if (poorEnvironmentType == null) {
            poorEnvironmentType = new ArrayList<_PoorEnvironmentTypeEnum>();
        }
        return this.poorEnvironmentType;
    }

    /**
     * Gets the value of the publicEventType property.
     * 
     * @return
     *     possible object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public _PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Sets the value of the publicEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(_PublicEventTypeEnum value) {
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
     * {@link _ReroutingManagementTypeEnum }
     * 
     * 
     */
    public List<_ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<_ReroutingManagementTypeEnum>();
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
     * {@link _RoadMaintenanceTypeEnum }
     * 
     * 
     */
    public List<_RoadMaintenanceTypeEnum> getRoadMaintenanceType() {
        if (roadMaintenanceType == null) {
            roadMaintenanceType = new ArrayList<_RoadMaintenanceTypeEnum>();
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
     * {@link _RoadOperatorServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<_RoadOperatorServiceDisruptionTypeEnum> getRoadOperatorServiceDisruptionType() {
        if (roadOperatorServiceDisruptionType == null) {
            roadOperatorServiceDisruptionType = new ArrayList<_RoadOperatorServiceDisruptionTypeEnum>();
        }
        return this.roadOperatorServiceDisruptionType;
    }

    /**
     * Gets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public _RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(_RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        this.roadOrCarriagewayOrLaneManagementType = value;
    }

    /**
     * Gets the value of the roadsideAssistanceType property.
     * 
     * @return
     *     possible object is
     *     {@link _RoadsideAssistanceTypeEnum }
     *     
     */
    public _RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Sets the value of the roadsideAssistanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceType(_RoadsideAssistanceTypeEnum value) {
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
     * {@link _ServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<_ServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<_ServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    /**
     * Gets the value of the speedManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _SpeedManagementTypeEnum }
     *     
     */
    public _SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Sets the value of the speedManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(_SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    /**
     * Gets the value of the transitServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link _TransitServiceInformationEnum }
     *     
     */
    public _TransitServiceInformationEnum getTransitServiceInformation() {
        return transitServiceInformation;
    }

    /**
     * Sets the value of the transitServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformation(_TransitServiceInformationEnum value) {
        this.transitServiceInformation = value;
    }

    /**
     * Gets the value of the vehicleObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleObstructionTypeEnum }
     *     
     */
    public _VehicleObstructionTypeEnum getVehicleObstructionType() {
        return vehicleObstructionType;
    }

    /**
     * Sets the value of the vehicleObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionType(_VehicleObstructionTypeEnum value) {
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
     * {@link _WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<_WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<_WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _WinterEquipmentManagementTypeEnum }
     *     
     */
    public _WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Sets the value of the winterEquipmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(_WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Gets the value of the _DetailedCauseTypeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DetailedCauseTypeExtension() {
        return _DetailedCauseTypeExtension;
    }

    /**
     * Sets the value of the _DetailedCauseTypeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DetailedCauseTypeExtension(_ExtensionType value) {
        this._DetailedCauseTypeExtension = value;
    }

}
