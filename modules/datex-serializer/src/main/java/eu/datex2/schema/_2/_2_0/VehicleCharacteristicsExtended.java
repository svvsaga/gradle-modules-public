
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleCharacteristicsExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCharacteristicsExtended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emissionClassification" type="{http://datex2.eu/schema/2/2_0}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operationFreeOfEmission" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="loadType2" type="{http://datex2.eu/schema/2/2_0}LoadType2Enum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType2" type="{http://datex2.eu/schema/2/2_0}VehicleType2Enum" minOccurs="0"/&gt;
 *         &lt;element name="fuelType2" type="{http://datex2.eu/schema/2/2_0}FuelType2Enum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleUsage2" type="{http://datex2.eu/schema/2/2_0}VehicleUsage2Enum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristicsExtended", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "emissionClassification",
    "operationFreeOfEmission",
    "loadType2",
    "vehicleType2",
    "fuelType2",
    "vehicleUsage2"
})
public class VehicleCharacteristicsExtended {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<String> emissionClassification;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean operationFreeOfEmission;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected LoadType2Enum loadType2;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected VehicleType2Enum vehicleType2;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected FuelType2Enum fuelType2;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected VehicleUsage2Enum vehicleUsage2;

    /**
     * Gets the value of the emissionClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the emissionClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmissionClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmissionClassification() {
        if (emissionClassification == null) {
            emissionClassification = new ArrayList<String>();
        }
        return this.emissionClassification;
    }

    /**
     * Gets the value of the operationFreeOfEmission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationFreeOfEmission() {
        return operationFreeOfEmission;
    }

    /**
     * Sets the value of the operationFreeOfEmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationFreeOfEmission(Boolean value) {
        this.operationFreeOfEmission = value;
    }

    /**
     * Gets the value of the loadType2 property.
     * 
     * @return
     *     possible object is
     *     {@link LoadType2Enum }
     *     
     */
    public LoadType2Enum getLoadType2() {
        return loadType2;
    }

    /**
     * Sets the value of the loadType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadType2Enum }
     *     
     */
    public void setLoadType2(LoadType2Enum value) {
        this.loadType2 = value;
    }

    /**
     * Gets the value of the vehicleType2 property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType2Enum }
     *     
     */
    public VehicleType2Enum getVehicleType2() {
        return vehicleType2;
    }

    /**
     * Sets the value of the vehicleType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType2Enum }
     *     
     */
    public void setVehicleType2(VehicleType2Enum value) {
        this.vehicleType2 = value;
    }

    /**
     * Gets the value of the fuelType2 property.
     * 
     * @return
     *     possible object is
     *     {@link FuelType2Enum }
     *     
     */
    public FuelType2Enum getFuelType2() {
        return fuelType2;
    }

    /**
     * Sets the value of the fuelType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelType2Enum }
     *     
     */
    public void setFuelType2(FuelType2Enum value) {
        this.fuelType2 = value;
    }

    /**
     * Gets the value of the vehicleUsage2 property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsage2Enum }
     *     
     */
    public VehicleUsage2Enum getVehicleUsage2() {
        return vehicleUsage2;
    }

    /**
     * Sets the value of the vehicleUsage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsage2Enum }
     *     
     */
    public void setVehicleUsage2(VehicleUsage2Enum value) {
        this.vehicleUsage2 = value;
    }

}
