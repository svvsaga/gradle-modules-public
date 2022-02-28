
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.UrlLink;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Location;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Variable message sign - a display panel used to display one or more messages (text,
 *         symbols, pictograms or combinations) that can be changed or switched on or off as required
 *       
 * 
 * <p>Java class for Vms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lanternsPresent" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="physicalSupport" type="{http://datex2.eu/schema/3/vms}_PhysicalSupportEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsType" type="{http://datex2.eu/schema/3/vms}_VmsTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsTypeCode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="dynamicallyConfigurable" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="displayHeight" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="displayWidth" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="heightAboveCarriageway" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="dedicatedUsage" type="{http://datex2.eu/schema/3/vms}_DedicatedUsageEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsConfiguration" type="{http://datex2.eu/schema/3/vms}VmsConfiguration"/&gt;
 *         &lt;element name="vmsLocation" type="{http://datex2.eu/schema/3/locationReferencing}Location" minOccurs="0"/&gt;
 *         &lt;element name="managedLogicalLocation" type="{http://datex2.eu/schema/3/vms}ManagedLogicalLocation" minOccurs="0"/&gt;
 *         &lt;element name="imageLink" type="{http://datex2.eu/schema/3/common}UrlLink" minOccurs="0"/&gt;
 *         &lt;element name="_vmsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "lanternsPresent",
    "description",
    "owner",
    "physicalSupport",
    "vmsType",
    "vmsTypeCode",
    "dynamicallyConfigurable",
    "displayHeight",
    "displayWidth",
    "heightAboveCarriageway",
    "dedicatedUsage",
    "vmsConfiguration",
    "vmsLocation",
    "managedLogicalLocation",
    "imageLink",
    "_VmsExtension"
})
public class Vms {

    protected Boolean lanternsPresent;
    protected MultilingualString description;
    protected MultilingualString owner;
    protected _PhysicalSupportEnum physicalSupport;
    protected _VmsTypeEnum vmsType;
    protected String vmsTypeCode;
    protected Boolean dynamicallyConfigurable;
    protected Float displayHeight;
    protected Float displayWidth;
    protected Float heightAboveCarriageway;
    protected _DedicatedUsageEnum dedicatedUsage;
    @XmlElement(required = true)
    protected VmsConfiguration vmsConfiguration;
    protected Location vmsLocation;
    protected ManagedLogicalLocation managedLogicalLocation;
    protected UrlLink imageLink;
    @XmlElement(name = "_vmsExtension")
    protected _ExtensionType _VmsExtension;

    /**
     * Gets the value of the lanternsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLanternsPresent() {
        return lanternsPresent;
    }

    /**
     * Sets the value of the lanternsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanternsPresent(Boolean value) {
        this.lanternsPresent = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setOwner(MultilingualString value) {
        this.owner = value;
    }

    /**
     * Gets the value of the physicalSupport property.
     * 
     * @return
     *     possible object is
     *     {@link _PhysicalSupportEnum }
     *     
     */
    public _PhysicalSupportEnum getPhysicalSupport() {
        return physicalSupport;
    }

    /**
     * Sets the value of the physicalSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PhysicalSupportEnum }
     *     
     */
    public void setPhysicalSupport(_PhysicalSupportEnum value) {
        this.physicalSupport = value;
    }

    /**
     * Gets the value of the vmsType property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsTypeEnum }
     *     
     */
    public _VmsTypeEnum getVmsType() {
        return vmsType;
    }

    /**
     * Sets the value of the vmsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsTypeEnum }
     *     
     */
    public void setVmsType(_VmsTypeEnum value) {
        this.vmsType = value;
    }

    /**
     * Gets the value of the vmsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsTypeCode() {
        return vmsTypeCode;
    }

    /**
     * Sets the value of the vmsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsTypeCode(String value) {
        this.vmsTypeCode = value;
    }

    /**
     * Gets the value of the dynamicallyConfigurable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicallyConfigurable() {
        return dynamicallyConfigurable;
    }

    /**
     * Sets the value of the dynamicallyConfigurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicallyConfigurable(Boolean value) {
        this.dynamicallyConfigurable = value;
    }

    /**
     * Gets the value of the displayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDisplayHeight() {
        return displayHeight;
    }

    /**
     * Sets the value of the displayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisplayHeight(Float value) {
        this.displayHeight = value;
    }

    /**
     * Gets the value of the displayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDisplayWidth() {
        return displayWidth;
    }

    /**
     * Sets the value of the displayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisplayWidth(Float value) {
        this.displayWidth = value;
    }

    /**
     * Gets the value of the heightAboveCarriageway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeightAboveCarriageway() {
        return heightAboveCarriageway;
    }

    /**
     * Sets the value of the heightAboveCarriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeightAboveCarriageway(Float value) {
        this.heightAboveCarriageway = value;
    }

    /**
     * Gets the value of the dedicatedUsage property.
     * 
     * @return
     *     possible object is
     *     {@link _DedicatedUsageEnum }
     *     
     */
    public _DedicatedUsageEnum getDedicatedUsage() {
        return dedicatedUsage;
    }

    /**
     * Sets the value of the dedicatedUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DedicatedUsageEnum }
     *     
     */
    public void setDedicatedUsage(_DedicatedUsageEnum value) {
        this.dedicatedUsage = value;
    }

    /**
     * Gets the value of the vmsConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link VmsConfiguration }
     *     
     */
    public VmsConfiguration getVmsConfiguration() {
        return vmsConfiguration;
    }

    /**
     * Sets the value of the vmsConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsConfiguration }
     *     
     */
    public void setVmsConfiguration(VmsConfiguration value) {
        this.vmsConfiguration = value;
    }

    /**
     * Gets the value of the vmsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getVmsLocation() {
        return vmsLocation;
    }

    /**
     * Sets the value of the vmsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setVmsLocation(Location value) {
        this.vmsLocation = value;
    }

    /**
     * Gets the value of the managedLogicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedLogicalLocation }
     *     
     */
    public ManagedLogicalLocation getManagedLogicalLocation() {
        return managedLogicalLocation;
    }

    /**
     * Sets the value of the managedLogicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedLogicalLocation }
     *     
     */
    public void setManagedLogicalLocation(ManagedLogicalLocation value) {
        this.managedLogicalLocation = value;
    }

    /**
     * Gets the value of the imageLink property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getImageLink() {
        return imageLink;
    }

    /**
     * Sets the value of the imageLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setImageLink(UrlLink value) {
        this.imageLink = value;
    }

    /**
     * Gets the value of the _VmsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsExtension() {
        return _VmsExtension;
    }

    /**
     * Sets the value of the _VmsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsExtension(_ExtensionType value) {
        this._VmsExtension = value;
    }

}
