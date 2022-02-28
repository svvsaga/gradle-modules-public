
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}VmsSetting"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsUnitTableReference" type="{http://datex2.eu/schema/2/2_0}_VmsUnitTableVersionedReference"/&gt;
 *         &lt;element name="vmsUnitReference" type="{http://datex2.eu/schema/2/2_0}_VmsUnitRecordVersionedReference"/&gt;
 *         &lt;element name="vms" type="{http://datex2.eu/schema/2/2_0}_VmsUnitVmsIndexVms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsUnitFault" type="{http://datex2.eu/schema/2/2_0}VmsUnitFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsUnitExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsUnit", propOrder = {
    "vmsUnitTableReference",
    "vmsUnitReference",
    "vms",
    "vmsUnitFault",
    "vmsUnitExtension"
})
public class VmsUnit
    extends VmsSetting
{

    @XmlElement(required = true)
    protected _VmsUnitTableVersionedReference vmsUnitTableReference;
    @XmlElement(required = true)
    protected _VmsUnitRecordVersionedReference vmsUnitReference;
    protected List<_VmsUnitVmsIndexVms> vms;
    protected List<VmsUnitFault> vmsUnitFault;
    protected _ExtensionType vmsUnitExtension;

    /**
     * Gets the value of the vmsUnitTableReference property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsUnitTableVersionedReference }
     *     
     */
    public _VmsUnitTableVersionedReference getVmsUnitTableReference() {
        return vmsUnitTableReference;
    }

    /**
     * Sets the value of the vmsUnitTableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsUnitTableVersionedReference }
     *     
     */
    public void setVmsUnitTableReference(_VmsUnitTableVersionedReference value) {
        this.vmsUnitTableReference = value;
    }

    /**
     * Gets the value of the vmsUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsUnitRecordVersionedReference }
     *     
     */
    public _VmsUnitRecordVersionedReference getVmsUnitReference() {
        return vmsUnitReference;
    }

    /**
     * Sets the value of the vmsUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsUnitRecordVersionedReference }
     *     
     */
    public void setVmsUnitReference(_VmsUnitRecordVersionedReference value) {
        this.vmsUnitReference = value;
    }

    /**
     * Gets the value of the vms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsUnitVmsIndexVms }
     * 
     * 
     */
    public List<_VmsUnitVmsIndexVms> getVms() {
        if (vms == null) {
            vms = new ArrayList<_VmsUnitVmsIndexVms>();
        }
        return this.vms;
    }

    /**
     * Gets the value of the vmsUnitFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsUnitFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsUnitFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsUnitFault }
     * 
     * 
     */
    public List<VmsUnitFault> getVmsUnitFault() {
        if (vmsUnitFault == null) {
            vmsUnitFault = new ArrayList<VmsUnitFault>();
        }
        return this.vmsUnitFault;
    }

    /**
     * Gets the value of the vmsUnitExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsUnitExtension() {
        return vmsUnitExtension;
    }

    /**
     * Sets the value of the vmsUnitExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsUnitExtension(_ExtensionType value) {
        this.vmsUnitExtension = value;
    }

}
