
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
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
 *         &lt;element name="cctvStillImageServiceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvStillImageAvailability" type="{http://datex2.eu/schema/2/2_0}CctvCameraVideoOrImageAvailabilityEnum"/&gt;
 *         &lt;element name="cctvStillImageBroadcastable" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="cctvStillImageServiceStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "cctvStillImageServiceStatusExtension"
})
public class CctvStillImageServiceStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageServiceLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CctvCameraVideoOrImageAvailabilityEnum cctvStillImageAvailability;
    protected Boolean cctvStillImageBroadcastable;
    protected ExtensionType cctvStillImageServiceStatusExtension;

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
     *     {@link CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public CctvCameraVideoOrImageAvailabilityEnum getCctvStillImageAvailability() {
        return cctvStillImageAvailability;
    }

    /**
     * Sets the value of the cctvStillImageAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public void setCctvStillImageAvailability(CctvCameraVideoOrImageAvailabilityEnum value) {
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
     * Gets the value of the cctvStillImageServiceStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvStillImageServiceStatusExtension() {
        return cctvStillImageServiceStatusExtension;
    }

    /**
     * Sets the value of the cctvStillImageServiceStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvStillImageServiceStatusExtension(ExtensionType value) {
        this.cctvStillImageServiceStatusExtension = value;
    }

}
