
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A linear section along a road between two points, primary and secondary, which are
 *         pre-defined in an ALERT-C location table. Direction is FROM the secondary point TO the primary point,
 *         i.e. the primary point is downstream of the secondary point.
 *       
 * 
 * <p>Java class for AlertCMethod2Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}AlertCLinear"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/3/locationReferencing}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCMethod2PrimaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod2SecondaryPointLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCMethod2SecondaryPointLocation"/&gt;
 *         &lt;element name="_alertCMethod2LinearExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Linear", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "alertCMethod2SecondaryPointLocation",
    "_AlertCMethod2LinearExtension"
})
public class AlertCMethod2Linear
    extends AlertCLinear
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation;
    @XmlElement(name = "_alertCMethod2LinearExtension")
    protected _ExtensionType _AlertCMethod2LinearExtension;

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
     * Gets the value of the alertCMethod2PrimaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
        return alertCMethod2PrimaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod2PrimaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        this.alertCMethod2PrimaryPointLocation = value;
    }

    /**
     * Gets the value of the alertCMethod2SecondaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2SecondaryPointLocation }
     *     
     */
    public AlertCMethod2SecondaryPointLocation getAlertCMethod2SecondaryPointLocation() {
        return alertCMethod2SecondaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod2SecondaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2SecondaryPointLocation }
     *     
     */
    public void setAlertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation value) {
        this.alertCMethod2SecondaryPointLocation = value;
    }

    /**
     * Gets the value of the _AlertCMethod2LinearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCMethod2LinearExtension() {
        return _AlertCMethod2LinearExtension;
    }

    /**
     * Sets the value of the _AlertCMethod2LinearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCMethod2LinearExtension(_ExtensionType value) {
        this._AlertCMethod2LinearExtension = value;
    }

}
