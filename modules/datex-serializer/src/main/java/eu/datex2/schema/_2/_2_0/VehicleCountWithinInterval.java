
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleCountWithinInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCountWithinInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementOrCalcualtionTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="measurementInterval" type="{http://datex2.eu/schema/2/2_0}Seconds"/&gt;
 *         &lt;element name="numberOfIncomingVehicles" type="{http://datex2.eu/schema/2/2_0}VehicleCountValue" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOutgoingVehicles" type="{http://datex2.eu/schema/2/2_0}VehicleCountValue" minOccurs="0"/&gt;
 *         &lt;element name="changeOfOccupiedSpaces" type="{http://datex2.eu/schema/2/2_0}OccupancyChangeValue" minOccurs="0"/&gt;
 *         &lt;element name="countedVehicles" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountWithinIntervalExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCountWithinInterval", propOrder = {
    "measurementOrCalcualtionTime",
    "measurementInterval",
    "numberOfIncomingVehicles",
    "numberOfOutgoingVehicles",
    "changeOfOccupiedSpaces",
    "countedVehicles",
    "vehicleCountWithinIntervalExtension"
})
public class VehicleCountWithinInterval {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementOrCalcualtionTime;
    protected float measurementInterval;
    protected VehicleCountValue numberOfIncomingVehicles;
    protected VehicleCountValue numberOfOutgoingVehicles;
    protected OccupancyChangeValue changeOfOccupiedSpaces;
    protected VehicleCharacteristics countedVehicles;
    protected ExtensionType vehicleCountWithinIntervalExtension;

    /**
     * Gets the value of the measurementOrCalcualtionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementOrCalcualtionTime() {
        return measurementOrCalcualtionTime;
    }

    /**
     * Sets the value of the measurementOrCalcualtionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementOrCalcualtionTime(XMLGregorianCalendar value) {
        this.measurementOrCalcualtionTime = value;
    }

    /**
     * Gets the value of the measurementInterval property.
     * 
     */
    public float getMeasurementInterval() {
        return measurementInterval;
    }

    /**
     * Sets the value of the measurementInterval property.
     * 
     */
    public void setMeasurementInterval(float value) {
        this.measurementInterval = value;
    }

    /**
     * Gets the value of the numberOfIncomingVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCountValue }
     *     
     */
    public VehicleCountValue getNumberOfIncomingVehicles() {
        return numberOfIncomingVehicles;
    }

    /**
     * Sets the value of the numberOfIncomingVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCountValue }
     *     
     */
    public void setNumberOfIncomingVehicles(VehicleCountValue value) {
        this.numberOfIncomingVehicles = value;
    }

    /**
     * Gets the value of the numberOfOutgoingVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCountValue }
     *     
     */
    public VehicleCountValue getNumberOfOutgoingVehicles() {
        return numberOfOutgoingVehicles;
    }

    /**
     * Sets the value of the numberOfOutgoingVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCountValue }
     *     
     */
    public void setNumberOfOutgoingVehicles(VehicleCountValue value) {
        this.numberOfOutgoingVehicles = value;
    }

    /**
     * Gets the value of the changeOfOccupiedSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyChangeValue }
     *     
     */
    public OccupancyChangeValue getChangeOfOccupiedSpaces() {
        return changeOfOccupiedSpaces;
    }

    /**
     * Sets the value of the changeOfOccupiedSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyChangeValue }
     *     
     */
    public void setChangeOfOccupiedSpaces(OccupancyChangeValue value) {
        this.changeOfOccupiedSpaces = value;
    }

    /**
     * Gets the value of the countedVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getCountedVehicles() {
        return countedVehicles;
    }

    /**
     * Sets the value of the countedVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setCountedVehicles(VehicleCharacteristics value) {
        this.countedVehicles = value;
    }

    /**
     * Gets the value of the vehicleCountWithinIntervalExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleCountWithinIntervalExtension() {
        return vehicleCountWithinIntervalExtension;
    }

    /**
     * Sets the value of the vehicleCountWithinIntervalExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleCountWithinIntervalExtension(ExtensionType value) {
        this.vehicleCountWithinIntervalExtension = value;
    }

}
