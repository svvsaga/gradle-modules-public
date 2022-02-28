
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="duration" type="{http://datex2.eu/schema/2/2_0}Seconds"/&gt;
 *         &lt;element name="durationValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurationValue", propOrder = {
    "duration",
    "durationValueExtension"
})
public class DurationValue
    extends DataValue
{

    protected float duration;
    protected _ExtensionType durationValueExtension;

    /**
     * Gets the value of the duration property.
     * 
     */
    public float getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(float value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getDurationValueExtension() {
        return durationValueExtension;
    }

    /**
     * Sets the value of the durationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setDurationValueExtension(_ExtensionType value) {
        this.durationValueExtension = value;
    }

}
