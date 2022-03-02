
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsTextDisplayCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsTextDisplayCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textLanternsPresent" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="textPageSequencingCapable" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="textPixelsAcross" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="textPixelsDown" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="textDisplayHeight" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="textDisplayWidth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfCharacters" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfRows" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="legendCodeListIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="maxFontHeight" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minFontHeight" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxFontWidth" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minFontWidth" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxFontSpacing" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minFontSpacing" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxTextLuminanceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfSequentialPages" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="textPositionAbsolute" type="{http://datex2.eu/schema/2/2_0}PositionAbsoluteEnum" minOccurs="0"/&gt;
 *         &lt;element name="textPositionX" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="textPositionY" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextDisplayCharacteristicsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsTextDisplayCharacteristics", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "textLanternsPresent",
    "textPageSequencingCapable",
    "textPixelsAcross",
    "textPixelsDown",
    "textDisplayHeight",
    "textDisplayWidth",
    "maxNumberOfCharacters",
    "maxNumberOfRows",
    "legendCodeListIdentifier",
    "maxFontHeight",
    "minFontHeight",
    "maxFontWidth",
    "minFontWidth",
    "maxFontSpacing",
    "minFontSpacing",
    "maxTextLuminanceLevel",
    "maxNumberOfSequentialPages",
    "textPositionAbsolute",
    "textPositionX",
    "textPositionY",
    "vmsTextDisplayCharacteristicsExtension"
})
public class VmsTextDisplayCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean textLanternsPresent;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean textPageSequencingCapable;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textPixelsAcross;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textPixelsDown;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float textDisplayHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float textDisplayWidth;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfCharacters;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfRows;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String legendCodeListIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxFontHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minFontHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxFontWidth;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minFontWidth;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxFontSpacing;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minFontSpacing;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxTextLuminanceLevel;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfSequentialPages;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected PositionAbsoluteEnum textPositionAbsolute;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float textPositionX;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float textPositionY;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsTextDisplayCharacteristicsExtension;

    /**
     * Gets the value of the textLanternsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextLanternsPresent() {
        return textLanternsPresent;
    }

    /**
     * Sets the value of the textLanternsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextLanternsPresent(Boolean value) {
        this.textLanternsPresent = value;
    }

    /**
     * Gets the value of the textPageSequencingCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextPageSequencingCapable() {
        return textPageSequencingCapable;
    }

    /**
     * Sets the value of the textPageSequencingCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextPageSequencingCapable(Boolean value) {
        this.textPageSequencingCapable = value;
    }

    /**
     * Gets the value of the textPixelsAcross property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextPixelsAcross() {
        return textPixelsAcross;
    }

    /**
     * Sets the value of the textPixelsAcross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextPixelsAcross(BigInteger value) {
        this.textPixelsAcross = value;
    }

    /**
     * Gets the value of the textPixelsDown property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextPixelsDown() {
        return textPixelsDown;
    }

    /**
     * Sets the value of the textPixelsDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextPixelsDown(BigInteger value) {
        this.textPixelsDown = value;
    }

    /**
     * Gets the value of the textDisplayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTextDisplayHeight() {
        return textDisplayHeight;
    }

    /**
     * Sets the value of the textDisplayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTextDisplayHeight(Float value) {
        this.textDisplayHeight = value;
    }

    /**
     * Gets the value of the textDisplayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTextDisplayWidth() {
        return textDisplayWidth;
    }

    /**
     * Sets the value of the textDisplayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTextDisplayWidth(Float value) {
        this.textDisplayWidth = value;
    }

    /**
     * Gets the value of the maxNumberOfCharacters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfCharacters() {
        return maxNumberOfCharacters;
    }

    /**
     * Sets the value of the maxNumberOfCharacters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfCharacters(BigInteger value) {
        this.maxNumberOfCharacters = value;
    }

    /**
     * Gets the value of the maxNumberOfRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfRows() {
        return maxNumberOfRows;
    }

    /**
     * Sets the value of the maxNumberOfRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfRows(BigInteger value) {
        this.maxNumberOfRows = value;
    }

    /**
     * Gets the value of the legendCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendCodeListIdentifier() {
        return legendCodeListIdentifier;
    }

    /**
     * Sets the value of the legendCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendCodeListIdentifier(String value) {
        this.legendCodeListIdentifier = value;
    }

    /**
     * Gets the value of the maxFontHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFontHeight() {
        return maxFontHeight;
    }

    /**
     * Sets the value of the maxFontHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFontHeight(BigInteger value) {
        this.maxFontHeight = value;
    }

    /**
     * Gets the value of the minFontHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinFontHeight() {
        return minFontHeight;
    }

    /**
     * Sets the value of the minFontHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinFontHeight(BigInteger value) {
        this.minFontHeight = value;
    }

    /**
     * Gets the value of the maxFontWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFontWidth() {
        return maxFontWidth;
    }

    /**
     * Sets the value of the maxFontWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFontWidth(BigInteger value) {
        this.maxFontWidth = value;
    }

    /**
     * Gets the value of the minFontWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinFontWidth() {
        return minFontWidth;
    }

    /**
     * Sets the value of the minFontWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinFontWidth(BigInteger value) {
        this.minFontWidth = value;
    }

    /**
     * Gets the value of the maxFontSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFontSpacing() {
        return maxFontSpacing;
    }

    /**
     * Sets the value of the maxFontSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFontSpacing(BigInteger value) {
        this.maxFontSpacing = value;
    }

    /**
     * Gets the value of the minFontSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinFontSpacing() {
        return minFontSpacing;
    }

    /**
     * Sets the value of the minFontSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinFontSpacing(BigInteger value) {
        this.minFontSpacing = value;
    }

    /**
     * Gets the value of the maxTextLuminanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxTextLuminanceLevel() {
        return maxTextLuminanceLevel;
    }

    /**
     * Sets the value of the maxTextLuminanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxTextLuminanceLevel(BigInteger value) {
        this.maxTextLuminanceLevel = value;
    }

    /**
     * Gets the value of the maxNumberOfSequentialPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfSequentialPages() {
        return maxNumberOfSequentialPages;
    }

    /**
     * Sets the value of the maxNumberOfSequentialPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfSequentialPages(BigInteger value) {
        this.maxNumberOfSequentialPages = value;
    }

    /**
     * Gets the value of the textPositionAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAbsoluteEnum }
     *     
     */
    public PositionAbsoluteEnum getTextPositionAbsolute() {
        return textPositionAbsolute;
    }

    /**
     * Sets the value of the textPositionAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAbsoluteEnum }
     *     
     */
    public void setTextPositionAbsolute(PositionAbsoluteEnum value) {
        this.textPositionAbsolute = value;
    }

    /**
     * Gets the value of the textPositionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTextPositionX() {
        return textPositionX;
    }

    /**
     * Sets the value of the textPositionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTextPositionX(Float value) {
        this.textPositionX = value;
    }

    /**
     * Gets the value of the textPositionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTextPositionY() {
        return textPositionY;
    }

    /**
     * Sets the value of the textPositionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTextPositionY(Float value) {
        this.textPositionY = value;
    }

    /**
     * Gets the value of the vmsTextDisplayCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsTextDisplayCharacteristicsExtension() {
        return vmsTextDisplayCharacteristicsExtension;
    }

    /**
     * Sets the value of the vmsTextDisplayCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsTextDisplayCharacteristicsExtension(ExtensionType value) {
        this.vmsTextDisplayCharacteristicsExtension = value;
    }

}
