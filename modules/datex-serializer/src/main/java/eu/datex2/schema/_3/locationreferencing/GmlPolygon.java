
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Planar surface defined by 1 exterior boundary and 0 or more interior boundaries
 *       
 * 
 * <p>Java class for GmlPolygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GmlPolygon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exterior" type="{http://datex2.eu/schema/3/locationReferencing}GmlLinearRing"/&gt;
 *         &lt;element name="interior" type="{http://datex2.eu/schema/3/locationReferencing}GmlLinearRing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_gmlPolygonExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlPolygon", propOrder = {
    "exterior",
    "interior",
    "_GmlPolygonExtension"
})
public class GmlPolygon {

    @XmlElement(required = true)
    protected GmlLinearRing exterior;
    protected List<GmlLinearRing> interior;
    @XmlElement(name = "_gmlPolygonExtension")
    protected _ExtensionType _GmlPolygonExtension;

    /**
     * Gets the value of the exterior property.
     * 
     * @return
     *     possible object is
     *     {@link GmlLinearRing }
     *     
     */
    public GmlLinearRing getExterior() {
        return exterior;
    }

    /**
     * Sets the value of the exterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link GmlLinearRing }
     *     
     */
    public void setExterior(GmlLinearRing value) {
        this.exterior = value;
    }

    /**
     * Gets the value of the interior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the interior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GmlLinearRing }
     * 
     * 
     */
    public List<GmlLinearRing> getInterior() {
        if (interior == null) {
            interior = new ArrayList<GmlLinearRing>();
        }
        return this.interior;
    }

    /**
     * Gets the value of the _GmlPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GmlPolygonExtension() {
        return _GmlPolygonExtension;
    }

    /**
     * Sets the value of the _GmlPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GmlPolygonExtension(_ExtensionType value) {
        this._GmlPolygonExtension = value;
    }

}
