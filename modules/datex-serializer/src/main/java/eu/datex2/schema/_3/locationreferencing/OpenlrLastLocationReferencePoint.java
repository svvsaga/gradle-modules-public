
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
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
@XmlType(name = "OpenlrLastLocationReferencePoint", propOrder = {
    "_OpenlrLastLocationReferencePointExtension"
})
public class OpenlrLastLocationReferencePoint
    extends OpenlrBaseReferencePoint
{

    @XmlElement(name = "_openlrLastLocationReferencePointExtension")
    protected _ExtensionType _OpenlrLastLocationReferencePointExtension;

    /**
     * Gets the value of the _OpenlrLastLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLastLocationReferencePointExtension() {
        return _OpenlrLastLocationReferencePointExtension;
    }

    /**
     * Sets the value of the _OpenlrLastLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLastLocationReferencePointExtension(_ExtensionType value) {
        this._OpenlrLastLocationReferencePointExtension = value;
    }

}
