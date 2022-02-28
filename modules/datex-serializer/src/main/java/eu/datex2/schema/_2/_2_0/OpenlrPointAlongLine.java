
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPointAlongLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPointAlongLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrBasePointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPointAlongLineExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPointAlongLine", propOrder = {
    "openlrPointAlongLineExtension"
})
public class OpenlrPointAlongLine
    extends OpenlrBasePointLocation
{

    protected _ExtensionType openlrPointAlongLineExtension;

    /**
     * Gets the value of the openlrPointAlongLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getOpenlrPointAlongLineExtension() {
        return openlrPointAlongLineExtension;
    }

    /**
     * Sets the value of the openlrPointAlongLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setOpenlrPointAlongLineExtension(_ExtensionType value) {
        this.openlrPointAlongLineExtension = value;
    }

}
