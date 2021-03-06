
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrictionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrictionValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coefficientOfFriction" type="{http://datex2.eu/schema/2/2_0}CoefficientOfFriction"/&gt;
 *         &lt;element name="frictionValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "coefficientOfFriction",
    "frictionValueExtension"
})
public class FrictionValue
    extends DataValue
{

    protected float coefficientOfFriction;
    protected ExtensionType frictionValueExtension;

    /**
     * Gets the value of the coefficientOfFriction property.
     * 
     */
    public float getCoefficientOfFriction() {
        return coefficientOfFriction;
    }

    /**
     * Sets the value of the coefficientOfFriction property.
     * 
     */
    public void setCoefficientOfFriction(float value) {
        this.coefficientOfFriction = value;
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
