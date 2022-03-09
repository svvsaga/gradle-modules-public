
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsControllerStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsControllerStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsControllerTableReference" type="{http://datex2.eu/schema/3/vms}_VmsControllerTableVersionedReference"/&gt;
 *         &lt;element name="vmsControllerReference" type="{http://datex2.eu/schema/3/vms}_VmsControllerVersionedReference"/&gt;
 *         &lt;element name="statusUpdateTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="informationManagerOverride" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="vmsStatus" type="{http://datex2.eu/schema/3/vms}_VmsControllerStatusVmsIndexVmsStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsControllerFault" type="{http://datex2.eu/schema/3/vms}VmsControllerFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_vmsControllerStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsControllerStatus", propOrder = {
    "vmsControllerTableReference",
    "vmsControllerReference",
    "statusUpdateTime",
    "informationManagerOverride",
    "vmsStatus",
    "vmsControllerFault",
    "_VmsControllerStatusExtension"
})
public class VmsControllerStatus {

    @XmlElement(required = true)
    protected _VmsControllerTableVersionedReference vmsControllerTableReference;
    @XmlElement(required = true)
    protected _VmsControllerVersionedReference vmsControllerReference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdateTime;
    protected InternationalIdentifier informationManagerOverride;
    protected List<_VmsControllerStatusVmsIndexVmsStatus> vmsStatus;
    protected List<VmsControllerFault> vmsControllerFault;
    @XmlElement(name = "_vmsControllerStatusExtension")
    protected _ExtensionType _VmsControllerStatusExtension;

    /**
     * Gets the value of the vmsControllerTableReference property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsControllerTableVersionedReference }
     *     
     */
    public _VmsControllerTableVersionedReference getVmsControllerTableReference() {
        return vmsControllerTableReference;
    }

    /**
     * Sets the value of the vmsControllerTableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsControllerTableVersionedReference }
     *     
     */
    public void setVmsControllerTableReference(_VmsControllerTableVersionedReference value) {
        this.vmsControllerTableReference = value;
    }

    /**
     * Gets the value of the vmsControllerReference property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsControllerVersionedReference }
     *     
     */
    public _VmsControllerVersionedReference getVmsControllerReference() {
        return vmsControllerReference;
    }

    /**
     * Sets the value of the vmsControllerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsControllerVersionedReference }
     *     
     */
    public void setVmsControllerReference(_VmsControllerVersionedReference value) {
        this.vmsControllerReference = value;
    }

    /**
     * Gets the value of the statusUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusUpdateTime() {
        return statusUpdateTime;
    }

    /**
     * Sets the value of the statusUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusUpdateTime(XMLGregorianCalendar value) {
        this.statusUpdateTime = value;
    }

    /**
     * Gets the value of the informationManagerOverride property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManagerOverride() {
        return informationManagerOverride;
    }

    /**
     * Sets the value of the informationManagerOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManagerOverride(InternationalIdentifier value) {
        this.informationManagerOverride = value;
    }

    /**
     * Gets the value of the vmsStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsControllerStatusVmsIndexVmsStatus }
     * 
     * 
     */
    public List<_VmsControllerStatusVmsIndexVmsStatus> getVmsStatus() {
        if (vmsStatus == null) {
            vmsStatus = new ArrayList<_VmsControllerStatusVmsIndexVmsStatus>();
        }
        return this.vmsStatus;
    }

    /**
     * Gets the value of the vmsControllerFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsControllerFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsControllerFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsControllerFault }
     * 
     * 
     */
    public List<VmsControllerFault> getVmsControllerFault() {
        if (vmsControllerFault == null) {
            vmsControllerFault = new ArrayList<VmsControllerFault>();
        }
        return this.vmsControllerFault;
    }

    /**
     * Gets the value of the _VmsControllerStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsControllerStatusExtension() {
        return _VmsControllerStatusExtension;
    }

    /**
     * Sets the value of the _VmsControllerStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsControllerStatusExtension(_ExtensionType value) {
        this._VmsControllerStatusExtension = value;
    }

}
