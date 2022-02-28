
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrAreaLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrAreaLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrAreaLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrAreaLocationReference", propOrder = {
    "openlrAreaLocationReferenceExtension"
})
@XmlSeeAlso({
    OpenlrCircleLocationReference.class,
    OpenlrClosedLineLocationReference.class,
    OpenlrGridLocationReference.class,
    OpenlrPolygonLocationReference.class,
    OpenlrRectangleLocationReference.class
})
public class OpenlrAreaLocationReference {

    protected _ExtensionType openlrAreaLocationReferenceExtension;

    /**
     * Gets the value of the openlrAreaLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getOpenlrAreaLocationReferenceExtension() {
        return openlrAreaLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrAreaLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setOpenlrAreaLocationReferenceExtension(_ExtensionType value) {
        this.openlrAreaLocationReferenceExtension = value;
    }

}
