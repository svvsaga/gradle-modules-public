
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.PercentageValue;
import eu.datex2.schema._3.common.VehicleFlowValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Averaged measurements or calculations of traffic flow rates.
 * 
 * <p>Java class for TrafficFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleFlow" type="{http://datex2.eu/schema/3/roadTrafficData}AxleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="pcuFlow" type="{http://datex2.eu/schema/3/roadTrafficData}PcuFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="percentageLongVehicles" type="{http://datex2.eu/schema/3/common}PercentageValue" minOccurs="0"/&gt;
 *         &lt;element name="vehicleFlow" type="{http://datex2.eu/schema/3/common}VehicleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="normallyExpectedFlow" type="{http://datex2.eu/schema/3/common}VehicleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="annualAverageDailyTraffic" type="{http://datex2.eu/schema/3/roadTrafficData}DailyTrafficFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="monthlyAverageDailyTraffic" type="{http://datex2.eu/schema/3/roadTrafficData}DailyTrafficFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="axleCharacteristics" type="{http://datex2.eu/schema/3/roadTrafficData}AxleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="_trafficFlowExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFlow", propOrder = {
    "axleFlow",
    "pcuFlow",
    "percentageLongVehicles",
    "vehicleFlow",
    "normallyExpectedFlow",
    "annualAverageDailyTraffic",
    "monthlyAverageDailyTraffic",
    "axleCharacteristics",
    "trafficFlowExtension"
})
public class TrafficFlow
    extends TrafficData
{

    protected AxleFlowValue axleFlow;
    protected PcuFlowValue pcuFlow;
    protected PercentageValue percentageLongVehicles;
    protected VehicleFlowValue vehicleFlow;
    protected VehicleFlowValue normallyExpectedFlow;
    protected DailyTrafficFlowValue annualAverageDailyTraffic;
    protected DailyTrafficFlowValue monthlyAverageDailyTraffic;
    protected AxleCharacteristics axleCharacteristics;
    @XmlElement(name = "_trafficFlowExtension")
    protected ExtensionType trafficFlowExtension;

    /**
     * Gets the value of the axleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link AxleFlowValue }
     *     
     */
    public AxleFlowValue getAxleFlow() {
        return axleFlow;
    }

    /**
     * Sets the value of the axleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxleFlowValue }
     *     
     */
    public void setAxleFlow(AxleFlowValue value) {
        this.axleFlow = value;
    }

    /**
     * Gets the value of the pcuFlow property.
     * 
     * @return
     *     possible object is
     *     {@link PcuFlowValue }
     *     
     */
    public PcuFlowValue getPcuFlow() {
        return pcuFlow;
    }

    /**
     * Sets the value of the pcuFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcuFlowValue }
     *     
     */
    public void setPcuFlow(PcuFlowValue value) {
        this.pcuFlow = value;
    }

    /**
     * Gets the value of the percentageLongVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getPercentageLongVehicles() {
        return percentageLongVehicles;
    }

    /**
     * Sets the value of the percentageLongVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setPercentageLongVehicles(PercentageValue value) {
        this.percentageLongVehicles = value;
    }

    /**
     * Gets the value of the vehicleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFlowValue }
     *     
     */
    public VehicleFlowValue getVehicleFlow() {
        return vehicleFlow;
    }

    /**
     * Sets the value of the vehicleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFlowValue }
     *     
     */
    public void setVehicleFlow(VehicleFlowValue value) {
        this.vehicleFlow = value;
    }

    /**
     * Gets the value of the normallyExpectedFlow property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFlowValue }
     *     
     */
    public VehicleFlowValue getNormallyExpectedFlow() {
        return normallyExpectedFlow;
    }

    /**
     * Sets the value of the normallyExpectedFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFlowValue }
     *     
     */
    public void setNormallyExpectedFlow(VehicleFlowValue value) {
        this.normallyExpectedFlow = value;
    }

    /**
     * Gets the value of the annualAverageDailyTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTrafficFlowValue }
     *     
     */
    public DailyTrafficFlowValue getAnnualAverageDailyTraffic() {
        return annualAverageDailyTraffic;
    }

    /**
     * Sets the value of the annualAverageDailyTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTrafficFlowValue }
     *     
     */
    public void setAnnualAverageDailyTraffic(DailyTrafficFlowValue value) {
        this.annualAverageDailyTraffic = value;
    }

    /**
     * Gets the value of the monthlyAverageDailyTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTrafficFlowValue }
     *     
     */
    public DailyTrafficFlowValue getMonthlyAverageDailyTraffic() {
        return monthlyAverageDailyTraffic;
    }

    /**
     * Sets the value of the monthlyAverageDailyTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTrafficFlowValue }
     *     
     */
    public void setMonthlyAverageDailyTraffic(DailyTrafficFlowValue value) {
        this.monthlyAverageDailyTraffic = value;
    }

    /**
     * Gets the value of the axleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link AxleCharacteristics }
     *     
     */
    public AxleCharacteristics getAxleCharacteristics() {
        return axleCharacteristics;
    }

    /**
     * Sets the value of the axleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxleCharacteristics }
     *     
     */
    public void setAxleCharacteristics(AxleCharacteristics value) {
        this.axleCharacteristics = value;
    }

    /**
     * Gets the value of the trafficFlowExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficFlowExtension() {
        return trafficFlowExtension;
    }

    /**
     * Sets the value of the trafficFlowExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficFlowExtension(ExtensionType value) {
        this.trafficFlowExtension = value;
    }

}
