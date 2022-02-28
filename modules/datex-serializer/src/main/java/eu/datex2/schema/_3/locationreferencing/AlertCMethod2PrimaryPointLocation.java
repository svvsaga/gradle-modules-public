
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The point (called Primary point) which is either a single point or at the downstream end
 *         of a linear road section. The point is specified by a reference to a point in a pre-defined ALERT-C
 *         location table.
 *       
 * 
 * <p>Java class for AlertCMethod2PrimaryPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2PrimaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLocation"/&gt;
 *         &lt;element name="_alertCMethod2PrimaryPointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2PrimaryPointLocation", propOrder = {
    "alertCLocation",
    "_AlertCMethod2PrimaryPointLocationExtension"
})
public class AlertCMethod2PrimaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(name = "_alertCMethod2PrimaryPointLocationExtension")
    protected _ExtensionType _AlertCMethod2PrimaryPointLocationExtension;

    /**
     * Gets the value of the alertCLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getAlertCLocation() {
        return alertCLocation;
    }

    /**
     * Sets the value of the alertCLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setAlertCLocation(AlertCLocation value) {
        this.alertCLocation = value;
    }

    /**
     * Gets the value of the _AlertCMethod2PrimaryPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCMethod2PrimaryPointLocationExtension() {
        return _AlertCMethod2PrimaryPointLocationExtension;
    }

    /**
     * Sets the value of the _AlertCMethod2PrimaryPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCMethod2PrimaryPointLocationExtension(_ExtensionType value) {
        this._AlertCMethod2PrimaryPointLocationExtension = value;
    }

}
