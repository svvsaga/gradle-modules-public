
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&gt;
 *         &lt;element name="vehicleLength" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="_lengthCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleLength",
    "_LengthCharacteristicExtension"
})
public class LengthCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float vehicleLength;
    @XmlElement(name = "_lengthCharacteristicExtension")
    protected _ExtensionType _LengthCharacteristicExtension;

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
     * Gets the value of the vehicleLength property.
     * 
     */
    public float getVehicleLength() {
        return vehicleLength;
    }

    /**
     * Sets the value of the vehicleLength property.
     * 
     */
    public void setVehicleLength(float value) {
        this.vehicleLength = value;
    }

    /**
     * Gets the value of the _LengthCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LengthCharacteristicExtension() {
        return _LengthCharacteristicExtension;
    }

    /**
     * Sets the value of the _LengthCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LengthCharacteristicExtension(_ExtensionType value) {
        this._LengthCharacteristicExtension = value;
    }

}
