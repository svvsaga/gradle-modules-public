
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Evaluation of the altitude confidence assessed according to ETSI ISO 102894-2
 *       
 * 
 * <p>Java class for AltitudeConfidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltitudeConfidence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altitudeAccuracyCodedValue" type="{http://datex2.eu/schema/3/locationReferencing}_AltitudeAccuracyEnum" minOccurs="0"/&gt;
 *         &lt;element name="altitudeAccuracyCodedError" type="{http://datex2.eu/schema/3/locationReferencing}_PositionConfidenceCodedErrorEnum" minOccurs="0"/&gt;
 *         &lt;element name="_altitudeConfidenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeConfidence", propOrder = {
    "altitudeAccuracyCodedValue",
    "altitudeAccuracyCodedError",
    "_AltitudeConfidenceExtension"
})
public class AltitudeConfidence {

    protected _AltitudeAccuracyEnum altitudeAccuracyCodedValue;
    protected _PositionConfidenceCodedErrorEnum altitudeAccuracyCodedError;
    @XmlElement(name = "_altitudeConfidenceExtension")
    protected _ExtensionType _AltitudeConfidenceExtension;

    /**
     * Gets the value of the altitudeAccuracyCodedValue property.
     * 
     * @return
     *     possible object is
     *     {@link _AltitudeAccuracyEnum }
     *     
     */
    public _AltitudeAccuracyEnum getAltitudeAccuracyCodedValue() {
        return altitudeAccuracyCodedValue;
    }

    /**
     * Sets the value of the altitudeAccuracyCodedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AltitudeAccuracyEnum }
     *     
     */
    public void setAltitudeAccuracyCodedValue(_AltitudeAccuracyEnum value) {
        this.altitudeAccuracyCodedValue = value;
    }

    /**
     * Gets the value of the altitudeAccuracyCodedError property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionConfidenceCodedErrorEnum }
     *     
     */
    public _PositionConfidenceCodedErrorEnum getAltitudeAccuracyCodedError() {
        return altitudeAccuracyCodedError;
    }

    /**
     * Sets the value of the altitudeAccuracyCodedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionConfidenceCodedErrorEnum }
     *     
     */
    public void setAltitudeAccuracyCodedError(_PositionConfidenceCodedErrorEnum value) {
        this.altitudeAccuracyCodedError = value;
    }

    /**
     * Gets the value of the _AltitudeConfidenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AltitudeConfidenceExtension() {
        return _AltitudeConfidenceExtension;
    }

    /**
     * Sets the value of the _AltitudeConfidenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AltitudeConfidenceExtension(_ExtensionType value) {
        this._AltitudeConfidenceExtension = value;
    }

}
