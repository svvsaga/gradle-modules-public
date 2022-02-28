
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of the status of traffic conditions on a section of road in
 *         a specified direction.
 *       
 * 
 * <p>Java class for TrafficStatusValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStatusValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficStatusValue" type="{http://datex2.eu/schema/3/roadTrafficData}_TrafficStatusEnum"/&gt;
 *         &lt;element name="_trafficStatusValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatusValue", propOrder = {
    "trafficStatusValue",
    "_TrafficStatusValueExtension"
})
public class TrafficStatusValue
    extends DataValue
{

    @XmlElement(required = true)
    protected _TrafficStatusEnum trafficStatusValue;
    @XmlElement(name = "_trafficStatusValueExtension")
    protected _ExtensionType _TrafficStatusValueExtension;

    /**
     * Gets the value of the trafficStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link _TrafficStatusEnum }
     *     
     */
    public _TrafficStatusEnum getTrafficStatusValue() {
        return trafficStatusValue;
    }

    /**
     * Sets the value of the trafficStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusValue(_TrafficStatusEnum value) {
        this.trafficStatusValue = value;
    }

    /**
     * Gets the value of the _TrafficStatusValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficStatusValueExtension() {
        return _TrafficStatusValueExtension;
    }

    /**
     * Sets the value of the _TrafficStatusValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficStatusValueExtension(_ExtensionType value) {
        this._TrafficStatusValueExtension = value;
    }

}
