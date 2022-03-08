
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="windMeasurementHeight" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="windSpeed" type="{http://datex2.eu/schema/2/2_0}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="maximumWindSpeed" type="{http://datex2.eu/schema/2/2_0}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="windDirectionBearing" type="{http://datex2.eu/schema/2/2_0}DirectionBearingValue" minOccurs="0"/&gt;
 *         &lt;element name="windDirectionCompass" type="{http://datex2.eu/schema/2/2_0}DirectionCompassValue" minOccurs="0"/&gt;
 *         &lt;element name="windExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", propOrder = {
    "windMeasurementHeight",
    "windSpeed",
    "maximumWindSpeed",
    "windDirectionBearing",
    "windDirectionCompass",
    "windExtension"
})
public class Wind {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger windMeasurementHeight;
    protected SpeedValue windSpeed;
    protected SpeedValue maximumWindSpeed;
    protected DirectionBearingValue windDirectionBearing;
    protected DirectionCompassValue windDirectionCompass;
    protected ExtensionType windExtension;

    /**
     * Gets the value of the windMeasurementHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindMeasurementHeight() {
        return windMeasurementHeight;
    }

    /**
     * Sets the value of the windMeasurementHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindMeasurementHeight(BigInteger value) {
        this.windMeasurementHeight = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setWindSpeed(SpeedValue value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the maximumWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getMaximumWindSpeed() {
        return maximumWindSpeed;
    }

    /**
     * Sets the value of the maximumWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setMaximumWindSpeed(SpeedValue value) {
        this.maximumWindSpeed = value;
    }

    /**
     * Gets the value of the windDirectionBearing property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionBearingValue }
     *     
     */
    public DirectionBearingValue getWindDirectionBearing() {
        return windDirectionBearing;
    }

    /**
     * Sets the value of the windDirectionBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionBearingValue }
     *     
     */
    public void setWindDirectionBearing(DirectionBearingValue value) {
        this.windDirectionBearing = value;
    }

    /**
     * Gets the value of the windDirectionCompass property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassValue }
     *     
     */
    public DirectionCompassValue getWindDirectionCompass() {
        return windDirectionCompass;
    }

    /**
     * Sets the value of the windDirectionCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassValue }
     *     
     */
    public void setWindDirectionCompass(DirectionCompassValue value) {
        this.windDirectionCompass = value;
    }

    /**
     * Gets the value of the windExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindExtension() {
        return windExtension;
    }

    /**
     * Sets the value of the windExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindExtension(ExtensionType value) {
        this.windExtension = value;
    }

}
