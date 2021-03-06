
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
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
 *         &lt;element name="cctvVideoServiceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvVideoAvailability" type="{http://datex2.eu/schema/2/2_0}CctvCameraVideoOrImageAvailabilityEnum"/&gt;
 *         &lt;element name="cctvVideoBroadcastable" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoServiceStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "cctvVideoServiceStatusExtension"
})
public class CctvVideoServiceStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoServiceLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CctvCameraVideoOrImageAvailabilityEnum cctvVideoAvailability;
    protected Boolean cctvVideoBroadcastable;
    protected ExtensionType cctvVideoServiceStatusExtension;

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
     *     {@link CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public CctvCameraVideoOrImageAvailabilityEnum getCctvVideoAvailability() {
        return cctvVideoAvailability;
    }

    /**
     * Sets the value of the cctvVideoAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraVideoOrImageAvailabilityEnum }
     *     
     */
    public void setCctvVideoAvailability(CctvCameraVideoOrImageAvailabilityEnum value) {
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
     * Gets the value of the cctvVideoServiceStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvVideoServiceStatusExtension() {
        return cctvVideoServiceStatusExtension;
    }

    /**
     * Sets the value of the cctvVideoServiceStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvVideoServiceStatusExtension(ExtensionType value) {
        this.cctvVideoServiceStatusExtension = value;
    }

}
