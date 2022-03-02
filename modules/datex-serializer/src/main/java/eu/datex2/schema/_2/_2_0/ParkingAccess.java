
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessCategory" type="{http://datex2.eu/schema/2/2_0}AccessCategoryEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="accessName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="accessEquipment" type="{http://datex2.eu/schema/2/2_0}AccessEquipmentEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accessibility" type="{http://datex2.eu/schema/2/2_0}AccessibilityEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="photoUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="accessOnlyAssignedFor" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="accessAssignedAmongOthers" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="accessProhibitedFor" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="primaryRoad" type="{http://datex2.eu/schema/2/2_0}Road" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/&gt;
 *         &lt;element name="openingTimes" type="{http://datex2.eu/schema/2/2_0}OpeningTimes" minOccurs="0"/&gt;
 *         &lt;element name="parkingAccessExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingAccess", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "accessCategory",
    "accessName",
    "accessEquipment",
    "accessibility",
    "photoUrl",
    "accessOnlyAssignedFor",
    "accessAssignedAmongOthers",
    "accessProhibitedFor",
    "primaryRoad",
    "location",
    "openingTimes",
    "parkingAccessExtension"
})
public class ParkingAccess {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected List<AccessCategoryEnum> accessCategory;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString accessName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<AccessEquipmentEnum> accessEquipment;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<AccessibilityEnum> accessibility;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "anyURI")
    protected String photoUrl;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ParkingAssignment accessOnlyAssignedFor;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ParkingAssignment accessAssignedAmongOthers;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ParkingAssignment accessProhibitedFor;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<Road> primaryRoad;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Location location;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected OpeningTimes openingTimes;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingAccessExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the accessCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessCategoryEnum }
     * 
     * 
     */
    public List<AccessCategoryEnum> getAccessCategory() {
        if (accessCategory == null) {
            accessCategory = new ArrayList<AccessCategoryEnum>();
        }
        return this.accessCategory;
    }

    /**
     * Gets the value of the accessName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAccessName() {
        return accessName;
    }

    /**
     * Sets the value of the accessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAccessName(MultilingualString value) {
        this.accessName = value;
    }

    /**
     * Gets the value of the accessEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessEquipmentEnum }
     * 
     * 
     */
    public List<AccessEquipmentEnum> getAccessEquipment() {
        if (accessEquipment == null) {
            accessEquipment = new ArrayList<AccessEquipmentEnum>();
        }
        return this.accessEquipment;
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
     * Gets the value of the accessOnlyAssignedFor property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssignment }
     *     
     */
    public ParkingAssignment getAccessOnlyAssignedFor() {
        return accessOnlyAssignedFor;
    }

    /**
     * Sets the value of the accessOnlyAssignedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssignment }
     *     
     */
    public void setAccessOnlyAssignedFor(ParkingAssignment value) {
        this.accessOnlyAssignedFor = value;
    }

    /**
     * Gets the value of the accessAssignedAmongOthers property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssignment }
     *     
     */
    public ParkingAssignment getAccessAssignedAmongOthers() {
        return accessAssignedAmongOthers;
    }

    /**
     * Sets the value of the accessAssignedAmongOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssignment }
     *     
     */
    public void setAccessAssignedAmongOthers(ParkingAssignment value) {
        this.accessAssignedAmongOthers = value;
    }

    /**
     * Gets the value of the accessProhibitedFor property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssignment }
     *     
     */
    public ParkingAssignment getAccessProhibitedFor() {
        return accessProhibitedFor;
    }

    /**
     * Sets the value of the accessProhibitedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssignment }
     *     
     */
    public void setAccessProhibitedFor(ParkingAssignment value) {
        this.accessProhibitedFor = value;
    }

    /**
     * Gets the value of the primaryRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the primaryRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Road }
     * 
     * 
     */
    public List<Road> getPrimaryRoad() {
        if (primaryRoad == null) {
            primaryRoad = new ArrayList<Road>();
        }
        return this.primaryRoad;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the openingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningTimes }
     *     
     */
    public OpeningTimes getOpeningTimes() {
        return openingTimes;
    }

    /**
     * Sets the value of the openingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningTimes }
     *     
     */
    public void setOpeningTimes(OpeningTimes value) {
        this.openingTimes = value;
    }

    /**
     * Gets the value of the parkingAccessExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingAccessExtension() {
        return parkingAccessExtension;
    }

    /**
     * Sets the value of the parkingAccessExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingAccessExtension(ExtensionType value) {
        this.parkingAccessExtension = value;
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

}
