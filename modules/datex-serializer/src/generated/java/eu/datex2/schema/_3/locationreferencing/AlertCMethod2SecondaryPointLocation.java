
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCMethod2SecondaryPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2SecondaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLocation"/&gt;
 *         &lt;element name="_alertCMethod2SecondaryPointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2SecondaryPointLocation", propOrder = {
    "alertCLocation",
    "_AlertCMethod2SecondaryPointLocationExtension"
})
public class AlertCMethod2SecondaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(name = "_alertCMethod2SecondaryPointLocationExtension")
    protected _ExtensionType _AlertCMethod2SecondaryPointLocationExtension;

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
     * Gets the value of the _AlertCMethod2SecondaryPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCMethod2SecondaryPointLocationExtension() {
        return _AlertCMethod2SecondaryPointLocationExtension;
    }

    /**
     * Sets the value of the _AlertCMethod2SecondaryPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCMethod2SecondaryPointLocationExtension(_ExtensionType value) {
        this._AlertCMethod2SecondaryPointLocationExtension = value;
    }

}
