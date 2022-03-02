
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "GmlPolygon", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "exterior",
    "interior",
    "gmlPolygonExtension"
})
public class GmlPolygon {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected GmlLinearRing exterior;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected List<GmlLinearRing> interior;
    @XmlElement(name = "_gmlPolygonExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType gmlPolygonExtension;

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
     * Gets the value of the gmlPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlPolygonExtension() {
        return gmlPolygonExtension;
    }

    /**
     * Sets the value of the gmlPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlPolygonExtension(ExtensionType value) {
        this.gmlPolygonExtension = value;
    }

}
