
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvVideoServiceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvVideoServiceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvVideoServiceLevel" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvVideoAvailability" type="{http://datex2.eu/schema/3/cctvExtension}_CctvCameraVideoOrImageAvailabilityEnum"/&gt;
 *         &lt;element name="cctvVideoBroadcastable" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="_cctvVideoServiceStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvVideoServiceStatus", propOrder = {
    "cctvVideoServiceLevel",
    "cctvVideoAvailability",
    "cctvVideoBroadcastable",
    "_CctvVideoServiceStatusExtension"
})
public class CctvVideoServiceStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoServiceLevel;
    @XmlElement(required = true)
    protected _CctvCameraVideoOrImageAvailabilityEnum cctvVideoAvailability;
    protected Boolean cctvVideoBroadcastable;
    @XmlElement(name = "_cctvVideoServiceStatusExtension")
    protected _ExtensionType _CctvVideoServiceStatusExtension;

    /**
     * Gets the value of the cctvVideoServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoServiceLevel() {
        return cctvVideoServiceLevel;
    }

    /**
     * Sets the value of the cctvVideoServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoServiceLevel(BigInteger value) {
        this.cctvVideoServiceLevel = value;
    }

    /**
     * Gets the value of the cctvVideoAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link _CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public _CctvCameraVideoOrImageAvailabilityEnum getCctvVideoAvailability() {
        return cctvVideoAvailability;
    }

    /**
     * Sets the value of the cctvVideoAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public void setCctvVideoAvailability(_CctvCameraVideoOrImageAvailabilityEnum value) {
        this.cctvVideoAvailability = value;
    }

    /**
     * Gets the value of the cctvVideoBroadcastable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCctvVideoBroadcastable() {
        return cctvVideoBroadcastable;
    }

    /**
     * Sets the value of the cctvVideoBroadcastable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCctvVideoBroadcastable(Boolean value) {
        this.cctvVideoBroadcastable = value;
    }

    /**
     * Gets the value of the _CctvVideoServiceStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvVideoServiceStatusExtension() {
        return _CctvVideoServiceStatusExtension;
    }

    /**
     * Sets the value of the _CctvVideoServiceStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvVideoServiceStatusExtension(_ExtensionType value) {
        this._CctvVideoServiceStatusExtension = value;
    }

}
