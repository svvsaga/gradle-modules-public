
package eu.datex2.schema._3.exchangeinformation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageType" type="{http://datex2.eu/schema/3/exchangeInformation}_MessageTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="exchangeContext" type="{http://datex2.eu/schema/3/exchangeInformation}ExchangeContext"/&gt;
 *         &lt;element name="dynamicInformation" type="{http://datex2.eu/schema/3/exchangeInformation}DynamicInformation"/&gt;
 *         &lt;element name="_exchangeInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "ExchangeInformation", namespace = "http://datex2.eu/schema/3/exchangeInformation", propOrder = {
    "messageType",
    "exchangeContext",
    "dynamicInformation",
    "exchangeInformationExtension"
})
public class ExchangeInformation {

    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected MessageTypeEnum messageType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation", required = true)
    protected ExchangeContext exchangeContext;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation", required = true)
    protected DynamicInformation dynamicInformation;
    @XmlElement(name = "_exchangeInformationExtension", namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected ExtensionType exchangeInformationExtension;
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
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeEnum }
     *     
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeEnum }
     *     
     */
    public void setMessageType(MessageTypeEnum value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the exchangeContext property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeContext }
     *     
     */
    public ExchangeContext getExchangeContext() {
        return exchangeContext;
    }

    /**
     * Sets the value of the exchangeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeContext }
     *     
     */
    public void setExchangeContext(ExchangeContext value) {
        this.exchangeContext = value;
    }

    /**
     * Gets the value of the dynamicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicInformation }
     *     
     */
    public DynamicInformation getDynamicInformation() {
        return dynamicInformation;
    }

    /**
     * Sets the value of the dynamicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicInformation }
     *     
     */
    public void setDynamicInformation(DynamicInformation value) {
        this.dynamicInformation = value;
    }

    /**
     * Gets the value of the exchangeInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExchangeInformationExtension() {
        return exchangeInformationExtension;
    }

    /**
     * Sets the value of the exchangeInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExchangeInformationExtension(ExtensionType value) {
        this.exchangeInformationExtension = value;
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
