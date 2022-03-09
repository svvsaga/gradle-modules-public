
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationGroupByList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationGroupByList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationGroup"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationContainedInGroup" type="{http://datex2.eu/schema/3/locationReferencing}Location" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element name="_locationGroupByListExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroupByList", propOrder = {
    "locationContainedInGroup",
    "_LocationGroupByListExtension"
})
public class LocationGroupByList
    extends LocationGroup
{

    @XmlElement(required = true)
    protected List<Location> locationContainedInGroup;
    @XmlElement(name = "_locationGroupByListExtension")
    protected _ExtensionType _LocationGroupByListExtension;

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
     * Gets the value of the _LocationGroupByListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationGroupByListExtension() {
        return _LocationGroupByListExtension;
    }

    /**
     * Sets the value of the _LocationGroupByListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationGroupByListExtension(_ExtensionType value) {
        this._LocationGroupByListExtension = value;
    }

}
