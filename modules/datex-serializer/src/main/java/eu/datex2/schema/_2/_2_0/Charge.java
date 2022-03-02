
package eu.datex2.schema._2._2_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Charge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Charge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="charge" type="{http://datex2.eu/schema/2/2_0}AmountOfMoney"/&gt;
 *         &lt;element name="chargeInterval" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="chargeType" type="{http://datex2.eu/schema/2/2_0}ChargeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="chargeTypeDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="maxIterationsOfCharge" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minIterationsOfCharge" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="chargeOrderIndex" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="timePeriodOfDay" type="{http://datex2.eu/schema/2/2_0}TimePeriodOfDay" minOccurs="0"/&gt;
 *         &lt;element name="chargeExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "charge",
    "chargeInterval",
    "chargeType",
    "chargeTypeDescription",
    "maxIterationsOfCharge",
    "minIterationsOfCharge",
    "chargeOrderIndex",
    "timePeriodOfDay",
    "chargeExtension"
})
public class Charge {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected BigDecimal charge;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float chargeInterval;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected ChargeTypeEnum chargeType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString chargeTypeDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxIterationsOfCharge;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minIterationsOfCharge;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger chargeOrderIndex;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected TimePeriodOfDay timePeriodOfDay;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType chargeExtension;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

    /**
     * Gets the value of the chargeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getChargeInterval() {
        return chargeInterval;
    }

    /**
     * Sets the value of the chargeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setChargeInterval(Float value) {
        this.chargeInterval = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTypeEnum }
     *     
     */
    public ChargeTypeEnum getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTypeEnum }
     *     
     */
    public void setChargeType(ChargeTypeEnum value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the chargeTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChargeTypeDescription() {
        return chargeTypeDescription;
    }

    /**
     * Sets the value of the chargeTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChargeTypeDescription(MultilingualString value) {
        this.chargeTypeDescription = value;
    }

    /**
     * Gets the value of the maxIterationsOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIterationsOfCharge() {
        return maxIterationsOfCharge;
    }

    /**
     * Sets the value of the maxIterationsOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIterationsOfCharge(BigInteger value) {
        this.maxIterationsOfCharge = value;
    }

    /**
     * Gets the value of the minIterationsOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinIterationsOfCharge() {
        return minIterationsOfCharge;
    }

    /**
     * Sets the value of the minIterationsOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinIterationsOfCharge(BigInteger value) {
        this.minIterationsOfCharge = value;
    }

    /**
     * Gets the value of the chargeOrderIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeOrderIndex() {
        return chargeOrderIndex;
    }

    /**
     * Sets the value of the chargeOrderIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeOrderIndex(BigInteger value) {
        this.chargeOrderIndex = value;
    }

    /**
     * Gets the value of the timePeriodOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodOfDay }
     *     
     */
    public TimePeriodOfDay getTimePeriodOfDay() {
        return timePeriodOfDay;
    }

    /**
     * Sets the value of the timePeriodOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodOfDay }
     *     
     */
    public void setTimePeriodOfDay(TimePeriodOfDay value) {
        this.timePeriodOfDay = value;
    }

    /**
     * Gets the value of the chargeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getChargeExtension() {
        return chargeExtension;
    }

    /**
     * Sets the value of the chargeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setChargeExtension(ExtensionType value) {
        this.chargeExtension = value;
    }

}
