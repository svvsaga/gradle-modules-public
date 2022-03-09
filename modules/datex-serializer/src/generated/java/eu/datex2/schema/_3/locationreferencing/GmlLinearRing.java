
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
@XmlType(name = "GmlLinearRing", propOrder = {
    "_GmlLinearRingExtension"
})
public class GmlLinearRing
    extends GmlLineString
{

    @XmlElement(name = "_gmlLinearRingExtension")
    protected _ExtensionType _GmlLinearRingExtension;

    /**
     * Gets the value of the _GmlLinearRingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GmlLinearRingExtension() {
        return _GmlLinearRingExtension;
    }

    /**
     * Sets the value of the _GmlLinearRingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GmlLinearRingExtension(_ExtensionType value) {
        this._GmlLinearRingExtension = value;
    }

}
