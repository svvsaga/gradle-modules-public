
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KilogramsConcentrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KilogramsConcentrationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kilogramsConcentration" type="{http://datex2.eu/schema/3/common}ConcentrationKilogramsPerCubicMetre"/&gt;
 *         &lt;element name="_kilogramsConcentrationValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KilogramsConcentrationValue", propOrder = {
    "kilogramsConcentration",
    "_KilogramsConcentrationValueExtension"
})
public class KilogramsConcentrationValue
    extends DataValue
{

    protected float kilogramsConcentration;
    @XmlElement(name = "_kilogramsConcentrationValueExtension")
    protected _ExtensionType _KilogramsConcentrationValueExtension;

    /**
     * Gets the value of the kilogramsConcentration property.
     * 
     */
    public float getKilogramsConcentration() {
        return kilogramsConcentration;
    }

    /**
     * Sets the value of the kilogramsConcentration property.
     * 
     */
    public void setKilogramsConcentration(float value) {
        this.kilogramsConcentration = value;
    }

    /**
     * Gets the value of the _KilogramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_KilogramsConcentrationValueExtension() {
        return _KilogramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the _KilogramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_KilogramsConcentrationValueExtension(_ExtensionType value) {
        this._KilogramsConcentrationValueExtension = value;
    }

}
