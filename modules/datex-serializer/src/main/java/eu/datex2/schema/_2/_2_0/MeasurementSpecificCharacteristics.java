
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/2/2_0}LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/2/2_0}MeasuredOrDerivedDataTypeEnum"/&gt;
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "accuracy",
    "period",
    "smoothingFactor",
    "specificLane",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "measurementSpecificCharacteristicsExtension"
})
public class MeasurementSpecificCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float accuracy;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float period;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float smoothingFactor;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected LaneEnum specificLane;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected VehicleCharacteristics specificVehicleCharacteristics;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType measurementSpecificCharacteristicsExtension;

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
     * Gets the value of the specificLane property.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getSpecificLane() {
        return specificLane;
    }

    /**
     * Sets the value of the specificLane property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setSpecificLane(LaneEnum value) {
        this.specificLane = value;
    }

    /**
     * Gets the value of the specificMeasurementValueType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Sets the value of the specificMeasurementValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
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
     * Gets the value of the measurementSpecificCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSpecificCharacteristicsExtension() {
        return measurementSpecificCharacteristicsExtension;
    }

    /**
     * Sets the value of the measurementSpecificCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        this.measurementSpecificCharacteristicsExtension = value;
    }

}
