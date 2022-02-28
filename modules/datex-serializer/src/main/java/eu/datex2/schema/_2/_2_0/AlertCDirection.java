
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCDirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirectionCoded" type="{http://datex2.eu/schema/2/2_0}AlertCDirectionEnum"/&gt;
 *         &lt;element name="alertCDirectionNamed" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="alertCDirectionSense" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="alertCDirectionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCDirection", propOrder = {
    "alertCDirectionCoded",
    "alertCDirectionNamed",
    "alertCDirectionSense",
    "alertCDirectionExtension"
})
public class AlertCDirection {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AlertCDirectionEnum alertCDirectionCoded;
    protected MultilingualString alertCDirectionNamed;
    protected Boolean alertCDirectionSense;
    protected _ExtensionType alertCDirectionExtension;

    /**
     * Gets the value of the alertCDirectionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public AlertCDirectionEnum getAlertCDirectionCoded() {
        return alertCDirectionCoded;
    }

    /**
     * Sets the value of the alertCDirectionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public void setAlertCDirectionCoded(AlertCDirectionEnum value) {
        this.alertCDirectionCoded = value;
    }

    /**
     * Gets the value of the alertCDirectionNamed property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCDirectionNamed() {
        return alertCDirectionNamed;
    }

    /**
     * Sets the value of the alertCDirectionNamed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCDirectionNamed(MultilingualString value) {
        this.alertCDirectionNamed = value;
    }

    /**
     * Gets the value of the alertCDirectionSense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertCDirectionSense() {
        return alertCDirectionSense;
    }

    /**
     * Sets the value of the alertCDirectionSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertCDirectionSense(Boolean value) {
        this.alertCDirectionSense = value;
    }

    /**
     * Gets the value of the alertCDirectionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getAlertCDirectionExtension() {
        return alertCDirectionExtension;
    }

    /**
     * Sets the value of the alertCDirectionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setAlertCDirectionExtension(_ExtensionType value) {
        this.alertCDirectionExtension = value;
    }

}
