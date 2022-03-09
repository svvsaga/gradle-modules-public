
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegerMetreDistanceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegerMetreDistanceValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="integerMetreDistance" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger"/&gt;
 *         &lt;element name="_integerMetreDistanceValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerMetreDistanceValue", propOrder = {
    "integerMetreDistance",
    "_IntegerMetreDistanceValueExtension"
})
public class IntegerMetreDistanceValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger integerMetreDistance;
    @XmlElement(name = "_integerMetreDistanceValueExtension")
    protected _ExtensionType _IntegerMetreDistanceValueExtension;

    /**
     * Gets the value of the integerMetreDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerMetreDistance() {
        return integerMetreDistance;
    }

    /**
     * Sets the value of the integerMetreDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerMetreDistance(BigInteger value) {
        this.integerMetreDistance = value;
    }

    /**
     * Gets the value of the _IntegerMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_IntegerMetreDistanceValueExtension() {
        return _IntegerMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the _IntegerMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_IntegerMetreDistanceValueExtension(_ExtensionType value) {
        this._IntegerMetreDistanceValueExtension = value;
    }

}
