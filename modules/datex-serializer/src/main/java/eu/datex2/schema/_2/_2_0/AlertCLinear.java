
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCLinear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLinear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationCountryCode" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="alertCLocationTableNumber" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="alertCLocationTableVersion" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="alertCLinearExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLinear", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "alertCLocationCountryCode",
    "alertCLocationTableNumber",
    "alertCLocationTableVersion",
    "alertCLinearExtension"
})
@XmlSeeAlso({
    AlertCLinearByCode.class,
    AlertCMethod2Linear.class,
    AlertCMethod4Linear.class
})
public abstract class AlertCLinear {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String alertCLocationCountryCode;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String alertCLocationTableNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String alertCLocationTableVersion;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType alertCLinearExtension;

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
     * Gets the value of the alertCLinearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCLinearExtension() {
        return alertCLinearExtension;
    }

    /**
     * Sets the value of the alertCLinearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCLinearExtension(ExtensionType value) {
        this.alertCLinearExtension = value;
    }

}
