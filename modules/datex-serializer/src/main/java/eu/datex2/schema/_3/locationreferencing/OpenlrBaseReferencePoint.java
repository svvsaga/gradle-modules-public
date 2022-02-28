
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base class used to hold data about a reference point.
 * 
 * <p>Java class for OpenlrBaseReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrBaseReferencePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="openlrLineAttributes" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLineAttributes"/&gt;
 *         &lt;element name="_openlrBaseReferencePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrBaseReferencePoint", propOrder = {
    "openlrCoordinates",
    "openlrLineAttributes",
    "_OpenlrBaseReferencePointExtension"
})
@XmlSeeAlso({
    OpenlrLastLocationReferencePoint.class,
    OpenlrLocationReferencePoint.class
})
public abstract class OpenlrBaseReferencePoint {

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinates;
    @XmlElement(required = true)
    protected OpenlrLineAttributes openlrLineAttributes;
    @XmlElement(name = "_openlrBaseReferencePointExtension")
    protected _ExtensionType _OpenlrBaseReferencePointExtension;

    /**
     * Gets the value of the openlrCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrCoordinates() {
        return openlrCoordinates;
    }

    /**
     * Sets the value of the openlrCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrCoordinates(PointCoordinates value) {
        this.openlrCoordinates = value;
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
     * Gets the value of the _OpenlrBaseReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrBaseReferencePointExtension() {
        return _OpenlrBaseReferencePointExtension;
    }

    /**
     * Sets the value of the _OpenlrBaseReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrBaseReferencePointExtension(_ExtensionType value) {
        this._OpenlrBaseReferencePointExtension = value;
    }

}
