
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "roadSurfaceConditionsExtension"
})
@XmlSeeAlso({
    NonWeatherRelatedRoadConditions.class,
    WeatherRelatedRoadConditions.class
})
public abstract class RoadSurfaceConditions
    extends Conditions
{

    @XmlElement(name = "_roadSurfaceConditionsExtension")
    protected ExtensionType roadSurfaceConditionsExtension;

    /**
     * Gets the value of the roadSurfaceConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionsExtension() {
        return roadSurfaceConditionsExtension;
    }

    /**
     * Sets the value of the roadSurfaceConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionsExtension(ExtensionType value) {
        this.roadSurfaceConditionsExtension = value;
    }

}
