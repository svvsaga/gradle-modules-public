
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
@XmlType(name = "ItineraryByReference", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "predefinedItineraryReference",
    "itineraryByReferenceExtension"
})
public class ItineraryByReference
    extends Itinerary
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PredefinedItineraryVersionedReference predefinedItineraryReference;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType itineraryByReferenceExtension;

    /**
     * Gets the value of the predefinedItineraryReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedItineraryVersionedReference }
     *     
     */
    public PredefinedItineraryVersionedReference getPredefinedItineraryReference() {
        return predefinedItineraryReference;
    }

    /**
     * Sets the value of the predefinedItineraryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedItineraryVersionedReference }
     *     
     */
    public void setPredefinedItineraryReference(PredefinedItineraryVersionedReference value) {
        this.predefinedItineraryReference = value;
    }

    /**
     * Gets the value of the itineraryByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryByReferenceExtension() {
        return itineraryByReferenceExtension;
    }

    /**
     * Sets the value of the itineraryByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryByReferenceExtension(ExtensionType value) {
        this.itineraryByReferenceExtension = value;
    }

}
