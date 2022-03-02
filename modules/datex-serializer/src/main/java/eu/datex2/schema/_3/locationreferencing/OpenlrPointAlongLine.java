
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Point along a line
 * 
 * <p>Java class for OpenlrPointAlongLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPointAlongLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrBasePointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_openlrPointAlongLineExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPointAlongLine", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "openlrPointAlongLineExtension"
})
public class OpenlrPointAlongLine
    extends OpenlrBasePointLocation
{

    @XmlElement(name = "_openlrPointAlongLineExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrPointAlongLineExtension;

    /**
     * Gets the value of the openlrPointAlongLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPointAlongLineExtension() {
        return openlrPointAlongLineExtension;
    }

    /**
     * Sets the value of the openlrPointAlongLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPointAlongLineExtension(ExtensionType value) {
        this.openlrPointAlongLineExtension = value;
    }

}
