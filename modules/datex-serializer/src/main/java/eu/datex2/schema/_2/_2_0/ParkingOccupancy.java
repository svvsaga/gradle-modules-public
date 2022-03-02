
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
 * <p>Java class for ParkingOccupancy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingOccupancy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingNumberOfSpacesOverride" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingNumberOfVacantSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingNumberOfVacantSpacesLowerThan" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingNumberOfVacantSpacesHigherThan" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingNumberOfVacantSpacesGraded" type="{http://datex2.eu/schema/2/2_0}ParkingVacantSpacesEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingNumberOfOccupiedSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingNumberOfVehicles" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupancy" type="{http://datex2.eu/schema/2/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupancyGraded" type="{http://datex2.eu/schema/2/2_0}ParkingOccupancyEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupancyTrend" type="{http://datex2.eu/schema/2/2_0}ParkingOccupancyTrendEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingNotAllowed" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountAndRate" type="{http://datex2.eu/schema/2/2_0}VehicleCountAndRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingOccupancyExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingOccupancy", propOrder = {
    "parkingNumberOfSpacesOverride",
    "parkingNumberOfVacantSpaces",
    "parkingNumberOfVacantSpacesLowerThan",
    "parkingNumberOfVacantSpacesHigherThan",
    "parkingNumberOfVacantSpacesGraded",
    "parkingNumberOfOccupiedSpaces",
    "parkingNumberOfVehicles",
    "parkingOccupancy",
    "parkingOccupancyGraded",
    "parkingOccupancyTrend",
    "parkingNotAllowed",
    "vehicleCountAndRate",
    "parkingOccupancyExtension"
})
@XmlSeeAlso({
    GroupOfParkingSpacesStatus.class
})
public class ParkingOccupancy {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfSpacesOverride;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfVacantSpaces;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfVacantSpacesLowerThan;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfVacantSpacesHigherThan;
    @XmlSchemaType(name = "string")
    protected ParkingVacantSpacesEnum parkingNumberOfVacantSpacesGraded;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfOccupiedSpaces;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfVehicles;
    protected Float parkingOccupancy;
    @XmlSchemaType(name = "string")
    protected ParkingOccupancyEnum parkingOccupancyGraded;
    @XmlSchemaType(name = "string")
    protected ParkingOccupancyTrendEnum parkingOccupancyTrend;
    protected Boolean parkingNotAllowed;
    protected List<VehicleCountAndRate> vehicleCountAndRate;
    protected ExtensionType parkingOccupancyExtension;

    /**
     * Gets the value of the parkingNumberOfSpacesOverride property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfSpacesOverride() {
        return parkingNumberOfSpacesOverride;
    }

    /**
     * Sets the value of the parkingNumberOfSpacesOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfSpacesOverride(BigInteger value) {
        this.parkingNumberOfSpacesOverride = value;
    }

    /**
     * Gets the value of the parkingNumberOfVacantSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfVacantSpaces() {
        return parkingNumberOfVacantSpaces;
    }

    /**
     * Sets the value of the parkingNumberOfVacantSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfVacantSpaces(BigInteger value) {
        this.parkingNumberOfVacantSpaces = value;
    }

    /**
     * Gets the value of the parkingNumberOfVacantSpacesLowerThan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfVacantSpacesLowerThan() {
        return parkingNumberOfVacantSpacesLowerThan;
    }

    /**
     * Sets the value of the parkingNumberOfVacantSpacesLowerThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfVacantSpacesLowerThan(BigInteger value) {
        this.parkingNumberOfVacantSpacesLowerThan = value;
    }

    /**
     * Gets the value of the parkingNumberOfVacantSpacesHigherThan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfVacantSpacesHigherThan() {
        return parkingNumberOfVacantSpacesHigherThan;
    }

    /**
     * Sets the value of the parkingNumberOfVacantSpacesHigherThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfVacantSpacesHigherThan(BigInteger value) {
        this.parkingNumberOfVacantSpacesHigherThan = value;
    }

    /**
     * Gets the value of the parkingNumberOfVacantSpacesGraded property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingVacantSpacesEnum }
     *     
     */
    public ParkingVacantSpacesEnum getParkingNumberOfVacantSpacesGraded() {
        return parkingNumberOfVacantSpacesGraded;
    }

    /**
     * Sets the value of the parkingNumberOfVacantSpacesGraded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingVacantSpacesEnum }
     *     
     */
    public void setParkingNumberOfVacantSpacesGraded(ParkingVacantSpacesEnum value) {
        this.parkingNumberOfVacantSpacesGraded = value;
    }

    /**
     * Gets the value of the parkingNumberOfOccupiedSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfOccupiedSpaces() {
        return parkingNumberOfOccupiedSpaces;
    }

    /**
     * Sets the value of the parkingNumberOfOccupiedSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfOccupiedSpaces(BigInteger value) {
        this.parkingNumberOfOccupiedSpaces = value;
    }

    /**
     * Gets the value of the parkingNumberOfVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfVehicles() {
        return parkingNumberOfVehicles;
    }

    /**
     * Sets the value of the parkingNumberOfVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfVehicles(BigInteger value) {
        this.parkingNumberOfVehicles = value;
    }

    /**
     * Gets the value of the parkingOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getParkingOccupancy() {
        return parkingOccupancy;
    }

    /**
     * Sets the value of the parkingOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setParkingOccupancy(Float value) {
        this.parkingOccupancy = value;
    }

    /**
     * Gets the value of the parkingOccupancyGraded property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingOccupancyEnum }
     *     
     */
    public ParkingOccupancyEnum getParkingOccupancyGraded() {
        return parkingOccupancyGraded;
    }

    /**
     * Sets the value of the parkingOccupancyGraded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingOccupancyEnum }
     *     
     */
    public void setParkingOccupancyGraded(ParkingOccupancyEnum value) {
        this.parkingOccupancyGraded = value;
    }

    /**
     * Gets the value of the parkingOccupancyTrend property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingOccupancyTrendEnum }
     *     
     */
    public ParkingOccupancyTrendEnum getParkingOccupancyTrend() {
        return parkingOccupancyTrend;
    }

    /**
     * Sets the value of the parkingOccupancyTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingOccupancyTrendEnum }
     *     
     */
    public void setParkingOccupancyTrend(ParkingOccupancyTrendEnum value) {
        this.parkingOccupancyTrend = value;
    }

    /**
     * Gets the value of the parkingNotAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkingNotAllowed() {
        return parkingNotAllowed;
    }

    /**
     * Sets the value of the parkingNotAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkingNotAllowed(Boolean value) {
        this.parkingNotAllowed = value;
    }

    /**
     * Gets the value of the vehicleCountAndRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCountAndRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCountAndRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCountAndRate }
     * 
     * 
     */
    public List<VehicleCountAndRate> getVehicleCountAndRate() {
        if (vehicleCountAndRate == null) {
            vehicleCountAndRate = new ArrayList<VehicleCountAndRate>();
        }
        return this.vehicleCountAndRate;
    }

    /**
     * Gets the value of the parkingOccupancyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingOccupancyExtension() {
        return parkingOccupancyExtension;
    }

    /**
     * Sets the value of the parkingOccupancyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingOccupancyExtension(ExtensionType value) {
        this.parkingOccupancyExtension = value;
    }

}
