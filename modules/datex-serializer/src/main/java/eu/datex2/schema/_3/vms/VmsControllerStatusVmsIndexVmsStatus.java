
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsControllerStatusVmsIndexVmsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsControllerStatusVmsIndexVmsStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsStatus" type="{http://datex2.eu/schema/3/vms}VmsStatus"/&gt;
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
@XmlType(name = "_VmsControllerStatusVmsIndexVmsStatus", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "vmsStatus"
})
public class VmsControllerStatusVmsIndexVmsStatus {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected VmsStatus vmsStatus;
    @XmlAttribute(name = "vmsIndex", required = true)
    protected int vmsIndex;

    /**
     * Gets the value of the vmsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VmsStatus }
     *     
     */
    public VmsStatus getVmsStatus() {
        return vmsStatus;
    }

    /**
     * Sets the value of the vmsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsStatus }
     *     
     */
    public void setVmsStatus(VmsStatus value) {
        this.vmsStatus = value;
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
