
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "TrafficStatusValue", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "trafficStatusValue",
    "trafficStatusValueExtension"
})
public class TrafficStatusValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected TrafficStatusEnum trafficStatusValue;
    @XmlElement(name = "_trafficStatusValueExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType trafficStatusValueExtension;

    /**
     * Gets the value of the trafficStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusValue() {
        return trafficStatusValue;
    }

    /**
     * Sets the value of the trafficStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusValue(TrafficStatusEnum value) {
        this.trafficStatusValue = value;
    }

    /**
     * Gets the value of the trafficStatusValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficStatusValueExtension() {
        return trafficStatusValueExtension;
    }

    /**
     * Sets the value of the trafficStatusValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficStatusValueExtension(ExtensionType value) {
        this.trafficStatusValueExtension = value;
    }

}
