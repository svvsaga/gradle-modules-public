
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxleSpacing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleSpacing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleSpacing" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="axleSpacingSequenceIdentifier" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="_axleSpacingExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleSpacing", propOrder = {
    "axleSpacing",
    "axleSpacingSequenceIdentifier",
    "_AxleSpacingExtension"
})
public class AxleSpacing {

    protected float axleSpacing;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axleSpacingSequenceIdentifier;
    @XmlElement(name = "_axleSpacingExtension")
    protected _ExtensionType _AxleSpacingExtension;

    /**
     * Gets the value of the axleSpacing property.
     * 
     */
    public float getAxleSpacing() {
        return axleSpacing;
    }

    /**
     * Sets the value of the axleSpacing property.
     * 
     */
    public void setAxleSpacing(float value) {
        this.axleSpacing = value;
    }

    /**
     * Gets the value of the axleSpacingSequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleSpacingSequenceIdentifier() {
        return axleSpacingSequenceIdentifier;
    }

    /**
     * Sets the value of the axleSpacingSequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleSpacingSequenceIdentifier(BigInteger value) {
        this.axleSpacingSequenceIdentifier = value;
    }

    /**
     * Gets the value of the _AxleSpacingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AxleSpacingExtension() {
        return _AxleSpacingExtension;
    }

    /**
     * Sets the value of the _AxleSpacingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AxleSpacingExtension(_ExtensionType value) {
        this._AxleSpacingExtension = value;
    }

}
