
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsPictogramDisplayCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsPictogramDisplayCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramLanternsPresent" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramSequencingCapable" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramPixelsAcross" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pictogramPixelsDown" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pictogramDisplayHeight" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="pictogramDisplayWidth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="pictogramCodeListIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="maxPictogramLuminanceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pictogramNumberOfColours" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfSequentialPictograms" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pictogramPositionAbsolute" type="{http://datex2.eu/schema/2/2_0}PositionAbsoluteEnum" minOccurs="0"/&gt;
 *         &lt;element name="pictogramPositionX" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="pictogramPositionY" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="pictogramPositionRelativeToText" type="{http://datex2.eu/schema/2/2_0}PositionRelativeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsSupplementaryPanelCharacteristics" type="{http://datex2.eu/schema/2/2_0}VmsSupplementaryPanelCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="vmsPictogramDisplayCharacteristicsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsPictogramDisplayCharacteristics", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "pictogramLanternsPresent",
    "pictogramSequencingCapable",
    "pictogramPixelsAcross",
    "pictogramPixelsDown",
    "pictogramDisplayHeight",
    "pictogramDisplayWidth",
    "pictogramCodeListIdentifier",
    "maxPictogramLuminanceLevel",
    "pictogramNumberOfColours",
    "maxNumberOfSequentialPictograms",
    "pictogramPositionAbsolute",
    "pictogramPositionX",
    "pictogramPositionY",
    "pictogramPositionRelativeToText",
    "vmsSupplementaryPanelCharacteristics",
    "vmsPictogramDisplayCharacteristicsExtension"
})
public class VmsPictogramDisplayCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean pictogramLanternsPresent;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean pictogramSequencingCapable;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pictogramPixelsAcross;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pictogramPixelsDown;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float pictogramDisplayHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float pictogramDisplayWidth;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String pictogramCodeListIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxPictogramLuminanceLevel;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pictogramNumberOfColours;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfSequentialPictograms;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected PositionAbsoluteEnum pictogramPositionAbsolute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float pictogramPositionX;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float pictogramPositionY;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected PositionRelativeEnum pictogramPositionRelativeToText;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected VmsSupplementaryPanelCharacteristics vmsSupplementaryPanelCharacteristics;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsPictogramDisplayCharacteristicsExtension;

    /**
     * Gets the value of the pictogramLanternsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramLanternsPresent() {
        return pictogramLanternsPresent;
    }

    /**
     * Sets the value of the pictogramLanternsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramLanternsPresent(Boolean value) {
        this.pictogramLanternsPresent = value;
    }

    /**
     * Gets the value of the pictogramSequencingCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramSequencingCapable() {
        return pictogramSequencingCapable;
    }

    /**
     * Sets the value of the pictogramSequencingCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramSequencingCapable(Boolean value) {
        this.pictogramSequencingCapable = value;
    }

    /**
     * Gets the value of the pictogramPixelsAcross property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPictogramPixelsAcross() {
        return pictogramPixelsAcross;
    }

    /**
     * Sets the value of the pictogramPixelsAcross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPictogramPixelsAcross(BigInteger value) {
        this.pictogramPixelsAcross = value;
    }

    /**
     * Gets the value of the pictogramPixelsDown property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPictogramPixelsDown() {
        return pictogramPixelsDown;
    }

    /**
     * Sets the value of the pictogramPixelsDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPictogramPixelsDown(BigInteger value) {
        this.pictogramPixelsDown = value;
    }

    /**
     * Gets the value of the pictogramDisplayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPictogramDisplayHeight() {
        return pictogramDisplayHeight;
    }

    /**
     * Sets the value of the pictogramDisplayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPictogramDisplayHeight(Float value) {
        this.pictogramDisplayHeight = value;
    }

    /**
     * Gets the value of the pictogramDisplayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPictogramDisplayWidth() {
        return pictogramDisplayWidth;
    }

    /**
     * Sets the value of the pictogramDisplayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPictogramDisplayWidth(Float value) {
        this.pictogramDisplayWidth = value;
    }

    /**
     * Gets the value of the pictogramCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramCodeListIdentifier() {
        return pictogramCodeListIdentifier;
    }

    /**
     * Sets the value of the pictogramCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramCodeListIdentifier(String value) {
        this.pictogramCodeListIdentifier = value;
    }

    /**
     * Gets the value of the maxPictogramLuminanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPictogramLuminanceLevel() {
        return maxPictogramLuminanceLevel;
    }

    /**
     * Sets the value of the maxPictogramLuminanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPictogramLuminanceLevel(BigInteger value) {
        this.maxPictogramLuminanceLevel = value;
    }

    /**
     * Gets the value of the pictogramNumberOfColours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPictogramNumberOfColours() {
        return pictogramNumberOfColours;
    }

    /**
     * Sets the value of the pictogramNumberOfColours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPictogramNumberOfColours(BigInteger value) {
        this.pictogramNumberOfColours = value;
    }

    /**
     * Gets the value of the maxNumberOfSequentialPictograms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfSequentialPictograms() {
        return maxNumberOfSequentialPictograms;
    }

    /**
     * Sets the value of the maxNumberOfSequentialPictograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfSequentialPictograms(BigInteger value) {
        this.maxNumberOfSequentialPictograms = value;
    }

    /**
     * Gets the value of the pictogramPositionAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAbsoluteEnum }
     *     
     */
    public PositionAbsoluteEnum getPictogramPositionAbsolute() {
        return pictogramPositionAbsolute;
    }

    /**
     * Sets the value of the pictogramPositionAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAbsoluteEnum }
     *     
     */
    public void setPictogramPositionAbsolute(PositionAbsoluteEnum value) {
        this.pictogramPositionAbsolute = value;
    }

    /**
     * Gets the value of the pictogramPositionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPictogramPositionX() {
        return pictogramPositionX;
    }

    /**
     * Sets the value of the pictogramPositionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPictogramPositionX(Float value) {
        this.pictogramPositionX = value;
    }

    /**
     * Gets the value of the pictogramPositionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPictogramPositionY() {
        return pictogramPositionY;
    }

    /**
     * Sets the value of the pictogramPositionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPictogramPositionY(Float value) {
        this.pictogramPositionY = value;
    }

    /**
     * Gets the value of the pictogramPositionRelativeToText property.
     * 
     * @return
     *     possible object is
     *     {@link PositionRelativeEnum }
     *     
     */
    public PositionRelativeEnum getPictogramPositionRelativeToText() {
        return pictogramPositionRelativeToText;
    }

    /**
     * Sets the value of the pictogramPositionRelativeToText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionRelativeEnum }
     *     
     */
    public void setPictogramPositionRelativeToText(PositionRelativeEnum value) {
        this.pictogramPositionRelativeToText = value;
    }

    /**
     * Gets the value of the vmsSupplementaryPanelCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VmsSupplementaryPanelCharacteristics }
     *     
     */
    public VmsSupplementaryPanelCharacteristics getVmsSupplementaryPanelCharacteristics() {
        return vmsSupplementaryPanelCharacteristics;
    }

    /**
     * Sets the value of the vmsSupplementaryPanelCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsSupplementaryPanelCharacteristics }
     *     
     */
    public void setVmsSupplementaryPanelCharacteristics(VmsSupplementaryPanelCharacteristics value) {
        this.vmsSupplementaryPanelCharacteristics = value;
    }

    /**
     * Gets the value of the vmsPictogramDisplayCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsPictogramDisplayCharacteristicsExtension() {
        return vmsPictogramDisplayCharacteristicsExtension;
    }

    /**
     * Sets the value of the vmsPictogramDisplayCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsPictogramDisplayCharacteristicsExtension(ExtensionType value) {
        this.vmsPictogramDisplayCharacteristicsExtension = value;
    }

}
