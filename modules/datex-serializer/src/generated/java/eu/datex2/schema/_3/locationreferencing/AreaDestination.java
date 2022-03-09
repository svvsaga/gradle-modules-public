
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Destination"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaLocation" type="{http://datex2.eu/schema/3/locationReferencing}AreaLocation"/&gt;
 *         &lt;element name="_areaDestinationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDestination", propOrder = {
    "areaLocation",
    "_AreaDestinationExtension"
})
public class AreaDestination
    extends Destination
{

    @XmlElement(required = true)
    protected AreaLocation areaLocation;
    @XmlElement(name = "_areaDestinationExtension")
    protected _ExtensionType _AreaDestinationExtension;

    /**
     * Gets the value of the areaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getAreaLocation() {
        return areaLocation;
    }

    /**
     * Sets the value of the areaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setAreaLocation(AreaLocation value) {
        this.areaLocation = value;
    }

    /**
     * Gets the value of the _AreaDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AreaDestinationExtension() {
        return _AreaDestinationExtension;
    }

    /**
     * Sets the value of the _AreaDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AreaDestinationExtension(_ExtensionType value) {
        this._AreaDestinationExtension = value;
    }

}
