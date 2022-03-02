
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Fault;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of the fault which is being reported for the specified variable message sign
 *         control unit.
 *       
 * 
 * <p>Java class for VmsControllerFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsControllerFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsControllerFault" type="{http://datex2.eu/schema/3/vms}_VmsControllerFaultEnum"/&gt;
 *         &lt;element name="_vmsControllerFaultExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsControllerFault", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "vmsControllerFault",
    "vmsControllerFaultExtension"
})
public class VmsControllerFault
    extends Fault
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected VmsControllerFaultEnum vmsControllerFault;
    @XmlElement(name = "_vmsControllerFaultExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType vmsControllerFaultExtension;

    /**
     * Gets the value of the vmsControllerFault property.
     * 
     * @return
     *     possible object is
     *     {@link VmsControllerFaultEnum }
     *     
     */
    public VmsControllerFaultEnum getVmsControllerFault() {
        return vmsControllerFault;
    }

    /**
     * Sets the value of the vmsControllerFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsControllerFaultEnum }
     *     
     */
    public void setVmsControllerFault(VmsControllerFaultEnum value) {
        this.vmsControllerFault = value;
    }

    /**
     * Gets the value of the vmsControllerFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsControllerFaultExtension() {
        return vmsControllerFaultExtension;
    }

    /**
     * Sets the value of the vmsControllerFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsControllerFaultExtension(ExtensionType value) {
        this.vmsControllerFaultExtension = value;
    }

}
