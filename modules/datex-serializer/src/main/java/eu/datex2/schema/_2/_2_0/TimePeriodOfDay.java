
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePeriodOfDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodOfDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timePeriodOfDayExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodOfDay", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "timePeriodOfDayExtension"
})
@XmlSeeAlso({
    TimePeriodByHour.class
})
public abstract class TimePeriodOfDay {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType timePeriodOfDayExtension;

    /**
     * Gets the value of the timePeriodOfDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodOfDayExtension() {
        return timePeriodOfDayExtension;
    }

    /**
     * Sets the value of the timePeriodOfDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodOfDayExtension(ExtensionType value) {
        this.timePeriodOfDayExtension = value;
    }

}
