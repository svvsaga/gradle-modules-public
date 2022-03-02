
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrExtendedLinear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrExtendedLinear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstDirection" type="{http://datex2.eu/schema/2/2_0}OpenlrLineLocationReference"/&gt;
 *         &lt;element name="oppositeDirection" type="{http://datex2.eu/schema/2/2_0}OpenlrLineLocationReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrExtendedLinear", propOrder = {
    "firstDirection",
    "oppositeDirection"
})
public class OpenlrExtendedLinear {

    @XmlElement(required = true)
    protected OpenlrLineLocationReference firstDirection;
    protected OpenlrLineLocationReference oppositeDirection;

    /**
     * Gets the value of the firstDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public OpenlrLineLocationReference getFirstDirection() {
        return firstDirection;
    }

    /**
     * Sets the value of the firstDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public void setFirstDirection(OpenlrLineLocationReference value) {
        this.firstDirection = value;
    }

    /**
     * Gets the value of the oppositeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public OpenlrLineLocationReference getOppositeDirection() {
        return oppositeDirection;
    }

    /**
     * Sets the value of the oppositeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public void setOppositeDirection(OpenlrLineLocationReference value) {
        this.oppositeDirection = value;
    }

}
