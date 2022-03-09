
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilityOfActivity" type="{http://datex2.eu/schema/3/situation}Mobility" minOccurs="0"/&gt;
 *         &lt;element name="_activityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "mobilityOfActivity",
    "_ActivityExtension"
})
@XmlSeeAlso({
    AuthorityOperation.class,
    DisturbanceActivity.class,
    PublicEvent.class
})
public abstract class Activity
    extends TrafficElement
{

    protected Mobility mobilityOfActivity;
    @XmlElement(name = "_activityExtension")
    protected _ExtensionType _ActivityExtension;

    /**
     * Gets the value of the mobilityOfActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobilityOfActivity() {
        return mobilityOfActivity;
    }

    /**
     * Sets the value of the mobilityOfActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobilityOfActivity(Mobility value) {
        this.mobilityOfActivity = value;
    }

    /**
     * Gets the value of the _ActivityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ActivityExtension() {
        return _ActivityExtension;
    }

    /**
     * Sets the value of the _ActivityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ActivityExtension(_ExtensionType value) {
        this._ActivityExtension = value;
    }

}
