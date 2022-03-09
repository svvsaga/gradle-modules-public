
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayAreaSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayAreaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isBlank" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="legallyBinding" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="legalBasis" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_displayAreaSettingsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayAreaSettings", propOrder = {
    "isBlank",
    "legallyBinding",
    "legalBasis",
    "_DisplayAreaSettingsExtension"
})
@XmlSeeAlso({
    MultiPageDisplay.class,
    PictogramDisplay.class,
    SupplementaryInformationDisplay.class,
    TextDisplay.class
})
public abstract class DisplayAreaSettings {

    protected Boolean isBlank;
    protected Boolean legallyBinding;
    protected MultilingualString legalBasis;
    @XmlElement(name = "_displayAreaSettingsExtension")
    protected _ExtensionType _DisplayAreaSettingsExtension;

    /**
     * Gets the value of the isBlank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBlank() {
        return isBlank;
    }

    /**
     * Sets the value of the isBlank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlank(Boolean value) {
        this.isBlank = value;
    }

    /**
     * Gets the value of the legallyBinding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegallyBinding() {
        return legallyBinding;
    }

    /**
     * Sets the value of the legallyBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegallyBinding(Boolean value) {
        this.legallyBinding = value;
    }

    /**
     * Gets the value of the legalBasis property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLegalBasis() {
        return legalBasis;
    }

    /**
     * Sets the value of the legalBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLegalBasis(MultilingualString value) {
        this.legalBasis = value;
    }

    /**
     * Gets the value of the _DisplayAreaSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DisplayAreaSettingsExtension() {
        return _DisplayAreaSettingsExtension;
    }

    /**
     * Sets the value of the _DisplayAreaSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DisplayAreaSettingsExtension(_ExtensionType value) {
        this._DisplayAreaSettingsExtension = value;
    }

}
