
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsUnitFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsUnitFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsUnitFault" type="{http://datex2.eu/schema/2/2_0}VmsFaultEnum"/&gt;
 *         &lt;element name="vmsUnitFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsUnitFault", propOrder = {
    "vmsUnitFault",
    "vmsUnitFaultExtension"
})
public class VmsUnitFault
    extends Fault
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VmsFaultEnum vmsUnitFault;
    protected _ExtensionType vmsUnitFaultExtension;

    /**
     * Gets the value of the vmsUnitFault property.
     * 
     * @return
     *     possible object is
     *     {@link VmsFaultEnum }
     *     
     */
    public VmsFaultEnum getVmsUnitFault() {
        return vmsUnitFault;
    }

    /**
     * Sets the value of the vmsUnitFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsFaultEnum }
     *     
     */
    public void setVmsUnitFault(VmsFaultEnum value) {
        this.vmsUnitFault = value;
    }

    /**
     * Gets the value of the vmsUnitFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsUnitFaultExtension() {
        return vmsUnitFaultExtension;
    }

    /**
     * Sets the value of the vmsUnitFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsUnitFaultExtension(_ExtensionType value) {
        this.vmsUnitFaultExtension = value;
    }

}
