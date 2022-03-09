
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.RoadSurfaceConditionMeasurements;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._WeatherRelatedRoadConditionTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherRelatedRoadConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherRelatedRoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}RoadSurfaceConditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/3/common}_WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/3/common}RoadSurfaceConditionMeasurements" minOccurs="0"/&gt;
 *         &lt;element name="_weatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherRelatedRoadConditions", propOrder = {
    "weatherRelatedRoadConditionType",
    "roadSurfaceConditionMeasurements",
    "_WeatherRelatedRoadConditionsExtension"
})
public class WeatherRelatedRoadConditions
    extends RoadSurfaceConditions
{

    @XmlElement(required = true)
    protected List<_WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    @XmlElement(name = "_weatherRelatedRoadConditionsExtension")
    protected _ExtensionType _WeatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<_WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<_WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the roadSurfaceConditionMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public RoadSurfaceConditionMeasurements getRoadSurfaceConditionMeasurements() {
        return roadSurfaceConditionMeasurements;
    }

    /**
     * Sets the value of the roadSurfaceConditionMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public void setRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        this.roadSurfaceConditionMeasurements = value;
    }

    /**
     * Gets the value of the _WeatherRelatedRoadConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WeatherRelatedRoadConditionsExtension() {
        return _WeatherRelatedRoadConditionsExtension;
    }

    /**
     * Sets the value of the _WeatherRelatedRoadConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WeatherRelatedRoadConditionsExtension(_ExtensionType value) {
        this._WeatherRelatedRoadConditionsExtension = value;
    }

}
