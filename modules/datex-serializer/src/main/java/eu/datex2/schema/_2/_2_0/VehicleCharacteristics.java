
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fuelType" type="{http://datex2.eu/schema/2/2_0}FuelTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="loadType" type="{http://datex2.eu/schema/2/2_0}LoadTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleEquipment" type="{http://datex2.eu/schema/2/2_0}VehicleEquipmentEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleUsage" type="{http://datex2.eu/schema/2/2_0}VehicleUsageEnum" minOccurs="0"/&gt;
 *         &lt;element name="grossWeightCharacteristic" type="{http://datex2.eu/schema/2/2_0}GrossWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heightCharacteristic" type="{http://datex2.eu/schema/2/2_0}HeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="lengthCharacteristic" type="{http://datex2.eu/schema/2/2_0}LengthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="widthCharacteristic" type="{http://datex2.eu/schema/2/2_0}WidthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heaviestAxleWeightCharacteristic" type="{http://datex2.eu/schema/2/2_0}HeaviestAxleWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="numberOfAxlesCharacteristic" type="{http://datex2.eu/schema/2/2_0}NumberOfAxlesCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristicsExtension" type="{http://datex2.eu/schema/2/2_0}_VehicleCharacteristicsExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristics", propOrder = {
    "fuelType",
    "loadType",
    "vehicleEquipment",
    "vehicleType",
    "vehicleUsage",
    "grossWeightCharacteristic",
    "heightCharacteristic",
    "lengthCharacteristic",
    "widthCharacteristic",
    "heaviestAxleWeightCharacteristic",
    "numberOfAxlesCharacteristic",
    "vehicleCharacteristicsExtension"
})
public class VehicleCharacteristics {

    @XmlSchemaType(name = "string")
    protected FuelTypeEnum fuelType;
    @XmlSchemaType(name = "string")
    protected LoadTypeEnum loadType;
    @XmlSchemaType(name = "string")
    protected VehicleEquipmentEnum vehicleEquipment;
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    @XmlSchemaType(name = "string")
    protected VehicleUsageEnum vehicleUsage;
    protected List<GrossWeightCharacteristic> grossWeightCharacteristic;
    protected List<HeightCharacteristic> heightCharacteristic;
    protected List<LengthCharacteristic> lengthCharacteristic;
    protected List<WidthCharacteristic> widthCharacteristic;
    protected List<HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic;
    protected List<NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic;
    protected _VehicleCharacteristicsExtensionType vehicleCharacteristicsExtension;

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnum }
     *     
     */
    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnum }
     *     
     */
    public void setFuelType(FuelTypeEnum value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the loadType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTypeEnum }
     *     
     */
    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Sets the value of the loadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTypeEnum }
     *     
     */
    public void setLoadType(LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Gets the value of the vehicleEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public VehicleEquipmentEnum getVehicleEquipment() {
        return vehicleEquipment;
    }

    /**
     * Sets the value of the vehicleEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public void setVehicleEquipment(VehicleEquipmentEnum value) {
        this.vehicleEquipment = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTypeEnum }
     * 
     * 
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the vehicleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Sets the value of the vehicleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public void setVehicleUsage(VehicleUsageEnum value) {
        this.vehicleUsage = value;
    }

    /**
     * Gets the value of the grossWeightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the grossWeightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossWeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossWeightCharacteristic }
     * 
     * 
     */
    public List<GrossWeightCharacteristic> getGrossWeightCharacteristic() {
        if (grossWeightCharacteristic == null) {
            grossWeightCharacteristic = new ArrayList<GrossWeightCharacteristic>();
        }
        return this.grossWeightCharacteristic;
    }

    /**
     * Gets the value of the heightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the heightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeightCharacteristic }
     * 
     * 
     */
    public List<HeightCharacteristic> getHeightCharacteristic() {
        if (heightCharacteristic == null) {
            heightCharacteristic = new ArrayList<HeightCharacteristic>();
        }
        return this.heightCharacteristic;
    }

    /**
     * Gets the value of the lengthCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lengthCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthCharacteristic }
     * 
     * 
     */
    public List<LengthCharacteristic> getLengthCharacteristic() {
        if (lengthCharacteristic == null) {
            lengthCharacteristic = new ArrayList<LengthCharacteristic>();
        }
        return this.lengthCharacteristic;
    }

    /**
     * Gets the value of the widthCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the widthCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWidthCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WidthCharacteristic }
     * 
     * 
     */
    public List<WidthCharacteristic> getWidthCharacteristic() {
        if (widthCharacteristic == null) {
            widthCharacteristic = new ArrayList<WidthCharacteristic>();
        }
        return this.widthCharacteristic;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the heaviestAxleWeightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaviestAxleWeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaviestAxleWeightCharacteristic }
     * 
     * 
     */
    public List<HeaviestAxleWeightCharacteristic> getHeaviestAxleWeightCharacteristic() {
        if (heaviestAxleWeightCharacteristic == null) {
            heaviestAxleWeightCharacteristic = new ArrayList<HeaviestAxleWeightCharacteristic>();
        }
        return this.heaviestAxleWeightCharacteristic;
    }

    /**
     * Gets the value of the numberOfAxlesCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfAxlesCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAxlesCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAxlesCharacteristic }
     * 
     * 
     */
    public List<NumberOfAxlesCharacteristic> getNumberOfAxlesCharacteristic() {
        if (numberOfAxlesCharacteristic == null) {
            numberOfAxlesCharacteristic = new ArrayList<NumberOfAxlesCharacteristic>();
        }
        return this.numberOfAxlesCharacteristic;
    }

    /**
     * Gets the value of the vehicleCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleCharacteristicsExtensionType }
     *     
     */
    public _VehicleCharacteristicsExtensionType getVehicleCharacteristicsExtension() {
        return vehicleCharacteristicsExtension;
    }

    /**
     * Sets the value of the vehicleCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleCharacteristicsExtensionType }
     *     
     */
    public void setVehicleCharacteristicsExtension(_VehicleCharacteristicsExtensionType value) {
        this.vehicleCharacteristicsExtension = value;
    }

}
