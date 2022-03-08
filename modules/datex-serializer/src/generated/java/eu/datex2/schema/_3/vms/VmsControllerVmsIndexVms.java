
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsControllerVmsIndexVms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsControllerVmsIndexVms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vms" type="{http://datex2.eu/schema/3/vms}Vms"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vmsIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsControllerVmsIndexVms", propOrder = {
    "vms"
})
public class VmsControllerVmsIndexVms {

    @XmlElement(required = true)
    protected Vms vms;
    @XmlAttribute(name = "vmsIndex", required = true)
    protected int vmsIndex;

    /**
     * Gets the value of the vms property.
     * 
     * @return
     *     possible object is
     *     {@link Vms }
     *     
     */
    public Vms getVms() {
        return vms;
    }

    /**
     * Sets the value of the vms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vms }
     *     
     */
    public void setVms(Vms value) {
        this.vms = value;
    }

    /**
     * Gets the value of the vmsIndex property.
     * 
     */
    public int getVmsIndex() {
        return vmsIndex;
    }

    /**
     * Sets the value of the vmsIndex property.
     * 
     */
    public void setVmsIndex(int value) {
        this.vmsIndex = value;
    }

}
