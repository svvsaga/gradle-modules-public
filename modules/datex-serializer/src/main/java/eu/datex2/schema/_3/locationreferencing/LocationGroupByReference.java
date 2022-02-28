
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A group of (i.e. more than one) physically separate locations which have no specific order
 *         that are defined by reference to a predefined non ordered location group.
 *       
 * 
 * <p>Java class for LocationGroupByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationGroupByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationGroup"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationGroupReference" type="{http://datex2.eu/schema/3/locationReferencing}_PredefinedLocationGroupVersionedReference"/&gt;
 *         &lt;element name="_locationGroupByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroupByReference", propOrder = {
    "predefinedLocationGroupReference",
    "_LocationGroupByReferenceExtension"
})
public class LocationGroupByReference
    extends LocationGroup
{

    @XmlElement(required = true)
    protected _PredefinedLocationGroupVersionedReference predefinedLocationGroupReference;
    @XmlElement(name = "_locationGroupByReferenceExtension")
    protected _ExtensionType _LocationGroupByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedLocationGroupVersionedReference }
     *     
     */
    public _PredefinedLocationGroupVersionedReference getPredefinedLocationGroupReference() {
        return predefinedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedLocationGroupReference(_PredefinedLocationGroupVersionedReference value) {
        this.predefinedLocationGroupReference = value;
    }

    /**
     * Gets the value of the _LocationGroupByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationGroupByReferenceExtension() {
        return _LocationGroupByReferenceExtension;
    }

    /**
     * Sets the value of the _LocationGroupByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationGroupByReferenceExtension(_ExtensionType value) {
        this._LocationGroupByReferenceExtension = value;
    }

}
