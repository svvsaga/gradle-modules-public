
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Management information relating to the data contained within a publication.
 *       
 * 
 * <p>Java class for HeaderInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confidentiality" type="{http://datex2.eu/schema/3/common}_ConfidentialityValueEnum" minOccurs="0"/&gt;
 *         &lt;element name="allowedDeliveryChannel" type="{http://datex2.eu/schema/3/common}_InformationDeliveryServicesEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="informationStatus" type="{http://datex2.eu/schema/3/common}_InformationStatusEnum"/&gt;
 *         &lt;element name="_headerInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformation", propOrder = {
    "confidentiality",
    "allowedDeliveryChannel",
    "informationStatus",
    "headerInformationExtension"
})
public class HeaderInformation {

    protected ConfidentialityValueEnum confidentiality;
    protected List<InformationDeliveryServicesEnum> allowedDeliveryChannel;
    @XmlElement(required = true)
    protected InformationStatusEnum informationStatus;
    @XmlElement(name = "_headerInformationExtension")
    protected ExtensionType headerInformationExtension;

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(ConfidentialityValueEnum value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the allowedDeliveryChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allowedDeliveryChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedDeliveryChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationDeliveryServicesEnum }
     * 
     * 
     */
    public List<InformationDeliveryServicesEnum> getAllowedDeliveryChannel() {
        if (allowedDeliveryChannel == null) {
            allowedDeliveryChannel = new ArrayList<InformationDeliveryServicesEnum>();
        }
        return this.allowedDeliveryChannel;
    }

    /**
     * Gets the value of the informationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Sets the value of the informationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatus(InformationStatusEnum value) {
        this.informationStatus = value;
    }

    /**
     * Gets the value of the headerInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaderInformationExtension() {
        return headerInformationExtension;
    }

    /**
     * Sets the value of the headerInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaderInformationExtension(ExtensionType value) {
        this.headerInformationExtension = value;
    }

}
