
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
 * <p>Java class for DailyTrafficFlowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyTrafficFlowValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleFlowRate" type="{http://datex2.eu/schema/3/roadTrafficData}VehiclesPerDay"/&gt;
 *         &lt;element name="_dailyTrafficFlowValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyTrafficFlowValue", propOrder = {
    "vehicleFlowRate",
    "_DailyTrafficFlowValueExtension"
})
public class DailyTrafficFlowValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleFlowRate;
    @XmlElement(name = "_dailyTrafficFlowValueExtension")
    protected _ExtensionType _DailyTrafficFlowValueExtension;

    /**
     * Gets the value of the vehicleFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleFlowRate() {
        return vehicleFlowRate;
    }

    /**
     * Sets the value of the vehicleFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleFlowRate(BigInteger value) {
        this.vehicleFlowRate = value;
    }

    /**
     * Gets the value of the _DailyTrafficFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DailyTrafficFlowValueExtension() {
        return _DailyTrafficFlowValueExtension;
    }

    /**
     * Sets the value of the _DailyTrafficFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DailyTrafficFlowValueExtension(_ExtensionType value) {
        this._DailyTrafficFlowValueExtension = value;
    }

}
