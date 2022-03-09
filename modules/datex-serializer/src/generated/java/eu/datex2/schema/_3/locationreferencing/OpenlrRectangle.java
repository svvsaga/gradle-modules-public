
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrRectangle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrRectangle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLowerLeft" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="openlrUpperRight" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="_openlrRectangleExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrRectangle", propOrder = {
    "openlrLowerLeft",
    "openlrUpperRight",
    "_OpenlrRectangleExtension"
})
public class OpenlrRectangle {

    @XmlElement(required = true)
    protected PointCoordinates openlrLowerLeft;
    @XmlElement(required = true)
    protected PointCoordinates openlrUpperRight;
    @XmlElement(name = "_openlrRectangleExtension")
    protected _ExtensionType _OpenlrRectangleExtension;

    /**
     * Gets the value of the openlrLowerLeft property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrLowerLeft() {
        return openlrLowerLeft;
    }

    /**
     * Sets the value of the openlrLowerLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrLowerLeft(PointCoordinates value) {
        this.openlrLowerLeft = value;
    }

    /**
     * Gets the value of the openlrUpperRight property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrUpperRight() {
        return openlrUpperRight;
    }

    /**
     * Sets the value of the openlrUpperRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrUpperRight(PointCoordinates value) {
        this.openlrUpperRight = value;
    }

    /**
     * Gets the value of the _OpenlrRectangleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrRectangleExtension() {
        return _OpenlrRectangleExtension;
    }

    /**
     * Sets the value of the _OpenlrRectangleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrRectangleExtension(_ExtensionType value) {
        this._OpenlrRectangleExtension = value;
    }

}
