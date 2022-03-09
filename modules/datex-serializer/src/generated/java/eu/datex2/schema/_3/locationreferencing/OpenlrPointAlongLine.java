
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
@XmlType(name = "OpenlrPointAlongLine", propOrder = {
    "_OpenlrPointAlongLineExtension"
})
public class OpenlrPointAlongLine
    extends OpenlrBasePointLocation
{

    @XmlElement(name = "_openlrPointAlongLineExtension")
    protected _ExtensionType _OpenlrPointAlongLineExtension;

    /**
     * Gets the value of the _OpenlrPointAlongLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPointAlongLineExtension() {
        return _OpenlrPointAlongLineExtension;
    }

    /**
     * Sets the value of the _OpenlrPointAlongLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPointAlongLineExtension(_ExtensionType value) {
        this._OpenlrPointAlongLineExtension = value;
    }

}
