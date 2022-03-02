
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Humidity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Humidity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relativeHumidity" type="{http://datex2.eu/schema/2/2_0}PercentageValue"/&gt;
 *         &lt;element name="humidityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Humidity", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "relativeHumidity",
    "humidityExtension"
})
public class Humidity {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PercentageValue relativeHumidity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType humidityExtension;

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setRelativeHumidity(PercentageValue value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the humidityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHumidityExtension() {
        return humidityExtension;
    }

    /**
     * Sets the value of the humidityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHumidityExtension(ExtensionType value) {
        this.humidityExtension = value;
    }

}
