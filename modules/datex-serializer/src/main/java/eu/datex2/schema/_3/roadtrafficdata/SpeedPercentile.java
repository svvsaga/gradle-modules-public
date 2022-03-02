
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.PercentageValue;
import eu.datex2.schema._3.common.SpeedValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of percentage (from an observation set) of vehicles whose speeds fall below a
 *         stated value.
 *       
 * 
 * <p>Java class for SpeedPercentile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedPercentile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehiclePercentage" type="{http://datex2.eu/schema/3/common}PercentageValue"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/3/common}SpeedValue"/&gt;
 *         &lt;element name="_speedPercentileExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "speedPercentileExtension"
})
public class SpeedPercentile {

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected PercentageValue vehiclePercentage;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected SpeedValue speedPercentile;
    @XmlElement(name = "_speedPercentileExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType speedPercentileExtension;

    /**
     * Gets the value of the vehiclePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getVehiclePercentage() {
        return vehiclePercentage;
    }

    /**
     * Sets the value of the vehiclePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setVehiclePercentage(PercentageValue value) {
        this.vehiclePercentage = value;
    }

    /**
     * Gets the value of the speedPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Sets the value of the speedPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setSpeedPercentile(SpeedValue value) {
        this.speedPercentile = value;
    }

    /**
     * Gets the value of the speedPercentileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Sets the value of the speedPercentileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

}
