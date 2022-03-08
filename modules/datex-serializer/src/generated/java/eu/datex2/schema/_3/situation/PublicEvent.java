
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.PublicEventTypeEnum;
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
    "publicEventExtension"
})
public class PublicEvent
    extends Activity
{

    @XmlElement(required = true)
    protected PublicEventTypeEnum publicEventType;
    protected MultilingualString venueName;
    @XmlElement(name = "_publicEventExtension")
    protected ExtensionType publicEventExtension;

    /**
     * Gets the value of the publicEventType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Sets the value of the publicEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(PublicEventTypeEnum value) {
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
     * Gets the value of the publicEventExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPublicEventExtension() {
        return publicEventExtension;
    }

    /**
     * Sets the value of the publicEventExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPublicEventExtension(ExtensionType value) {
        this.publicEventExtension = value;
    }

}
