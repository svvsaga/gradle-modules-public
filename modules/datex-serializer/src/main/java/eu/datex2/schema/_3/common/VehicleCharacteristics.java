
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The characteristics of a vehicle, e.g. lorry of gross weight greater than 30 tonnes.
 *       
 * 
 * <p>Java class for VehicleCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fuelType" type="{http://datex2.eu/schema/3/common}_FuelTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loadType" type="{http://datex2.eu/schema/3/common}_LoadTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleEquipment" type="{http://datex2.eu/schema/3/common}_VehicleEquipmentEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/3/common}_VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleUsage" type="{http://datex2.eu/schema/3/common}_VehicleUsageEnum" minOccurs="0"/&gt;
 *         &lt;element name="yearOfFirstRegistration" type="{http://datex2.eu/schema/3/common}Year" minOccurs="0"/&gt;
 *         &lt;element name="grossWeightCharacteristic" type="{http://datex2.eu/schema/3/common}GrossWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heightCharacteristic" type="{http://datex2.eu/schema/3/common}HeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="lengthCharacteristic" type="{http://datex2.eu/schema/3/common}LengthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="widthCharacteristic" type="{http://datex2.eu/schema/3/common}WidthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heaviestAxleWeightCharacteristic" type="{http://datex2.eu/schema/3/common}HeaviestAxleWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="numberOfAxlesCharacteristic" type="{http://datex2.eu/schema/3/common}NumberOfAxlesCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="emissions" type="{http://datex2.eu/schema/3/common}Emissions" minOccurs="0"/&gt;
 *         &lt;element name="_vehicleCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "yearOfFirstRegistration",
    "grossWeightCharacteristic",
    "heightCharacteristic",
    "lengthCharacteristic",
    "widthCharacteristic",
    "heaviestAxleWeightCharacteristic",
    "numberOfAxlesCharacteristic",
    "emissions",
    "_VehicleCharacteristicsExtension"
})
public class VehicleCharacteristics {

    protected List<_FuelTypeEnum> fuelType;
    protected _LoadTypeEnum loadType;
    protected _VehicleEquipmentEnum vehicleEquipment;
    protected List<_VehicleTypeEnum> vehicleType;
    protected _VehicleUsageEnum vehicleUsage;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger yearOfFirstRegistration;
    protected List<GrossWeightCharacteristic> grossWeightCharacteristic;
    protected List<HeightCharacteristic> heightCharacteristic;
    protected List<LengthCharacteristic> lengthCharacteristic;
    protected List<WidthCharacteristic> widthCharacteristic;
    protected List<HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic;
    protected List<NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic;
    protected Emissions emissions;
    @XmlElement(name = "_vehicleCharacteristicsExtension")
    protected _ExtensionType _VehicleCharacteristicsExtension;

    /**
     * Gets the value of the fuelType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fuelType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _FuelTypeEnum }
     * 
     * 
     */
    public List<_FuelTypeEnum> getFuelType() {
        if (fuelType == null) {
            fuelType = new ArrayList<_FuelTypeEnum>();
        }
        return this.fuelType;
    }

    /**
     * Gets the value of the loadType property.
     * 
     * @return
     *     possible object is
     *     {@link _LoadTypeEnum }
     *     
     */
    public _LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Sets the value of the loadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LoadTypeEnum }
     *     
     */
    public void setLoadType(_LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Gets the value of the vehicleEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleEquipmentEnum }
     *     
     */
    public _VehicleEquipmentEnum getVehicleEquipment() {
        return vehicleEquipment;
    }

    /**
     * Sets the value of the vehicleEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleEquipmentEnum }
     *     
     */
    public void setVehicleEquipment(_VehicleEquipmentEnum value) {
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
     * {@link _VehicleTypeEnum }
     * 
     * 
     */
    public List<_VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<_VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the vehicleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleUsageEnum }
     *     
     */
    public _VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Sets the value of the vehicleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleUsageEnum }
     *     
     */
    public void setVehicleUsage(_VehicleUsageEnum value) {
        this.vehicleUsage = value;
    }

    /**
     * Gets the value of the yearOfFirstRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearOfFirstRegistration() {
        return yearOfFirstRegistration;
    }

    /**
     * Sets the value of the yearOfFirstRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearOfFirstRegistration(BigInteger value) {
        this.yearOfFirstRegistration = value;
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
     * Gets the value of the emissions property.
     * 
     * @return
     *     possible object is
     *     {@link Emissions }
     *     
     */
    public Emissions getEmissions() {
        return emissions;
    }

    /**
     * Sets the value of the emissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Emissions }
     *     
     */
    public void setEmissions(Emissions value) {
        this.emissions = value;
    }

    /**
     * Gets the value of the _VehicleCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VehicleCharacteristicsExtension() {
        return _VehicleCharacteristicsExtension;
    }

    /**
     * Sets the value of the _VehicleCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VehicleCharacteristicsExtension(_ExtensionType value) {
        this._VehicleCharacteristicsExtension = value;
    }

}
