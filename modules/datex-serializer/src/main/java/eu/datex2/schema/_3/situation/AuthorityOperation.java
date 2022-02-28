
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Authority initiated operation or activity that could disrupt traffic.
 * 
 * <p>Java class for AuthorityOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorityOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorityOperationType" type="{http://datex2.eu/schema/3/situation}_AuthorityOperationTypeEnum"/&gt;
 *         &lt;element name="_authorityOperationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityOperation", propOrder = {
    "authorityOperationType",
    "_AuthorityOperationExtension"
})
public class AuthorityOperation
    extends Activity
{

    @XmlElement(required = true)
    protected _AuthorityOperationTypeEnum authorityOperationType;
    @XmlElement(name = "_authorityOperationExtension")
    protected _ExtensionType _AuthorityOperationExtension;

    /**
     * Gets the value of the authorityOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link _AuthorityOperationTypeEnum }
     *     
     */
    public _AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Sets the value of the authorityOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationType(_AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    /**
     * Gets the value of the _AuthorityOperationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AuthorityOperationExtension() {
        return _AuthorityOperationExtension;
    }

    /**
     * Sets the value of the _AuthorityOperationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AuthorityOperationExtension(_ExtensionType value) {
        this._AuthorityOperationExtension = value;
    }

}
