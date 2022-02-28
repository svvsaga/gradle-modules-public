
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startOfPeriod" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="endOfPeriod" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="periodName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="recurringTimePeriodOfDay" type="{http://datex2.eu/schema/2/2_0}TimePeriodOfDay" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurringDayWeekMonthPeriod" type="{http://datex2.eu/schema/2/2_0}DayWeekMonth" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodExtension" type="{http://datex2.eu/schema/2/2_0}_PeriodExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "startOfPeriod",
    "endOfPeriod",
    "periodName",
    "recurringTimePeriodOfDay",
    "recurringDayWeekMonthPeriod",
    "periodExtension"
})
public class Period {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOfPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfPeriod;
    protected MultilingualString periodName;
    protected List<TimePeriodOfDay> recurringTimePeriodOfDay;
    protected List<DayWeekMonth> recurringDayWeekMonthPeriod;
    protected _PeriodExtensionType periodExtension;

    /**
     * Gets the value of the startOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOfPeriod() {
        return startOfPeriod;
    }

    /**
     * Sets the value of the startOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOfPeriod(XMLGregorianCalendar value) {
        this.startOfPeriod = value;
    }

    /**
     * Gets the value of the endOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfPeriod() {
        return endOfPeriod;
    }

    /**
     * Sets the value of the endOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfPeriod(XMLGregorianCalendar value) {
        this.endOfPeriod = value;
    }

    /**
     * Gets the value of the periodName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPeriodName() {
        return periodName;
    }

    /**
     * Sets the value of the periodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPeriodName(MultilingualString value) {
        this.periodName = value;
    }

    /**
     * Gets the value of the recurringTimePeriodOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recurringTimePeriodOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringTimePeriodOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodOfDay }
     * 
     * 
     */
    public List<TimePeriodOfDay> getRecurringTimePeriodOfDay() {
        if (recurringTimePeriodOfDay == null) {
            recurringTimePeriodOfDay = new ArrayList<TimePeriodOfDay>();
        }
        return this.recurringTimePeriodOfDay;
    }

    /**
     * Gets the value of the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringDayWeekMonthPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayWeekMonth }
     * 
     * 
     */
    public List<DayWeekMonth> getRecurringDayWeekMonthPeriod() {
        if (recurringDayWeekMonthPeriod == null) {
            recurringDayWeekMonthPeriod = new ArrayList<DayWeekMonth>();
        }
        return this.recurringDayWeekMonthPeriod;
    }

    /**
     * Gets the value of the periodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _PeriodExtensionType }
     *     
     */
    public _PeriodExtensionType getPeriodExtension() {
        return periodExtension;
    }

    /**
     * Sets the value of the periodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PeriodExtensionType }
     *     
     */
    public void setPeriodExtension(_PeriodExtensionType value) {
        this.periodExtension = value;
    }

}
