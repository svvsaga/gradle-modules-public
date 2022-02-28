
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.Fault;
import eu.datex2.schema._3.common._ExtensionType;
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
@XmlType(name = "VmsControllerFault", propOrder = {
    "vmsControllerFault",
    "_VmsControllerFaultExtension"
})
public class VmsControllerFault
    extends Fault
{

    @XmlElement(required = true)
    protected _VmsControllerFaultEnum vmsControllerFault;
    @XmlElement(name = "_vmsControllerFaultExtension")
    protected _ExtensionType _VmsControllerFaultExtension;

    /**
     * Gets the value of the vmsControllerFault property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsControllerFaultEnum }
     *     
     */
    public _VmsControllerFaultEnum getVmsControllerFault() {
        return vmsControllerFault;
    }

    /**
     * Sets the value of the vmsControllerFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsControllerFaultEnum }
     *     
     */
    public void setVmsControllerFault(_VmsControllerFaultEnum value) {
        this.vmsControllerFault = value;
    }

    /**
     * Gets the value of the _VmsControllerFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsControllerFaultExtension() {
        return _VmsControllerFaultExtension;
    }

    /**
     * Sets the value of the _VmsControllerFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsControllerFaultExtension(_ExtensionType value) {
        this._VmsControllerFaultExtension = value;
    }

}
