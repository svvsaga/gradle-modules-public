
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of a Uniform Resource Locator (URL) address pointing to a resource available on
 *         the Internet from where further relevant information may be obtained.
 *       
 * 
 * <p>Java class for UrlLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/3/common}Url"/&gt;
 *         &lt;element name="urlLinkDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkType" type="{http://datex2.eu/schema/3/common}_UrlLinkTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_urlLinkExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlLink", propOrder = {
    "urlLinkAddress",
    "urlLinkDescription",
    "urlLinkType",
    "_UrlLinkExtension"
})
public class UrlLink {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    protected MultilingualString urlLinkDescription;
    protected _UrlLinkTypeEnum urlLinkType;
    @XmlElement(name = "_urlLinkExtension")
    protected _ExtensionType _UrlLinkExtension;

    /**
     * Gets the value of the urlLinkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Sets the value of the urlLinkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    /**
     * Gets the value of the urlLinkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getUrlLinkDescription() {
        return urlLinkDescription;
    }

    /**
     * Sets the value of the urlLinkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setUrlLinkDescription(MultilingualString value) {
        this.urlLinkDescription = value;
    }

    /**
     * Gets the value of the urlLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link _UrlLinkTypeEnum }
     *     
     */
    public _UrlLinkTypeEnum getUrlLinkType() {
        return urlLinkType;
    }

    /**
     * Sets the value of the urlLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _UrlLinkTypeEnum }
     *     
     */
    public void setUrlLinkType(_UrlLinkTypeEnum value) {
        this.urlLinkType = value;
    }

    /**
     * Gets the value of the _UrlLinkExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_UrlLinkExtension() {
        return _UrlLinkExtension;
    }

    /**
     * Sets the value of the _UrlLinkExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_UrlLinkExtension(_ExtensionType value) {
        this._UrlLinkExtension = value;
    }

}
