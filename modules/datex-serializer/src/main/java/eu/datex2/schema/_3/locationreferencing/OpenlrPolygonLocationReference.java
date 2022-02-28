
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The OpenLR method of area definition by providing points that bound the area
 *       
 * 
 * <p>Java class for OpenlrPolygonLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPolygonLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPolygonCorners" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrPolygonCorners"/&gt;
 *         &lt;element name="_openlrPolygonLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonLocationReference", propOrder = {
    "openlrPolygonCorners",
    "_OpenlrPolygonLocationReferenceExtension"
})
public class OpenlrPolygonLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrPolygonCorners openlrPolygonCorners;
    @XmlElement(name = "_openlrPolygonLocationReferenceExtension")
    protected _ExtensionType _OpenlrPolygonLocationReferenceExtension;

    /**
     * Gets the value of the openlrPolygonCorners property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public OpenlrPolygonCorners getOpenlrPolygonCorners() {
        return openlrPolygonCorners;
    }

    /**
     * Sets the value of the openlrPolygonCorners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public void setOpenlrPolygonCorners(OpenlrPolygonCorners value) {
        this.openlrPolygonCorners = value;
    }

    /**
     * Gets the value of the _OpenlrPolygonLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPolygonLocationReferenceExtension() {
        return _OpenlrPolygonLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrPolygonLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPolygonLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrPolygonLocationReferenceExtension = value;
    }

}
