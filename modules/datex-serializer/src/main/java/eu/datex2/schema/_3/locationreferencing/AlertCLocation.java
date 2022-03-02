
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Identification of a specific point, linear or area location in an ALERT-C location
 *         table.
 *       
 * 
 * <p>Java class for AlertCLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="specificLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLocationCode"/&gt;
 *         &lt;element name="_alertCLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocation", propOrder = {
    "alertCLocationName",
    "specificLocation",
    "alertCLocationExtension"
})
public class AlertCLocation {

    protected MultilingualString alertCLocationName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int specificLocation;
    @XmlElement(name = "_alertCLocationExtension")
    protected ExtensionType alertCLocationExtension;

    /**
     * Gets the value of the alertCLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCLocationName() {
        return alertCLocationName;
    }

    /**
     * Sets the value of the alertCLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCLocationName(MultilingualString value) {
        this.alertCLocationName = value;
    }

    /**
     * Gets the value of the specificLocation property.
     * 
     */
    public int getSpecificLocation() {
        return specificLocation;
    }

    /**
     * Sets the value of the specificLocation property.
     * 
     */
    public void setSpecificLocation(int value) {
        this.specificLocation = value;
    }

    /**
     * Gets the value of the alertCLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCLocationExtension() {
        return alertCLocationExtension;
    }

    /**
     * Sets the value of the alertCLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCLocationExtension(ExtensionType value) {
        this.alertCLocationExtension = value;
    }

}
