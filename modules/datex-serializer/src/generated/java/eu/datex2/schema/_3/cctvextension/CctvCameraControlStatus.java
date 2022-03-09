
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraControlStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraControlStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvCameraControlAvailability" type="{http://datex2.eu/schema/3/cctvExtension}_CctvCameraControlAvailabilityEnum" minOccurs="0"/&gt;
 *         &lt;element name="cctvIdentityOfCurrentControllingClient" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="cctvPrivilegeOfCurrentControllingClient" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="cctvUserGroupOfCurrentControllingClient" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="cctvCurrentlySelectedPreset" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="_cctvCameraControlStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraControlStatus", propOrder = {
    "cctvCameraControlAvailability",
    "cctvIdentityOfCurrentControllingClient",
    "cctvPrivilegeOfCurrentControllingClient",
    "cctvUserGroupOfCurrentControllingClient",
    "cctvCurrentlySelectedPreset",
    "_CctvCameraControlStatusExtension"
})
public class CctvCameraControlStatus {

    protected _CctvCameraControlAvailabilityEnum cctvCameraControlAvailability;
    protected String cctvIdentityOfCurrentControllingClient;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvPrivilegeOfCurrentControllingClient;
    protected String cctvUserGroupOfCurrentControllingClient;
    protected String cctvCurrentlySelectedPreset;
    @XmlElement(name = "_cctvCameraControlStatusExtension")
    protected _ExtensionType _CctvCameraControlStatusExtension;

    /**
     * Gets the value of the cctvCameraControlAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link _CctvCameraControlAvailabilityEnum }
     *     
     */
    public _CctvCameraControlAvailabilityEnum getCctvCameraControlAvailability() {
        return cctvCameraControlAvailability;
    }

    /**
     * Sets the value of the cctvCameraControlAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CctvCameraControlAvailabilityEnum }
     *     
     */
    public void setCctvCameraControlAvailability(_CctvCameraControlAvailabilityEnum value) {
        this.cctvCameraControlAvailability = value;
    }

    /**
     * Gets the value of the cctvIdentityOfCurrentControllingClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvIdentityOfCurrentControllingClient() {
        return cctvIdentityOfCurrentControllingClient;
    }

    /**
     * Sets the value of the cctvIdentityOfCurrentControllingClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvIdentityOfCurrentControllingClient(String value) {
        this.cctvIdentityOfCurrentControllingClient = value;
    }

    /**
     * Gets the value of the cctvPrivilegeOfCurrentControllingClient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvPrivilegeOfCurrentControllingClient() {
        return cctvPrivilegeOfCurrentControllingClient;
    }

    /**
     * Sets the value of the cctvPrivilegeOfCurrentControllingClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvPrivilegeOfCurrentControllingClient(BigInteger value) {
        this.cctvPrivilegeOfCurrentControllingClient = value;
    }

    /**
     * Gets the value of the cctvUserGroupOfCurrentControllingClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvUserGroupOfCurrentControllingClient() {
        return cctvUserGroupOfCurrentControllingClient;
    }

    /**
     * Sets the value of the cctvUserGroupOfCurrentControllingClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvUserGroupOfCurrentControllingClient(String value) {
        this.cctvUserGroupOfCurrentControllingClient = value;
    }

    /**
     * Gets the value of the cctvCurrentlySelectedPreset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCurrentlySelectedPreset() {
        return cctvCurrentlySelectedPreset;
    }

    /**
     * Sets the value of the cctvCurrentlySelectedPreset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCurrentlySelectedPreset(String value) {
        this.cctvCurrentlySelectedPreset = value;
    }

    /**
     * Gets the value of the _CctvCameraControlStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvCameraControlStatusExtension() {
        return _CctvCameraControlStatusExtension;
    }

    /**
     * Sets the value of the _CctvCameraControlStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvCameraControlStatusExtension(_ExtensionType value) {
        this._CctvCameraControlStatusExtension = value;
    }

}
