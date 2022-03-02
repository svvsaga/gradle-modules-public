
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Closed line string not self-intersecting (i.e. having as last point the first point)
 *       
 * 
 * <p>Java class for GmlLinearRing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GmlLinearRing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}GmlLineString"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_gmlLinearRingExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlLinearRing", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "gmlLinearRingExtension"
})
public class GmlLinearRing
    extends GmlLineString
{

    @XmlElement(name = "_gmlLinearRingExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType gmlLinearRingExtension;

    /**
     * Gets the value of the gmlLinearRingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlLinearRingExtension() {
        return gmlLinearRingExtension;
    }

    /**
     * Sets the value of the gmlLinearRingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlLinearRingExtension(ExtensionType value) {
        this.gmlLinearRingExtension = value;
    }

}
