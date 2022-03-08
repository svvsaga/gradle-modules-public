
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
    "dataValueExtension"
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
    protected ExtensionType dataValueExtension;
    @XmlAttribute(name = "accuracy")
    protected Float accuracy;
    @XmlAttribute(name = "computationalMethod")
    protected ComputationMethodEnum2 computationalMethod;
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
     *     {@link ComputationMethodEnum2 }
     *     
     */
    public ComputationMethodEnum2 getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Sets the value of the computationalMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum2 }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum2 value) {
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
