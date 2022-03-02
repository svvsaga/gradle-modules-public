
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePeriodByHour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodByHour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TimePeriodOfDay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/2/2_0}Time"/&gt;
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/2/2_0}Time"/&gt;
 *         &lt;element name="timePeriodByHourExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodByHour", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "timePeriodByHourExtension"
})
public class TimePeriodByHour
    extends TimePeriodOfDay
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTimeOfPeriod;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTimeOfPeriod;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType timePeriodByHourExtension;

    /**
     * Gets the value of the startTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Sets the value of the startTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeOfPeriod(XMLGregorianCalendar value) {
        this.startTimeOfPeriod = value;
    }

    /**
     * Gets the value of the endTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Sets the value of the endTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeOfPeriod(XMLGregorianCalendar value) {
        this.endTimeOfPeriod = value;
    }

    /**
     * Gets the value of the timePeriodByHourExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodByHourExtension() {
        return timePeriodByHourExtension;
    }

    /**
     * Sets the value of the timePeriodByHourExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodByHourExtension(ExtensionType value) {
        this.timePeriodByHourExtension = value;
    }

}
