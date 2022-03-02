
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OpenLR line location reference
 * 
 * <p>Java class for OpenlrLinear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLinear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstDirection" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLineLocationReference"/&gt;
 *         &lt;element name="oppositeDirection" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLineLocationReference" minOccurs="0"/&gt;
 *         &lt;element name="_openlrLinearExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLinear", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "firstDirection",
    "oppositeDirection",
    "openlrLinearExtension"
})
public class OpenlrLinear {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected OpenlrLineLocationReference firstDirection;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected OpenlrLineLocationReference oppositeDirection;
    @XmlElement(name = "_openlrLinearExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrLinearExtension;

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

    /**
     * Gets the value of the openlrLinearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLinearExtension() {
        return openlrLinearExtension;
    }

    /**
     * Sets the value of the openlrLinearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLinearExtension(ExtensionType value) {
        this.openlrLinearExtension = value;
    }

}
