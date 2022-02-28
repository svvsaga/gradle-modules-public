
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of speed.
 * 
 * <p>Java class for SpeedValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speed" type="{http://datex2.eu/schema/3/common}KilometresPerHour"/&gt;
 *         &lt;element name="_speedValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedValue", propOrder = {
    "speed",
    "_SpeedValueExtension"
})
public class SpeedValue
    extends DataValue
{

    protected float speed;
    @XmlElement(name = "_speedValueExtension")
    protected _ExtensionType _SpeedValueExtension;

    /**
     * Gets the value of the speed property.
     * 
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the _SpeedValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SpeedValueExtension() {
        return _SpeedValueExtension;
    }

    /**
     * Sets the value of the _SpeedValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SpeedValueExtension(_ExtensionType value) {
        this._SpeedValueExtension = value;
    }

}
