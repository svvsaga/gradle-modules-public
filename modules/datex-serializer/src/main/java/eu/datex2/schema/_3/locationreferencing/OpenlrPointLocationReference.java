
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A point location is a zero-dimensional element in a map that specifies a geometric
 *         location.
 *       
 * 
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
    "openlrPointLocationReferenceExtension"
})
@XmlSeeAlso({
    OpenlrGeoCoordinate.class,
    OpenlrBasePointLocation.class
})
public abstract class OpenlrPointLocationReference {

    @XmlElement(name = "_openlrPointLocationReferenceExtension")
    protected ExtensionType openlrPointLocationReferenceExtension;

    /**
     * Gets the value of the openlrPointLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPointLocationReferenceExtension() {
        return openlrPointLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrPointLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPointLocationReferenceExtension(ExtensionType value) {
        this.openlrPointLocationReferenceExtension = value;
    }

}
