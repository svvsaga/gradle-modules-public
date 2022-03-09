
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
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
    "_OpenlrGeoCoordinateExtension"
})
public class OpenlrGeoCoordinate
    extends OpenlrPointLocationReference
{

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinates;
    @XmlElement(name = "_openlrGeoCoordinateExtension")
    protected _ExtensionType _OpenlrGeoCoordinateExtension;

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
     * Gets the value of the _OpenlrGeoCoordinateExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrGeoCoordinateExtension() {
        return _OpenlrGeoCoordinateExtension;
    }

    /**
     * Sets the value of the _OpenlrGeoCoordinateExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrGeoCoordinateExtension(_ExtensionType value) {
        this._OpenlrGeoCoordinateExtension = value;
    }

}
