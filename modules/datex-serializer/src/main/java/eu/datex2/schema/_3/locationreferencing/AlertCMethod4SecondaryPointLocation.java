
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The point (called Secondary point) which is at the upstream end of a linear road section.
 *         The point is specified by a reference to a point in a pre-defined Alert-C location table plus a
 *         non-negative offset distance.
 *       
 * 
 * <p>Java class for AlertCMethod4SecondaryPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4SecondaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLocation"/&gt;
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/3/locationReferencing}OffsetDistance"/&gt;
 *         &lt;element name="_alertCMethod4SecondaryPointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4SecondaryPointLocation", propOrder = {
    "alertCLocation",
    "offsetDistance",
    "_AlertCMethod4SecondaryPointLocationExtension"
})
public class AlertCMethod4SecondaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(required = true)
    protected OffsetDistance offsetDistance;
    @XmlElement(name = "_alertCMethod4SecondaryPointLocationExtension")
    protected _ExtensionType _AlertCMethod4SecondaryPointLocationExtension;

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
     * Gets the value of the offsetDistance property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetDistance }
     *     
     */
    public OffsetDistance getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Sets the value of the offsetDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetDistance }
     *     
     */
    public void setOffsetDistance(OffsetDistance value) {
        this.offsetDistance = value;
    }

    /**
     * Gets the value of the _AlertCMethod4SecondaryPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCMethod4SecondaryPointLocationExtension() {
        return _AlertCMethod4SecondaryPointLocationExtension;
    }

    /**
     * Sets the value of the _AlertCMethod4SecondaryPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCMethod4SecondaryPointLocationExtension(_ExtensionType value) {
        this._AlertCMethod4SecondaryPointLocationExtension = value;
    }

}
