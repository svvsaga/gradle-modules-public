
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPointLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPointLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_openlrPointLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPointLocationReference", propOrder = {
    "_OpenlrPointLocationReferenceExtension"
})
@XmlSeeAlso({
    OpenlrGeoCoordinate.class,
    OpenlrBasePointLocation.class
})
public abstract class OpenlrPointLocationReference {

    @XmlElement(name = "_openlrPointLocationReferenceExtension")
    protected _ExtensionType _OpenlrPointLocationReferenceExtension;

    /**
     * Gets the value of the _OpenlrPointLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPointLocationReferenceExtension() {
        return _OpenlrPointLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrPointLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPointLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrPointLocationReferenceExtension = value;
    }

}
