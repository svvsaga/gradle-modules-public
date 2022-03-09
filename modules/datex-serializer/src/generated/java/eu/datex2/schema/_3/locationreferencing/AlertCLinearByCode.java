
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCLinearByCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLinearByCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}AlertCLinear"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/3/locationReferencing}AlertCDirection"/&gt;
 *         &lt;element name="locationCodeForLinearLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLocation"/&gt;
 *         &lt;element name="_alertCLinearByCodeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLinearByCode", propOrder = {
    "alertCDirection",
    "locationCodeForLinearLocation",
    "_AlertCLinearByCodeExtension"
})
public class AlertCLinearByCode
    extends AlertCLinear
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCLocation locationCodeForLinearLocation;
    @XmlElement(name = "_alertCLinearByCodeExtension")
    protected _ExtensionType _AlertCLinearByCodeExtension;

    /**
     * Gets the value of the alertCDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirection }
     *     
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Sets the value of the alertCDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirection }
     *     
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    /**
     * Gets the value of the locationCodeForLinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getLocationCodeForLinearLocation() {
        return locationCodeForLinearLocation;
    }

    /**
     * Sets the value of the locationCodeForLinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setLocationCodeForLinearLocation(AlertCLocation value) {
        this.locationCodeForLinearLocation = value;
    }

    /**
     * Gets the value of the _AlertCLinearByCodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCLinearByCodeExtension() {
        return _AlertCLinearByCodeExtension;
    }

    /**
     * Sets the value of the _AlertCLinearByCodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCLinearByCodeExtension(_ExtensionType value) {
        this._AlertCLinearByCodeExtension = value;
    }

}
