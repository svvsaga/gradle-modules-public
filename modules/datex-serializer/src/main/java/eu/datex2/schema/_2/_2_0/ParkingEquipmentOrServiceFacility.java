
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingEquipmentOrServiceFacility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingEquipmentOrServiceFacility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentOrServiceFacilityIdentifier" type="{http://datex2.eu/schema/2/2_0}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availability" type="{http://datex2.eu/schema/2/2_0}AvailabilityEnum" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEquipmentOrServiceFacility" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="additionalDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="otherEquipmentOrServiceFacility" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="accessibility" type="{http://datex2.eu/schema/2/2_0}AccessibilityEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nameOrBrand" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="photoUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="applicableForUser" type="{http://datex2.eu/schema/2/2_0}UserTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availabilityAndOpeningTimes" type="{http://datex2.eu/schema/2/2_0}OpeningTimes" minOccurs="0"/&gt;
 *         &lt;element name="tariffsAndPayment" type="{http://datex2.eu/schema/2/2_0}TariffsAndPayment" minOccurs="0"/&gt;
 *         &lt;element name="groupOfLocations" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="applicableForVehicles" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacilityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingEquipmentOrServiceFacility", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "equipmentOrServiceFacilityIdentifier",
    "availability",
    "numberOfEquipmentOrServiceFacility",
    "additionalDescription",
    "otherEquipmentOrServiceFacility",
    "accessibility",
    "nameOrBrand",
    "comment",
    "photoUrl",
    "applicableForUser",
    "availabilityAndOpeningTimes",
    "tariffsAndPayment",
    "groupOfLocations",
    "applicableForVehicles",
    "parkingEquipmentOrServiceFacilityExtension"
})
@XmlSeeAlso({
    Equipment.class,
    ServiceFacility.class
})
public abstract class ParkingEquipmentOrServiceFacility {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<String> equipmentOrServiceFacilityIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected AvailabilityEnum availability;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfEquipmentOrServiceFacility;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString additionalDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString otherEquipmentOrServiceFacility;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<AccessibilityEnum> accessibility;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString nameOrBrand;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString comment;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "anyURI")
    protected String photoUrl;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<UserTypeEnum> applicableForUser;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected OpeningTimes availabilityAndOpeningTimes;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected TariffsAndPayment tariffsAndPayment;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected GroupOfLocations groupOfLocations;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<VehicleCharacteristics> applicableForVehicles;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingEquipmentOrServiceFacilityExtension;

    /**
     * Gets the value of the equipmentOrServiceFacilityIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentOrServiceFacilityIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentOrServiceFacilityIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentOrServiceFacilityIdentifier() {
        if (equipmentOrServiceFacilityIdentifier == null) {
            equipmentOrServiceFacilityIdentifier = new ArrayList<String>();
        }
        return this.equipmentOrServiceFacilityIdentifier;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityEnum }
     *     
     */
    public AvailabilityEnum getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityEnum }
     *     
     */
    public void setAvailability(AvailabilityEnum value) {
        this.availability = value;
    }

    /**
     * Gets the value of the numberOfEquipmentOrServiceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEquipmentOrServiceFacility() {
        return numberOfEquipmentOrServiceFacility;
    }

    /**
     * Sets the value of the numberOfEquipmentOrServiceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEquipmentOrServiceFacility(BigInteger value) {
        this.numberOfEquipmentOrServiceFacility = value;
    }

    /**
     * Gets the value of the additionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdditionalDescription() {
        return additionalDescription;
    }

    /**
     * Sets the value of the additionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdditionalDescription(MultilingualString value) {
        this.additionalDescription = value;
    }

    /**
     * Gets the value of the otherEquipmentOrServiceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getOtherEquipmentOrServiceFacility() {
        return otherEquipmentOrServiceFacility;
    }

    /**
     * Sets the value of the otherEquipmentOrServiceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setOtherEquipmentOrServiceFacility(MultilingualString value) {
        this.otherEquipmentOrServiceFacility = value;
    }

    /**
     * Gets the value of the accessibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityEnum }
     * 
     * 
     */
    public List<AccessibilityEnum> getAccessibility() {
        if (accessibility == null) {
            accessibility = new ArrayList<AccessibilityEnum>();
        }
        return this.accessibility;
    }

    /**
     * Gets the value of the nameOrBrand property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameOrBrand() {
        return nameOrBrand;
    }

    /**
     * Sets the value of the nameOrBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameOrBrand(MultilingualString value) {
        this.nameOrBrand = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setComment(MultilingualString value) {
        this.comment = value;
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
     * Gets the value of the applicableForUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTypeEnum }
     * 
     * 
     */
    public List<UserTypeEnum> getApplicableForUser() {
        if (applicableForUser == null) {
            applicableForUser = new ArrayList<UserTypeEnum>();
        }
        return this.applicableForUser;
    }

    /**
     * Gets the value of the availabilityAndOpeningTimes property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningTimes }
     *     
     */
    public OpeningTimes getAvailabilityAndOpeningTimes() {
        return availabilityAndOpeningTimes;
    }

    /**
     * Sets the value of the availabilityAndOpeningTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningTimes }
     *     
     */
    public void setAvailabilityAndOpeningTimes(OpeningTimes value) {
        this.availabilityAndOpeningTimes = value;
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
     * Gets the value of the groupOfLocations property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Sets the value of the groupOfLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    /**
     * Gets the value of the applicableForVehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForVehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getApplicableForVehicles() {
        if (applicableForVehicles == null) {
            applicableForVehicles = new ArrayList<VehicleCharacteristics>();
        }
        return this.applicableForVehicles;
    }

    /**
     * Gets the value of the parkingEquipmentOrServiceFacilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingEquipmentOrServiceFacilityExtension() {
        return parkingEquipmentOrServiceFacilityExtension;
    }

    /**
     * Sets the value of the parkingEquipmentOrServiceFacilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingEquipmentOrServiceFacilityExtension(ExtensionType value) {
        this.parkingEquipmentOrServiceFacilityExtension = value;
    }

}
