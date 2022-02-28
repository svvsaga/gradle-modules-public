
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2/2_0}Url"/&gt;
 *         &lt;element name="urlLinkDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkType" type="{http://datex2.eu/schema/2/2_0}UrlLinkTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "urlLinkExtension"
})
public class UrlLink {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    protected MultilingualString urlLinkDescription;
    @XmlSchemaType(name = "string")
    protected UrlLinkTypeEnum urlLinkType;
    protected _ExtensionType urlLinkExtension;

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
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public UrlLinkTypeEnum getUrlLinkType() {
        return urlLinkType;
    }

    /**
     * Sets the value of the urlLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public void setUrlLinkType(UrlLinkTypeEnum value) {
        this.urlLinkType = value;
    }

    /**
     * Gets the value of the urlLinkExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getUrlLinkExtension() {
        return urlLinkExtension;
    }

    /**
     * Sets the value of the urlLinkExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setUrlLinkExtension(_ExtensionType value) {
        this.urlLinkExtension = value;
    }

}
