
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.UrlLink;
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
@XmlType(name = "Vms", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
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
    "vmsExtension"
})
public class Vms {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean lanternsPresent;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected MultilingualString description;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected MultilingualString owner;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected PhysicalSupportEnum physicalSupport;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected VmsTypeEnum vmsType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String vmsTypeCode;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean dynamicallyConfigurable;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Float displayHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Float displayWidth;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Float heightAboveCarriageway;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected DedicatedUsageEnum dedicatedUsage;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected VmsConfiguration vmsConfiguration;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Location vmsLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected ManagedLogicalLocation managedLogicalLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected UrlLink imageLink;
    @XmlElement(name = "_vmsExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType vmsExtension;

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
     *     {@link PhysicalSupportEnum }
     *     
     */
    public PhysicalSupportEnum getPhysicalSupport() {
        return physicalSupport;
    }

    /**
     * Sets the value of the physicalSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalSupportEnum }
     *     
     */
    public void setPhysicalSupport(PhysicalSupportEnum value) {
        this.physicalSupport = value;
    }

    /**
     * Gets the value of the vmsType property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTypeEnum }
     *     
     */
    public VmsTypeEnum getVmsType() {
        return vmsType;
    }

    /**
     * Sets the value of the vmsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTypeEnum }
     *     
     */
    public void setVmsType(VmsTypeEnum value) {
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
     *     {@link DedicatedUsageEnum }
     *     
     */
    public DedicatedUsageEnum getDedicatedUsage() {
        return dedicatedUsage;
    }

    /**
     * Sets the value of the dedicatedUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DedicatedUsageEnum }
     *     
     */
    public void setDedicatedUsage(DedicatedUsageEnum value) {
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
     * Gets the value of the vmsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsExtension() {
        return vmsExtension;
    }

    /**
     * Sets the value of the vmsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsExtension(ExtensionType value) {
        this.vmsExtension = value;
    }

}
