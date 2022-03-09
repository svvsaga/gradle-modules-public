
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaviestAxleWeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaviestAxleWeightCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&gt;
 *         &lt;element name="heaviestAxleWeight" type="{http://datex2.eu/schema/3/common}Tonnes"/&gt;
 *         &lt;element name="_heaviestAxleWeightCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaviestAxleWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "heaviestAxleWeight",
    "_HeaviestAxleWeightCharacteristicExtension"
})
public class HeaviestAxleWeightCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float heaviestAxleWeight;
    @XmlElement(name = "_heaviestAxleWeightCharacteristicExtension")
    protected _ExtensionType _HeaviestAxleWeightCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link _ComparisonOperatorEnum }
     *     
     */
    public _ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(_ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the heaviestAxleWeight property.
     * 
     */
    public float getHeaviestAxleWeight() {
        return heaviestAxleWeight;
    }

    /**
     * Sets the value of the heaviestAxleWeight property.
     * 
     */
    public void setHeaviestAxleWeight(float value) {
        this.heaviestAxleWeight = value;
    }

    /**
     * Gets the value of the _HeaviestAxleWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_HeaviestAxleWeightCharacteristicExtension() {
        return _HeaviestAxleWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the _HeaviestAxleWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_HeaviestAxleWeightCharacteristicExtension(_ExtensionType value) {
        this._HeaviestAxleWeightCharacteristicExtension = value;
    }

}
