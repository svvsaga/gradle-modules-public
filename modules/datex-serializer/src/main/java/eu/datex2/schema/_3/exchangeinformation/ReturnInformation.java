
package eu.datex2.schema._3.exchangeinformation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnStatus" type="{http://datex2.eu/schema/3/exchangeInformation}_ExchangeReturnEnum"/&gt;
 *         &lt;element name="returnStatusReason" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_returnInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnInformation", propOrder = {
    "returnStatus",
    "returnStatusReason",
    "returnInformationExtension"
})
public class ReturnInformation {

    @XmlElement(required = true)
    protected ExchangeReturnEnum returnStatus;
    protected MultilingualString returnStatusReason;
    @XmlElement(name = "_returnInformationExtension")
    protected ExtensionType returnInformationExtension;

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeReturnEnum }
     *     
     */
    public ExchangeReturnEnum getReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeReturnEnum }
     *     
     */
    public void setReturnStatus(ExchangeReturnEnum value) {
        this.returnStatus = value;
    }

    /**
     * Gets the value of the returnStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReturnStatusReason() {
        return returnStatusReason;
    }

    /**
     * Sets the value of the returnStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReturnStatusReason(MultilingualString value) {
        this.returnStatusReason = value;
    }

    /**
     * Gets the value of the returnInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReturnInformationExtension() {
        return returnInformationExtension;
    }

    /**
     * Sets the value of the returnInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReturnInformationExtension(ExtensionType value) {
        this.returnInformationExtension = value;
    }

}
