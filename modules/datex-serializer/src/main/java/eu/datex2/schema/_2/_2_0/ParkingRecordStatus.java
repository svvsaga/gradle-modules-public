
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRecordStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRecordStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRecordReference" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordVersionedReference"/&gt;
 *         &lt;element name="parkingStatusOriginTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="parkingStatusDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="parkingQueueingTime" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="parkingConditions" type="{http://datex2.eu/schema/2/2_0}ParkingConditionsEnum" minOccurs="0"/&gt;
 *         &lt;element name="blurredAvailability" type="{http://datex2.eu/schema/2/2_0}Boolean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingFault" type="{http://datex2.eu/schema/2/2_0}ParkingFaultEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/2/2_0}WinterEquipmentManagementTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceStatus" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordStatusParkingSpaceIndexParkingSpaceStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupancy" type="{http://datex2.eu/schema/2/2_0}ParkingOccupancy"/&gt;
 *         &lt;element name="groupOfParkingSpacesStatus" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingStatusValidity" type="{http://datex2.eu/schema/2/2_0}ParkingStatusValidity" minOccurs="0"/&gt;
 *         &lt;element name="overrideParkingThresholds" type="{http://datex2.eu/schema/2/2_0}ParkingThresholds" minOccurs="0"/&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacilityStatus" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingUsageScenarioStatus" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordStatusScenarioIndexParkingUsageScenarioStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingAccessStatus" type="{http://datex2.eu/schema/2/2_0}ParkingAccessStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteStatus" type="{http://datex2.eu/schema/2/2_0}ParkingRouteStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingRecordStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRecordStatus", propOrder = {
    "parkingRecordReference",
    "parkingStatusOriginTime",
    "parkingStatusDescription",
    "parkingQueueingTime",
    "parkingConditions",
    "blurredAvailability",
    "parkingFault",
    "winterEquipmentManagementType",
    "parkingSpaceStatus",
    "parkingOccupancy",
    "groupOfParkingSpacesStatus",
    "parkingStatusValidity",
    "overrideParkingThresholds",
    "parkingEquipmentOrServiceFacilityStatus",
    "parkingUsageScenarioStatus",
    "parkingAccessStatus",
    "parkingRouteStatus",
    "parkingRecordStatusExtension"
})
@XmlSeeAlso({
    GroupOfParkingSitesStatus.class,
    ParkingSiteStatus.class
})
public abstract class ParkingRecordStatus {

    @XmlElement(required = true)
    protected ParkingRecordVersionedReference parkingRecordReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar parkingStatusOriginTime;
    protected MultilingualString parkingStatusDescription;
    protected Float parkingQueueingTime;
    @XmlSchemaType(name = "string")
    protected ParkingConditionsEnum parkingConditions;
    @XmlElement(type = Boolean.class)
    protected List<Boolean> blurredAvailability;
    @XmlSchemaType(name = "string")
    protected List<ParkingFaultEnum> parkingFault;
    @XmlSchemaType(name = "string")
    protected List<WinterEquipmentManagementTypeEnum> winterEquipmentManagementType;
    protected List<ParkingRecordStatusParkingSpaceIndexParkingSpaceStatus> parkingSpaceStatus;
    @XmlElement(required = true)
    protected ParkingOccupancy parkingOccupancy;
    protected List<ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus> groupOfParkingSpacesStatus;
    protected ParkingStatusValidity parkingStatusValidity;
    protected ParkingThresholds overrideParkingThresholds;
    protected List<ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus> parkingEquipmentOrServiceFacilityStatus;
    protected List<ParkingRecordStatusScenarioIndexParkingUsageScenarioStatus> parkingUsageScenarioStatus;
    protected List<ParkingAccessStatus> parkingAccessStatus;
    protected List<ParkingRouteStatus> parkingRouteStatus;
    protected ExtensionType parkingRecordStatusExtension;

    /**
     * Gets the value of the parkingRecordReference property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRecordVersionedReference }
     *     
     */
    public ParkingRecordVersionedReference getParkingRecordReference() {
        return parkingRecordReference;
    }

    /**
     * Sets the value of the parkingRecordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRecordVersionedReference }
     *     
     */
    public void setParkingRecordReference(ParkingRecordVersionedReference value) {
        this.parkingRecordReference = value;
    }

    /**
     * Gets the value of the parkingStatusOriginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingStatusOriginTime() {
        return parkingStatusOriginTime;
    }

    /**
     * Sets the value of the parkingStatusOriginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingStatusOriginTime(XMLGregorianCalendar value) {
        this.parkingStatusOriginTime = value;
    }

    /**
     * Gets the value of the parkingStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingStatusDescription() {
        return parkingStatusDescription;
    }

    /**
     * Sets the value of the parkingStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingStatusDescription(MultilingualString value) {
        this.parkingStatusDescription = value;
    }

    /**
     * Gets the value of the parkingQueueingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getParkingQueueingTime() {
        return parkingQueueingTime;
    }

    /**
     * Sets the value of the parkingQueueingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setParkingQueueingTime(Float value) {
        this.parkingQueueingTime = value;
    }

    /**
     * Gets the value of the parkingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingConditionsEnum }
     *     
     */
    public ParkingConditionsEnum getParkingConditions() {
        return parkingConditions;
    }

    /**
     * Sets the value of the parkingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingConditionsEnum }
     *     
     */
    public void setParkingConditions(ParkingConditionsEnum value) {
        this.parkingConditions = value;
    }

    /**
     * Gets the value of the blurredAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the blurredAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlurredAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getBlurredAvailability() {
        if (blurredAvailability == null) {
            blurredAvailability = new ArrayList<Boolean>();
        }
        return this.blurredAvailability;
    }

    /**
     * Gets the value of the parkingFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingFaultEnum }
     * 
     * 
     */
    public List<ParkingFaultEnum> getParkingFault() {
        if (parkingFault == null) {
            parkingFault = new ArrayList<ParkingFaultEnum>();
        }
        return this.parkingFault;
    }

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the winterEquipmentManagementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWinterEquipmentManagementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WinterEquipmentManagementTypeEnum }
     * 
     * 
     */
    public List<WinterEquipmentManagementTypeEnum> getWinterEquipmentManagementType() {
        if (winterEquipmentManagementType == null) {
            winterEquipmentManagementType = new ArrayList<WinterEquipmentManagementTypeEnum>();
        }
        return this.winterEquipmentManagementType;
    }

    /**
     * Gets the value of the parkingSpaceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSpaceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSpaceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordStatusParkingSpaceIndexParkingSpaceStatus }
     * 
     * 
     */
    public List<ParkingRecordStatusParkingSpaceIndexParkingSpaceStatus> getParkingSpaceStatus() {
        if (parkingSpaceStatus == null) {
            parkingSpaceStatus = new ArrayList<ParkingRecordStatusParkingSpaceIndexParkingSpaceStatus>();
        }
        return this.parkingSpaceStatus;
    }

    /**
     * Gets the value of the parkingOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingOccupancy }
     *     
     */
    public ParkingOccupancy getParkingOccupancy() {
        return parkingOccupancy;
    }

    /**
     * Sets the value of the parkingOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingOccupancy }
     *     
     */
    public void setParkingOccupancy(ParkingOccupancy value) {
        this.parkingOccupancy = value;
    }

    /**
     * Gets the value of the groupOfParkingSpacesStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfParkingSpacesStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfParkingSpacesStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus }
     * 
     * 
     */
    public List<ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus> getGroupOfParkingSpacesStatus() {
        if (groupOfParkingSpacesStatus == null) {
            groupOfParkingSpacesStatus = new ArrayList<ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus>();
        }
        return this.groupOfParkingSpacesStatus;
    }

    /**
     * Gets the value of the parkingStatusValidity property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingStatusValidity }
     *     
     */
    public ParkingStatusValidity getParkingStatusValidity() {
        return parkingStatusValidity;
    }

    /**
     * Sets the value of the parkingStatusValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingStatusValidity }
     *     
     */
    public void setParkingStatusValidity(ParkingStatusValidity value) {
        this.parkingStatusValidity = value;
    }

    /**
     * Gets the value of the overrideParkingThresholds property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingThresholds }
     *     
     */
    public ParkingThresholds getOverrideParkingThresholds() {
        return overrideParkingThresholds;
    }

    /**
     * Sets the value of the overrideParkingThresholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingThresholds }
     *     
     */
    public void setOverrideParkingThresholds(ParkingThresholds value) {
        this.overrideParkingThresholds = value;
    }

    /**
     * Gets the value of the parkingEquipmentOrServiceFacilityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingEquipmentOrServiceFacilityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingEquipmentOrServiceFacilityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus }
     * 
     * 
     */
    public List<ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus> getParkingEquipmentOrServiceFacilityStatus() {
        if (parkingEquipmentOrServiceFacilityStatus == null) {
            parkingEquipmentOrServiceFacilityStatus = new ArrayList<ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus>();
        }
        return this.parkingEquipmentOrServiceFacilityStatus;
    }

    /**
     * Gets the value of the parkingUsageScenarioStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingUsageScenarioStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingUsageScenarioStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordStatusScenarioIndexParkingUsageScenarioStatus }
     * 
     * 
     */
    public List<ParkingRecordStatusScenarioIndexParkingUsageScenarioStatus> getParkingUsageScenarioStatus() {
        if (parkingUsageScenarioStatus == null) {
            parkingUsageScenarioStatus = new ArrayList<ParkingRecordStatusScenarioIndexParkingUsageScenarioStatus>();
        }
        return this.parkingUsageScenarioStatus;
    }

    /**
     * Gets the value of the parkingAccessStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingAccessStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingAccessStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingAccessStatus }
     * 
     * 
     */
    public List<ParkingAccessStatus> getParkingAccessStatus() {
        if (parkingAccessStatus == null) {
            parkingAccessStatus = new ArrayList<ParkingAccessStatus>();
        }
        return this.parkingAccessStatus;
    }

    /**
     * Gets the value of the parkingRouteStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingRouteStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingRouteStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRouteStatus }
     * 
     * 
     */
    public List<ParkingRouteStatus> getParkingRouteStatus() {
        if (parkingRouteStatus == null) {
            parkingRouteStatus = new ArrayList<ParkingRouteStatus>();
        }
        return this.parkingRouteStatus;
    }

    /**
     * Gets the value of the parkingRecordStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingRecordStatusExtension() {
        return parkingRecordStatusExtension;
    }

    /**
     * Sets the value of the parkingRecordStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingRecordStatusExtension(ExtensionType value) {
        this.parkingRecordStatusExtension = value;
    }

}
