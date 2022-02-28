
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._TrafficTrendTypeEnum;
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
@XmlType(name = "TrafficStatus", propOrder = {
    "trafficTrendType",
    "trafficStatus",
    "_TrafficStatusExtension"
})
public class TrafficStatus
    extends BasicData
{

    protected _TrafficTrendTypeEnum trafficTrendType;
    protected TrafficStatusValue trafficStatus;
    @XmlElement(name = "_trafficStatusExtension")
    protected _ExtensionType _TrafficStatusExtension;

    /**
     * Gets the value of the trafficTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link _TrafficTrendTypeEnum }
     *     
     */
    public _TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Sets the value of the trafficTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(_TrafficTrendTypeEnum value) {
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
     * Gets the value of the _TrafficStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficStatusExtension() {
        return _TrafficStatusExtension;
    }

    /**
     * Sets the value of the _TrafficStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficStatusExtension(_ExtensionType value) {
        this._TrafficStatusExtension = value;
    }

}
