
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of distance in metres in a floating point format.
 *       
 * 
 * <p>Java class for FloatingPointMetreDistanceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingPointMetreDistanceValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distance" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="_floatingPointMetreDistanceValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingPointMetreDistanceValue", propOrder = {
    "distance",
    "_FloatingPointMetreDistanceValueExtension"
})
public class FloatingPointMetreDistanceValue
    extends DataValue
{

    protected float distance;
    @XmlElement(name = "_floatingPointMetreDistanceValueExtension")
    protected _ExtensionType _FloatingPointMetreDistanceValueExtension;

    /**
     * Gets the value of the distance property.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Gets the value of the _FloatingPointMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FloatingPointMetreDistanceValueExtension() {
        return _FloatingPointMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the _FloatingPointMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FloatingPointMetreDistanceValueExtension(_ExtensionType value) {
        this._FloatingPointMetreDistanceValueExtension = value;
    }

}
