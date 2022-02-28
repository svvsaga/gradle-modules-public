
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCMethod4PrimaryPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4PrimaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2/2_0}AlertCLocation"/&gt;
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2/2_0}OffsetDistance"/&gt;
 *         &lt;element name="alertCMethod4PrimaryPointLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4PrimaryPointLocation", propOrder = {
    "alertCLocation",
    "offsetDistance",
    "alertCMethod4PrimaryPointLocationExtension"
})
public class AlertCMethod4PrimaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(required = true)
    protected OffsetDistance offsetDistance;
    protected _ExtensionType alertCMethod4PrimaryPointLocationExtension;

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
     * Gets the value of the alertCMethod4PrimaryPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getAlertCMethod4PrimaryPointLocationExtension() {
        return alertCMethod4PrimaryPointLocationExtension;
    }

    /**
     * Sets the value of the alertCMethod4PrimaryPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setAlertCMethod4PrimaryPointLocationExtension(_ExtensionType value) {
        this.alertCMethod4PrimaryPointLocationExtension = value;
    }

}
