
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Conditions of the road surface which may affect driving conditions. These may be related
 *         to the weather (e.g. ice, snow etc.) or to other conditions (e.g. oil, mud, leaves etc. on the road)
 *       
 * 
 * <p>Java class for RoadSurfaceConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Conditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_roadSurfaceConditionsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditions", propOrder = {
    "_RoadSurfaceConditionsExtension"
})
@XmlSeeAlso({
    NonWeatherRelatedRoadConditions.class,
    WeatherRelatedRoadConditions.class
})
public abstract class RoadSurfaceConditions
    extends Conditions
{

    @XmlElement(name = "_roadSurfaceConditionsExtension")
    protected _ExtensionType _RoadSurfaceConditionsExtension;

    /**
     * Gets the value of the _RoadSurfaceConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RoadSurfaceConditionsExtension() {
        return _RoadSurfaceConditionsExtension;
    }

    /**
     * Sets the value of the _RoadSurfaceConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RoadSurfaceConditionsExtension(_ExtensionType value) {
        this._RoadSurfaceConditionsExtension = value;
    }

}
