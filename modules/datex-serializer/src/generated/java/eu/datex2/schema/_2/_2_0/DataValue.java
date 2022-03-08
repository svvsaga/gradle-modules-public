
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataError" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="reasonForDataError" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="dataValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="accuracy" type="{http://datex2.eu/schema/2/2_0}Percentage" /&gt;
 *       &lt;attribute name="computationalMethod" type="{http://datex2.eu/schema/2/2_0}ComputationMethodEnum" /&gt;
 *       &lt;attribute name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" /&gt;
 *       &lt;attribute name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" /&gt;
 *       &lt;attribute name="smoothingFactor" type="{http://datex2.eu/schema/2/2_0}Float" /&gt;
 *       &lt;attribute name="standardDeviation" type="{http://datex2.eu/schema/2/2_0}Float" /&gt;
 *       &lt;attribute name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/2/2_0}Percentage" /&gt;
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
    "dataValueExtension"
})
@XmlSeeAlso({
    ApplicationRateValue.class,
    AxleFlowValue.class,
    ConcentrationOfVehiclesValue.class,
    DateTimeValue.class,
    DirectionBearingValue.class,
    DirectionCompassValue.class,
    DurationValue.class,
    FloatingPointMetreDistanceValue.class,
    FrictionValue.class,
    IntegerMetreDistanceValue.class,
    KilogramsConcentrationValue.class,
    MicrogramsConcentrationValue.class,
    PcuFlowValue.class,
    PercentageValue.class,
    PrecipitationIntensityValue.class,
    SpeedValue.class,
    TemperatureValue.class,
    TrafficStatusValue.class,
    VehicleFlowValue.class
})
public abstract class DataValue {

    protected Boolean dataError;
    protected MultilingualString reasonForDataError;
    protected ExtensionType dataValueExtension;
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
     * Gets the value of the dataValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDataValueExtension() {
        return dataValueExtension;
    }

    /**
     * Sets the value of the dataValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDataValueExtension(ExtensionType value) {
        this.dataValueExtension = value;
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
