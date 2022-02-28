
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Deliberate human action of either a public disorder nature or of a situation alert type
 *         which could disrupt traffic.
 *       
 * 
 * <p>Java class for DisturbanceActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisturbanceActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disturbanceActivityType" type="{http://datex2.eu/schema/3/situation}_DisturbanceActivityTypeEnum"/&gt;
 *         &lt;element name="_disturbanceActivityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisturbanceActivity", propOrder = {
    "disturbanceActivityType",
    "_DisturbanceActivityExtension"
})
public class DisturbanceActivity
    extends Activity
{

    @XmlElement(required = true)
    protected _DisturbanceActivityTypeEnum disturbanceActivityType;
    @XmlElement(name = "_disturbanceActivityExtension")
    protected _ExtensionType _DisturbanceActivityExtension;

    /**
     * Gets the value of the disturbanceActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link _DisturbanceActivityTypeEnum }
     *     
     */
    public _DisturbanceActivityTypeEnum getDisturbanceActivityType() {
        return disturbanceActivityType;
    }

    /**
     * Sets the value of the disturbanceActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityType(_DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityType = value;
    }

    /**
     * Gets the value of the _DisturbanceActivityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DisturbanceActivityExtension() {
        return _DisturbanceActivityExtension;
    }

    /**
     * Sets the value of the _DisturbanceActivityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DisturbanceActivityExtension(_ExtensionType value) {
        this._DisturbanceActivityExtension = value;
    }

}
