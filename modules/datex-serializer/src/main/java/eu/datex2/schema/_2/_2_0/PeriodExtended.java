
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodExtended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringSpecialDay" type="{http://datex2.eu/schema/2/2_0}SpecialDay" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodExtended", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "recurringSpecialDay"
})
public class PeriodExtended {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<SpecialDay> recurringSpecialDay;

    /**
     * Gets the value of the recurringSpecialDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recurringSpecialDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringSpecialDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialDay }
     * 
     * 
     */
    public List<SpecialDay> getRecurringSpecialDay() {
        if (recurringSpecialDay == null) {
            recurringSpecialDay = new ArrayList<SpecialDay>();
        }
        return this.recurringSpecialDay;
    }

}
