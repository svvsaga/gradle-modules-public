
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.Fault;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of the fault which is being reported for the specified variable message sign
 *         panel.
 *       
 * 
 * <p>Java class for VmsFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/3/vms}_VmsFaultEnum"/&gt;
 *         &lt;element name="_vmsFaultExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsFault", propOrder = {
    "vmsFault",
    "_VmsFaultExtension"
})
public class VmsFault
    extends Fault
{

    @XmlElement(required = true)
    protected _VmsFaultEnum vmsFault;
    @XmlElement(name = "_vmsFaultExtension")
    protected _ExtensionType _VmsFaultExtension;

    /**
     * Gets the value of the vmsFault property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsFaultEnum }
     *     
     */
    public _VmsFaultEnum getVmsFault() {
        return vmsFault;
    }

    /**
     * Sets the value of the vmsFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsFaultEnum }
     *     
     */
    public void setVmsFault(_VmsFaultEnum value) {
        this.vmsFault = value;
    }

    /**
     * Gets the value of the _VmsFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsFaultExtension() {
        return _VmsFaultExtension;
    }

    /**
     * Sets the value of the _VmsFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsFaultExtension(_ExtensionType value) {
        this._VmsFaultExtension = value;
    }

}
