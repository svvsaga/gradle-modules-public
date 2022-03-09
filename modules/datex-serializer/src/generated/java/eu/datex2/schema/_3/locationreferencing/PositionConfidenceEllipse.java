
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionConfidenceEllipse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionConfidenceEllipse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="semiMajorAxisLength" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="semiMajorAxisLengthCodedError" type="{http://datex2.eu/schema/3/locationReferencing}_PositionConfidenceCodedErrorEnum" minOccurs="0"/&gt;
 *         &lt;element name="semiMinorAxisLength" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="semiMinorAxisLengthCodedError" type="{http://datex2.eu/schema/3/locationReferencing}_PositionConfidenceCodedErrorEnum" minOccurs="0"/&gt;
 *         &lt;element name="semiMajorAxisOrientation" type="{http://datex2.eu/schema/3/common}AngleInDegrees" minOccurs="0"/&gt;
 *         &lt;element name="semiMajorAxisOrientationError" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="_positionConfidenceEllipseExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionConfidenceEllipse", propOrder = {
    "semiMajorAxisLength",
    "semiMajorAxisLengthCodedError",
    "semiMinorAxisLength",
    "semiMinorAxisLengthCodedError",
    "semiMajorAxisOrientation",
    "semiMajorAxisOrientationError",
    "_PositionConfidenceEllipseExtension"
})
public class PositionConfidenceEllipse {

    protected Float semiMajorAxisLength;
    protected _PositionConfidenceCodedErrorEnum semiMajorAxisLengthCodedError;
    protected Float semiMinorAxisLength;
    protected _PositionConfidenceCodedErrorEnum semiMinorAxisLengthCodedError;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer semiMajorAxisOrientation;
    protected Boolean semiMajorAxisOrientationError;
    @XmlElement(name = "_positionConfidenceEllipseExtension")
    protected _ExtensionType _PositionConfidenceEllipseExtension;

    /**
     * Gets the value of the semiMajorAxisLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSemiMajorAxisLength() {
        return semiMajorAxisLength;
    }

    /**
     * Sets the value of the semiMajorAxisLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSemiMajorAxisLength(Float value) {
        this.semiMajorAxisLength = value;
    }

    /**
     * Gets the value of the semiMajorAxisLengthCodedError property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionConfidenceCodedErrorEnum }
     *     
     */
    public _PositionConfidenceCodedErrorEnum getSemiMajorAxisLengthCodedError() {
        return semiMajorAxisLengthCodedError;
    }

    /**
     * Sets the value of the semiMajorAxisLengthCodedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionConfidenceCodedErrorEnum }
     *     
     */
    public void setSemiMajorAxisLengthCodedError(_PositionConfidenceCodedErrorEnum value) {
        this.semiMajorAxisLengthCodedError = value;
    }

    /**
     * Gets the value of the semiMinorAxisLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSemiMinorAxisLength() {
        return semiMinorAxisLength;
    }

    /**
     * Sets the value of the semiMinorAxisLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSemiMinorAxisLength(Float value) {
        this.semiMinorAxisLength = value;
    }

    /**
     * Gets the value of the semiMinorAxisLengthCodedError property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionConfidenceCodedErrorEnum }
     *     
     */
    public _PositionConfidenceCodedErrorEnum getSemiMinorAxisLengthCodedError() {
        return semiMinorAxisLengthCodedError;
    }

    /**
     * Sets the value of the semiMinorAxisLengthCodedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionConfidenceCodedErrorEnum }
     *     
     */
    public void setSemiMinorAxisLengthCodedError(_PositionConfidenceCodedErrorEnum value) {
        this.semiMinorAxisLengthCodedError = value;
    }

    /**
     * Gets the value of the semiMajorAxisOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSemiMajorAxisOrientation() {
        return semiMajorAxisOrientation;
    }

    /**
     * Sets the value of the semiMajorAxisOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSemiMajorAxisOrientation(Integer value) {
        this.semiMajorAxisOrientation = value;
    }

    /**
     * Gets the value of the semiMajorAxisOrientationError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSemiMajorAxisOrientationError() {
        return semiMajorAxisOrientationError;
    }

    /**
     * Sets the value of the semiMajorAxisOrientationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSemiMajorAxisOrientationError(Boolean value) {
        this.semiMajorAxisOrientationError = value;
    }

    /**
     * Gets the value of the _PositionConfidenceEllipseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PositionConfidenceEllipseExtension() {
        return _PositionConfidenceEllipseExtension;
    }

    /**
     * Sets the value of the _PositionConfidenceEllipseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PositionConfidenceEllipseExtension(_ExtensionType value) {
        this._PositionConfidenceEllipseExtension = value;
    }

}
