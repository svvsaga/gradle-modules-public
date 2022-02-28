
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification of periods defined by the instance of a specific weekday within a month
 *         (e.g. 3rd Tuesday in May)
 *       
 * 
 * <p>Java class for InstanceOfDayWithinMonth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceOfDayWithinMonth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DayWeekMonth"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableInstanceOfDayWithinMonth" type="{http://datex2.eu/schema/3/common}_InstanceOfDayEnum" maxOccurs="5"/&gt;
 *         &lt;element name="_instanceOfDayWithinMonthExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceOfDayWithinMonth", propOrder = {
    "applicableInstanceOfDayWithinMonth",
    "_InstanceOfDayWithinMonthExtension"
})
public class InstanceOfDayWithinMonth
    extends DayWeekMonth
{

    @XmlElement(required = true)
    protected List<_InstanceOfDayEnum> applicableInstanceOfDayWithinMonth;
    @XmlElement(name = "_instanceOfDayWithinMonthExtension")
    protected _ExtensionType _InstanceOfDayWithinMonthExtension;

    /**
     * Gets the value of the applicableInstanceOfDayWithinMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableInstanceOfDayWithinMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableInstanceOfDayWithinMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _InstanceOfDayEnum }
     * 
     * 
     */
    public List<_InstanceOfDayEnum> getApplicableInstanceOfDayWithinMonth() {
        if (applicableInstanceOfDayWithinMonth == null) {
            applicableInstanceOfDayWithinMonth = new ArrayList<_InstanceOfDayEnum>();
        }
        return this.applicableInstanceOfDayWithinMonth;
    }

    /**
     * Gets the value of the _InstanceOfDayWithinMonthExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InstanceOfDayWithinMonthExtension() {
        return _InstanceOfDayWithinMonthExtension;
    }

    /**
     * Sets the value of the _InstanceOfDayWithinMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InstanceOfDayWithinMonthExtension(_ExtensionType value) {
        this._InstanceOfDayWithinMonthExtension = value;
    }

}
