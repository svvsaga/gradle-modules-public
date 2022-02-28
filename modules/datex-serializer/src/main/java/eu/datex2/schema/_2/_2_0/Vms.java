
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsWorking" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="vmsMessageSequencingInterval" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="vmsMessage" type="{http://datex2.eu/schema/2/2_0}_VmsMessageIndexVmsMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="textDisplayAreaSettings" type="{http://datex2.eu/schema/2/2_0}TextDisplayAreaSettings" minOccurs="0"/&gt;
 *         &lt;element name="pictogramDisplayAreaSettings" type="{http://datex2.eu/schema/2/2_0}_VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsLocationOverride" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/&gt;
 *         &lt;element name="managedLogicalLocationOverride" type="{http://datex2.eu/schema/2/2_0}VmsManagedLogicalLocation" minOccurs="0"/&gt;
 *         &lt;element name="vmsDynamicCharacteristics" type="{http://datex2.eu/schema/2/2_0}VmsDynamicCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/2/2_0}VmsFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vms", propOrder = {
    "vmsWorking",
    "vmsMessageSequencingInterval",
    "vmsMessage",
    "textDisplayAreaSettings",
    "pictogramDisplayAreaSettings",
    "vmsLocationOverride",
    "managedLogicalLocationOverride",
    "vmsDynamicCharacteristics",
    "vmsFault",
    "vmsExtension"
})
public class Vms {

    protected boolean vmsWorking;
    protected Float vmsMessageSequencingInterval;
    protected List<_VmsMessageIndexVmsMessage> vmsMessage;
    protected TextDisplayAreaSettings textDisplayAreaSettings;
    protected List<_VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings> pictogramDisplayAreaSettings;
    protected Location vmsLocationOverride;
    protected VmsManagedLogicalLocation managedLogicalLocationOverride;
    protected VmsDynamicCharacteristics vmsDynamicCharacteristics;
    protected List<VmsFault> vmsFault;
    protected _ExtensionType vmsExtension;

    /**
     * Gets the value of the vmsWorking property.
     * 
     */
    public boolean isVmsWorking() {
        return vmsWorking;
    }

    /**
     * Sets the value of the vmsWorking property.
     * 
     */
    public void setVmsWorking(boolean value) {
        this.vmsWorking = value;
    }

    /**
     * Gets the value of the vmsMessageSequencingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVmsMessageSequencingInterval() {
        return vmsMessageSequencingInterval;
    }

    /**
     * Sets the value of the vmsMessageSequencingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVmsMessageSequencingInterval(Float value) {
        this.vmsMessageSequencingInterval = value;
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
     * {@link _VmsMessageIndexVmsMessage }
     * 
     * 
     */
    public List<_VmsMessageIndexVmsMessage> getVmsMessage() {
        if (vmsMessage == null) {
            vmsMessage = new ArrayList<_VmsMessageIndexVmsMessage>();
        }
        return this.vmsMessage;
    }

    /**
     * Gets the value of the textDisplayAreaSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TextDisplayAreaSettings }
     *     
     */
    public TextDisplayAreaSettings getTextDisplayAreaSettings() {
        return textDisplayAreaSettings;
    }

    /**
     * Sets the value of the textDisplayAreaSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDisplayAreaSettings }
     *     
     */
    public void setTextDisplayAreaSettings(TextDisplayAreaSettings value) {
        this.textDisplayAreaSettings = value;
    }

    /**
     * Gets the value of the pictogramDisplayAreaSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pictogramDisplayAreaSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictogramDisplayAreaSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings }
     * 
     * 
     */
    public List<_VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings> getPictogramDisplayAreaSettings() {
        if (pictogramDisplayAreaSettings == null) {
            pictogramDisplayAreaSettings = new ArrayList<_VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings>();
        }
        return this.pictogramDisplayAreaSettings;
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
     *     {@link VmsManagedLogicalLocation }
     *     
     */
    public VmsManagedLogicalLocation getManagedLogicalLocationOverride() {
        return managedLogicalLocationOverride;
    }

    /**
     * Sets the value of the managedLogicalLocationOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsManagedLogicalLocation }
     *     
     */
    public void setManagedLogicalLocationOverride(VmsManagedLogicalLocation value) {
        this.managedLogicalLocationOverride = value;
    }

    /**
     * Gets the value of the vmsDynamicCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VmsDynamicCharacteristics }
     *     
     */
    public VmsDynamicCharacteristics getVmsDynamicCharacteristics() {
        return vmsDynamicCharacteristics;
    }

    /**
     * Sets the value of the vmsDynamicCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsDynamicCharacteristics }
     *     
     */
    public void setVmsDynamicCharacteristics(VmsDynamicCharacteristics value) {
        this.vmsDynamicCharacteristics = value;
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
     * Gets the value of the vmsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsExtension() {
        return vmsExtension;
    }

    /**
     * Sets the value of the vmsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsExtension(_ExtensionType value) {
        this.vmsExtension = value;
    }

}
