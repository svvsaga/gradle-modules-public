
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadSurfaceConditionMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadSurfaceTemperature" type="{http://datex2.eu/schema/2/2_0}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="protectionTemperature" type="{http://datex2.eu/schema/2/2_0}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="deIcingApplicationRate" type="{http://datex2.eu/schema/2/2_0}ApplicationRateValue" minOccurs="0"/&gt;
 *         &lt;element name="deIcingConcentration" type="{http://datex2.eu/schema/2/2_0}KilogramsConcentrationValue" minOccurs="0"/&gt;
 *         &lt;element name="depthOfSnow" type="{http://datex2.eu/schema/2/2_0}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="waterFilmThickness" type="{http://datex2.eu/schema/2/2_0}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurementsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "roadSurfaceTemperature",
    "protectionTemperature",
    "deIcingApplicationRate",
    "deIcingConcentration",
    "depthOfSnow",
    "waterFilmThickness",
    "roadSurfaceConditionMeasurementsExtension"
})
public class RoadSurfaceConditionMeasurements {

    protected TemperatureValue roadSurfaceTemperature;
    protected TemperatureValue protectionTemperature;
    protected ApplicationRateValue deIcingApplicationRate;
    protected KilogramsConcentrationValue deIcingConcentration;
    protected FloatingPointMetreDistanceValue depthOfSnow;
    protected FloatingPointMetreDistanceValue waterFilmThickness;
    protected _ExtensionType roadSurfaceConditionMeasurementsExtension;

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
     * Gets the value of the roadSurfaceConditionMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getRoadSurfaceConditionMeasurementsExtension() {
        return roadSurfaceConditionMeasurementsExtension;
    }

    /**
     * Sets the value of the roadSurfaceConditionMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionMeasurementsExtension(_ExtensionType value) {
        this.roadSurfaceConditionMeasurementsExtension = value;
    }

}
