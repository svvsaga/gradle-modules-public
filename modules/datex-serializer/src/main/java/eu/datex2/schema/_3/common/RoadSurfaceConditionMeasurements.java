
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measurements of the road surface condition which relate specifically to the weather.
 *       
 * 
 * <p>Java class for RoadSurfaceConditionMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temperatureBelowOrAboveRoadSurface" type="{http://datex2.eu/schema/3/common}TemperatureBelowOrAboveRoadSurface" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceTemperature" type="{http://datex2.eu/schema/3/common}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="protectionTemperature" type="{http://datex2.eu/schema/3/common}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="deIcingApplicationRate" type="{http://datex2.eu/schema/3/common}ApplicationRateValue" minOccurs="0"/&gt;
 *         &lt;element name="deIcingConcentration" type="{http://datex2.eu/schema/3/common}KilogramsConcentrationValue" minOccurs="0"/&gt;
 *         &lt;element name="friction" type="{http://datex2.eu/schema/3/common}FrictionValue" minOccurs="0"/&gt;
 *         &lt;element name="depthOfSnow" type="{http://datex2.eu/schema/3/common}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="waterFilmThickness" type="{http://datex2.eu/schema/3/common}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="iceLayerThickness" type="{http://datex2.eu/schema/3/common}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="icePercentage" type="{http://datex2.eu/schema/3/common}PercentageValue" minOccurs="0"/&gt;
 *         &lt;element name="_roadSurfaceConditionMeasurementsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionMeasurements", propOrder = {
    "temperatureBelowOrAboveRoadSurface",
    "roadSurfaceTemperature",
    "protectionTemperature",
    "deIcingApplicationRate",
    "deIcingConcentration",
    "friction",
    "depthOfSnow",
    "waterFilmThickness",
    "iceLayerThickness",
    "icePercentage",
    "roadSurfaceConditionMeasurementsExtension"
})
public class RoadSurfaceConditionMeasurements {

    protected List<TemperatureBelowOrAboveRoadSurface> temperatureBelowOrAboveRoadSurface;
    protected TemperatureValue roadSurfaceTemperature;
    protected TemperatureValue protectionTemperature;
    protected ApplicationRateValue deIcingApplicationRate;
    protected KilogramsConcentrationValue deIcingConcentration;
    protected FrictionValue friction;
    protected FloatingPointMetreDistanceValue depthOfSnow;
    protected FloatingPointMetreDistanceValue waterFilmThickness;
    protected FloatingPointMetreDistanceValue iceLayerThickness;
    protected PercentageValue icePercentage;
    @XmlElement(name = "_roadSurfaceConditionMeasurementsExtension")
    protected ExtensionType roadSurfaceConditionMeasurementsExtension;

    /**
     * Gets the value of the temperatureBelowOrAboveRoadSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the temperatureBelowOrAboveRoadSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperatureBelowOrAboveRoadSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureBelowOrAboveRoadSurface }
     * 
     * 
     */
    public List<TemperatureBelowOrAboveRoadSurface> getTemperatureBelowOrAboveRoadSurface() {
        if (temperatureBelowOrAboveRoadSurface == null) {
            temperatureBelowOrAboveRoadSurface = new ArrayList<TemperatureBelowOrAboveRoadSurface>();
        }
        return this.temperatureBelowOrAboveRoadSurface;
    }

    /**
     * Gets the value of the roadSurfaceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getRoadSurfaceTemperature() {
        return roadSurfaceTemperature;
    }

    /**
     * Sets the value of the roadSurfaceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setRoadSurfaceTemperature(TemperatureValue value) {
        this.roadSurfaceTemperature = value;
    }

    /**
     * Gets the value of the protectionTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getProtectionTemperature() {
        return protectionTemperature;
    }

    /**
     * Sets the value of the protectionTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setProtectionTemperature(TemperatureValue value) {
        this.protectionTemperature = value;
    }

    /**
     * Gets the value of the deIcingApplicationRate property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationRateValue }
     *     
     */
    public ApplicationRateValue getDeIcingApplicationRate() {
        return deIcingApplicationRate;
    }

    /**
     * Sets the value of the deIcingApplicationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationRateValue }
     *     
     */
    public void setDeIcingApplicationRate(ApplicationRateValue value) {
        this.deIcingApplicationRate = value;
    }

    /**
     * Gets the value of the deIcingConcentration property.
     * 
     * @return
     *     possible object is
     *     {@link KilogramsConcentrationValue }
     *     
     */
    public KilogramsConcentrationValue getDeIcingConcentration() {
        return deIcingConcentration;
    }

    /**
     * Sets the value of the deIcingConcentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link KilogramsConcentrationValue }
     *     
     */
    public void setDeIcingConcentration(KilogramsConcentrationValue value) {
        this.deIcingConcentration = value;
    }

    /**
     * Gets the value of the friction property.
     * 
     * @return
     *     possible object is
     *     {@link FrictionValue }
     *     
     */
    public FrictionValue getFriction() {
        return friction;
    }

    /**
     * Sets the value of the friction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrictionValue }
     *     
     */
    public void setFriction(FrictionValue value) {
        this.friction = value;
    }

    /**
     * Gets the value of the depthOfSnow property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getDepthOfSnow() {
        return depthOfSnow;
    }

    /**
     * Sets the value of the depthOfSnow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setDepthOfSnow(FloatingPointMetreDistanceValue value) {
        this.depthOfSnow = value;
    }

    /**
     * Gets the value of the waterFilmThickness property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getWaterFilmThickness() {
        return waterFilmThickness;
    }

    /**
     * Sets the value of the waterFilmThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setWaterFilmThickness(FloatingPointMetreDistanceValue value) {
        this.waterFilmThickness = value;
    }

    /**
     * Gets the value of the iceLayerThickness property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getIceLayerThickness() {
        return iceLayerThickness;
    }

    /**
     * Sets the value of the iceLayerThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setIceLayerThickness(FloatingPointMetreDistanceValue value) {
        this.iceLayerThickness = value;
    }

    /**
     * Gets the value of the icePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getIcePercentage() {
        return icePercentage;
    }

    /**
     * Sets the value of the icePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setIcePercentage(PercentageValue value) {
        this.icePercentage = value;
    }

    /**
     * Gets the value of the roadSurfaceConditionMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionMeasurementsExtension() {
        return roadSurfaceConditionMeasurementsExtension;
    }

    /**
     * Sets the value of the roadSurfaceConditionMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        this.roadSurfaceConditionMeasurementsExtension = value;
    }

}
