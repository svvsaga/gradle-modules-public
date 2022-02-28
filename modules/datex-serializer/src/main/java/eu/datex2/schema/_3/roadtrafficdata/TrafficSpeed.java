
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.SpeedValue;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Averaged measurements or calculations of traffic speed.
 * 
 * <p>Java class for TrafficSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/3/common}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/3/roadTrafficData}SpeedPercentile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="normallyExpectedSpeed" type="{http://datex2.eu/schema/3/common}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="minimumSpeed" type="{http://datex2.eu/schema/3/common}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="maximumSpeed" type="{http://datex2.eu/schema/3/common}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="_trafficSpeedExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "normallyExpectedSpeed",
    "minimumSpeed",
    "maximumSpeed",
    "_TrafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficData
{

    protected SpeedValue averageVehicleSpeed;
    protected List<SpeedPercentile> speedPercentile;
    protected SpeedValue normallyExpectedSpeed;
    protected SpeedValue minimumSpeed;
    protected SpeedValue maximumSpeed;
    @XmlElement(name = "_trafficSpeedExtension")
    protected _ExtensionType _TrafficSpeedExtension;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the speedPercentile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedPercentile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeedPercentile }
     * 
     * 
     */
    public List<SpeedPercentile> getSpeedPercentile() {
        if (speedPercentile == null) {
            speedPercentile = new ArrayList<SpeedPercentile>();
        }
        return this.speedPercentile;
    }

    /**
     * Gets the value of the normallyExpectedSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getNormallyExpectedSpeed() {
        return normallyExpectedSpeed;
    }

    /**
     * Sets the value of the normallyExpectedSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setNormallyExpectedSpeed(SpeedValue value) {
        this.normallyExpectedSpeed = value;
    }

    /**
     * Gets the value of the minimumSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getMinimumSpeed() {
        return minimumSpeed;
    }

    /**
     * Sets the value of the minimumSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setMinimumSpeed(SpeedValue value) {
        this.minimumSpeed = value;
    }

    /**
     * Gets the value of the maximumSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Sets the value of the maximumSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setMaximumSpeed(SpeedValue value) {
        this.maximumSpeed = value;
    }

    /**
     * Gets the value of the _TrafficSpeedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficSpeedExtension() {
        return _TrafficSpeedExtension;
    }

    /**
     * Sets the value of the _TrafficSpeedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficSpeedExtension(_ExtensionType value) {
        this._TrafficSpeedExtension = value;
    }

}
