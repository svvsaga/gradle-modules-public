
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.TrafficTrendTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbnormalTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbnormalTraffic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abnormalTrafficType" type="{http://datex2.eu/schema/3/situation}_AbnormalTrafficTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVehiclesWaiting" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="queueLength" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="relativeTrafficFlow" type="{http://datex2.eu/schema/3/situation}_RelativeTrafficFlowEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficFlowCharacteristics" type="{http://datex2.eu/schema/3/situation}_TrafficFlowCharacteristicsEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/3/common}_TrafficTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_abnormalTrafficExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalTraffic", propOrder = {
    "abnormalTrafficType",
    "numberOfVehiclesWaiting",
    "queueLength",
    "relativeTrafficFlow",
    "trafficFlowCharacteristics",
    "trafficTrendType",
    "abnormalTrafficExtension"
})
public class AbnormalTraffic
    extends TrafficElement
{

    protected AbnormalTrafficTypeEnum abnormalTrafficType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVehiclesWaiting;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger queueLength;
    protected RelativeTrafficFlowEnum relativeTrafficFlow;
    protected TrafficFlowCharacteristicsEnum trafficFlowCharacteristics;
    protected TrafficTrendTypeEnum trafficTrendType;
    @XmlElement(name = "_abnormalTrafficExtension")
    protected ExtensionType abnormalTrafficExtension;

    /**
     * Gets the value of the abnormalTrafficType property.
     * 
     * @return
     *     possible object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Sets the value of the abnormalTrafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficType = value;
    }

    /**
     * Gets the value of the numberOfVehiclesWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehiclesWaiting() {
        return numberOfVehiclesWaiting;
    }

    /**
     * Sets the value of the numberOfVehiclesWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehiclesWaiting(BigInteger value) {
        this.numberOfVehiclesWaiting = value;
    }

    /**
     * Gets the value of the queueLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueLength() {
        return queueLength;
    }

    /**
     * Sets the value of the queueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueLength(BigInteger value) {
        this.queueLength = value;
    }

    /**
     * Gets the value of the relativeTrafficFlow property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public RelativeTrafficFlowEnum getRelativeTrafficFlow() {
        return relativeTrafficFlow;
    }

    /**
     * Sets the value of the relativeTrafficFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public void setRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        this.relativeTrafficFlow = value;
    }

    /**
     * Gets the value of the trafficFlowCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficFlowCharacteristicsEnum }
     *     
     */
    public TrafficFlowCharacteristicsEnum getTrafficFlowCharacteristics() {
        return trafficFlowCharacteristics;
    }

    /**
     * Sets the value of the trafficFlowCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficFlowCharacteristicsEnum }
     *     
     */
    public void setTrafficFlowCharacteristics(TrafficFlowCharacteristicsEnum value) {
        this.trafficFlowCharacteristics = value;
    }

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
     * Gets the value of the abnormalTrafficExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAbnormalTrafficExtension() {
        return abnormalTrafficExtension;
    }

    /**
     * Sets the value of the abnormalTrafficExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAbnormalTrafficExtension(ExtensionType value) {
        this.abnormalTrafficExtension = value;
    }

}
