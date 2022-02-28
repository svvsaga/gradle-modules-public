
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolygonArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolygonArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2/2_0}_PolygonAreaIndexPointCoordinates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="polygonAreaExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonArea", propOrder = {
    "sectionName",
    "pointCoordinates",
    "polygonAreaExtension"
})
public class PolygonArea {

    protected MultilingualString sectionName;
    protected List<_PolygonAreaIndexPointCoordinates> pointCoordinates;
    protected _ExtensionType polygonAreaExtension;

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSectionName(MultilingualString value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pointCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _PolygonAreaIndexPointCoordinates }
     * 
     * 
     */
    public List<_PolygonAreaIndexPointCoordinates> getPointCoordinates() {
        if (pointCoordinates == null) {
            pointCoordinates = new ArrayList<_PolygonAreaIndexPointCoordinates>();
        }
        return this.pointCoordinates;
    }

    /**
     * Gets the value of the polygonAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPolygonAreaExtension() {
        return polygonAreaExtension;
    }

    /**
     * Sets the value of the polygonAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPolygonAreaExtension(_ExtensionType value) {
        this.polygonAreaExtension = value;
    }

}
