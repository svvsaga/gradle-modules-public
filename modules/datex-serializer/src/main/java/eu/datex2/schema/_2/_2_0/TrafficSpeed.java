
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/2/2_0}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2/2_0}SpeedPercentile" minOccurs="0"/&gt;
 *         &lt;element name="trafficSpeedExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "trafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficData
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected SpeedValue averageVehicleSpeed;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected SpeedPercentile speedPercentile;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType trafficSpeedExtension;

    /**
     * Gets the value of the averageVehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    /**
     * Sets the value of the averageVehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setAverageVehicleSpeed(SpeedValue value) {
        this.averageVehicleSpeed = value;
    }

    /**
     * Gets the value of the speedPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedPercentile }
     *     
     */
    public SpeedPercentile getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Sets the value of the speedPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedPercentile }
     *     
     */
    public void setSpeedPercentile(SpeedPercentile value) {
        this.speedPercentile = value;
    }

    /**
     * Gets the value of the trafficSpeedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficSpeedExtension() {
        return trafficSpeedExtension;
    }

    /**
     * Sets the value of the trafficSpeedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficSpeedExtension(ExtensionType value) {
        this.trafficSpeedExtension = value;
    }

}
