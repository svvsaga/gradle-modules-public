
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictogramDisplayAreaSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictogramDisplayAreaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramLanternsOn" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramLuminanceOverride" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramLuminanceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pictogramLuminanceLevelName" type="{http://datex2.eu/schema/2/2_0}VmsLuminanceLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="pictogramDisplayAreaSettingsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictogramDisplayAreaSettings", propOrder = {
    "pictogramLanternsOn",
    "pictogramLuminanceOverride",
    "pictogramLuminanceLevel",
    "pictogramLuminanceLevelName",
    "pictogramDisplayAreaSettingsExtension"
})
public class PictogramDisplayAreaSettings {

    protected Boolean pictogramLanternsOn;
    protected Boolean pictogramLuminanceOverride;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pictogramLuminanceLevel;
    @XmlSchemaType(name = "string")
    protected VmsLuminanceLevelEnum pictogramLuminanceLevelName;
    protected ExtensionType pictogramDisplayAreaSettingsExtension;

    /**
     * Gets the value of the pictogramLanternsOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramLanternsOn() {
        return pictogramLanternsOn;
    }

    /**
     * Sets the value of the pictogramLanternsOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramLanternsOn(Boolean value) {
        this.pictogramLanternsOn = value;
    }

    /**
     * Gets the value of the pictogramLuminanceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramLuminanceOverride() {
        return pictogramLuminanceOverride;
    }

    /**
     * Sets the value of the pictogramLuminanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramLuminanceOverride(Boolean value) {
        this.pictogramLuminanceOverride = value;
    }

    /**
     * Gets the value of the pictogramLuminanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPictogramLuminanceLevel() {
        return pictogramLuminanceLevel;
    }

    /**
     * Sets the value of the pictogramLuminanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPictogramLuminanceLevel(BigInteger value) {
        this.pictogramLuminanceLevel = value;
    }

    /**
     * Gets the value of the pictogramLuminanceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link VmsLuminanceLevelEnum }
     *     
     */
    public VmsLuminanceLevelEnum getPictogramLuminanceLevelName() {
        return pictogramLuminanceLevelName;
    }

    /**
     * Sets the value of the pictogramLuminanceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsLuminanceLevelEnum }
     *     
     */
    public void setPictogramLuminanceLevelName(VmsLuminanceLevelEnum value) {
        this.pictogramLuminanceLevelName = value;
    }

    /**
     * Gets the value of the pictogramDisplayAreaSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPictogramDisplayAreaSettingsExtension() {
        return pictogramDisplayAreaSettingsExtension;
    }

    /**
     * Sets the value of the pictogramDisplayAreaSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPictogramDisplayAreaSettingsExtension(ExtensionType value) {
        this.pictogramDisplayAreaSettingsExtension = value;
    }

}
