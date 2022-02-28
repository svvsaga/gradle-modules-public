
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadSurfaceConditionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2/2_0}WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/2/2_0}RoadSurfaceConditionMeasurements"/&gt;
 *         &lt;element name="roadSurfaceConditionInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionInformation", propOrder = {
    "weatherRelatedRoadConditionType",
    "roadSurfaceConditionMeasurements",
    "roadSurfaceConditionInformationExtension"
})
public class RoadSurfaceConditionInformation
    extends WeatherData
{

    @XmlSchemaType(name = "string")
    protected List<WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    @XmlElement(required = true)
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected _ExtensionType roadSurfaceConditionInformationExtension;

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
     * {@link WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<WeatherRelatedRoadConditionTypeEnum>();
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
     * Gets the value of the roadSurfaceConditionInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getRoadSurfaceConditionInformationExtension() {
        return roadSurfaceConditionInformationExtension;
    }

    /**
     * Sets the value of the roadSurfaceConditionInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionInformationExtension(_ExtensionType value) {
        this.roadSurfaceConditionInformationExtension = value;
    }

}
