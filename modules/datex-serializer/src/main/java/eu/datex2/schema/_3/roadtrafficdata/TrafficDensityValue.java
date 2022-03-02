
package eu.datex2.schema._3.roadtrafficdata;

import java.math.BigInteger;
import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of the density of vehicles on a unit stretch of road in a
 *         given direction.
 *       
 * 
 * <p>Java class for TrafficDensityValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficDensityValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="densityOfVehicles" type="{http://datex2.eu/schema/3/roadTrafficData}DensityVehiclesPerKilometre"/&gt;
 *         &lt;element name="_trafficDensityValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficDensityValue", propOrder = {
    "densityOfVehicles",
    "trafficDensityValueExtension"
})
public class TrafficDensityValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger densityOfVehicles;
    @XmlElement(name = "_trafficDensityValueExtension")
    protected ExtensionType trafficDensityValueExtension;

    /**
     * Gets the value of the densityOfVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDensityOfVehicles() {
        return densityOfVehicles;
    }

    /**
     * Sets the value of the densityOfVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDensityOfVehicles(BigInteger value) {
        this.densityOfVehicles = value;
    }

    /**
     * Gets the value of the trafficDensityValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficDensityValueExtension() {
        return trafficDensityValueExtension;
    }

    /**
     * Sets the value of the trafficDensityValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficDensityValueExtension(ExtensionType value) {
        this.trafficDensityValueExtension = value;
    }

}
