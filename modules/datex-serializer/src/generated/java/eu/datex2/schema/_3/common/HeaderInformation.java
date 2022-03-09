
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "_HeaderInformationExtension"
})
public class HeaderInformation {

    protected _ConfidentialityValueEnum confidentiality;
    protected List<_InformationDeliveryServicesEnum> allowedDeliveryChannel;
    @XmlElement(required = true)
    protected _InformationStatusEnum informationStatus;
    @XmlElement(name = "_headerInformationExtension")
    protected _ExtensionType _HeaderInformationExtension;

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link _ConfidentialityValueEnum }
     *     
     */
    public _ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(_ConfidentialityValueEnum value) {
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
     * {@link _InformationDeliveryServicesEnum }
     * 
     * 
     */
    public List<_InformationDeliveryServicesEnum> getAllowedDeliveryChannel() {
        if (allowedDeliveryChannel == null) {
            allowedDeliveryChannel = new ArrayList<_InformationDeliveryServicesEnum>();
        }
        return this.allowedDeliveryChannel;
    }

    /**
     * Gets the value of the informationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _InformationStatusEnum }
     *     
     */
    public _InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Sets the value of the informationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _InformationStatusEnum }
     *     
     */
    public void setInformationStatus(_InformationStatusEnum value) {
        this.informationStatus = value;
    }

    /**
     * Gets the value of the _HeaderInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_HeaderInformationExtension() {
        return _HeaderInformationExtension;
    }

    /**
     * Sets the value of the _HeaderInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_HeaderInformationExtension(_ExtensionType value) {
        this._HeaderInformationExtension = value;
    }

}
