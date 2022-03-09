
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfAxlesCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfAxlesCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&gt;
 *         &lt;element name="numberOfAxles" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="_numberOfAxlesCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfAxlesCharacteristic", propOrder = {
    "comparisonOperator",
    "numberOfAxles",
    "_NumberOfAxlesCharacteristicExtension"
})
public class NumberOfAxlesCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfAxles;
    @XmlElement(name = "_numberOfAxlesCharacteristicExtension")
    protected _ExtensionType _NumberOfAxlesCharacteristicExtension;

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
     * Gets the value of the numberOfAxles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Sets the value of the numberOfAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAxles(BigInteger value) {
        this.numberOfAxles = value;
    }

    /**
     * Gets the value of the _NumberOfAxlesCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NumberOfAxlesCharacteristicExtension() {
        return _NumberOfAxlesCharacteristicExtension;
    }

    /**
     * Sets the value of the _NumberOfAxlesCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NumberOfAxlesCharacteristicExtension(_ExtensionType value) {
        this._NumberOfAxlesCharacteristicExtension = value;
    }

}
