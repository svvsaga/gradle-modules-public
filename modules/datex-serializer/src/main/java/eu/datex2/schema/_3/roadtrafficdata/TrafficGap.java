
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.FloatingPointMetreDistanceValue;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Averaged measurements or calculations of traffic gap i.e. the distance or time interval
 *         between vehicles, measured between the rear of one vehicle and the front of the following vehicle.
 *       
 * 
 * <p>Java class for TrafficGap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficGap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageDistanceGap" type="{http://datex2.eu/schema/3/common}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="averageTimeGap" type="{http://datex2.eu/schema/3/roadTrafficData}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="_trafficGapExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficGap", propOrder = {
    "averageDistanceGap",
    "averageTimeGap",
    "_TrafficGapExtension"
})
public class TrafficGap
    extends TrafficData
{

    protected FloatingPointMetreDistanceValue averageDistanceGap;
    protected DurationValue averageTimeGap;
    @XmlElement(name = "_trafficGapExtension")
    protected _ExtensionType _TrafficGapExtension;

    /**
     * Gets the value of the averageDistanceGap property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getAverageDistanceGap() {
        return averageDistanceGap;
    }

    /**
     * Sets the value of the averageDistanceGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setAverageDistanceGap(FloatingPointMetreDistanceValue value) {
        this.averageDistanceGap = value;
    }

    /**
     * Gets the value of the averageTimeGap property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getAverageTimeGap() {
        return averageTimeGap;
    }

    /**
     * Sets the value of the averageTimeGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setAverageTimeGap(DurationValue value) {
        this.averageTimeGap = value;
    }

    /**
     * Gets the value of the _TrafficGapExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficGapExtension() {
        return _TrafficGapExtension;
    }

    /**
     * Sets the value of the _TrafficGapExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficGapExtension(_ExtensionType value) {
        this._TrafficGapExtension = value;
    }

}
