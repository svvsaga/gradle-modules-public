
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The specification of the destination of a defined route or itinerary which is an area.
 *       
 * 
 * <p>Java class for AreaDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Destination"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaLocation" type="{http://datex2.eu/schema/3/locationReferencing}AreaLocation"/&gt;
 *         &lt;element name="_areaDestinationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDestination", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "areaLocation",
    "areaDestinationExtension"
})
public class AreaDestination
    extends Destination
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected AreaLocation areaLocation;
    @XmlElement(name = "_areaDestinationExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType areaDestinationExtension;

    /**
     * Gets the value of the areaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getAreaLocation() {
        return areaLocation;
    }

    /**
     * Sets the value of the areaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setAreaLocation(AreaLocation value) {
        this.areaLocation = value;
    }

    /**
     * Gets the value of the areaDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAreaDestinationExtension() {
        return areaDestinationExtension;
    }

    /**
     * Sets the value of the areaDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAreaDestinationExtension(ExtensionType value) {
        this.areaDestinationExtension = value;
    }

}
