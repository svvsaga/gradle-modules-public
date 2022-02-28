
package eu.datex2.schema._3.exchangeinformation;

import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="referenceID" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="serviceURL" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="internationalIdentifier" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_agentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agent", propOrder = {
    "address",
    "name",
    "referenceID",
    "serviceURL",
    "internationalIdentifier",
    "_AgentExtension"
})
public class Agent {

    protected String address;
    protected String name;
    protected String referenceID;
    protected String serviceURL;
    protected InternationalIdentifier internationalIdentifier;
    @XmlElement(name = "_agentExtension")
    protected _ExtensionType _AgentExtension;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the serviceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceURL() {
        return serviceURL;
    }

    /**
     * Sets the value of the serviceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceURL(String value) {
        this.serviceURL = value;
    }

    /**
     * Gets the value of the internationalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInternationalIdentifier() {
        return internationalIdentifier;
    }

    /**
     * Sets the value of the internationalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInternationalIdentifier(InternationalIdentifier value) {
        this.internationalIdentifier = value;
    }

    /**
     * Gets the value of the _AgentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AgentExtension() {
        return _AgentExtension;
    }

    /**
     * Sets the value of the _AgentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AgentExtension(_ExtensionType value) {
        this._AgentExtension = value;
    }

}
