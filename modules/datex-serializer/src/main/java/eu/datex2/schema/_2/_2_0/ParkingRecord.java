
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="parkingAlias" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="parkingRecordVersionTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="parkingNumberOfSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingPrincipalNumberOfSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maximumParkingDuration" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="photoUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupanyDetectionType" type="{http://datex2.eu/schema/2/2_0}OccupancyDetectionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContact" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responisbleAuthority" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="securityService" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operator" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="servicePartner" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingVMS" type="{http://datex2.eu/schema/2/2_0}ParkingVMS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingLocation" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations"/&gt;
 *         &lt;element name="parkingRoute" type="{http://datex2.eu/schema/2/2_0}ParkingRoute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingColour" type="{http://datex2.eu/schema/2/2_0}RGBColour" minOccurs="0"/&gt;
 *         &lt;element name="onlyAssignedParking" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="assignedParkingAmongOthers" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="prohibitedParking" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="tariffsAndPayment" type="{http://datex2.eu/schema/2/2_0}TariffsAndPayment" minOccurs="0"/&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacility" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpace" type="{http://datex2.eu/schema/2/2_0}_ParkingSpace" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSpaces" type="{http://datex2.eu/schema/2/2_0}_GroupOfParkingSpaces" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingThresholds" type="{http://datex2.eu/schema/2/2_0}ParkingThresholds" minOccurs="0"/&gt;
 *         &lt;element name="permitsAndProhibitions" type="{http://datex2.eu/schema/2/2_0}PermitsAndProhibitions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="emergencyAssemblyPoint" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="entireArea" type="{http://datex2.eu/schema/2/2_0}Area" minOccurs="0"/&gt;
 *         &lt;element name="parkingRecordDimension" type="{http://datex2.eu/schema/2/2_0}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="parkingRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRecord", propOrder = {
    "parkingName",
    "parkingAlias",
    "parkingDescription",
    "parkingRecordVersionTime",
    "parkingNumberOfSpaces",
    "parkingPrincipalNumberOfSpaces",
    "maximumParkingDuration",
    "photoUrl",
    "urlLinkAddress",
    "parkingOccupanyDetectionType",
    "emergencyContact",
    "owner",
    "responisbleAuthority",
    "securityService",
    "operator",
    "servicePartner",
    "parkingVMS",
    "parkingLocation",
    "parkingRoute",
    "parkingColour",
    "onlyAssignedParking",
    "assignedParkingAmongOthers",
    "prohibitedParking",
    "tariffsAndPayment",
    "parkingEquipmentOrServiceFacility",
    "parkingSpace",
    "groupOfParkingSpaces",
    "parkingThresholds",
    "permitsAndProhibitions",
    "emergencyAssemblyPoint",
    "entireArea",
    "parkingRecordDimension",
    "parkingRecordExtension"
})
@XmlSeeAlso({
    GroupOfParkingSites.class,
    ParkingSite.class
})
public abstract class ParkingRecord {

    protected MultilingualString parkingName;
    protected List<MultilingualString> parkingAlias;
    protected MultilingualString parkingDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar parkingRecordVersionTime;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfSpaces;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingPrincipalNumberOfSpaces;
    protected Float maximumParkingDuration;
    @XmlSchemaType(name = "anyURI")
    protected String photoUrl;
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    @XmlSchemaType(name = "string")
    protected List<OccupancyDetectionTypeEnum> parkingOccupanyDetectionType;
    protected List<Contact> emergencyContact;
    protected List<Contact> owner;
    protected List<Contact> responisbleAuthority;
    protected List<Contact> securityService;
    protected List<Contact> operator;
    protected List<Contact> servicePartner;
    protected List<ParkingVMS> parkingVMS;
    @XmlElement(required = true)
    protected GroupOfLocations parkingLocation;
    protected List<ParkingRoute> parkingRoute;
    protected RGBColour parkingColour;
    protected ParkingAssignment onlyAssignedParking;
    protected ParkingAssignment assignedParkingAmongOthers;
    protected ParkingAssignment prohibitedParking;
    protected TariffsAndPayment tariffsAndPayment;
    protected List<ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility> parkingEquipmentOrServiceFacility;
    protected List<ParkingSpace> parkingSpace;
    protected List<GroupOfParkingSpaces> groupOfParkingSpaces;
    protected ParkingThresholds parkingThresholds;
    protected List<PermitsAndProhibitions> permitsAndProhibitions;
    protected GroupOfLocations emergencyAssemblyPoint;
    protected Area entireArea;
    protected Dimension parkingRecordDimension;
    protected ExtensionType parkingRecordExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the parkingName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingName() {
        return parkingName;
    }

    /**
     * Sets the value of the parkingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingName(MultilingualString value) {
        this.parkingName = value;
    }

    /**
     * Gets the value of the parkingAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getParkingAlias() {
        if (parkingAlias == null) {
            parkingAlias = new ArrayList<MultilingualString>();
        }
        return this.parkingAlias;
    }

    /**
     * Gets the value of the parkingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingDescription() {
        return parkingDescription;
    }

    /**
     * Sets the value of the parkingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingDescription(MultilingualString value) {
        this.parkingDescription = value;
    }

    /**
     * Gets the value of the parkingRecordVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingRecordVersionTime() {
        return parkingRecordVersionTime;
    }

    /**
     * Sets the value of the parkingRecordVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingRecordVersionTime(XMLGregorianCalendar value) {
        this.parkingRecordVersionTime = value;
    }

    /**
     * Gets the value of the parkingNumberOfSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfSpaces() {
        return parkingNumberOfSpaces;
    }

    /**
     * Sets the value of the parkingNumberOfSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfSpaces(BigInteger value) {
        this.parkingNumberOfSpaces = value;
    }

    /**
     * Gets the value of the parkingPrincipalNumberOfSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingPrincipalNumberOfSpaces() {
        return parkingPrincipalNumberOfSpaces;
    }

    /**
     * Sets the value of the parkingPrincipalNumberOfSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingPrincipalNumberOfSpaces(BigInteger value) {
        this.parkingPrincipalNumberOfSpaces = value;
    }

    /**
     * Gets the value of the maximumParkingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumParkingDuration() {
        return maximumParkingDuration;
    }

    /**
     * Sets the value of the maximumParkingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumParkingDuration(Float value) {
        this.maximumParkingDuration = value;
    }

    /**
     * Gets the value of the photoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets the value of the photoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoUrl(String value) {
        this.photoUrl = value;
    }

    /**
     * Gets the value of the urlLinkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Sets the value of the urlLinkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    /**
     * Gets the value of the parkingOccupanyDetectionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingOccupanyDetectionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingOccupanyDetectionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupancyDetectionTypeEnum }
     * 
     * 
     */
    public List<OccupancyDetectionTypeEnum> getParkingOccupanyDetectionType() {
        if (parkingOccupanyDetectionType == null) {
            parkingOccupanyDetectionType = new ArrayList<OccupancyDetectionTypeEnum>();
        }
        return this.parkingOccupanyDetectionType;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getEmergencyContact() {
        if (emergencyContact == null) {
            emergencyContact = new ArrayList<Contact>();
        }
        return this.emergencyContact;
    }

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getOwner() {
        if (owner == null) {
            owner = new ArrayList<Contact>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the responisbleAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the responisbleAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponisbleAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getResponisbleAuthority() {
        if (responisbleAuthority == null) {
            responisbleAuthority = new ArrayList<Contact>();
        }
        return this.responisbleAuthority;
    }

    /**
     * Gets the value of the securityService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the securityService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getSecurityService() {
        if (securityService == null) {
            securityService = new ArrayList<Contact>();
        }
        return this.securityService;
    }

    /**
     * Gets the value of the operator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getOperator() {
        if (operator == null) {
            operator = new ArrayList<Contact>();
        }
        return this.operator;
    }

    /**
     * Gets the value of the servicePartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the servicePartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getServicePartner() {
        if (servicePartner == null) {
            servicePartner = new ArrayList<Contact>();
        }
        return this.servicePartner;
    }

    /**
     * Gets the value of the parkingVMS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingVMS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingVMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingVMS }
     * 
     * 
     */
    public List<ParkingVMS> getParkingVMS() {
        if (parkingVMS == null) {
            parkingVMS = new ArrayList<ParkingVMS>();
        }
        return this.parkingVMS;
    }

    /**
     * Gets the value of the parkingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getParkingLocation() {
        return parkingLocation;
    }

    /**
     * Sets the value of the parkingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setParkingLocation(GroupOfLocations value) {
        this.parkingLocation = value;
    }

    /**
     * Gets the value of the parkingRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRoute }
     * 
     * 
     */
    public List<ParkingRoute> getParkingRoute() {
        if (parkingRoute == null) {
            parkingRoute = new ArrayList<ParkingRoute>();
        }
        return this.parkingRoute;
    }

    /**
     * Gets the value of the parkingColour property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColour }
     *     
     */
    public RGBColour getParkingColour() {
        return parkingColour;
    }

    /**
     * Sets the value of the parkingColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColour }
     *     
     */
    public void setParkingColour(RGBColour value) {
        this.parkingColour = value;
    }

    /**
     * Gets the value of the onlyAssignedParking property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssignment }
     *     
     */
    public ParkingAssignment getOnlyAssignedParking() {
        return onlyAssignedParking;
    }

    /**
     * Sets the value of the onlyAssignedParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssignment }
     *     
     */
    public void setOnlyAssignedParking(ParkingAssignment value) {
        this.onlyAssignedParking = value;
    }

    /**
     * Gets the value of the assignedParkingAmongOthers property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssignment }
     *     
     */
    public ParkingAssignment getAssignedParkingAmongOthers() {
        return assignedParkingAmongOthers;
    }

    /**
     * Sets the value of the assignedParkingAmongOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssignment }
     *     
     */
    public void setAssignedParkingAmongOthers(ParkingAssignment value) {
        this.assignedParkingAmongOthers = value;
    }

    /**
     * Gets the value of the prohibitedParking property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssignment }
     *     
     */
    public ParkingAssignment getProhibitedParking() {
        return prohibitedParking;
    }

    /**
     * Sets the value of the prohibitedParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssignment }
     *     
     */
    public void setProhibitedParking(ParkingAssignment value) {
        this.prohibitedParking = value;
    }

    /**
     * Gets the value of the tariffsAndPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TariffsAndPayment }
     *     
     */
    public TariffsAndPayment getTariffsAndPayment() {
        return tariffsAndPayment;
    }

    /**
     * Sets the value of the tariffsAndPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffsAndPayment }
     *     
     */
    public void setTariffsAndPayment(TariffsAndPayment value) {
        this.tariffsAndPayment = value;
    }

    /**
     * Gets the value of the parkingEquipmentOrServiceFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingEquipmentOrServiceFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingEquipmentOrServiceFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility }
     * 
     * 
     */
    public List<ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility> getParkingEquipmentOrServiceFacility() {
        if (parkingEquipmentOrServiceFacility == null) {
            parkingEquipmentOrServiceFacility = new ArrayList<ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility>();
        }
        return this.parkingEquipmentOrServiceFacility;
    }

    /**
     * Gets the value of the parkingSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSpace }
     * 
     * 
     */
    public List<ParkingSpace> getParkingSpace() {
        if (parkingSpace == null) {
            parkingSpace = new ArrayList<ParkingSpace>();
        }
        return this.parkingSpace;
    }

    /**
     * Gets the value of the groupOfParkingSpaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfParkingSpaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfParkingSpaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfParkingSpaces }
     * 
     * 
     */
    public List<GroupOfParkingSpaces> getGroupOfParkingSpaces() {
        if (groupOfParkingSpaces == null) {
            groupOfParkingSpaces = new ArrayList<GroupOfParkingSpaces>();
        }
        return this.groupOfParkingSpaces;
    }

    /**
     * Gets the value of the parkingThresholds property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingThresholds }
     *     
     */
    public ParkingThresholds getParkingThresholds() {
        return parkingThresholds;
    }

    /**
     * Sets the value of the parkingThresholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingThresholds }
     *     
     */
    public void setParkingThresholds(ParkingThresholds value) {
        this.parkingThresholds = value;
    }

    /**
     * Gets the value of the permitsAndProhibitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the permitsAndProhibitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermitsAndProhibitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermitsAndProhibitions }
     * 
     * 
     */
    public List<PermitsAndProhibitions> getPermitsAndProhibitions() {
        if (permitsAndProhibitions == null) {
            permitsAndProhibitions = new ArrayList<PermitsAndProhibitions>();
        }
        return this.permitsAndProhibitions;
    }

    /**
     * Gets the value of the emergencyAssemblyPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getEmergencyAssemblyPoint() {
        return emergencyAssemblyPoint;
    }

    /**
     * Sets the value of the emergencyAssemblyPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setEmergencyAssemblyPoint(GroupOfLocations value) {
        this.emergencyAssemblyPoint = value;
    }

    /**
     * Gets the value of the entireArea property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getEntireArea() {
        return entireArea;
    }

    /**
     * Sets the value of the entireArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setEntireArea(Area value) {
        this.entireArea = value;
    }

    /**
     * Gets the value of the parkingRecordDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getParkingRecordDimension() {
        return parkingRecordDimension;
    }

    /**
     * Sets the value of the parkingRecordDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setParkingRecordDimension(Dimension value) {
        this.parkingRecordDimension = value;
    }

    /**
     * Gets the value of the parkingRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingRecordExtension() {
        return parkingRecordExtension;
    }

    /**
     * Sets the value of the parkingRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingRecordExtension(ExtensionType value) {
        this.parkingRecordExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
