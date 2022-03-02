
package eu.datex2.schema._2._2_0;

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
 *         &lt;element name="openlrLowerLeft" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/&gt;
 *         &lt;element name="openlrUpperRight" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/&gt;
 *         &lt;element name="openlrRectangleExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrRectangle", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrLowerLeft",
    "openlrUpperRight",
    "openlrRectangleExtension"
})
public class OpenlrRectangle {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PointCoordinates openlrLowerLeft;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PointCoordinates openlrUpperRight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType openlrRectangleExtension;

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
     * Gets the value of the openlrRectangleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrRectangleExtension() {
        return openlrRectangleExtension;
    }

    /**
     * Sets the value of the openlrRectangleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrRectangleExtension(ExtensionType value) {
        this.openlrRectangleExtension = value;
    }

}
