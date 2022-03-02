
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarParks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarParks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carParkConfiguration" type="{http://datex2.eu/schema/2/2_0}CarParkConfigurationEnum" minOccurs="0"/&gt;
 *         &lt;element name="carParkIdentity" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="carParkOccupancy" type="{http://datex2.eu/schema/2/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="carParkStatus" type="{http://datex2.eu/schema/2/2_0}CarParkStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="exitRate" type="{http://datex2.eu/schema/2/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="fillRate" type="{http://datex2.eu/schema/2/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVacantParkingSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="occupiedSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="queuingTime" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="totalCapacity" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="carParksExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarParks", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "carParkConfiguration",
    "carParkIdentity",
    "carParkOccupancy",
    "carParkStatus",
    "exitRate",
    "fillRate",
    "numberOfVacantParkingSpaces",
    "occupiedSpaces",
    "queuingTime",
    "totalCapacity",
    "carParksExtension"
})
public class CarParks
    extends NonRoadEventInformation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected CarParkConfigurationEnum carParkConfiguration;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String carParkIdentity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float carParkOccupancy;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected CarParkStatusEnum carParkStatus;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger exitRate;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fillRate;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVacantParkingSpaces;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger occupiedSpaces;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float queuingTime;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType carParksExtension;

    /**
     * Gets the value of the carParkConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public CarParkConfigurationEnum getCarParkConfiguration() {
        return carParkConfiguration;
    }

    /**
     * Sets the value of the carParkConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public void setCarParkConfiguration(CarParkConfigurationEnum value) {
        this.carParkConfiguration = value;
    }

    /**
     * Gets the value of the carParkIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarParkIdentity() {
        return carParkIdentity;
    }

    /**
     * Sets the value of the carParkIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarParkIdentity(String value) {
        this.carParkIdentity = value;
    }

    /**
     * Gets the value of the carParkOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCarParkOccupancy() {
        return carParkOccupancy;
    }

    /**
     * Sets the value of the carParkOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCarParkOccupancy(Float value) {
        this.carParkOccupancy = value;
    }

    /**
     * Gets the value of the carParkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public CarParkStatusEnum getCarParkStatus() {
        return carParkStatus;
    }

    /**
     * Sets the value of the carParkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public void setCarParkStatus(CarParkStatusEnum value) {
        this.carParkStatus = value;
    }

    /**
     * Gets the value of the exitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExitRate() {
        return exitRate;
    }

    /**
     * Sets the value of the exitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExitRate(BigInteger value) {
        this.exitRate = value;
    }

    /**
     * Gets the value of the fillRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFillRate() {
        return fillRate;
    }

    /**
     * Sets the value of the fillRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFillRate(BigInteger value) {
        this.fillRate = value;
    }

    /**
     * Gets the value of the numberOfVacantParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVacantParkingSpaces() {
        return numberOfVacantParkingSpaces;
    }

    /**
     * Sets the value of the numberOfVacantParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVacantParkingSpaces(BigInteger value) {
        this.numberOfVacantParkingSpaces = value;
    }

    /**
     * Gets the value of the occupiedSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupiedSpaces() {
        return occupiedSpaces;
    }

    /**
     * Sets the value of the occupiedSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupiedSpaces(BigInteger value) {
        this.occupiedSpaces = value;
    }

    /**
     * Gets the value of the queuingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQueuingTime() {
        return queuingTime;
    }

    /**
     * Sets the value of the queuingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQueuingTime(Float value) {
        this.queuingTime = value;
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Gets the value of the carParksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCarParksExtension() {
        return carParksExtension;
    }

    /**
     * Sets the value of the carParksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCarParksExtension(ExtensionType value) {
        this.carParksExtension = value;
    }

}
