
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStillImageServiceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvStillImageServiceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvStillImageServiceLevel" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvStillImageAvailability" type="{http://datex2.eu/schema/3/cctvExtension}_CctvCameraVideoOrImageAvailabilityEnum"/&gt;
 *         &lt;element name="cctvStillImageBroadcastable" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="_cctvStillImageServiceStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvStillImageServiceStatus", propOrder = {
    "cctvStillImageServiceLevel",
    "cctvStillImageAvailability",
    "cctvStillImageBroadcastable",
    "_CctvStillImageServiceStatusExtension"
})
public class CctvStillImageServiceStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageServiceLevel;
    @XmlElement(required = true)
    protected _CctvCameraVideoOrImageAvailabilityEnum cctvStillImageAvailability;
    protected Boolean cctvStillImageBroadcastable;
    @XmlElement(name = "_cctvStillImageServiceStatusExtension")
    protected _ExtensionType _CctvStillImageServiceStatusExtension;

    /**
     * Gets the value of the cctvStillImageServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageServiceLevel() {
        return cctvStillImageServiceLevel;
    }

    /**
     * Sets the value of the cctvStillImageServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageServiceLevel(BigInteger value) {
        this.cctvStillImageServiceLevel = value;
    }

    /**
     * Gets the value of the cctvStillImageAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link _CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public _CctvCameraVideoOrImageAvailabilityEnum getCctvStillImageAvailability() {
        return cctvStillImageAvailability;
    }

    /**
     * Sets the value of the cctvStillImageAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public void setCctvStillImageAvailability(_CctvCameraVideoOrImageAvailabilityEnum value) {
        this.cctvStillImageAvailability = value;
    }

    /**
     * Gets the value of the cctvStillImageBroadcastable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCctvStillImageBroadcastable() {
        return cctvStillImageBroadcastable;
    }

    /**
     * Sets the value of the cctvStillImageBroadcastable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCctvStillImageBroadcastable(Boolean value) {
        this.cctvStillImageBroadcastable = value;
    }

    /**
     * Gets the value of the _CctvStillImageServiceStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvStillImageServiceStatusExtension() {
        return _CctvStillImageServiceStatusExtension;
    }

    /**
     * Sets the value of the _CctvStillImageServiceStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvStillImageServiceStatusExtension(_ExtensionType value) {
        this._CctvStillImageServiceStatusExtension = value;
    }

}
