
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A publication used to make level B extensions at the publication level.
 * 
 * <p>Java class for GenericPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericPublicationName" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_genericPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPublication", propOrder = {
    "genericPublicationName",
    "_GenericPublicationExtension"
})
public class GenericPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected String genericPublicationName;
    @XmlElement(name = "_genericPublicationExtension")
    protected _ExtensionType _GenericPublicationExtension;

    /**
     * Gets the value of the genericPublicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericPublicationName() {
        return genericPublicationName;
    }

    /**
     * Sets the value of the genericPublicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericPublicationName(String value) {
        this.genericPublicationName = value;
    }

    /**
     * Gets the value of the _GenericPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GenericPublicationExtension() {
        return _GenericPublicationExtension;
    }

    /**
     * Sets the value of the _GenericPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GenericPublicationExtension(_ExtensionType value) {
        this._GenericPublicationExtension = value;
    }

}
