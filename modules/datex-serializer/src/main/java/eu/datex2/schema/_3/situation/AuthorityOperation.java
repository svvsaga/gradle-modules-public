
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
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
    "authorityOperationExtension"
})
public class AuthorityOperation
    extends Activity
{

    @XmlElement(required = true)
    protected AuthorityOperationTypeEnum authorityOperationType;
    @XmlElement(name = "_authorityOperationExtension")
    protected ExtensionType authorityOperationExtension;

    /**
     * Gets the value of the authorityOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Sets the value of the authorityOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationType(AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    /**
     * Gets the value of the authorityOperationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAuthorityOperationExtension() {
        return authorityOperationExtension;
    }

    /**
     * Sets the value of the authorityOperationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAuthorityOperationExtension(ExtensionType value) {
        this.authorityOperationExtension = value;
    }

}
