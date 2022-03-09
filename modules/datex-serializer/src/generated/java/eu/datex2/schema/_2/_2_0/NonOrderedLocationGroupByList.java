
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocationGroupByList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocationGroupByList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonOrderedLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationContainedInGroup" type="{http://datex2.eu/schema/2/2_0}Location" maxOccurs="unbounded"/&gt;
 *         &lt;element name="nonOrderedLocationGroupByListExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocationGroupByList", propOrder = {
    "locationContainedInGroup",
    "nonOrderedLocationGroupByListExtension"
})
public class NonOrderedLocationGroupByList
    extends NonOrderedLocations
{

    @XmlElement(required = true)
    protected List<Location> locationContainedInGroup;
    protected _ExtensionType nonOrderedLocationGroupByListExtension;

    /**
     * Gets the value of the locationContainedInGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocationContainedInGroup() {
        if (locationContainedInGroup == null) {
            locationContainedInGroup = new ArrayList<Location>();
        }
        return this.locationContainedInGroup;
    }

    /**
     * Gets the value of the nonOrderedLocationGroupByListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getNonOrderedLocationGroupByListExtension() {
        return nonOrderedLocationGroupByListExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationGroupByListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setNonOrderedLocationGroupByListExtension(_ExtensionType value) {
        this.nonOrderedLocationGroupByListExtension = value;
    }

}
