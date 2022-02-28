
package eu.datex2.schema._3.messagecontainer;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.cisinformation.CISInformation;
import eu.datex2.schema._3.common.PayloadPublication;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.exchangeinformation.ExchangeInformation;
import eu.datex2.schema._3.informationmanagement.InformationManagement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payload" type="{http://datex2.eu/schema/3/common}PayloadPublication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cisInformation" type="{http://datex2.eu/schema/3/cisInformation}CISInformation" minOccurs="0"/&gt;
 *         &lt;element name="exchangeInformation" type="{http://datex2.eu/schema/3/exchangeInformation}ExchangeInformation"/&gt;
 *         &lt;element name="informationManagement" type="{http://datex2.eu/schema/3/informationManagement}InformationManagement" minOccurs="0"/&gt;
 *         &lt;element name="_messageContainerExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" /&gt;
 *       &lt;attribute name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" default="Exchange 2018" /&gt;
 *       &lt;attribute name="extensionVersion" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="profileVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageContainer", propOrder = {
    "payload",
    "cisInformation",
    "exchangeInformation",
    "informationManagement",
    "_MessageContainerExtension"
})
@jakarta.xml.bind.annotation.XmlRootElement public class MessageContainer {

    protected List<PayloadPublication> payload;
    protected CISInformation cisInformation;
    @XmlElement(required = true)
    protected ExchangeInformation exchangeInformation;
    protected InformationManagement informationManagement;
    @XmlElement(name = "_messageContainerExtension")
    protected _ExtensionType _MessageContainerExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    protected String modelBaseVersion;
    @XmlAttribute(name = "extensionName")
    protected String extensionName;
    @XmlAttribute(name = "extensionVersion")
    protected String extensionVersion;
    @XmlAttribute(name = "profileName")
    protected String profileName;
    @XmlAttribute(name = "profileVersion")
    protected String profileVersion;

    /**
     * Gets the value of the payload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the payload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayloadPublication }
     * 
     * 
     */
    public List<PayloadPublication> getPayload() {
        if (payload == null) {
            payload = new ArrayList<PayloadPublication>();
        }
        return this.payload;
    }

    /**
     * Gets the value of the cisInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CISInformation }
     *     
     */
    public CISInformation getCisInformation() {
        return cisInformation;
    }

    /**
     * Sets the value of the cisInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CISInformation }
     *     
     */
    public void setCisInformation(CISInformation value) {
        this.cisInformation = value;
    }

    /**
     * Gets the value of the exchangeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeInformation }
     *     
     */
    public ExchangeInformation getExchangeInformation() {
        return exchangeInformation;
    }

    /**
     * Sets the value of the exchangeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeInformation }
     *     
     */
    public void setExchangeInformation(ExchangeInformation value) {
        this.exchangeInformation = value;
    }

    /**
     * Gets the value of the informationManagement property.
     * 
     * @return
     *     possible object is
     *     {@link InformationManagement }
     *     
     */
    public InformationManagement getInformationManagement() {
        return informationManagement;
    }

    /**
     * Sets the value of the informationManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationManagement }
     *     
     */
    public void setInformationManagement(InformationManagement value) {
        this.informationManagement = value;
    }

    /**
     * Gets the value of the _MessageContainerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MessageContainerExtension() {
        return _MessageContainerExtension;
    }

    /**
     * Sets the value of the _MessageContainerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MessageContainerExtension(_ExtensionType value) {
        this._MessageContainerExtension = value;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "3";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        if (extensionName == null) {
            return "Exchange 2018";
        } else {
            return extensionName;
        }
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionVersion() {
        if (extensionVersion == null) {
            return "1";
        } else {
            return extensionVersion;
        }
    }

    /**
     * Sets the value of the extensionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionVersion(String value) {
        this.extensionVersion = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileVersion(String value) {
        this.profileVersion = value;
    }

}
