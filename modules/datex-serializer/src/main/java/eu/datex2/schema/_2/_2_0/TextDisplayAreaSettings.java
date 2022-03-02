
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextDisplayAreaSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextDisplayAreaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textLanternsOn" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="textLuminanceOverride" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="textLuminanceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="textLuminanceLevelName" type="{http://datex2.eu/schema/2/2_0}VmsLuminanceLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="textDisplayAreaSettingsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextDisplayAreaSettings", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "textLanternsOn",
    "textLuminanceOverride",
    "textLuminanceLevel",
    "textLuminanceLevelName",
    "textDisplayAreaSettingsExtension"
})
public class TextDisplayAreaSettings {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean textLanternsOn;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean textLuminanceOverride;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textLuminanceLevel;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected VmsLuminanceLevelEnum textLuminanceLevelName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType textDisplayAreaSettingsExtension;

    /**
     * Gets the value of the textLanternsOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextLanternsOn() {
        return textLanternsOn;
    }

    /**
     * Sets the value of the textLanternsOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextLanternsOn(Boolean value) {
        this.textLanternsOn = value;
    }

    /**
     * Gets the value of the textLuminanceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextLuminanceOverride() {
        return textLuminanceOverride;
    }

    /**
     * Sets the value of the textLuminanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextLuminanceOverride(Boolean value) {
        this.textLuminanceOverride = value;
    }

    /**
     * Gets the value of the textLuminanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextLuminanceLevel() {
        return textLuminanceLevel;
    }

    /**
     * Sets the value of the textLuminanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextLuminanceLevel(BigInteger value) {
        this.textLuminanceLevel = value;
    }

    /**
     * Gets the value of the textLuminanceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link VmsLuminanceLevelEnum }
     *     
     */
    public VmsLuminanceLevelEnum getTextLuminanceLevelName() {
        return textLuminanceLevelName;
    }

    /**
     * Sets the value of the textLuminanceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsLuminanceLevelEnum }
     *     
     */
    public void setTextLuminanceLevelName(VmsLuminanceLevelEnum value) {
        this.textLuminanceLevelName = value;
    }

    /**
     * Gets the value of the textDisplayAreaSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTextDisplayAreaSettingsExtension() {
        return textDisplayAreaSettingsExtension;
    }

    /**
     * Sets the value of the textDisplayAreaSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTextDisplayAreaSettingsExtension(ExtensionType value) {
        this.textDisplayAreaSettingsExtension = value;
    }

}
