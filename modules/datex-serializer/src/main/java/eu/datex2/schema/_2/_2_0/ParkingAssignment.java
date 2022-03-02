
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableForUser" type="{http://datex2.eu/schema/2/2_0}UserTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingDuration" type="{http://datex2.eu/schema/2/2_0}ParkingDurationEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardousMaterials" type="{http://datex2.eu/schema/2/2_0}HazardousMaterials" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timePeriodByHour" type="{http://datex2.eu/schema/2/2_0}TimePeriodByHour" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingPermit" type="{http://datex2.eu/schema/2/2_0}ParkingPermit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingAssignmentExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingAssignment", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "applicableForUser",
    "parkingDuration",
    "vehicleCharacteristics",
    "hazardousMaterials",
    "timePeriodByHour",
    "parkingPermit",
    "parkingAssignmentExtension"
})
public class ParkingAssignment {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<UserTypeEnum> applicableForUser;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<ParkingDurationEnum> parkingDuration;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<VehicleCharacteristics> vehicleCharacteristics;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<HazardousMaterials> hazardousMaterials;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<TimePeriodByHour> timePeriodByHour;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<ParkingPermit> parkingPermit;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingAssignmentExtension;

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
     * Gets the value of the parkingDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingDurationEnum }
     * 
     * 
     */
    public List<ParkingDurationEnum> getParkingDuration() {
        if (parkingDuration == null) {
            parkingDuration = new ArrayList<ParkingDurationEnum>();
        }
        return this.parkingDuration;
    }

    /**
     * Gets the value of the vehicleCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getVehicleCharacteristics() {
        if (vehicleCharacteristics == null) {
            vehicleCharacteristics = new ArrayList<VehicleCharacteristics>();
        }
        return this.vehicleCharacteristics;
    }

    /**
     * Gets the value of the hazardousMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterials }
     * 
     * 
     */
    public List<HazardousMaterials> getHazardousMaterials() {
        if (hazardousMaterials == null) {
            hazardousMaterials = new ArrayList<HazardousMaterials>();
        }
        return this.hazardousMaterials;
    }

    /**
     * Gets the value of the timePeriodByHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timePeriodByHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePeriodByHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodByHour }
     * 
     * 
     */
    public List<TimePeriodByHour> getTimePeriodByHour() {
        if (timePeriodByHour == null) {
            timePeriodByHour = new ArrayList<TimePeriodByHour>();
        }
        return this.timePeriodByHour;
    }

    /**
     * Gets the value of the parkingPermit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingPermit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingPermit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingPermit }
     * 
     * 
     */
    public List<ParkingPermit> getParkingPermit() {
        if (parkingPermit == null) {
            parkingPermit = new ArrayList<ParkingPermit>();
        }
        return this.parkingPermit;
    }

    /**
     * Gets the value of the parkingAssignmentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingAssignmentExtension() {
        return parkingAssignmentExtension;
    }

    /**
     * Sets the value of the parkingAssignmentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingAssignmentExtension(ExtensionType value) {
        this.parkingAssignmentExtension = value;
    }

}
