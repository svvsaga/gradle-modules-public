
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrGeoCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrGeoCoordinate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrCoordinate" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/&gt;
 *         &lt;element name="openlrGeoCoordinateExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGeoCoordinate", propOrder = {
    "openlrCoordinate",
    "openlrGeoCoordinateExtension"
})
public class OpenlrGeoCoordinate {

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinate;
    protected ExtensionType openlrGeoCoordinateExtension;

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
     * Gets the value of the openlrGeoCoordinateExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrGeoCoordinateExtension() {
        return openlrGeoCoordinateExtension;
    }

    /**
     * Sets the value of the openlrGeoCoordinateExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrGeoCoordinateExtension(ExtensionType value) {
        this.openlrGeoCoordinateExtension = value;
    }

}
