
package eu.datex2.schema._2._2_0;

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
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Itinerary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedItineraryReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedItineraryVersionedReference"/&gt;
 *         &lt;element name="itineraryByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "itineraryByReferenceExtension"
})
public class ItineraryByReference
    extends Itinerary
{

    @XmlElement(required = true)
    protected _PredefinedItineraryVersionedReference predefinedItineraryReference;
    protected _ExtensionType itineraryByReferenceExtension;

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
     * Gets the value of the itineraryByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getItineraryByReferenceExtension() {
        return itineraryByReferenceExtension;
    }

    /**
     * Sets the value of the itineraryByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setItineraryByReferenceExtension(_ExtensionType value) {
        this.itineraryByReferenceExtension = value;
    }

}
