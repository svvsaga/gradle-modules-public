
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingVehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRecordReference" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordVersionedReference"/&gt;
 *         &lt;element name="parkingSpaceReference" type="{http://datex2.eu/schema/2/2_0}IndexReference" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSpacesReference" type="{http://datex2.eu/schema/2/2_0}IndexReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingPermit" type="{http://datex2.eu/schema/2/2_0}ParkingPermit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicle" type="{http://datex2.eu/schema/2/2_0}Vehicle"/&gt;
 *         &lt;element name="individualCharge" type="{http://datex2.eu/schema/2/2_0}IndividualCharge" minOccurs="0"/&gt;
 *         &lt;element name="parkingPeriod" type="{http://datex2.eu/schema/2/2_0}OverallPeriod" minOccurs="0"/&gt;
 *         &lt;element name="parkingVehicleExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "ParkingVehicle", propOrder = {
    "parkingRecordReference",
    "parkingSpaceReference",
    "groupOfParkingSpacesReference",
    "parkingPermit",
    "vehicle",
    "individualCharge",
    "parkingPeriod",
    "parkingVehicleExtension"
})
public class ParkingVehicle {

    @XmlElement(required = true)
    protected _ParkingRecordVersionedReference parkingRecordReference;
    protected String parkingSpaceReference;
    protected List<String> groupOfParkingSpacesReference;
    protected List<ParkingPermit> parkingPermit;
    @XmlElement(required = true)
    protected Vehicle vehicle;
    protected IndividualCharge individualCharge;
    protected OverallPeriod parkingPeriod;
    protected _ExtensionType parkingVehicleExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the parkingRecordReference property.
     * 
     * @return
     *     possible object is
     *     {@link _ParkingRecordVersionedReference }
     *     
     */
    public _ParkingRecordVersionedReference getParkingRecordReference() {
        return parkingRecordReference;
    }

    /**
     * Sets the value of the parkingRecordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ParkingRecordVersionedReference }
     *     
     */
    public void setParkingRecordReference(_ParkingRecordVersionedReference value) {
        this.parkingRecordReference = value;
    }

    /**
     * Gets the value of the parkingSpaceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingSpaceReference() {
        return parkingSpaceReference;
    }

    /**
     * Sets the value of the parkingSpaceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingSpaceReference(String value) {
        this.parkingSpaceReference = value;
    }

    /**
     * Gets the value of the groupOfParkingSpacesReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfParkingSpacesReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfParkingSpacesReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupOfParkingSpacesReference() {
        if (groupOfParkingSpacesReference == null) {
            groupOfParkingSpacesReference = new ArrayList<String>();
        }
        return this.groupOfParkingSpacesReference;
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
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the individualCharge property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCharge }
     *     
     */
    public IndividualCharge getIndividualCharge() {
        return individualCharge;
    }

    /**
     * Sets the value of the individualCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCharge }
     *     
     */
    public void setIndividualCharge(IndividualCharge value) {
        this.individualCharge = value;
    }

    /**
     * Gets the value of the parkingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getParkingPeriod() {
        return parkingPeriod;
    }

    /**
     * Sets the value of the parkingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setParkingPeriod(OverallPeriod value) {
        this.parkingPeriod = value;
    }

    /**
     * Gets the value of the parkingVehicleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingVehicleExtension() {
        return parkingVehicleExtension;
    }

    /**
     * Sets the value of the parkingVehicleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingVehicleExtension(_ExtensionType value) {
        this.parkingVehicleExtension = value;
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
