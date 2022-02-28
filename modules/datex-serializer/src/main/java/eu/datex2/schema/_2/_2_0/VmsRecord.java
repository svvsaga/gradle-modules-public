
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vmsOwner" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vmsPhysicalMounting" type="{http://datex2.eu/schema/2/2_0}PhysicalMountingEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsType" type="{http://datex2.eu/schema/2/2_0}VmsTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsTypeCode" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPictogramDisplayAreas" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="dynamicallyConfigurableDisplayAreas" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="vmsDisplayHeight" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vmsDisplayWidth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vmsHeightAboveRoadway" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextDisplayCharacteristics" type="{http://datex2.eu/schema/2/2_0}VmsTextDisplayCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="vmsPictogramDisplayCharacteristics" type="{http://datex2.eu/schema/2/2_0}_VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsLocation" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/&gt;
 *         &lt;element name="vmsManagedLogicalLocation" type="{http://datex2.eu/schema/2/2_0}VmsManagedLogicalLocation" minOccurs="0"/&gt;
 *         &lt;element name="backgroundImageUrl" type="{http://datex2.eu/schema/2/2_0}UrlLink" minOccurs="0"/&gt;
 *         &lt;element name="vmsRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsRecord", propOrder = {
    "vmsDescription",
    "vmsOwner",
    "vmsPhysicalMounting",
    "vmsType",
    "vmsTypeCode",
    "numberOfPictogramDisplayAreas",
    "dynamicallyConfigurableDisplayAreas",
    "vmsDisplayHeight",
    "vmsDisplayWidth",
    "vmsHeightAboveRoadway",
    "vmsTextDisplayCharacteristics",
    "vmsPictogramDisplayCharacteristics",
    "vmsLocation",
    "vmsManagedLogicalLocation",
    "backgroundImageUrl",
    "vmsRecordExtension"
})
public class VmsRecord {

    protected MultilingualString vmsDescription;
    protected MultilingualString vmsOwner;
    @XmlSchemaType(name = "string")
    protected PhysicalMountingEnum vmsPhysicalMounting;
    @XmlSchemaType(name = "string")
    protected VmsTypeEnum vmsType;
    protected String vmsTypeCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPictogramDisplayAreas;
    protected Boolean dynamicallyConfigurableDisplayAreas;
    protected Float vmsDisplayHeight;
    protected Float vmsDisplayWidth;
    protected Float vmsHeightAboveRoadway;
    protected VmsTextDisplayCharacteristics vmsTextDisplayCharacteristics;
    protected List<_VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics> vmsPictogramDisplayCharacteristics;
    protected Location vmsLocation;
    protected VmsManagedLogicalLocation vmsManagedLogicalLocation;
    protected UrlLink backgroundImageUrl;
    protected _ExtensionType vmsRecordExtension;

    /**
     * Gets the value of the vmsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVmsDescription() {
        return vmsDescription;
    }

    /**
     * Sets the value of the vmsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVmsDescription(MultilingualString value) {
        this.vmsDescription = value;
    }

    /**
     * Gets the value of the vmsOwner property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVmsOwner() {
        return vmsOwner;
    }

    /**
     * Sets the value of the vmsOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVmsOwner(MultilingualString value) {
        this.vmsOwner = value;
    }

    /**
     * Gets the value of the vmsPhysicalMounting property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalMountingEnum }
     *     
     */
    public PhysicalMountingEnum getVmsPhysicalMounting() {
        return vmsPhysicalMounting;
    }

    /**
     * Sets the value of the vmsPhysicalMounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalMountingEnum }
     *     
     */
    public void setVmsPhysicalMounting(PhysicalMountingEnum value) {
        this.vmsPhysicalMounting = value;
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
     * Gets the value of the numberOfPictogramDisplayAreas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPictogramDisplayAreas() {
        return numberOfPictogramDisplayAreas;
    }

    /**
     * Sets the value of the numberOfPictogramDisplayAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPictogramDisplayAreas(BigInteger value) {
        this.numberOfPictogramDisplayAreas = value;
    }

    /**
     * Gets the value of the dynamicallyConfigurableDisplayAreas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicallyConfigurableDisplayAreas() {
        return dynamicallyConfigurableDisplayAreas;
    }

    /**
     * Sets the value of the dynamicallyConfigurableDisplayAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicallyConfigurableDisplayAreas(Boolean value) {
        this.dynamicallyConfigurableDisplayAreas = value;
    }

    /**
     * Gets the value of the vmsDisplayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVmsDisplayHeight() {
        return vmsDisplayHeight;
    }

    /**
     * Sets the value of the vmsDisplayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVmsDisplayHeight(Float value) {
        this.vmsDisplayHeight = value;
    }

    /**
     * Gets the value of the vmsDisplayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVmsDisplayWidth() {
        return vmsDisplayWidth;
    }

    /**
     * Sets the value of the vmsDisplayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVmsDisplayWidth(Float value) {
        this.vmsDisplayWidth = value;
    }

    /**
     * Gets the value of the vmsHeightAboveRoadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVmsHeightAboveRoadway() {
        return vmsHeightAboveRoadway;
    }

    /**
     * Sets the value of the vmsHeightAboveRoadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVmsHeightAboveRoadway(Float value) {
        this.vmsHeightAboveRoadway = value;
    }

    /**
     * Gets the value of the vmsTextDisplayCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTextDisplayCharacteristics }
     *     
     */
    public VmsTextDisplayCharacteristics getVmsTextDisplayCharacteristics() {
        return vmsTextDisplayCharacteristics;
    }

    /**
     * Sets the value of the vmsTextDisplayCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTextDisplayCharacteristics }
     *     
     */
    public void setVmsTextDisplayCharacteristics(VmsTextDisplayCharacteristics value) {
        this.vmsTextDisplayCharacteristics = value;
    }

    /**
     * Gets the value of the vmsPictogramDisplayCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsPictogramDisplayCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsPictogramDisplayCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics }
     * 
     * 
     */
    public List<_VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics> getVmsPictogramDisplayCharacteristics() {
        if (vmsPictogramDisplayCharacteristics == null) {
            vmsPictogramDisplayCharacteristics = new ArrayList<_VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics>();
        }
        return this.vmsPictogramDisplayCharacteristics;
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
     * Gets the value of the vmsManagedLogicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VmsManagedLogicalLocation }
     *     
     */
    public VmsManagedLogicalLocation getVmsManagedLogicalLocation() {
        return vmsManagedLogicalLocation;
    }

    /**
     * Sets the value of the vmsManagedLogicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsManagedLogicalLocation }
     *     
     */
    public void setVmsManagedLogicalLocation(VmsManagedLogicalLocation value) {
        this.vmsManagedLogicalLocation = value;
    }

    /**
     * Gets the value of the backgroundImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    /**
     * Sets the value of the backgroundImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setBackgroundImageUrl(UrlLink value) {
        this.backgroundImageUrl = value;
    }

    /**
     * Gets the value of the vmsRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsRecordExtension() {
        return vmsRecordExtension;
    }

    /**
     * Sets the value of the vmsRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsRecordExtension(_ExtensionType value) {
        this.vmsRecordExtension = value;
    }

}
