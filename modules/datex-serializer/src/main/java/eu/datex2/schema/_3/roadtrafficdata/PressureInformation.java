
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Pressure;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measurements of atmospheric pressure.
 * 
 * <p>Java class for PressureInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PressureInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pressure" type="{http://datex2.eu/schema/3/common}Pressure"/&gt;
 *         &lt;element name="_pressureInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PressureInformation", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "pressure",
    "pressureInformationExtension"
})
public class PressureInformation
    extends WeatherData
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected Pressure pressure;
    @XmlElement(name = "_pressureInformationExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType pressureInformationExtension;

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link Pressure }
     *     
     */
    public Pressure getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pressure }
     *     
     */
    public void setPressure(Pressure value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the pressureInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPressureInformationExtension() {
        return pressureInformationExtension;
    }

    /**
     * Sets the value of the pressureInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPressureInformationExtension(ExtensionType value) {
        this.pressureInformationExtension = value;
    }

}
