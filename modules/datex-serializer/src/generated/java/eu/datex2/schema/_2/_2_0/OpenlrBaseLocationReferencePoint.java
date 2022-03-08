
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrBaseLocationReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrBaseLocationReferencePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrCoordinate" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/&gt;
 *         &lt;element name="openlrLineAttributes" type="{http://datex2.eu/schema/2/2_0}OpenlrLineAttributes"/&gt;
 *         &lt;element name="openlrBaseLocationReferencePointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrBaseLocationReferencePoint", propOrder = {
    "openlrCoordinate",
    "openlrLineAttributes",
    "openlrBaseLocationReferencePointExtension"
})
@XmlSeeAlso({
    OpenlrLastLocationReferencePoint.class,
    OpenlrLocationReferencePoint.class
})
public abstract class OpenlrBaseLocationReferencePoint {

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinate;
    @XmlElement(required = true)
    protected OpenlrLineAttributes openlrLineAttributes;
    protected ExtensionType openlrBaseLocationReferencePointExtension;

    /**
     * Gets the value of the openlrCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrCoordinate() {
        return openlrCoordinate;
    }

    /**
     * Sets the value of the openlrCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrCoordinate(PointCoordinates value) {
        this.openlrCoordinate = value;
    }

    /**
     * Gets the value of the openlrLineAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLineAttributes }
     *     
     */
    public OpenlrLineAttributes getOpenlrLineAttributes() {
        return openlrLineAttributes;
    }

    /**
     * Sets the value of the openlrLineAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineAttributes }
     *     
     */
    public void setOpenlrLineAttributes(OpenlrLineAttributes value) {
        this.openlrLineAttributes = value;
    }

    /**
     * Gets the value of the openlrBaseLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrBaseLocationReferencePointExtension() {
        return openlrBaseLocationReferencePointExtension;
    }

    /**
     * Sets the value of the openlrBaseLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrBaseLocationReferencePointExtension(ExtensionType value) {
        this.openlrBaseLocationReferencePointExtension = value;
    }

}
