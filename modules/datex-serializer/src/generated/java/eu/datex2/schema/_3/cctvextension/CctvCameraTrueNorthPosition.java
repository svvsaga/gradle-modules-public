
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraTrueNorthPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraTrueNorthPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvNorthPanValue" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvNorthTiltValue" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvNorthZoomValue" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="_cctvCameraTrueNorthPositionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraTrueNorthPosition", propOrder = {
    "cctvNorthPanValue",
    "cctvNorthTiltValue",
    "cctvNorthZoomValue",
    "cctvCameraTrueNorthPositionExtension"
})
public class CctvCameraTrueNorthPosition {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNorthPanValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNorthTiltValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNorthZoomValue;
    @XmlElement(name = "_cctvCameraTrueNorthPositionExtension")
    protected ExtensionType cctvCameraTrueNorthPositionExtension;

    /**
     * Gets the value of the cctvNorthPanValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNorthPanValue() {
        return cctvNorthPanValue;
    }

    /**
     * Sets the value of the cctvNorthPanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNorthPanValue(BigInteger value) {
        this.cctvNorthPanValue = value;
    }

    /**
     * Gets the value of the cctvNorthTiltValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNorthTiltValue() {
        return cctvNorthTiltValue;
    }

    /**
     * Sets the value of the cctvNorthTiltValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNorthTiltValue(BigInteger value) {
        this.cctvNorthTiltValue = value;
    }

    /**
     * Gets the value of the cctvNorthZoomValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNorthZoomValue() {
        return cctvNorthZoomValue;
    }

    /**
     * Sets the value of the cctvNorthZoomValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNorthZoomValue(BigInteger value) {
        this.cctvNorthZoomValue = value;
    }

    /**
     * Gets the value of the cctvCameraTrueNorthPositionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraTrueNorthPositionExtension() {
        return cctvCameraTrueNorthPositionExtension;
    }

    /**
     * Sets the value of the cctvCameraTrueNorthPositionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraTrueNorthPositionExtension(ExtensionType value) {
        this.cctvCameraTrueNorthPositionExtension = value;
    }

}
