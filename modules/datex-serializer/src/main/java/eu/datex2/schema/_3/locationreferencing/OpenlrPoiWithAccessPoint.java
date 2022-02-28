
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A point of interest (POI) along a line with access is a point location which is defined by
 *         a linear reference path, an offset value (defining the access point) from the starting node of this path
 *         and a coordinate pair that defines the POI itself.
 *       
 * 
 * <p>Java class for OpenlrPoiWithAccessPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPoiWithAccessPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrBasePointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="_openlrPoiWithAccessPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPoiWithAccessPoint", propOrder = {
    "openlrCoordinates",
    "_OpenlrPoiWithAccessPointExtension"
})
public class OpenlrPoiWithAccessPoint
    extends OpenlrBasePointLocation
{

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinates;
    @XmlElement(name = "_openlrPoiWithAccessPointExtension")
    protected _ExtensionType _OpenlrPoiWithAccessPointExtension;

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
     * Gets the value of the _OpenlrPoiWithAccessPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPoiWithAccessPointExtension() {
        return _OpenlrPoiWithAccessPointExtension;
    }

    /**
     * Sets the value of the _OpenlrPoiWithAccessPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPoiWithAccessPointExtension(_ExtensionType value) {
        this._OpenlrPoiWithAccessPointExtension = value;
    }

}
