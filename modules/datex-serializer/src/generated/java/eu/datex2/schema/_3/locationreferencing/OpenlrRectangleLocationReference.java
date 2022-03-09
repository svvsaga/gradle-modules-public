
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrRectangleLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrRectangleLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrRectangle" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrRectangle"/&gt;
 *         &lt;element name="_openlrRectangleLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrRectangleLocationReference", propOrder = {
    "openlrRectangle",
    "_OpenlrRectangleLocationReferenceExtension"
})
public class OpenlrRectangleLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrRectangle openlrRectangle;
    @XmlElement(name = "_openlrRectangleLocationReferenceExtension")
    protected _ExtensionType _OpenlrRectangleLocationReferenceExtension;

    /**
     * Gets the value of the openlrRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrRectangle }
     *     
     */
    public OpenlrRectangle getOpenlrRectangle() {
        return openlrRectangle;
    }

    /**
     * Sets the value of the openlrRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrRectangle }
     *     
     */
    public void setOpenlrRectangle(OpenlrRectangle value) {
        this.openlrRectangle = value;
    }

    /**
     * Gets the value of the _OpenlrRectangleLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrRectangleLocationReferenceExtension() {
        return _OpenlrRectangleLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrRectangleLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrRectangleLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrRectangleLocationReferenceExtension = value;
    }

}
