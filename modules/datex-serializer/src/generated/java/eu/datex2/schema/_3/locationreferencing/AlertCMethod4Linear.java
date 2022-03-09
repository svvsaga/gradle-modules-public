
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCMethod4Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}AlertCLinear"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/3/locationReferencing}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod4PrimaryPointLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCMethod4PrimaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod4SecondaryPointLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCMethod4SecondaryPointLocation"/&gt;
 *         &lt;element name="_alertCMethod4LinearExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4Linear", propOrder = {
    "alertCDirection",
    "alertCMethod4PrimaryPointLocation",
    "alertCMethod4SecondaryPointLocation",
    "_AlertCMethod4LinearExtension"
})
public class AlertCMethod4Linear
    extends AlertCLinear
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation;
    @XmlElement(name = "_alertCMethod4LinearExtension")
    protected _ExtensionType _AlertCMethod4LinearExtension;

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
     * Gets the value of the alertCMethod4PrimaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod4PrimaryPointLocation }
     *     
     */
    public AlertCMethod4PrimaryPointLocation getAlertCMethod4PrimaryPointLocation() {
        return alertCMethod4PrimaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod4PrimaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod4PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation value) {
        this.alertCMethod4PrimaryPointLocation = value;
    }

    /**
     * Gets the value of the alertCMethod4SecondaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod4SecondaryPointLocation }
     *     
     */
    public AlertCMethod4SecondaryPointLocation getAlertCMethod4SecondaryPointLocation() {
        return alertCMethod4SecondaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod4SecondaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod4SecondaryPointLocation }
     *     
     */
    public void setAlertCMethod4SecondaryPointLocation(AlertCMethod4SecondaryPointLocation value) {
        this.alertCMethod4SecondaryPointLocation = value;
    }

    /**
     * Gets the value of the _AlertCMethod4LinearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCMethod4LinearExtension() {
        return _AlertCMethod4LinearExtension;
    }

    /**
     * Sets the value of the _AlertCMethod4LinearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCMethod4LinearExtension(_ExtensionType value) {
        this._AlertCMethod4LinearExtension = value;
    }

}
