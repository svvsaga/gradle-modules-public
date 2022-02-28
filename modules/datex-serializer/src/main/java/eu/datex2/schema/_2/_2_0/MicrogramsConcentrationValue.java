
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MicrogramsConcentrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MicrogramsConcentrationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="microgramsConcentration" type="{http://datex2.eu/schema/2/2_0}ConcentrationMicrogramsPerCubicMetre"/&gt;
 *         &lt;element name="microgramsConcentrationValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "microgramsConcentrationValueExtension"
})
public class MicrogramsConcentrationValue
    extends DataValue
{

    protected float microgramsConcentration;
    protected _ExtensionType microgramsConcentrationValueExtension;

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
     * Gets the value of the microgramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getMicrogramsConcentrationValueExtension() {
        return microgramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the microgramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setMicrogramsConcentrationValueExtension(_ExtensionType value) {
        this.microgramsConcentrationValueExtension = value;
    }

}
