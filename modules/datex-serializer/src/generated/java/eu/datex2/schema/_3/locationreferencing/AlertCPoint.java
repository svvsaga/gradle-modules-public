
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationCountryCode" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="alertCLocationTableNumber" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="alertCLocationTableVersion" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_alertCPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCPoint", propOrder = {
    "alertCLocationCountryCode",
    "alertCLocationTableNumber",
    "alertCLocationTableVersion",
    "_AlertCPointExtension"
})
@XmlSeeAlso({
    AlertCMethod2Point.class,
    AlertCMethod4Point.class
})
public abstract class AlertCPoint {

    @XmlElement(required = true)
    protected String alertCLocationCountryCode;
    @XmlElement(required = true)
    protected String alertCLocationTableNumber;
    @XmlElement(required = true)
    protected String alertCLocationTableVersion;
    @XmlElement(name = "_alertCPointExtension")
    protected _ExtensionType _AlertCPointExtension;

    /**
     * Gets the value of the alertCLocationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCountryCode() {
        return alertCLocationCountryCode;
    }

    /**
     * Sets the value of the alertCLocationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCountryCode(String value) {
        this.alertCLocationCountryCode = value;
    }

    /**
     * Gets the value of the alertCLocationTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationTableNumber() {
        return alertCLocationTableNumber;
    }

    /**
     * Sets the value of the alertCLocationTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationTableNumber(String value) {
        this.alertCLocationTableNumber = value;
    }

    /**
     * Gets the value of the alertCLocationTableVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationTableVersion() {
        return alertCLocationTableVersion;
    }

    /**
     * Sets the value of the alertCLocationTableVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationTableVersion(String value) {
        this.alertCLocationTableVersion = value;
    }

    /**
     * Gets the value of the _AlertCPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCPointExtension() {
        return _AlertCPointExtension;
    }

    /**
     * Sets the value of the _AlertCPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCPointExtension(_ExtensionType value) {
        this._AlertCPointExtension = value;
    }

}
