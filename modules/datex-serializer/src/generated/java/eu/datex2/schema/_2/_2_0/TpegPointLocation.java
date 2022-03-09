
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/2/2_0}DirectionEnum"/&gt;
 *         &lt;element name="tpegPointLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointLocation", propOrder = {
    "tpegDirection",
    "tpegPointLocationExtension"
})
@XmlSeeAlso({
    TpegFramedPoint.class,
    TpegSimplePoint.class
})
public abstract class TpegPointLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DirectionEnum tpegDirection;
    protected _ExtensionType tpegPointLocationExtension;

    /**
     * Gets the value of the tpegDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Sets the value of the tpegDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setTpegDirection(DirectionEnum value) {
        this.tpegDirection = value;
    }

    /**
     * Gets the value of the tpegPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTpegPointLocationExtension() {
        return tpegPointLocationExtension;
    }

    /**
     * Sets the value of the tpegPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTpegPointLocationExtension(_ExtensionType value) {
        this.tpegPointLocationExtension = value;
    }

}
