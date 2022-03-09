
package eu.datex2.schema._3.exchangeinformation;

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
 *         &lt;element name="supplierOrCisRequester" type="{http://datex2.eu/schema/3/exchangeInformation}Agent"/&gt;
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
    "supplierOrCisRequester",
    "_ExchangeContextExtension"
})
public class ExchangeContext {

    @XmlElement(required = true)
    protected _ProtocolTypeEnum codedExchangeProtocol;
    @XmlElement(required = true)
    protected String exchangeSpecificationVersion;
    @XmlElement(required = true)
    protected Agent supplierOrCisRequester;
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
