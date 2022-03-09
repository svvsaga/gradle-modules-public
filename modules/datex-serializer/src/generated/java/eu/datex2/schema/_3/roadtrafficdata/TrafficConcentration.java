
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.PercentageValue;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
@XmlType(name = "TrafficConcentration", propOrder = {
    "density",
    "occupancy",
    "_TrafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficData
{

    protected TrafficDensityValue density;
    protected PercentageValue occupancy;
    @XmlElement(name = "_trafficConcentrationExtension")
    protected _ExtensionType _TrafficConcentrationExtension;

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
     * Gets the value of the _TrafficConcentrationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficConcentrationExtension() {
        return _TrafficConcentrationExtension;
    }

    /**
     * Sets the value of the _TrafficConcentrationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficConcentrationExtension(_ExtensionType value) {
        this._TrafficConcentrationExtension = value;
    }

}
