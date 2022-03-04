
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrictionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrictionValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="friction" type="{http://datex2.eu/schema/3/common}Float"/&gt;
 *         &lt;element name="_frictionValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrictionValue", propOrder = {
    "friction",
    "frictionValueExtension"
})
public class FrictionValue
    extends DataValue
{

    protected float friction;
    @XmlElement(name = "_frictionValueExtension")
    protected ExtensionType frictionValueExtension;

    /**
     * Gets the value of the friction property.
     * 
     */
    public float getFriction() {
        return friction;
    }

    /**
     * Sets the value of the friction property.
     * 
     */
    public void setFriction(float value) {
        this.friction = value;
    }

    /**
     * Gets the value of the frictionValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFrictionValueExtension() {
        return frictionValueExtension;
    }

    /**
     * Sets the value of the frictionValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFrictionValueExtension(ExtensionType value) {
        this.frictionValueExtension = value;
    }

}
