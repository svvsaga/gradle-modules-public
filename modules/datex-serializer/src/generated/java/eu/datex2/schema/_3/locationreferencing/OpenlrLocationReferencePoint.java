
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrLocationReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLocationReferencePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrBaseReferencePoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPathAttributes" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrPathAttributes"/&gt;
 *         &lt;element name="_openlrLocationReferencePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLocationReferencePoint", propOrder = {
    "openlrPathAttributes",
    "_OpenlrLocationReferencePointExtension"
})
public class OpenlrLocationReferencePoint
    extends OpenlrBaseReferencePoint
{

    @XmlElement(required = true)
    protected OpenlrPathAttributes openlrPathAttributes;
    @XmlElement(name = "_openlrLocationReferencePointExtension")
    protected _ExtensionType _OpenlrLocationReferencePointExtension;

    /**
     * Gets the value of the openlrPathAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPathAttributes }
     *     
     */
    public OpenlrPathAttributes getOpenlrPathAttributes() {
        return openlrPathAttributes;
    }

    /**
     * Sets the value of the openlrPathAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPathAttributes }
     *     
     */
    public void setOpenlrPathAttributes(OpenlrPathAttributes value) {
        this.openlrPathAttributes = value;
    }

    /**
     * Gets the value of the _OpenlrLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLocationReferencePointExtension() {
        return _OpenlrLocationReferencePointExtension;
    }

    /**
     * Sets the value of the _OpenlrLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLocationReferencePointExtension(_ExtensionType value) {
        this._OpenlrLocationReferencePointExtension = value;
    }

}
