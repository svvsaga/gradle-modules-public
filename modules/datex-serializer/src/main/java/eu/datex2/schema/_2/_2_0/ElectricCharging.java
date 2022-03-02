
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricCharging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricCharging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargingStationUsageType" type="{http://datex2.eu/schema/2/2_0}ChargingStationUsageTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="chargingStationModelType" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="maximumCurrent" type="{http://datex2.eu/schema/2/2_0}Ampere" minOccurs="0"/&gt;
 *         &lt;element name="voltage" type="{http://datex2.eu/schema/2/2_0}Volt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chargingStationConnectorType" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfChargingPoints" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="electricChargingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricCharging", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "chargingStationUsageType",
    "chargingStationModelType",
    "maximumCurrent",
    "voltage",
    "chargingStationConnectorType",
    "numberOfChargingPoints",
    "electricChargingExtension"
})
public class ElectricCharging {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected List<ChargingStationUsageTypeEnum> chargingStationUsageType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString chargingStationModelType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float maximumCurrent;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", type = Float.class)
    protected List<Float> voltage;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<MultilingualString> chargingStationConnectorType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfChargingPoints;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType electricChargingExtension;

    /**
     * Gets the value of the chargingStationUsageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargingStationUsageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingStationUsageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingStationUsageTypeEnum }
     * 
     * 
     */
    public List<ChargingStationUsageTypeEnum> getChargingStationUsageType() {
        if (chargingStationUsageType == null) {
            chargingStationUsageType = new ArrayList<ChargingStationUsageTypeEnum>();
        }
        return this.chargingStationUsageType;
    }

    /**
     * Gets the value of the chargingStationModelType property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChargingStationModelType() {
        return chargingStationModelType;
    }

    /**
     * Sets the value of the chargingStationModelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChargingStationModelType(MultilingualString value) {
        this.chargingStationModelType = value;
    }

    /**
     * Gets the value of the maximumCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumCurrent() {
        return maximumCurrent;
    }

    /**
     * Sets the value of the maximumCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumCurrent(Float value) {
        this.maximumCurrent = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the voltage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoltage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getVoltage() {
        if (voltage == null) {
            voltage = new ArrayList<Float>();
        }
        return this.voltage;
    }

    /**
     * Gets the value of the chargingStationConnectorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargingStationConnectorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingStationConnectorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getChargingStationConnectorType() {
        if (chargingStationConnectorType == null) {
            chargingStationConnectorType = new ArrayList<MultilingualString>();
        }
        return this.chargingStationConnectorType;
    }

    /**
     * Gets the value of the numberOfChargingPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfChargingPoints() {
        return numberOfChargingPoints;
    }

    /**
     * Sets the value of the numberOfChargingPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfChargingPoints(BigInteger value) {
        this.numberOfChargingPoints = value;
    }

    /**
     * Gets the value of the electricChargingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElectricChargingExtension() {
        return electricChargingExtension;
    }

    /**
     * Sets the value of the electricChargingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElectricChargingExtension(ExtensionType value) {
        this.electricChargingExtension = value;
    }

}
