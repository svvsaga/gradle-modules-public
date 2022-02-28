
package eu.datex2.schema._3.exchangeinformation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codedExchangeProtocol" type="{http://datex2.eu/schema/3/exchangeInformation}_ProtocolTypeEnum"/&gt;
 *         &lt;element name="exchangeSpecificationVersion" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="operatingMode" type="{http://datex2.eu/schema/3/exchangeInformation}_OperatingModeEnum" minOccurs="0"/&gt;
 *         &lt;element name="updateMethod" type="{http://datex2.eu/schema/3/exchangeInformation}_UpdateMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="nonCodedExchangeProtocol" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="supplierOrCisRequester" type="{http://datex2.eu/schema/3/exchangeInformation}Agent"/&gt;
 *         &lt;element name="clientOrCisProvider" type="{http://datex2.eu/schema/3/exchangeInformation}Agent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{http://datex2.eu/schema/3/exchangeInformation}Subscription" minOccurs="0"/&gt;
 *         &lt;element name="_exchangeContextExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeContext", propOrder = {
    "codedExchangeProtocol",
    "exchangeSpecificationVersion",
    "operatingMode",
    "updateMethod",
    "nonCodedExchangeProtocol",
    "supplierOrCisRequester",
    "clientOrCisProvider",
    "subscription",
    "_ExchangeContextExtension"
})
public class ExchangeContext {

    @XmlElement(required = true)
    protected _ProtocolTypeEnum codedExchangeProtocol;
    @XmlElement(required = true)
    protected String exchangeSpecificationVersion;
    protected _OperatingModeEnum operatingMode;
    protected _UpdateMethodEnum updateMethod;
    protected String nonCodedExchangeProtocol;
    @XmlElement(required = true)
    protected Agent supplierOrCisRequester;
    protected List<Agent> clientOrCisProvider;
    protected Subscription subscription;
    @XmlElement(name = "_exchangeContextExtension")
    protected _ExtensionType _ExchangeContextExtension;

    /**
     * Gets the value of the codedExchangeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link _ProtocolTypeEnum }
     *     
     */
    public _ProtocolTypeEnum getCodedExchangeProtocol() {
        return codedExchangeProtocol;
    }

    /**
     * Sets the value of the codedExchangeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ProtocolTypeEnum }
     *     
     */
    public void setCodedExchangeProtocol(_ProtocolTypeEnum value) {
        this.codedExchangeProtocol = value;
    }

    /**
     * Gets the value of the exchangeSpecificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeSpecificationVersion() {
        return exchangeSpecificationVersion;
    }

    /**
     * Sets the value of the exchangeSpecificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeSpecificationVersion(String value) {
        this.exchangeSpecificationVersion = value;
    }

    /**
     * Gets the value of the operatingMode property.
     * 
     * @return
     *     possible object is
     *     {@link _OperatingModeEnum }
     *     
     */
    public _OperatingModeEnum getOperatingMode() {
        return operatingMode;
    }

    /**
     * Sets the value of the operatingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OperatingModeEnum }
     *     
     */
    public void setOperatingMode(_OperatingModeEnum value) {
        this.operatingMode = value;
    }

    /**
     * Gets the value of the updateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link _UpdateMethodEnum }
     *     
     */
    public _UpdateMethodEnum getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Sets the value of the updateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link _UpdateMethodEnum }
     *     
     */
    public void setUpdateMethod(_UpdateMethodEnum value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the nonCodedExchangeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCodedExchangeProtocol() {
        return nonCodedExchangeProtocol;
    }

    /**
     * Sets the value of the nonCodedExchangeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCodedExchangeProtocol(String value) {
        this.nonCodedExchangeProtocol = value;
    }

    /**
     * Gets the value of the supplierOrCisRequester property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getSupplierOrCisRequester() {
        return supplierOrCisRequester;
    }

    /**
     * Sets the value of the supplierOrCisRequester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setSupplierOrCisRequester(Agent value) {
        this.supplierOrCisRequester = value;
    }

    /**
     * Gets the value of the clientOrCisProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clientOrCisProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientOrCisProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agent }
     * 
     * 
     */
    public List<Agent> getClientOrCisProvider() {
        if (clientOrCisProvider == null) {
            clientOrCisProvider = new ArrayList<Agent>();
        }
        return this.clientOrCisProvider;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the _ExchangeContextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ExchangeContextExtension() {
        return _ExchangeContextExtension;
    }

    /**
     * Sets the value of the _ExchangeContextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ExchangeContextExtension(_ExtensionType value) {
        this._ExchangeContextExtension = value;
    }

}
