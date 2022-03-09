
package eu.datex2.schema._3.roadtrafficdata;

import java.math.BigInteger;
import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "_TrafficDensityValueExtension"
})
public class TrafficDensityValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger densityOfVehicles;
    @XmlElement(name = "_trafficDensityValueExtension")
    protected _ExtensionType _TrafficDensityValueExtension;

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
     * Gets the value of the _TrafficDensityValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficDensityValueExtension() {
        return _TrafficDensityValueExtension;
    }

    /**
     * Sets the value of the _TrafficDensityValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficDensityValueExtension(_ExtensionType value) {
        this._TrafficDensityValueExtension = value;
    }

}
