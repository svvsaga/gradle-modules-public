
package eu.datex2.schema._2._2_0;

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
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplementaryPositionalDescription" type="{http://datex2.eu/schema/2/2_0}SupplementaryPositionalDescription" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://datex2.eu/schema/2/2_0}Destination" minOccurs="0"/&gt;
 *         &lt;element name="networkLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLocation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "supplementaryPositionalDescription",
    "destination",
    "networkLocationExtension"
})
@XmlSeeAlso({
    Linear.class,
    Point.class
})
public abstract class NetworkLocation
    extends Location
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected SupplementaryPositionalDescription supplementaryPositionalDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Destination destination;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
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
