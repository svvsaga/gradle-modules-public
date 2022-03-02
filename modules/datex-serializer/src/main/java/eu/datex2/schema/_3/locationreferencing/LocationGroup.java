
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Multiple (i.e. more than one) physically separate locations which have no specific
 *         order.
 *       
 * 
 * <p>Java class for LocationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_locationGroupExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroup", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "locationGroupExtension"
})
@XmlSeeAlso({
    LocationGroupByList.class,
    LocationGroupByReference.class
})
public abstract class LocationGroup
    extends LocationReference
{

    @XmlElement(name = "_locationGroupExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType locationGroupExtension;

    /**
     * Gets the value of the locationGroupExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationGroupExtension() {
        return locationGroupExtension;
    }

    /**
     * Sets the value of the locationGroupExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationGroupExtension(ExtensionType value) {
        this.locationGroupExtension = value;
    }

}
