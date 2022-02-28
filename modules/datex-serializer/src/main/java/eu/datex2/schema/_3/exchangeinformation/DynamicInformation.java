
package eu.datex2.schema._3.exchangeinformation;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exchangeStatus" type="{http://datex2.eu/schema/3/exchangeInformation}_ExchangeStatusEnum"/&gt;
 *         &lt;element name="exchangeStatusDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="completedPaylod" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="messageSequencingNumber" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="messageGenerationTimestamp" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="returnInformation" type="{http://datex2.eu/schema/3/exchangeInformation}ReturnInformation" minOccurs="0"/&gt;
 *         &lt;element name="sessionInformation" type="{http://datex2.eu/schema/3/exchangeInformation}SessionInformation" minOccurs="0"/&gt;
 *         &lt;element name="_dynamicInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicInformation", propOrder = {
    "exchangeStatus",
    "exchangeStatusDescription",
    "completedPaylod",
    "messageSequencingNumber",
    "messageGenerationTimestamp",
    "returnInformation",
    "sessionInformation",
    "_DynamicInformationExtension"
})
public class DynamicInformation {

    @XmlElement(required = true)
    protected _ExchangeStatusEnum exchangeStatus;
    protected MultilingualString exchangeStatusDescription;
    protected Boolean completedPaylod;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger messageSequencingNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageGenerationTimestamp;
    protected ReturnInformation returnInformation;
    protected SessionInformation sessionInformation;
    @XmlElement(name = "_dynamicInformationExtension")
    protected _ExtensionType _DynamicInformationExtension;

    /**
     * Gets the value of the exchangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ExchangeStatusEnum }
     *     
     */
    public _ExchangeStatusEnum getExchangeStatus() {
        return exchangeStatus;
    }

    /**
     * Sets the value of the exchangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExchangeStatusEnum }
     *     
     */
    public void setExchangeStatus(_ExchangeStatusEnum value) {
        this.exchangeStatus = value;
    }

    /**
     * Gets the value of the exchangeStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getExchangeStatusDescription() {
        return exchangeStatusDescription;
    }

    /**
     * Sets the value of the exchangeStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setExchangeStatusDescription(MultilingualString value) {
        this.exchangeStatusDescription = value;
    }

    /**
     * Gets the value of the completedPaylod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompletedPaylod() {
        return completedPaylod;
    }

    /**
     * Sets the value of the completedPaylod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletedPaylod(Boolean value) {
        this.completedPaylod = value;
    }

    /**
     * Gets the value of the messageSequencingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageSequencingNumber() {
        return messageSequencingNumber;
    }

    /**
     * Sets the value of the messageSequencingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageSequencingNumber(BigInteger value) {
        this.messageSequencingNumber = value;
    }

    /**
     * Gets the value of the messageGenerationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageGenerationTimestamp() {
        return messageGenerationTimestamp;
    }

    /**
     * Sets the value of the messageGenerationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageGenerationTimestamp(XMLGregorianCalendar value) {
        this.messageGenerationTimestamp = value;
    }

    /**
     * Gets the value of the returnInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInformation }
     *     
     */
    public ReturnInformation getReturnInformation() {
        return returnInformation;
    }

    /**
     * Sets the value of the returnInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInformation }
     *     
     */
    public void setReturnInformation(ReturnInformation value) {
        this.returnInformation = value;
    }

    /**
     * Gets the value of the sessionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInformation }
     *     
     */
    public SessionInformation getSessionInformation() {
        return sessionInformation;
    }

    /**
     * Sets the value of the sessionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInformation }
     *     
     */
    public void setSessionInformation(SessionInformation value) {
        this.sessionInformation = value;
    }

    /**
     * Gets the value of the _DynamicInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DynamicInformationExtension() {
        return _DynamicInformationExtension;
    }

    /**
     * Sets the value of the _DynamicInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DynamicInformationExtension(_ExtensionType value) {
        this._DynamicInformationExtension = value;
    }

}
