
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of atmospheric pressure.
 * 
 * <p>Java class for PressureValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PressureValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pressure" type="{http://datex2.eu/schema/3/common}Hectopascal"/&gt;
 *         &lt;element name="_pressureValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PressureValue", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "pressure",
    "pressureValueExtension"
})
public class PressureValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected float pressure;
    @XmlElement(name = "_pressureValueExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType pressureValueExtension;

    /**
     * Gets the value of the pressure property.
     * 
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     */
    public void setPressure(float value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the pressureValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPressureValueExtension() {
        return pressureValueExtension;
    }

    /**
     * Sets the value of the pressureValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPressureValueExtension(ExtensionType value) {
        this.pressureValueExtension = value;
    }

}
