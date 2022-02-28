
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mesurement of temperature below or above the road surface.
 * 
 * <p>Java class for TemperatureBelowOrAboveRoadSurface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureBelowOrAboveRoadSurface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heightBelowOrAboveRoadSurface" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="temperatureBelowOrAboveRoadSurface" type="{http://datex2.eu/schema/3/common}TemperatureValue"/&gt;
 *         &lt;element name="_temperatureBelowOrAboveRoadSurfaceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureBelowOrAboveRoadSurface", propOrder = {
    "heightBelowOrAboveRoadSurface",
    "temperatureBelowOrAboveRoadSurface",
    "_TemperatureBelowOrAboveRoadSurfaceExtension"
})
public class TemperatureBelowOrAboveRoadSurface {

    protected float heightBelowOrAboveRoadSurface;
    @XmlElement(required = true)
    protected TemperatureValue temperatureBelowOrAboveRoadSurface;
    @XmlElement(name = "_temperatureBelowOrAboveRoadSurfaceExtension")
    protected _ExtensionType _TemperatureBelowOrAboveRoadSurfaceExtension;

    /**
     * Gets the value of the heightBelowOrAboveRoadSurface property.
     * 
     */
    public float getHeightBelowOrAboveRoadSurface() {
        return heightBelowOrAboveRoadSurface;
    }

    /**
     * Sets the value of the heightBelowOrAboveRoadSurface property.
     * 
     */
    public void setHeightBelowOrAboveRoadSurface(float value) {
        this.heightBelowOrAboveRoadSurface = value;
    }

    /**
     * Gets the value of the temperatureBelowOrAboveRoadSurface property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getTemperatureBelowOrAboveRoadSurface() {
        return temperatureBelowOrAboveRoadSurface;
    }

    /**
     * Sets the value of the temperatureBelowOrAboveRoadSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setTemperatureBelowOrAboveRoadSurface(TemperatureValue value) {
        this.temperatureBelowOrAboveRoadSurface = value;
    }

    /**
     * Gets the value of the _TemperatureBelowOrAboveRoadSurfaceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TemperatureBelowOrAboveRoadSurfaceExtension() {
        return _TemperatureBelowOrAboveRoadSurfaceExtension;
    }

    /**
     * Sets the value of the _TemperatureBelowOrAboveRoadSurfaceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TemperatureBelowOrAboveRoadSurfaceExtension(_ExtensionType value) {
        this._TemperatureBelowOrAboveRoadSurfaceExtension = value;
    }

}
