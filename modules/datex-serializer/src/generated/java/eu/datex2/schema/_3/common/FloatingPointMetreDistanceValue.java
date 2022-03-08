
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "floatingPointMetreDistanceValueExtension"
})
public class FloatingPointMetreDistanceValue
    extends DataValue
{

    protected float distance;
    @XmlElement(name = "_floatingPointMetreDistanceValueExtension")
    protected ExtensionType floatingPointMetreDistanceValueExtension;

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
     * Gets the value of the floatingPointMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFloatingPointMetreDistanceValueExtension() {
        return floatingPointMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the floatingPointMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFloatingPointMetreDistanceValueExtension(ExtensionType value) {
        this.floatingPointMetreDistanceValueExtension = value;
    }

}
