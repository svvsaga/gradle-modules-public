
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Itinerary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedItineraryReference" type="{http://datex2.eu/schema/3/locationReferencing}_PredefinedItineraryVersionedReference"/&gt;
 *         &lt;element name="_itineraryByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByReference", propOrder = {
    "predefinedItineraryReference",
    "_ItineraryByReferenceExtension"
})
public class ItineraryByReference
    extends Itinerary
{

    @XmlElement(required = true)
    protected _PredefinedItineraryVersionedReference predefinedItineraryReference;
    @XmlElement(name = "_itineraryByReferenceExtension")
    protected _ExtensionType _ItineraryByReferenceExtension;

    /**
     * Gets the value of the predefinedItineraryReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedItineraryVersionedReference }
     *     
     */
    public _PredefinedItineraryVersionedReference getPredefinedItineraryReference() {
        return predefinedItineraryReference;
    }

    /**
     * Sets the value of the predefinedItineraryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedItineraryVersionedReference }
     *     
     */
    public void setPredefinedItineraryReference(_PredefinedItineraryVersionedReference value) {
        this.predefinedItineraryReference = value;
    }

    /**
     * Gets the value of the _ItineraryByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ItineraryByReferenceExtension() {
        return _ItineraryByReferenceExtension;
    }

    /**
     * Sets the value of the _ItineraryByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ItineraryByReferenceExtension(_ExtensionType value) {
        this._ItineraryByReferenceExtension = value;
    }

}
