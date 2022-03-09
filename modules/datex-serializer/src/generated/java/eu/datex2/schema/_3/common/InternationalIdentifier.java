
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode"/&gt;
 *         &lt;element name="nationalIdentifier" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_internationalIdentifierExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalIdentifier", propOrder = {
    "country",
    "nationalIdentifier",
    "_InternationalIdentifierExtension"
})
public class InternationalIdentifier {

    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String nationalIdentifier;
    @XmlElement(name = "_internationalIdentifierExtension")
    protected _ExtensionType _InternationalIdentifierExtension;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the nationalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * Sets the value of the nationalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

    /**
     * Gets the value of the _InternationalIdentifierExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InternationalIdentifierExtension() {
        return _InternationalIdentifierExtension;
    }

    /**
     * Sets the value of the _InternationalIdentifierExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InternationalIdentifierExtension(_ExtensionType value) {
        this._InternationalIdentifierExtension = value;
    }

}
