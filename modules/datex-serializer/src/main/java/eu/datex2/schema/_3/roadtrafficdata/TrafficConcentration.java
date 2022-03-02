
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.PercentageValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Averaged measurements or calculations of traffic concentration.
 * 
 * <p>Java class for TrafficConcentration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficConcentration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="density" type="{http://datex2.eu/schema/3/roadTrafficData}TrafficDensityValue" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://datex2.eu/schema/3/common}PercentageValue" minOccurs="0"/&gt;
 *         &lt;element name="_trafficConcentrationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConcentration", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "density",
    "occupancy",
    "trafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficData
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected TrafficDensityValue density;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected PercentageValue occupancy;
    @XmlElement(name = "_trafficConcentrationExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType trafficConcentrationExtension;

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficDensityValue }
     *     
     */
    public TrafficDensityValue getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficDensityValue }
     *     
     */
    public void setDensity(TrafficDensityValue value) {
        this.density = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setOccupancy(PercentageValue value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the trafficConcentrationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficConcentrationExtension() {
        return trafficConcentrationExtension;
    }

    /**
     * Sets the value of the trafficConcentrationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficConcentrationExtension(ExtensionType value) {
        this.trafficConcentrationExtension = value;
    }

}
