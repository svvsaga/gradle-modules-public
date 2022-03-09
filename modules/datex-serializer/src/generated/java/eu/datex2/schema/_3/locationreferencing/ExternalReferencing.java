
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalReferencing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferencing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalLocationCode" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="externalReferencingSystem" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_externalReferencingExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferencing", propOrder = {
    "externalLocationCode",
    "externalReferencingSystem",
    "_ExternalReferencingExtension"
})
public class ExternalReferencing {

    @XmlElement(required = true)
    protected String externalLocationCode;
    @XmlElement(required = true)
    protected String externalReferencingSystem;
    @XmlElement(name = "_externalReferencingExtension")
    protected _ExtensionType _ExternalReferencingExtension;

    /**
     * Gets the value of the externalLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLocationCode() {
        return externalLocationCode;
    }

    /**
     * Sets the value of the externalLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLocationCode(String value) {
        this.externalLocationCode = value;
    }

    /**
     * Gets the value of the externalReferencingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferencingSystem() {
        return externalReferencingSystem;
    }

    /**
     * Sets the value of the externalReferencingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferencingSystem(String value) {
        this.externalReferencingSystem = value;
    }

    /**
     * Gets the value of the _ExternalReferencingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ExternalReferencingExtension() {
        return _ExternalReferencingExtension;
    }

    /**
     * Sets the value of the _ExternalReferencingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ExternalReferencingExtension(_ExtensionType value) {
        this._ExternalReferencingExtension = value;
    }

}
