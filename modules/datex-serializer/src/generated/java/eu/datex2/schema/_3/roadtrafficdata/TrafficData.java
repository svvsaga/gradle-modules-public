
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.VehicleCharacteristics;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="_trafficDataExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficData", propOrder = {
    "forVehiclesWithCharacteristicsOf",
    "trafficDataExtension"
})
@XmlSeeAlso({
    IndividualVehicleDataValues.class,
    TrafficConcentration.class,
    TrafficFlow.class,
    TrafficGap.class,
    TrafficHeadway.class,
    TrafficSpeed.class
})
public abstract class TrafficData
    extends BasicData
{

    protected VehicleCharacteristics forVehiclesWithCharacteristicsOf;
    @XmlElement(name = "_trafficDataExtension")
    protected ExtensionType trafficDataExtension;

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getForVehiclesWithCharacteristicsOf() {
        return forVehiclesWithCharacteristicsOf;
    }

    /**
     * Sets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        this.forVehiclesWithCharacteristicsOf = value;
    }

    /**
     * Gets the value of the trafficDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficDataExtension() {
        return trafficDataExtension;
    }

    /**
     * Sets the value of the trafficDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficDataExtension(ExtensionType value) {
        this.trafficDataExtension = value;
    }

}
