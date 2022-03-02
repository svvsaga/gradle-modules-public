
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The sequence of location reference points is terminated by a last location reference
 *         point.
 *       
 * 
 * <p>Java class for OpenlrLastLocationReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLastLocationReferencePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrBaseReferencePoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_openlrLastLocationReferencePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLastLocationReferencePoint", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "openlrLastLocationReferencePointExtension"
})
public class OpenlrLastLocationReferencePoint
    extends OpenlrBaseReferencePoint
{

    @XmlElement(name = "_openlrLastLocationReferencePointExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrLastLocationReferencePointExtension;

    /**
     * Gets the value of the openlrLastLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLastLocationReferencePointExtension() {
        return openlrLastLocationReferencePointExtension;
    }

    /**
     * Sets the value of the openlrLastLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLastLocationReferencePointExtension(ExtensionType value) {
        this.openlrLastLocationReferencePointExtension = value;
    }

}
