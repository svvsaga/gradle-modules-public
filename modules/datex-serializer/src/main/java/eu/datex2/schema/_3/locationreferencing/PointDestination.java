
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The specification of the destination of a defined route or itinerary which is a point.
 *       
 * 
 * <p>Java class for PointDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Destination"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointLocation" type="{http://datex2.eu/schema/3/locationReferencing}PointLocation"/&gt;
 *         &lt;element name="_pointDestinationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointDestination", propOrder = {
    "pointLocation",
    "_PointDestinationExtension"
})
public class PointDestination
    extends Destination
{

    @XmlElement(required = true)
    protected PointLocation pointLocation;
    @XmlElement(name = "_pointDestinationExtension")
    protected _ExtensionType _PointDestinationExtension;

    /**
     * Gets the value of the pointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getPointLocation() {
        return pointLocation;
    }

    /**
     * Sets the value of the pointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setPointLocation(PointLocation value) {
        this.pointLocation = value;
    }

    /**
     * Gets the value of the _PointDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PointDestinationExtension() {
        return _PointDestinationExtension;
    }

    /**
     * Sets the value of the _PointDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PointDestinationExtension(_ExtensionType value) {
        this._PointDestinationExtension = value;
    }

}
