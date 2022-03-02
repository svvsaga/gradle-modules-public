
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.TrafficTrendTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The status of traffic conditions on a specific section or at a specific point on the road
 *         network.
 *       
 * 
 * <p>Java class for TrafficStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/3/common}_TrafficTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficStatus" type="{http://datex2.eu/schema/3/roadTrafficData}TrafficStatusValue" minOccurs="0"/&gt;
 *         &lt;element name="_trafficStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatus", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "trafficTrendType",
    "trafficStatus",
    "trafficStatusExtension"
})
public class TrafficStatus
    extends BasicData
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected TrafficTrendTypeEnum trafficTrendType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected TrafficStatusValue trafficStatus;
    @XmlElement(name = "_trafficStatusExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType trafficStatusExtension;

    /**
     * Gets the value of the trafficTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Sets the value of the trafficTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    /**
     * Gets the value of the trafficStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusValue }
     *     
     */
    public TrafficStatusValue getTrafficStatus() {
        return trafficStatus;
    }

    /**
     * Sets the value of the trafficStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusValue }
     *     
     */
    public void setTrafficStatus(TrafficStatusValue value) {
        this.trafficStatus = value;
    }

    /**
     * Gets the value of the trafficStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficStatusExtension() {
        return trafficStatusExtension;
    }

    /**
     * Sets the value of the trafficStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficStatusExtension(ExtensionType value) {
        this.trafficStatusExtension = value;
    }

}
