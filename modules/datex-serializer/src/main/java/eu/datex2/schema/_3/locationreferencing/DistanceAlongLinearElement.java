
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Distance of a point along a linear element either measured from the start node or a
 *         defined referent on that linear element, where the start node is relative to the element definition
 *         rather than the direction of traffic flow.
 *       
 * 
 * <p>Java class for DistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_distanceAlongLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceAlongLinearElement", propOrder = {
    "_DistanceAlongLinearElementExtension"
})
@XmlSeeAlso({
    DistanceFromLinearElementReferent.class,
    DistanceFromLinearElementStart.class,
    PercentageDistanceAlongLinearElement.class
})
public abstract class DistanceAlongLinearElement {

    @XmlElement(name = "_distanceAlongLinearElementExtension")
    protected _ExtensionType _DistanceAlongLinearElementExtension;

    /**
     * Gets the value of the _DistanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DistanceAlongLinearElementExtension() {
        return _DistanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the _DistanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DistanceAlongLinearElementExtension(_ExtensionType value) {
        this._DistanceAlongLinearElementExtension = value;
    }

}
