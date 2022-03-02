
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The direction of traffic flow along the road to which the information relates.
 *       
 * 
 * <p>Java class for AlertCDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCDirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirectionCoded" type="{http://datex2.eu/schema/3/locationReferencing}_AlertCDirectionEnum"/&gt;
 *         &lt;element name="alertCDirectionNamed" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="alertCAffectedDirection" type="{http://datex2.eu/schema/3/locationReferencing}_LinearDirectionEnum"/&gt;
 *         &lt;element name="_alertCDirectionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "alertCAffectedDirection",
    "alertCDirectionExtension"
})
public class AlertCDirection {

    @XmlElement(required = true)
    protected AlertCDirectionEnum alertCDirectionCoded;
    protected MultilingualString alertCDirectionNamed;
    @XmlElement(required = true)
    protected LinearDirectionEnum alertCAffectedDirection;
    @XmlElement(name = "_alertCDirectionExtension")
    protected ExtensionType alertCDirectionExtension;

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
     * Gets the value of the alertCAffectedDirection property.
     * 
     * @return
     *     possible object is
     *     {@link LinearDirectionEnum }
     *     
     */
    public LinearDirectionEnum getAlertCAffectedDirection() {
        return alertCAffectedDirection;
    }

    /**
     * Sets the value of the alertCAffectedDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearDirectionEnum }
     *     
     */
    public void setAlertCAffectedDirection(LinearDirectionEnum value) {
        this.alertCAffectedDirection = value;
    }

    /**
     * Gets the value of the alertCDirectionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCDirectionExtension() {
        return alertCDirectionExtension;
    }

    /**
     * Sets the value of the alertCDirectionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCDirectionExtension(ExtensionType value) {
        this.alertCDirectionExtension = value;
    }

}
