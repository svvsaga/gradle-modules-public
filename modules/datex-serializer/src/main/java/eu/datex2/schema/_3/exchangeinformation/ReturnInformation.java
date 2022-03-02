
package eu.datex2.schema._3.exchangeinformation;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="codedInvalidityReason" type="{http://datex2.eu/schema/3/exchangeInformation}_InvalidityReasonEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "codedInvalidityReason",
    "returnInformationExtension"
})
public class ReturnInformation {

    @XmlElement(required = true)
    protected ExchangeReturnEnum returnStatus;
    protected MultilingualString returnStatusReason;
    protected List<InvalidityReasonEnum> codedInvalidityReason;
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
     * Gets the value of the codedInvalidityReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the codedInvalidityReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodedInvalidityReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvalidityReasonEnum }
     * 
     * 
     */
    public List<InvalidityReasonEnum> getCodedInvalidityReason() {
        if (codedInvalidityReason == null) {
            codedInvalidityReason = new ArrayList<InvalidityReasonEnum>();
        }
        return this.codedInvalidityReason;
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
