
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpaceBasics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSpaceBasics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingSpaceOrGroupIdentifier" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="parkingFloorOrLevel" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/&gt;
 *         &lt;element name="accessibility" type="{http://datex2.eu/schema/2/2_0}AccessibilityEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceAccessibility" type="{http://datex2.eu/schema/2/2_0}ParkingSpaceAccessibilityEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpacePhysics" type="{http://datex2.eu/schema/2/2_0}ParkingSpacePhysicsEnum" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="parkingMode" type="{http://datex2.eu/schema/2/2_0}ParkingModeEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingReservation" type="{http://datex2.eu/schema/2/2_0}ReservationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="maximumParkingDuration" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromPrimaryRoad" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupanyDetectionType" type="{http://datex2.eu/schema/2/2_0}OccupancyDetectionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSecurity" type="{http://datex2.eu/schema/2/2_0}ParkingSecurityEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dedicatedAccess" type="{http://datex2.eu/schema/2/2_0}DedicatedAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="onlyAssignedParking" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="assignedParkingAmongOthers" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="prohibitedParking" type="{http://datex2.eu/schema/2/2_0}ParkingAssignment" minOccurs="0"/&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacility" type="{http://datex2.eu/schema/2/2_0}_ParkingSpaceBasicsEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingUsageScenario" type="{http://datex2.eu/schema/2/2_0}_ParkingSpaceBasicsScenarioIndexParkingUsageScenario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceBasicsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSpaceBasics", propOrder = {
    "parkingSpaceOrGroupIdentifier",
    "parkingFloorOrLevel",
    "accessibility",
    "parkingSpaceAccessibility",
    "parkingSpacePhysics",
    "parkingMode",
    "parkingReservation",
    "maximumParkingDuration",
    "distanceFromPrimaryRoad",
    "parkingOccupanyDetectionType",
    "parkingSecurity",
    "dedicatedAccess",
    "onlyAssignedParking",
    "assignedParkingAmongOthers",
    "prohibitedParking",
    "parkingEquipmentOrServiceFacility",
    "parkingUsageScenario",
    "parkingSpaceBasicsExtension"
})
@XmlSeeAlso({
    GroupOfParkingSpaces2 .class,
    ParkingSpace2 .class
})
public abstract class ParkingSpaceBasics {

    protected MultilingualString parkingSpaceOrGroupIdentifier;
    protected BigInteger parkingFloorOrLevel;
    @XmlSchemaType(name = "string")
    protected List<AccessibilityEnum> accessibility;
    @XmlSchemaType(name = "string")
    protected List<ParkingSpaceAccessibilityEnum> parkingSpaceAccessibility;
    @XmlSchemaType(name = "string")
    protected List<ParkingSpacePhysicsEnum> parkingSpacePhysics;
    @XmlSchemaType(name = "string")
    protected ParkingModeEnum parkingMode;
    @XmlSchemaType(name = "string")
    protected ReservationTypeEnum parkingReservation;
    protected Float maximumParkingDuration;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromPrimaryRoad;
    @XmlSchemaType(name = "string")
    protected List<OccupancyDetectionTypeEnum> parkingOccupanyDetectionType;
    @XmlSchemaType(name = "string")
    protected List<ParkingSecurityEnum> parkingSecurity;
    protected List<DedicatedAccess> dedicatedAccess;
    protected ParkingAssignment onlyAssignedParking;
    protected ParkingAssignment assignedParkingAmongOthers;
    protected ParkingAssignment prohibitedParking;
    protected List<ParkingSpaceBasicsEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility> parkingEquipmentOrServiceFacility;
    protected List<ParkingSpaceBasicsScenarioIndexParkingUsageScenario> parkingUsageScenario;
    protected ExtensionType parkingSpaceBasicsExtension;

    /**
     * Gets the value of the parkingSpaceOrGroupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingSpaceOrGroupIdentifier() {
        return parkingSpaceOrGroupIdentifier;
    }

    /**
     * Sets the value of the parkingSpaceOrGroupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingSpaceOrGroupIdentifier(MultilingualString value) {
        this.parkingSpaceOrGroupIdentifier = value;
    }

    /**
     * Gets the value of the parkingFloorOrLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingFloorOrLevel() {
        return parkingFloorOrLevel;
    }

    /**
     * Sets the value of the parkingFloorOrLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingFloorOrLevel(BigInteger value) {
        this.parkingFloorOrLevel = value;
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
     * Gets the value of the parkingSpaceAccessibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSpaceAccessibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSpaceAccessibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSpaceAccessibilityEnum }
     * 
     * 
     */
    public List<ParkingSpaceAccessibilityEnum> getParkingSpaceAccessibility() {
        if (parkingSpaceAccessibility == null) {
            parkingSpaceAccessibility = new ArrayList<ParkingSpaceAccessibilityEnum>();
        }
        return this.parkingSpaceAccessibility;
    }

    /**
     * Gets the value of the parkingSpacePhysics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSpacePhysics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSpacePhysics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSpacePhysicsEnum }
     * 
     * 
     */
    public List<ParkingSpacePhysicsEnum> getParkingSpacePhysics() {
        if (parkingSpacePhysics == null) {
            parkingSpacePhysics = new ArrayList<ParkingSpacePhysicsEnum>();
        }
        return this.parkingSpacePhysics;
    }

    /**
     * Gets the value of the parkingMode property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingModeEnum }
     *     
     */
    public ParkingModeEnum getParkingMode() {
        return parkingMode;
    }

    /**
     * Sets the value of the parkingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingModeEnum }
     *     
     */
    public void setParkingMode(ParkingModeEnum value) {
        this.parkingMode = value;
    }

    /**
     * Gets the value of the parkingReservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationTypeEnum }
     *     
     */
    public ReservationTypeEnum getParkingReservation() {
        return parkingReservation;
    }

    /**
     * Sets the value of the parkingReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationTypeEnum }
     *     
     */
    public void setParkingReservation(ReservationTypeEnum value) {
        this.parkingReservation = value;
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
     * Gets the value of the distanceFromPrimaryRoad property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromPrimaryRoad() {
        return distanceFromPrimaryRoad;
    }

    /**
     * Sets the value of the distanceFromPrimaryRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromPrimaryRoad(BigInteger value) {
        this.distanceFromPrimaryRoad = value;
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
     * Gets the value of the parkingSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSecurityEnum }
     * 
     * 
     */
    public List<ParkingSecurityEnum> getParkingSecurity() {
        if (parkingSecurity == null) {
            parkingSecurity = new ArrayList<ParkingSecurityEnum>();
        }
        return this.parkingSecurity;
    }

    /**
     * Gets the value of the dedicatedAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dedicatedAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDedicatedAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DedicatedAccess }
     * 
     * 
     */
    public List<DedicatedAccess> getDedicatedAccess() {
        if (dedicatedAccess == null) {
            dedicatedAccess = new ArrayList<DedicatedAccess>();
        }
        return this.dedicatedAccess;
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
     * {@link ParkingSpaceBasicsEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility }
     * 
     * 
     */
    public List<ParkingSpaceBasicsEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility> getParkingEquipmentOrServiceFacility() {
        if (parkingEquipmentOrServiceFacility == null) {
            parkingEquipmentOrServiceFacility = new ArrayList<ParkingSpaceBasicsEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility>();
        }
        return this.parkingEquipmentOrServiceFacility;
    }

    /**
     * Gets the value of the parkingUsageScenario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingUsageScenario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingUsageScenario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSpaceBasicsScenarioIndexParkingUsageScenario }
     * 
     * 
     */
    public List<ParkingSpaceBasicsScenarioIndexParkingUsageScenario> getParkingUsageScenario() {
        if (parkingUsageScenario == null) {
            parkingUsageScenario = new ArrayList<ParkingSpaceBasicsScenarioIndexParkingUsageScenario>();
        }
        return this.parkingUsageScenario;
    }

    /**
     * Gets the value of the parkingSpaceBasicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingSpaceBasicsExtension() {
        return parkingSpaceBasicsExtension;
    }

    /**
     * Sets the value of the parkingSpaceBasicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingSpaceBasicsExtension(ExtensionType value) {
        this.parkingSpaceBasicsExtension = value;
    }

}
