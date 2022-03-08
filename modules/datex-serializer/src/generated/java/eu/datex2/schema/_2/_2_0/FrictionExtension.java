
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrictionExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrictionExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="friction" type="{http://datex2.eu/schema/2/2_0}FrictionValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrictionExtension", propOrder = {
    "friction"
})
public class FrictionExtension {

    @XmlElement(required = true)
    protected FrictionValue friction;

    /**
     * Gets the value of the friction property.
     * 
     * @return
     *     possible object is
     *     {@link FrictionValue }
     *     
     */
    public FrictionValue getFriction() {
        return friction;
    }

    /**
     * Sets the value of the friction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrictionValue }
     *     
     */
    public void setFriction(FrictionValue value) {
        this.friction = value;
    }

}
