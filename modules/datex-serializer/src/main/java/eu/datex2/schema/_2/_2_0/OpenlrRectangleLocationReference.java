
package eu.datex2.schema._2._2_0;

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
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrRectangle" type="{http://datex2.eu/schema/2/2_0}OpenlrRectangle"/&gt;
 *         &lt;element name="openlrRectangleLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "openlrRectangleLocationReferenceExtension"
})
public class OpenlrRectangleLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrRectangle openlrRectangle;
    protected _ExtensionType openlrRectangleLocationReferenceExtension;

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
     * Gets the value of the openlrRectangleLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getOpenlrRectangleLocationReferenceExtension() {
        return openlrRectangleLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrRectangleLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setOpenlrRectangleLocationReferenceExtension(_ExtensionType value) {
        this.openlrRectangleLocationReferenceExtension = value;
    }

}
