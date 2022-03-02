
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrGridLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrGridLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrRectangle" type="{http://datex2.eu/schema/2/2_0}OpenlrRectangle"/&gt;
 *         &lt;element name="openlrGridAttributes" type="{http://datex2.eu/schema/2/2_0}OpenlrGridAttributes"/&gt;
 *         &lt;element name="openlrGridLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGridLocationReference", propOrder = {
    "openlrRectangle",
    "openlrGridAttributes",
    "openlrGridLocationReferenceExtension"
})
public class OpenlrGridLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrRectangle openlrRectangle;
    @XmlElement(required = true)
    protected OpenlrGridAttributes openlrGridAttributes;
    protected ExtensionType openlrGridLocationReferenceExtension;

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
     * Gets the value of the openlrGridAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrGridAttributes }
     *     
     */
    public OpenlrGridAttributes getOpenlrGridAttributes() {
        return openlrGridAttributes;
    }

    /**
     * Sets the value of the openlrGridAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrGridAttributes }
     *     
     */
    public void setOpenlrGridAttributes(OpenlrGridAttributes value) {
        this.openlrGridAttributes = value;
    }

    /**
     * Gets the value of the openlrGridLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrGridLocationReferenceExtension() {
        return openlrGridLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrGridLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrGridLocationReferenceExtension(ExtensionType value) {
        this.openlrGridLocationReferenceExtension = value;
    }

}
