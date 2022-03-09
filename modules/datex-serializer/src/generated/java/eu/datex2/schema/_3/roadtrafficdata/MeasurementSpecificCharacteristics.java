
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.VehicleCharacteristics;
import eu.datex2.schema._3.common._ComputationMethodEnum;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Lane;
import eu.datex2.schema._3.locationreferencing._DirectionEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementSpecificCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSpecificCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/3/common}_ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="defaultMeasurementHeight" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/3/common}Float" minOccurs="0"/&gt;
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/3/roadTrafficData}_MeasuredOrDerivedDataTypeEnum"/&gt;
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/3/locationReferencing}Lane" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="axleCharacteristics" type="{http://datex2.eu/schema/3/roadTrafficData}AxleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="_measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", propOrder = {
    "accuracy",
    "computationMethod",
    "defaultMeasurementHeight",
    "measurementSide",
    "period",
    "smoothingFactor",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "specificLane",
    "axleCharacteristics",
    "_MeasurementSpecificCharacteristicsExtension"
})
public class MeasurementSpecificCharacteristics {

    protected Float accuracy;
    protected _ComputationMethodEnum computationMethod;
    protected Float defaultMeasurementHeight;
    protected _DirectionEnum measurementSide;
    protected Float period;
    protected Float smoothingFactor;
    @XmlElement(required = true)
    protected _MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    protected VehicleCharacteristics specificVehicleCharacteristics;
    protected List<Lane> specificLane;
    protected AxleCharacteristics axleCharacteristics;
    @XmlElement(name = "_measurementSpecificCharacteristicsExtension")
    protected _ExtensionType _MeasurementSpecificCharacteristicsExtension;

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the computationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link _ComputationMethodEnum }
     *     
     */
    public _ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Sets the value of the computationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(_ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    /**
     * Gets the value of the defaultMeasurementHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultMeasurementHeight() {
        return defaultMeasurementHeight;
    }

    /**
     * Sets the value of the defaultMeasurementHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultMeasurementHeight(Float value) {
        this.defaultMeasurementHeight = value;
    }

    /**
     * Gets the value of the measurementSide property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionEnum }
     *     
     */
    public _DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Sets the value of the measurementSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionEnum }
     *     
     */
    public void setMeasurementSide(_DirectionEnum value) {
        this.measurementSide = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    /**
     * Gets the value of the smoothingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Sets the value of the smoothingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Gets the value of the specificMeasurementValueType property.
     * 
     * @return
     *     possible object is
     *     {@link _MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public _MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Sets the value of the specificMeasurementValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setSpecificMeasurementValueType(_MeasuredOrDerivedDataTypeEnum value) {
        this.specificMeasurementValueType = value;
    }

    /**
     * Gets the value of the specificVehicleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getSpecificVehicleCharacteristics() {
        return specificVehicleCharacteristics;
    }

    /**
     * Sets the value of the specificVehicleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        this.specificVehicleCharacteristics = value;
    }

    /**
     * Gets the value of the specificLane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificLane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane }
     * 
     * 
     */
    public List<Lane> getSpecificLane() {
        if (specificLane == null) {
            specificLane = new ArrayList<Lane>();
        }
        return this.specificLane;
    }

    /**
     * Gets the value of the axleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link AxleCharacteristics }
     *     
     */
    public AxleCharacteristics getAxleCharacteristics() {
        return axleCharacteristics;
    }

    /**
     * Sets the value of the axleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxleCharacteristics }
     *     
     */
    public void setAxleCharacteristics(AxleCharacteristics value) {
        this.axleCharacteristics = value;
    }

    /**
     * Gets the value of the _MeasurementSpecificCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MeasurementSpecificCharacteristicsExtension() {
        return _MeasurementSpecificCharacteristicsExtension;
    }

    /**
     * Sets the value of the _MeasurementSpecificCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MeasurementSpecificCharacteristicsExtension(_ExtensionType value) {
        this._MeasurementSpecificCharacteristicsExtension = value;
    }

}
