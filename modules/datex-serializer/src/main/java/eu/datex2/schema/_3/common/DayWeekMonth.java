
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification of periods defined by the intersection of days or instances of them,
 *         calendar weeks and months.
 *       
 * 
 * <p>Java class for DayWeekMonth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayWeekMonth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableDay" type="{http://datex2.eu/schema/3/common}_DayEnum" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="applicableMonth" type="{http://datex2.eu/schema/3/common}_MonthOfYearEnum" maxOccurs="12" minOccurs="0"/&gt;
 *         &lt;element name="_dayWeekMonthExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayWeekMonth", propOrder = {
    "applicableDay",
    "applicableMonth",
    "dayWeekMonthExtension"
})
@XmlSeeAlso({
    CalendarWeekWithinMonth.class,
    InstanceOfDayWithinMonth.class
})
public class DayWeekMonth {

    protected List<DayEnum> applicableDay;
    protected List<MonthOfYearEnum> applicableMonth;
    @XmlElement(name = "_dayWeekMonthExtension")
    protected ExtensionType dayWeekMonthExtension;

    /**
     * Gets the value of the applicableDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayEnum }
     * 
     * 
     */
    public List<DayEnum> getApplicableDay() {
        if (applicableDay == null) {
            applicableDay = new ArrayList<DayEnum>();
        }
        return this.applicableDay;
    }

    /**
     * Gets the value of the applicableMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthOfYearEnum }
     * 
     * 
     */
    public List<MonthOfYearEnum> getApplicableMonth() {
        if (applicableMonth == null) {
            applicableMonth = new ArrayList<MonthOfYearEnum>();
        }
        return this.applicableMonth;
    }

    /**
     * Gets the value of the dayWeekMonthExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDayWeekMonthExtension() {
        return dayWeekMonthExtension;
    }

    /**
     * Sets the value of the dayWeekMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDayWeekMonthExtension(ExtensionType value) {
        this.dayWeekMonthExtension = value;
    }

}
