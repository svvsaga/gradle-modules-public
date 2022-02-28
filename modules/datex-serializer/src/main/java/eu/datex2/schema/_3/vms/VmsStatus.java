
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Location;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Provides the current status and settings of the VMS and the currently displayed
 *         information.
 *       
 * 
 * <p>Java class for VmsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flashingLightsOn" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="remainingPowerCapacity" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="statusUpdateTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="sequencingInterval" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="workingStatus" type="{http://datex2.eu/schema/3/vms}_WorkingStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsDynamicConfiguration" type="{http://datex2.eu/schema/3/vms}VmsConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="vmsMessage" type="{http://datex2.eu/schema/3/vms}_VmsStatusMessageIndexVmsMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsLocationOverride" type="{http://datex2.eu/schema/3/locationReferencing}Location" minOccurs="0"/&gt;
 *         &lt;element name="managedLogicalLocationOverride" type="{http://datex2.eu/schema/3/vms}ManagedLogicalLocation" minOccurs="0"/&gt;
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/3/vms}VmsFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_vmsStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsStatus", propOrder = {
    "flashingLightsOn",
    "remainingPowerCapacity",
    "statusUpdateTime",
    "sequencingInterval",
    "workingStatus",
    "vmsDynamicConfiguration",
    "vmsMessage",
    "vmsLocationOverride",
    "managedLogicalLocationOverride",
    "vmsFault",
    "_VmsStatusExtension"
})
public class VmsStatus {

    protected Boolean flashingLightsOn;
    protected Float remainingPowerCapacity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdateTime;
    protected Float sequencingInterval;
    protected _WorkingStatusEnum workingStatus;
    protected VmsConfiguration vmsDynamicConfiguration;
    protected List<_VmsStatusMessageIndexVmsMessage> vmsMessage;
    protected Location vmsLocationOverride;
    protected ManagedLogicalLocation managedLogicalLocationOverride;
    protected List<VmsFault> vmsFault;
    @XmlElement(name = "_vmsStatusExtension")
    protected _ExtensionType _VmsStatusExtension;

    /**
     * Gets the value of the flashingLightsOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlashingLightsOn() {
        return flashingLightsOn;
    }

    /**
     * Sets the value of the flashingLightsOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlashingLightsOn(Boolean value) {
        this.flashingLightsOn = value;
    }

    /**
     * Gets the value of the remainingPowerCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRemainingPowerCapacity() {
        return remainingPowerCapacity;
    }

    /**
     * Sets the value of the remainingPowerCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRemainingPowerCapacity(Float value) {
        this.remainingPowerCapacity = value;
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
     * Gets the value of the sequencingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSequencingInterval() {
        return sequencingInterval;
    }

    /**
     * Sets the value of the sequencingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSequencingInterval(Float value) {
        this.sequencingInterval = value;
    }

    /**
     * Gets the value of the workingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _WorkingStatusEnum }
     *     
     */
    public _WorkingStatusEnum getWorkingStatus() {
        return workingStatus;
    }

    /**
     * Sets the value of the workingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _WorkingStatusEnum }
     *     
     */
    public void setWorkingStatus(_WorkingStatusEnum value) {
        this.workingStatus = value;
    }

    /**
     * Gets the value of the vmsDynamicConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link VmsConfiguration }
     *     
     */
    public VmsConfiguration getVmsDynamicConfiguration() {
        return vmsDynamicConfiguration;
    }

    /**
     * Sets the value of the vmsDynamicConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsConfiguration }
     *     
     */
    public void setVmsDynamicConfiguration(VmsConfiguration value) {
        this.vmsDynamicConfiguration = value;
    }

    /**
     * Gets the value of the vmsMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsStatusMessageIndexVmsMessage }
     * 
     * 
     */
    public List<_VmsStatusMessageIndexVmsMessage> getVmsMessage() {
        if (vmsMessage == null) {
            vmsMessage = new ArrayList<_VmsStatusMessageIndexVmsMessage>();
        }
        return this.vmsMessage;
    }

    /**
     * Gets the value of the vmsLocationOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getVmsLocationOverride() {
        return vmsLocationOverride;
    }

    /**
     * Sets the value of the vmsLocationOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setVmsLocationOverride(Location value) {
        this.vmsLocationOverride = value;
    }

    /**
     * Gets the value of the managedLogicalLocationOverride property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedLogicalLocation }
     *     
     */
    public ManagedLogicalLocation getManagedLogicalLocationOverride() {
        return managedLogicalLocationOverride;
    }

    /**
     * Sets the value of the managedLogicalLocationOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedLogicalLocation }
     *     
     */
    public void setManagedLogicalLocationOverride(ManagedLogicalLocation value) {
        this.managedLogicalLocationOverride = value;
    }

    /**
     * Gets the value of the vmsFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsFault }
     * 
     * 
     */
    public List<VmsFault> getVmsFault() {
        if (vmsFault == null) {
            vmsFault = new ArrayList<VmsFault>();
        }
        return this.vmsFault;
    }

    /**
     * Gets the value of the _VmsStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsStatusExtension() {
        return _VmsStatusExtension;
    }

    /**
     * Sets the value of the _VmsStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsStatusExtension(_ExtensionType value) {
        this._VmsStatusExtension = value;
    }

}
