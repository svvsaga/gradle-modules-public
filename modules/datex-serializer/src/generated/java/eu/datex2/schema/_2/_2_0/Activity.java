
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilityOfActivity" type="{http://datex2.eu/schema/2/2_0}Mobility" minOccurs="0"/&gt;
 *         &lt;element name="activityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "activityExtension"
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
    protected ExtensionType activityExtension;

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
     * Gets the value of the activityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getActivityExtension() {
        return activityExtension;
    }

    /**
     * Sets the value of the activityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setActivityExtension(ExtensionType value) {
        this.activityExtension = value;
    }

}
