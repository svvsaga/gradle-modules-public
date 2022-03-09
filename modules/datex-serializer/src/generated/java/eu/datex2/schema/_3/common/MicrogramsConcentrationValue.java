
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MicrogramsConcentrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MicrogramsConcentrationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="microgramsConcentration" type="{http://datex2.eu/schema/3/common}ConcentrationMicrogramsPerCubicMetre"/&gt;
 *         &lt;element name="_microgramsConcentrationValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrogramsConcentrationValue", propOrder = {
    "microgramsConcentration",
    "_MicrogramsConcentrationValueExtension"
})
public class MicrogramsConcentrationValue
    extends DataValue
{

    protected float microgramsConcentration;
    @XmlElement(name = "_microgramsConcentrationValueExtension")
    protected _ExtensionType _MicrogramsConcentrationValueExtension;

    /**
     * Gets the value of the microgramsConcentration property.
     * 
     */
    public float getMicrogramsConcentration() {
        return microgramsConcentration;
    }

    /**
     * Sets the value of the microgramsConcentration property.
     * 
     */
    public void setMicrogramsConcentration(float value) {
        this.microgramsConcentration = value;
    }

    /**
     * Gets the value of the _MicrogramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MicrogramsConcentrationValueExtension() {
        return _MicrogramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the _MicrogramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MicrogramsConcentrationValueExtension(_ExtensionType value) {
        this._MicrogramsConcentrationValueExtension = value;
    }

}
