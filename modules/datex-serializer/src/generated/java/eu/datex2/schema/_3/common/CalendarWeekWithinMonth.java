
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarWeekWithinMonth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarWeekWithinMonth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DayWeekMonth"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableCalenderWeekWithinMonth" type="{http://datex2.eu/schema/3/common}_CalendarWeekWithinMonthEnum" maxOccurs="6"/&gt;
 *         &lt;element name="_calendarWeekWithinMonthExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarWeekWithinMonth", propOrder = {
    "applicableCalenderWeekWithinMonth",
    "calendarWeekWithinMonthExtension"
})
public class CalendarWeekWithinMonth
    extends DayWeekMonth
{

    @XmlElement(required = true)
    protected List<CalendarWeekWithinMonthEnum> applicableCalenderWeekWithinMonth;
    @XmlElement(name = "_calendarWeekWithinMonthExtension")
    protected ExtensionType calendarWeekWithinMonthExtension;

    /**
     * Gets the value of the applicableCalenderWeekWithinMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableCalenderWeekWithinMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableCalenderWeekWithinMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarWeekWithinMonthEnum }
     * 
     * 
     */
    public List<CalendarWeekWithinMonthEnum> getApplicableCalenderWeekWithinMonth() {
        if (applicableCalenderWeekWithinMonth == null) {
            applicableCalenderWeekWithinMonth = new ArrayList<CalendarWeekWithinMonthEnum>();
        }
        return this.applicableCalenderWeekWithinMonth;
    }

    /**
     * Gets the value of the calendarWeekWithinMonthExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCalendarWeekWithinMonthExtension() {
        return calendarWeekWithinMonthExtension;
    }

    /**
     * Sets the value of the calendarWeekWithinMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCalendarWeekWithinMonthExtension(ExtensionType value) {
        this.calendarWeekWithinMonthExtension = value;
    }

}
