
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mobility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilityType" type="{http://datex2.eu/schema/2/2_0}MobilityEnum"/&gt;
 *         &lt;element name="mobilityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mobility", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "mobilityType",
    "mobilityExtension"
})
public class Mobility {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected MobilityEnum mobilityType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType mobilityExtension;

    /**
     * Gets the value of the mobilityType property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnum }
     *     
     */
    public MobilityEnum getMobilityType() {
        return mobilityType;
    }

    /**
     * Sets the value of the mobilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnum }
     *     
     */
    public void setMobilityType(MobilityEnum value) {
        this.mobilityType = value;
    }

    /**
     * Gets the value of the mobilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMobilityExtension() {
        return mobilityExtension;
    }

    /**
     * Sets the value of the mobilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMobilityExtension(ExtensionType value) {
        this.mobilityExtension = value;
    }

}
