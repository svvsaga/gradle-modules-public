
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.FloatingPointMetreDistanceValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Averaged measurements or calculations of traffic headway, i.e. the distance or time
 *         interval between vehicles. This is measured one end (normally the front) of one vehicle to the same end
 *         of the following vehicle.
 *       
 * 
 * <p>Java class for TrafficHeadway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficHeadway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageDistanceHeadway" type="{http://datex2.eu/schema/3/common}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="averageTimeHeadway" type="{http://datex2.eu/schema/3/roadTrafficData}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="_trafficHeadwayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficHeadway", propOrder = {
    "averageDistanceHeadway",
    "averageTimeHeadway",
    "trafficHeadwayExtension"
})
public class TrafficHeadway
    extends TrafficData
{

    protected FloatingPointMetreDistanceValue averageDistanceHeadway;
    protected DurationValue averageTimeHeadway;
    @XmlElement(name = "_trafficHeadwayExtension")
    protected ExtensionType trafficHeadwayExtension;

    /**
     * Gets the value of the averageDistanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getAverageDistanceHeadway() {
        return averageDistanceHeadway;
    }

    /**
     * Sets the value of the averageDistanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setAverageDistanceHeadway(FloatingPointMetreDistanceValue value) {
        this.averageDistanceHeadway = value;
    }

    /**
     * Gets the value of the averageTimeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getAverageTimeHeadway() {
        return averageTimeHeadway;
    }

    /**
     * Sets the value of the averageTimeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setAverageTimeHeadway(DurationValue value) {
        this.averageTimeHeadway = value;
    }

    /**
     * Gets the value of the trafficHeadwayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficHeadwayExtension() {
        return trafficHeadwayExtension;
    }

    /**
     * Sets the value of the trafficHeadwayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficHeadwayExtension(ExtensionType value) {
        this.trafficHeadwayExtension = value;
    }

}
