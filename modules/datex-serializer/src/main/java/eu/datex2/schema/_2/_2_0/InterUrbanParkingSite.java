
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterUrbanParkingSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterUrbanParkingSite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingSite"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interUrbanParkingSiteLocation" type="{http://datex2.eu/schema/2/2_0}InterUrbanParkingSiteLocationEnum"/&gt;
 *         &lt;element name="interUrbanParkingSiteExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterUrbanParkingSite", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "interUrbanParkingSiteLocation",
    "interUrbanParkingSiteExtension"
})
public class InterUrbanParkingSite
    extends ParkingSite
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected InterUrbanParkingSiteLocationEnum interUrbanParkingSiteLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType interUrbanParkingSiteExtension;

    /**
     * Gets the value of the interUrbanParkingSiteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InterUrbanParkingSiteLocationEnum }
     *     
     */
    public InterUrbanParkingSiteLocationEnum getInterUrbanParkingSiteLocation() {
        return interUrbanParkingSiteLocation;
    }

    /**
     * Sets the value of the interUrbanParkingSiteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterUrbanParkingSiteLocationEnum }
     *     
     */
    public void setInterUrbanParkingSiteLocation(InterUrbanParkingSiteLocationEnum value) {
        this.interUrbanParkingSiteLocation = value;
    }

    /**
     * Gets the value of the interUrbanParkingSiteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInterUrbanParkingSiteExtension() {
        return interUrbanParkingSiteExtension;
    }

    /**
     * Sets the value of the interUrbanParkingSiteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInterUrbanParkingSiteExtension(ExtensionType value) {
        this.interUrbanParkingSiteExtension = value;
    }

}
