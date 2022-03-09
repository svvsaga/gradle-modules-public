
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/3/locationReferencing}_PredefinedLocationVersionedReference"/&gt;
 *         &lt;element name="_locationByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", propOrder = {
    "predefinedLocationReference",
    "_LocationByReferenceExtension"
})
public class LocationByReference
    extends Location
{

    @XmlElement(required = true)
    protected _PredefinedLocationVersionedReference predefinedLocationReference;
    @XmlElement(name = "_locationByReferenceExtension")
    protected _ExtensionType _LocationByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedLocationVersionedReference }
     *     
     */
    public _PredefinedLocationVersionedReference getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Sets the value of the predefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedLocationVersionedReference }
     *     
     */
    public void setPredefinedLocationReference(_PredefinedLocationVersionedReference value) {
        this.predefinedLocationReference = value;
    }

    /**
     * Gets the value of the _LocationByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationByReferenceExtension() {
        return _LocationByReferenceExtension;
    }

    /**
     * Sets the value of the _LocationByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationByReferenceExtension(_ExtensionType value) {
        this._LocationByReferenceExtension = value;
    }

}
