
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCLocationCodeTablePublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocationCodeTablePublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationCodeTable" type="{http://datex2.eu/schema/2/2_0}AlertCLocationCodeTable" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocationCodeTablePublication", propOrder = {
    "alertCLocationCodeTable"
})
public class AlertCLocationCodeTablePublication {

    @XmlElement(required = true)
    protected List<AlertCLocationCodeTable> alertCLocationCodeTable;

    /**
     * Gets the value of the alertCLocationCodeTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alertCLocationCodeTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertCLocationCodeTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCLocationCodeTable }
     * 
     * 
     */
    public List<AlertCLocationCodeTable> getAlertCLocationCodeTable() {
        if (alertCLocationCodeTable == null) {
            alertCLocationCodeTable = new ArrayList<AlertCLocationCodeTable>();
        }
        return this.alertCLocationCodeTable;
    }

}
