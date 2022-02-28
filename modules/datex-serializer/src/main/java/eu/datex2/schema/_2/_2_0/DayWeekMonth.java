
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayWeekMonth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayWeekMonth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableDay" type="{http://datex2.eu/schema/2/2_0}DayEnum" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="applicableWeek" type="{http://datex2.eu/schema/2/2_0}WeekOfMonthEnum" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="applicableMonth" type="{http://datex2.eu/schema/2/2_0}MonthOfYearEnum" maxOccurs="12" minOccurs="0"/&gt;
 *         &lt;element name="dayWeekMonthExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "applicableWeek",
    "applicableMonth",
    "dayWeekMonthExtension"
})
public class DayWeekMonth {

    @XmlSchemaType(name = "string")
    protected List<DayEnum> applicableDay;
    @XmlSchemaType(name = "string")
    protected List<WeekOfMonthEnum> applicableWeek;
    @XmlSchemaType(name = "string")
    protected List<MonthOfYearEnum> applicableMonth;
    protected _ExtensionType dayWeekMonthExtension;

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
     * Gets the value of the applicableWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekOfMonthEnum }
     * 
     * 
     */
    public List<WeekOfMonthEnum> getApplicableWeek() {
        if (applicableWeek == null) {
            applicableWeek = new ArrayList<WeekOfMonthEnum>();
        }
        return this.applicableWeek;
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
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getDayWeekMonthExtension() {
        return dayWeekMonthExtension;
    }

    /**
     * Sets the value of the dayWeekMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setDayWeekMonthExtension(_ExtensionType value) {
        this.dayWeekMonthExtension = value;
    }

}
