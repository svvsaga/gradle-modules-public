
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Confidence ellipse position defined in a shape of ellipse with a predefined confidence
 *         level (e.g. 95 %). The centre of the ellipse shape corresponds to the reference position point for which
 *         the position accuracy is evaluated.
 *       
 * 
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
    "positionConfidenceEllipseExtension"
})
public class PositionConfidenceEllipse {

    protected Float semiMajorAxisLength;
    protected PositionConfidenceCodedErrorEnum semiMajorAxisLengthCodedError;
    protected Float semiMinorAxisLength;
    protected PositionConfidenceCodedErrorEnum semiMinorAxisLengthCodedError;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer semiMajorAxisOrientation;
    protected Boolean semiMajorAxisOrientationError;
    @XmlElement(name = "_positionConfidenceEllipseExtension")
    protected ExtensionType positionConfidenceEllipseExtension;

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
     *     {@link PositionConfidenceCodedErrorEnum }
     *     
     */
    public PositionConfidenceCodedErrorEnum getSemiMajorAxisLengthCodedError() {
        return semiMajorAxisLengthCodedError;
    }

    /**
     * Sets the value of the semiMajorAxisLengthCodedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionConfidenceCodedErrorEnum }
     *     
     */
    public void setSemiMajorAxisLengthCodedError(PositionConfidenceCodedErrorEnum value) {
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
     *     {@link PositionConfidenceCodedErrorEnum }
     *     
     */
    public PositionConfidenceCodedErrorEnum getSemiMinorAxisLengthCodedError() {
        return semiMinorAxisLengthCodedError;
    }

    /**
     * Sets the value of the semiMinorAxisLengthCodedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionConfidenceCodedErrorEnum }
     *     
     */
    public void setSemiMinorAxisLengthCodedError(PositionConfidenceCodedErrorEnum value) {
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
     * Gets the value of the positionConfidenceEllipseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPositionConfidenceEllipseExtension() {
        return positionConfidenceEllipseExtension;
    }

    /**
     * Sets the value of the positionConfidenceEllipseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPositionConfidenceEllipseExtension(ExtensionType value) {
        this.positionConfidenceEllipseExtension = value;
    }

}
