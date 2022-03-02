
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsPictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsPictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramDescription" type="{http://datex2.eu/schema/2/2_0}VmsDatexPictogramEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pictogramCode" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="pictogramUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="additionalPictogramDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pictogramFlashing" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramInInverseColour" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="presenceOfRedTriangle" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="viennaConventionCompliant" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="distanceAttribute" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="heightAttribute" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="lengthAttribute" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="speedAttribute" type="{http://datex2.eu/schema/2/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="weightAttribute" type="{http://datex2.eu/schema/2/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="weightPerAxleAttribute" type="{http://datex2.eu/schema/2/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="widthAttribute" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vmsSupplementaryPanel" type="{http://datex2.eu/schema/2/2_0}VmsSupplementaryPanel" minOccurs="0"/&gt;
 *         &lt;element name="vmsPictogramExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsPictogram", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "pictogramDescription",
    "pictogramCode",
    "pictogramUrl",
    "additionalPictogramDescription",
    "pictogramFlashing",
    "pictogramInInverseColour",
    "presenceOfRedTriangle",
    "viennaConventionCompliant",
    "distanceAttribute",
    "heightAttribute",
    "lengthAttribute",
    "speedAttribute",
    "weightAttribute",
    "weightPerAxleAttribute",
    "widthAttribute",
    "vmsSupplementaryPanel",
    "vmsPictogramExtension"
})
public class VmsPictogram {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<VmsDatexPictogramEnum> pictogramDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String pictogramCode;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "anyURI")
    protected String pictogramUrl;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString additionalPictogramDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean pictogramFlashing;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean pictogramInInverseColour;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected boolean presenceOfRedTriangle;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean viennaConventionCompliant;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float heightAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float lengthAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float speedAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float weightAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float weightPerAxleAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float widthAttribute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected VmsSupplementaryPanel vmsSupplementaryPanel;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsPictogramExtension;

    /**
     * Gets the value of the pictogramDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pictogramDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictogramDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsDatexPictogramEnum }
     * 
     * 
     */
    public List<VmsDatexPictogramEnum> getPictogramDescription() {
        if (pictogramDescription == null) {
            pictogramDescription = new ArrayList<VmsDatexPictogramEnum>();
        }
        return this.pictogramDescription;
    }

    /**
     * Gets the value of the pictogramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramCode() {
        return pictogramCode;
    }

    /**
     * Sets the value of the pictogramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramCode(String value) {
        this.pictogramCode = value;
    }

    /**
     * Gets the value of the pictogramUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramUrl() {
        return pictogramUrl;
    }

    /**
     * Sets the value of the pictogramUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramUrl(String value) {
        this.pictogramUrl = value;
    }

    /**
     * Gets the value of the additionalPictogramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdditionalPictogramDescription() {
        return additionalPictogramDescription;
    }

    /**
     * Sets the value of the additionalPictogramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdditionalPictogramDescription(MultilingualString value) {
        this.additionalPictogramDescription = value;
    }

    /**
     * Gets the value of the pictogramFlashing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramFlashing() {
        return pictogramFlashing;
    }

    /**
     * Sets the value of the pictogramFlashing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramFlashing(Boolean value) {
        this.pictogramFlashing = value;
    }

    /**
     * Gets the value of the pictogramInInverseColour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramInInverseColour() {
        return pictogramInInverseColour;
    }

    /**
     * Sets the value of the pictogramInInverseColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramInInverseColour(Boolean value) {
        this.pictogramInInverseColour = value;
    }

    /**
     * Gets the value of the presenceOfRedTriangle property.
     * 
     */
    public boolean isPresenceOfRedTriangle() {
        return presenceOfRedTriangle;
    }

    /**
     * Sets the value of the presenceOfRedTriangle property.
     * 
     */
    public void setPresenceOfRedTriangle(boolean value) {
        this.presenceOfRedTriangle = value;
    }

    /**
     * Gets the value of the viennaConventionCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViennaConventionCompliant() {
        return viennaConventionCompliant;
    }

    /**
     * Sets the value of the viennaConventionCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViennaConventionCompliant(Boolean value) {
        this.viennaConventionCompliant = value;
    }

    /**
     * Gets the value of the distanceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceAttribute() {
        return distanceAttribute;
    }

    /**
     * Sets the value of the distanceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceAttribute(BigInteger value) {
        this.distanceAttribute = value;
    }

    /**
     * Gets the value of the heightAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeightAttribute() {
        return heightAttribute;
    }

    /**
     * Sets the value of the heightAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeightAttribute(Float value) {
        this.heightAttribute = value;
    }

    /**
     * Gets the value of the lengthAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAttribute() {
        return lengthAttribute;
    }

    /**
     * Sets the value of the lengthAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAttribute(Float value) {
        this.lengthAttribute = value;
    }

    /**
     * Gets the value of the speedAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeedAttribute() {
        return speedAttribute;
    }

    /**
     * Sets the value of the speedAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeedAttribute(Float value) {
        this.speedAttribute = value;
    }

    /**
     * Gets the value of the weightAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightAttribute() {
        return weightAttribute;
    }

    /**
     * Sets the value of the weightAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightAttribute(Float value) {
        this.weightAttribute = value;
    }

    /**
     * Gets the value of the weightPerAxleAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightPerAxleAttribute() {
        return weightPerAxleAttribute;
    }

    /**
     * Sets the value of the weightPerAxleAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightPerAxleAttribute(Float value) {
        this.weightPerAxleAttribute = value;
    }

    /**
     * Gets the value of the widthAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWidthAttribute() {
        return widthAttribute;
    }

    /**
     * Sets the value of the widthAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWidthAttribute(Float value) {
        this.widthAttribute = value;
    }

    /**
     * Gets the value of the vmsSupplementaryPanel property.
     * 
     * @return
     *     possible object is
     *     {@link VmsSupplementaryPanel }
     *     
     */
    public VmsSupplementaryPanel getVmsSupplementaryPanel() {
        return vmsSupplementaryPanel;
    }

    /**
     * Sets the value of the vmsSupplementaryPanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsSupplementaryPanel }
     *     
     */
    public void setVmsSupplementaryPanel(VmsSupplementaryPanel value) {
        this.vmsSupplementaryPanel = value;
    }

    /**
     * Gets the value of the vmsPictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsPictogramExtension() {
        return vmsPictogramExtension;
    }

    /**
     * Sets the value of the vmsPictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsPictogramExtension(ExtensionType value) {
        this.vmsPictogramExtension = value;
    }

}
