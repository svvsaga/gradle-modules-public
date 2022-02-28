
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
@XmlType(name = "PressureValue", propOrder = {
    "pressure",
    "_PressureValueExtension"
})
public class PressureValue
    extends DataValue
{

    protected float pressure;
    @XmlElement(name = "_pressureValueExtension")
    protected _ExtensionType _PressureValueExtension;

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
     * Gets the value of the _PressureValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PressureValueExtension() {
        return _PressureValueExtension;
    }

    /**
     * Sets the value of the _PressureValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PressureValueExtension(_ExtensionType value) {
        this._PressureValueExtension = value;
    }

}
