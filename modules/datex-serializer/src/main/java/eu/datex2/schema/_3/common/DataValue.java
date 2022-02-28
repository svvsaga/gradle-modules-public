
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import eu.datex2.schema._3.roadtrafficdata.AxleFlowValue;
import eu.datex2.schema._3.roadtrafficdata.DailyTrafficFlowValue;
import eu.datex2.schema._3.roadtrafficdata.DateTimeValue;
import eu.datex2.schema._3.roadtrafficdata.DurationValue;
import eu.datex2.schema._3.roadtrafficdata.PcuFlowValue;
import eu.datex2.schema._3.roadtrafficdata.TrafficDensityValue;
import eu.datex2.schema._3.roadtrafficdata.TrafficStatusValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data value of something that can be measured or calculated. Any provided meta-data
 *         values specified in the attributes override any specified generic characteristics such as defined for a
 *         specific measurement in the MeasurementSiteTable.
 *       
 * 
 * <p>Java class for DataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataError" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="reasonForDataError" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_dataValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="accuracy" type="{http://datex2.eu/schema/3/common}Percentage" /&gt;
 *       &lt;attribute name="computationalMethod" type="{http://datex2.eu/schema/3/common}ComputationMethodEnum" /&gt;
 *       &lt;attribute name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" /&gt;
 *       &lt;attribute name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" /&gt;
 *       &lt;attribute name="smoothingFactor" type="{http://datex2.eu/schema/3/common}Float" /&gt;
 *       &lt;attribute name="standardDeviation" type="{http://datex2.eu/schema/3/common}Float" /&gt;
 *       &lt;attribute name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/3/common}Percentage" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataValue", propOrder = {
    "dataError",
    "reasonForDataError",
    "_DataValueExtension"
})
@XmlSeeAlso({
    ApplicationRateValue.class,
    DirectionBearingValue.class,
    DirectionCompassValue.class,
    FloatingPointMetreDistanceValue.class,
    FrictionValue.class,
    IntegerMetreDistanceValue.class,
    KilogramsConcentrationValue.class,
    MicrogramsConcentrationValue.class,
    PercentageValue.class,
    PrecipitationIntensityValue.class,
    PressureValue.class,
    SpeedValue.class,
    TemperatureValue.class,
    VehicleFlowValue.class,
    WindSpeedValue.class,
    AxleFlowValue.class,
    DailyTrafficFlowValue.class,
    DateTimeValue.class,
    DurationValue.class,
    PcuFlowValue.class,
    TrafficDensityValue.class,
    TrafficStatusValue.class
})
public abstract class DataValue {

    protected Boolean dataError;
    protected MultilingualString reasonForDataError;
    @XmlElement(name = "_dataValueExtension")
    protected _ExtensionType _DataValueExtension;
    @XmlAttribute(name = "accuracy")
    protected Float accuracy;
    @XmlAttribute(name = "computationalMethod")
    protected ComputationMethodEnum computationalMethod;
    @XmlAttribute(name = "numberOfIncompleteInputs")
    protected BigInteger numberOfIncompleteInputs;
    @XmlAttribute(name = "numberOfInputValuesUsed")
    protected BigInteger numberOfInputValuesUsed;
    @XmlAttribute(name = "smoothingFactor")
    protected Float smoothingFactor;
    @XmlAttribute(name = "standardDeviation")
    protected Float standardDeviation;
    @XmlAttribute(name = "supplierCalculatedDataQuality")
    protected Float supplierCalculatedDataQuality;

    /**
     * Gets the value of the dataError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataError() {
        return dataError;
    }

    /**
     * Sets the value of the dataError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataError(Boolean value) {
        this.dataError = value;
    }

    /**
     * Gets the value of the reasonForDataError property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReasonForDataError() {
        return reasonForDataError;
    }

    /**
     * Sets the value of the reasonForDataError property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReasonForDataError(MultilingualString value) {
        this.reasonForDataError = value;
    }

    /**
     * Gets the value of the _DataValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DataValueExtension() {
        return _DataValueExtension;
    }

    /**
     * Sets the value of the _DataValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DataValueExtension(_ExtensionType value) {
        this._DataValueExtension = value;
    }

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
     * Gets the value of the computationalMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Sets the value of the computationalMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum value) {
        this.computationalMethod = value;
    }

    /**
     * Gets the value of the numberOfIncompleteInputs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIncompleteInputs() {
        return numberOfIncompleteInputs;
    }

    /**
     * Sets the value of the numberOfIncompleteInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIncompleteInputs(BigInteger value) {
        this.numberOfIncompleteInputs = value;
    }

    /**
     * Gets the value of the numberOfInputValuesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInputValuesUsed() {
        return numberOfInputValuesUsed;
    }

    /**
     * Sets the value of the numberOfInputValuesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInputValuesUsed(BigInteger value) {
        this.numberOfInputValuesUsed = value;
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
     * Gets the value of the standardDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets the value of the standardDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStandardDeviation(Float value) {
        this.standardDeviation = value;
    }

    /**
     * Gets the value of the supplierCalculatedDataQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplierCalculatedDataQuality() {
        return supplierCalculatedDataQuality;
    }

    /**
     * Sets the value of the supplierCalculatedDataQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplierCalculatedDataQuality(Float value) {
        this.supplierCalculatedDataQuality = value;
    }

}
