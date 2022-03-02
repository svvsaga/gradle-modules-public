
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is either a junction point or a non junction point.
 *       
 * 
 * <p>Java class for TpegPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_tpegPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPoint", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "tpegPointExtension"
})
@XmlSeeAlso({
    TpegJunction.class,
    TpegNonJunctionPoint.class
})
public abstract class TpegPoint {

    @XmlElement(name = "_tpegPointExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType tpegPointExtension;

    /**
     * Gets the value of the tpegPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointExtension() {
        return tpegPointExtension;
    }

    /**
     * Sets the value of the tpegPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointExtension(ExtensionType value) {
        this.tpegPointExtension = value;
    }

}
