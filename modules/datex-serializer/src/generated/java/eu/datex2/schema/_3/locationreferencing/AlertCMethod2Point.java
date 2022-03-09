
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCMethod2Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}AlertCPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/3/locationReferencing}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCMethod2PrimaryPointLocation"/&gt;
 *         &lt;element name="_alertCMethod2PointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Point", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "_AlertCMethod2PointExtension"
})
public class AlertCMethod2Point
    extends AlertCPoint
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    @XmlElement(name = "_alertCMethod2PointExtension")
    protected _ExtensionType _AlertCMethod2PointExtension;

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
     * Gets the value of the _AlertCMethod2PointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCMethod2PointExtension() {
        return _AlertCMethod2PointExtension;
    }

    /**
     * Sets the value of the _AlertCMethod2PointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCMethod2PointExtension(_ExtensionType value) {
        this._AlertCMethod2PointExtension = value;
    }

}
