
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="_openlrAreaLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "_OpenlrAreaLocationReferenceExtension"
})
@XmlSeeAlso({
    OpenlrCircleLocationReference.class,
    OpenlrClosedLineLocationReference.class,
    OpenlrGridLocationReference.class,
    OpenlrPolygonLocationReference.class,
    OpenlrRectangleLocationReference.class
})
public abstract class OpenlrAreaLocationReference {

    @XmlElement(name = "_openlrAreaLocationReferenceExtension")
    protected _ExtensionType _OpenlrAreaLocationReferenceExtension;

    /**
     * Gets the value of the _OpenlrAreaLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrAreaLocationReferenceExtension() {
        return _OpenlrAreaLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrAreaLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrAreaLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrAreaLocationReferenceExtension = value;
    }

}
