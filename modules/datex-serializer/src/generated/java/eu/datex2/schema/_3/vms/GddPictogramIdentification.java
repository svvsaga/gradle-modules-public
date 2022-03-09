
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GddPictogramIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GddPictogramIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode"/&gt;
 *         &lt;element name="serviceCategory" type="{http://datex2.eu/schema/3/vms}_GddServiceCategoryEnum"/&gt;
 *         &lt;element name="pictogramCategoryCode" type="{http://datex2.eu/schema/3/vms}GddPictogramCategoryCode"/&gt;
 *         &lt;element name="_gddPictogramIdentificationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GddPictogramIdentification", propOrder = {
    "country",
    "serviceCategory",
    "pictogramCategoryCode",
    "_GddPictogramIdentificationExtension"
})
public class GddPictogramIdentification {

    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected _GddServiceCategoryEnum serviceCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pictogramCategoryCode;
    @XmlElement(name = "_gddPictogramIdentificationExtension")
    protected _ExtensionType _GddPictogramIdentificationExtension;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link _GddServiceCategoryEnum }
     *     
     */
    public _GddServiceCategoryEnum getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link _GddServiceCategoryEnum }
     *     
     */
    public void setServiceCategory(_GddServiceCategoryEnum value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the pictogramCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPictogramCategoryCode() {
        return pictogramCategoryCode;
    }

    /**
     * Sets the value of the pictogramCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPictogramCategoryCode(BigInteger value) {
        this.pictogramCategoryCode = value;
    }

    /**
     * Gets the value of the _GddPictogramIdentificationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GddPictogramIdentificationExtension() {
        return _GddPictogramIdentificationExtension;
    }

    /**
     * Sets the value of the _GddPictogramIdentificationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GddPictogramIdentificationExtension(_ExtensionType value) {
        this._GddPictogramIdentificationExtension = value;
    }

}
