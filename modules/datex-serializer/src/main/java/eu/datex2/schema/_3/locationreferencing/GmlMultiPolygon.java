
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An area defined by a set of polygons acording to GML (EN ISO 19136).
 * 
 * <p>Java class for GmlMultiPolygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GmlMultiPolygon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gmlAreaName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="gmlPolygon" type="{http://datex2.eu/schema/3/locationReferencing}GmlPolygon" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_gmlMultiPolygonExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlMultiPolygon", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "gmlAreaName",
    "gmlPolygon",
    "gmlMultiPolygonExtension"
})
public class GmlMultiPolygon {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected MultilingualString gmlAreaName;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected List<GmlPolygon> gmlPolygon;
    @XmlElement(name = "_gmlMultiPolygonExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType gmlMultiPolygonExtension;

    /**
     * Gets the value of the gmlAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getGmlAreaName() {
        return gmlAreaName;
    }

    /**
     * Sets the value of the gmlAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setGmlAreaName(MultilingualString value) {
        this.gmlAreaName = value;
    }

    /**
     * Gets the value of the gmlPolygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gmlPolygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGmlPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GmlPolygon }
     * 
     * 
     */
    public List<GmlPolygon> getGmlPolygon() {
        if (gmlPolygon == null) {
            gmlPolygon = new ArrayList<GmlPolygon>();
        }
        return this.gmlPolygon;
    }

    /**
     * Gets the value of the gmlMultiPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlMultiPolygonExtension() {
        return gmlMultiPolygonExtension;
    }

    /**
     * Sets the value of the gmlMultiPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlMultiPolygonExtension(ExtensionType value) {
        this.gmlMultiPolygonExtension = value;
    }

}
