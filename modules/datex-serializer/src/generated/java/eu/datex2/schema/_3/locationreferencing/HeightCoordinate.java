
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeightCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeightCoordinate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heightValue" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="heightType" type="{http://datex2.eu/schema/3/locationReferencing}_HeightTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="altitudeConfidence" type="{http://datex2.eu/schema/3/locationReferencing}AltitudeConfidence" minOccurs="0"/&gt;
 *         &lt;element name="verticalPositionAccuracy" type="{http://datex2.eu/schema/3/locationReferencing}PositionAccuracy" minOccurs="0"/&gt;
 *         &lt;element name="_heightCoordinateExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightCoordinate", propOrder = {
    "heightValue",
    "heightType",
    "altitudeConfidence",
    "verticalPositionAccuracy",
    "_HeightCoordinateExtension"
})
public class HeightCoordinate {

    protected float heightValue;
    protected _HeightTypeEnum heightType;
    protected AltitudeConfidence altitudeConfidence;
    protected PositionAccuracy verticalPositionAccuracy;
    @XmlElement(name = "_heightCoordinateExtension")
    protected _ExtensionType _HeightCoordinateExtension;

    /**
     * Gets the value of the heightValue property.
     * 
     */
    public float getHeightValue() {
        return heightValue;
    }

    /**
     * Sets the value of the heightValue property.
     * 
     */
    public void setHeightValue(float value) {
        this.heightValue = value;
    }

    /**
     * Gets the value of the heightType property.
     * 
     * @return
     *     possible object is
     *     {@link _HeightTypeEnum }
     *     
     */
    public _HeightTypeEnum getHeightType() {
        return heightType;
    }

    /**
     * Sets the value of the heightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _HeightTypeEnum }
     *     
     */
    public void setHeightType(_HeightTypeEnum value) {
        this.heightType = value;
    }

    /**
     * Gets the value of the altitudeConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeConfidence }
     *     
     */
    public AltitudeConfidence getAltitudeConfidence() {
        return altitudeConfidence;
    }

    /**
     * Sets the value of the altitudeConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeConfidence }
     *     
     */
    public void setAltitudeConfidence(AltitudeConfidence value) {
        this.altitudeConfidence = value;
    }

    /**
     * Gets the value of the verticalPositionAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAccuracy }
     *     
     */
    public PositionAccuracy getVerticalPositionAccuracy() {
        return verticalPositionAccuracy;
    }

    /**
     * Sets the value of the verticalPositionAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAccuracy }
     *     
     */
    public void setVerticalPositionAccuracy(PositionAccuracy value) {
        this.verticalPositionAccuracy = value;
    }

    /**
     * Gets the value of the _HeightCoordinateExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_HeightCoordinateExtension() {
        return _HeightCoordinateExtension;
    }

    /**
     * Sets the value of the _HeightCoordinateExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_HeightCoordinateExtension(_ExtensionType value) {
        this._HeightCoordinateExtension = value;
    }

}
