
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._PublicEventTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicEventType" type="{http://datex2.eu/schema/3/common}_PublicEventTypeEnum"/&gt;
 *         &lt;element name="venueName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_publicEventExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicEvent", propOrder = {
    "publicEventType",
    "venueName",
    "_PublicEventExtension"
})
public class PublicEvent
    extends Activity
{

    @XmlElement(required = true)
    protected _PublicEventTypeEnum publicEventType;
    protected MultilingualString venueName;
    @XmlElement(name = "_publicEventExtension")
    protected _ExtensionType _PublicEventExtension;

    /**
     * Gets the value of the publicEventType property.
     * 
     * @return
     *     possible object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public _PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Sets the value of the publicEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(_PublicEventTypeEnum value) {
        this.publicEventType = value;
    }

    /**
     * Gets the value of the venueName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVenueName() {
        return venueName;
    }

    /**
     * Sets the value of the venueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVenueName(MultilingualString value) {
        this.venueName = value;
    }

    /**
     * Gets the value of the _PublicEventExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PublicEventExtension() {
        return _PublicEventExtension;
    }

    /**
     * Sets the value of the _PublicEventExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PublicEventExtension(_ExtensionType value) {
        this._PublicEventExtension = value;
    }

}
