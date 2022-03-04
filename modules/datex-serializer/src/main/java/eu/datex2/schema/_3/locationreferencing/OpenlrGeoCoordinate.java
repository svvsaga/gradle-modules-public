
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
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
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrPointLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="_openlrGeoCoordinateExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGeoCoordinate", propOrder = {
    "openlrCoordinates",
    "openlrGeoCoordinateExtension"
})
public class OpenlrGeoCoordinate
    extends OpenlrPointLocationReference
{

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinates;
    @XmlElement(name = "_openlrGeoCoordinateExtension")
    protected ExtensionType openlrGeoCoordinateExtension;

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
