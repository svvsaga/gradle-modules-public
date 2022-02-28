
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gross weight characteristic of a vehicle.
 * 
 * <p>Java class for GrossWeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrossWeightCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&gt;
 *         &lt;element name="grossVehicleWeight" type="{http://datex2.eu/schema/3/common}Tonnes"/&gt;
 *         &lt;element name="typeOfWeight" type="{http://datex2.eu/schema/3/common}_WeightTypeEnum"/&gt;
 *         &lt;element name="_grossWeightCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "grossVehicleWeight",
    "typeOfWeight",
    "_GrossWeightCharacteristicExtension"
})
public class GrossWeightCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float grossVehicleWeight;
    @XmlElement(required = true)
    protected _WeightTypeEnum typeOfWeight;
    @XmlElement(name = "_grossWeightCharacteristicExtension")
    protected _ExtensionType _GrossWeightCharacteristicExtension;

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
     * Gets the value of the grossVehicleWeight property.
     * 
     */
    public float getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Sets the value of the grossVehicleWeight property.
     * 
     */
    public void setGrossVehicleWeight(float value) {
        this.grossVehicleWeight = value;
    }

    /**
     * Gets the value of the typeOfWeight property.
     * 
     * @return
     *     possible object is
     *     {@link _WeightTypeEnum }
     *     
     */
    public _WeightTypeEnum getTypeOfWeight() {
        return typeOfWeight;
    }

    /**
     * Sets the value of the typeOfWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link _WeightTypeEnum }
     *     
     */
    public void setTypeOfWeight(_WeightTypeEnum value) {
        this.typeOfWeight = value;
    }

    /**
     * Gets the value of the _GrossWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GrossWeightCharacteristicExtension() {
        return _GrossWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the _GrossWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GrossWeightCharacteristicExtension(_ExtensionType value) {
        this._GrossWeightCharacteristicExtension = value;
    }

}
