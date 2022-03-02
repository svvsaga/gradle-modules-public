
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The basis of a location reference is a sequence of location reference points (LRPs).
 *       
 * 
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
    "openlrLocationReferencePointExtension"
})
public class OpenlrLocationReferencePoint
    extends OpenlrBaseReferencePoint
{

    @XmlElement(required = true)
    protected OpenlrPathAttributes openlrPathAttributes;
    @XmlElement(name = "_openlrLocationReferencePointExtension")
    protected ExtensionType openlrLocationReferencePointExtension;

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
     * Gets the value of the openlrLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLocationReferencePointExtension() {
        return openlrLocationReferencePointExtension;
    }

    /**
     * Sets the value of the openlrLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLocationReferencePointExtension(ExtensionType value) {
        this.openlrLocationReferencePointExtension = value;
    }

}
