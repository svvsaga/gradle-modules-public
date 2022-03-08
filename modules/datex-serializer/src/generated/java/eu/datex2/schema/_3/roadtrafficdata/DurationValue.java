
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="duration" type="{http://datex2.eu/schema/3/common}Seconds"/&gt;
 *         &lt;element name="_durationValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    @XmlElement(name = "_durationValueExtension")
    protected ExtensionType durationValueExtension;

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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDurationValueExtension() {
        return durationValueExtension;
    }

    /**
     * Sets the value of the durationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDurationValueExtension(ExtensionType value) {
        this.durationValueExtension = value;
    }

}
