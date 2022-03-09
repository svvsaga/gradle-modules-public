
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.PercentageValue;
import eu.datex2.schema._3.common.SpeedValue;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
@XmlType(name = "SpeedPercentile", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "_SpeedPercentileExtension"
})
public class SpeedPercentile {

    @XmlElement(required = true)
    protected PercentageValue vehiclePercentage;
    @XmlElement(required = true)
    protected SpeedValue speedPercentile;
    @XmlElement(name = "_speedPercentileExtension")
    protected _ExtensionType _SpeedPercentileExtension;

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
     * Gets the value of the _SpeedPercentileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SpeedPercentileExtension() {
        return _SpeedPercentileExtension;
    }

    /**
     * Sets the value of the _SpeedPercentileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SpeedPercentileExtension(_ExtensionType value) {
        this._SpeedPercentileExtension = value;
    }

}
