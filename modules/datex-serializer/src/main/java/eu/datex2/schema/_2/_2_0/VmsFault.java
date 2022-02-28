
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/2/2_0}VmsFaultEnum"/&gt;
 *         &lt;element name="vmsFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "vmsFaultExtension"
})
public class VmsFault
    extends Fault
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VmsFaultEnum vmsFault;
    protected _ExtensionType vmsFaultExtension;

    /**
     * Gets the value of the vmsFault property.
     * 
     * @return
     *     possible object is
     *     {@link VmsFaultEnum }
     *     
     */
    public VmsFaultEnum getVmsFault() {
        return vmsFault;
    }

    /**
     * Sets the value of the vmsFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsFaultEnum }
     *     
     */
    public void setVmsFault(VmsFaultEnum value) {
        this.vmsFault = value;
    }

    /**
     * Gets the value of the vmsFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsFaultExtension() {
        return vmsFaultExtension;
    }

    /**
     * Sets the value of the vmsFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsFaultExtension(_ExtensionType value) {
        this.vmsFaultExtension = value;
    }

}
