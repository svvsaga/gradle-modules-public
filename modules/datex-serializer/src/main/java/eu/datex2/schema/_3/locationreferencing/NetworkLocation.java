
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplementaryPositionalDescription" type="{http://datex2.eu/schema/3/locationReferencing}SupplementaryPositionalDescription" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://datex2.eu/schema/3/locationReferencing}Destination" minOccurs="0"/&gt;
 *         &lt;element name="_networkLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLocation", propOrder = {
    "supplementaryPositionalDescription",
    "destination",
    "networkLocationExtension"
})
@XmlSeeAlso({
    PointLocation.class,
    LinearLocation.class
})
public abstract class NetworkLocation
    extends Location
{

    protected SupplementaryPositionalDescription supplementaryPositionalDescription;
    protected Destination destination;
    @XmlElement(name = "_networkLocationExtension")
    protected ExtensionType networkLocationExtension;

    /**
     * Gets the value of the supplementaryPositionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public SupplementaryPositionalDescription getSupplementaryPositionalDescription() {
        return supplementaryPositionalDescription;
    }

    /**
     * Sets the value of the supplementaryPositionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public void setSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        this.supplementaryPositionalDescription = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the networkLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkLocationExtension() {
        return networkLocationExtension;
    }

    /**
     * Sets the value of the networkLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkLocationExtension(ExtensionType value) {
        this.networkLocationExtension = value;
    }

}
