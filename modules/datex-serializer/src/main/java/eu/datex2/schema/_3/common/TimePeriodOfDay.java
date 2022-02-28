
package eu.datex2.schema._3.common;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification of a continuous period of time within a 24 hour period.
 * 
 * <p>Java class for TimePeriodOfDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodOfDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/3/common}Time"/&gt;
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/3/common}Time"/&gt;
 *         &lt;element name="_timePeriodOfDayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodOfDay", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "_TimePeriodOfDayExtension"
})
public class TimePeriodOfDay {

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTimeOfPeriod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTimeOfPeriod;
    @XmlElement(name = "_timePeriodOfDayExtension")
    protected _ExtensionType _TimePeriodOfDayExtension;

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
     * Gets the value of the _TimePeriodOfDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TimePeriodOfDayExtension() {
        return _TimePeriodOfDayExtension;
    }

    /**
     * Sets the value of the _TimePeriodOfDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TimePeriodOfDayExtension(_ExtensionType value) {
        this._TimePeriodOfDayExtension = value;
    }

}
