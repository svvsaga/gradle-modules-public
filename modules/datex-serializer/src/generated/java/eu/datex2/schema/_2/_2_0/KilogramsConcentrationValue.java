
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KilogramsConcentrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KilogramsConcentrationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kilogramsConcentration" type="{http://datex2.eu/schema/2/2_0}ConcentrationKilogramsPerCubicMetre"/&gt;
 *         &lt;element name="kilogramsConcentrationValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "kilogramsConcentrationValueExtension"
})
public class KilogramsConcentrationValue
    extends DataValue
{

    protected float kilogramsConcentration;
    protected _ExtensionType kilogramsConcentrationValueExtension;

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
     * Gets the value of the kilogramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getKilogramsConcentrationValueExtension() {
        return kilogramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the kilogramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setKilogramsConcentrationValueExtension(_ExtensionType value) {
        this.kilogramsConcentrationValueExtension = value;
    }

}
