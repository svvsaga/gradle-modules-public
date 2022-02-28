
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaExtended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namedArea" type="{http://datex2.eu/schema/2/2_0}NamedArea" minOccurs="0"/&gt;
 *         &lt;element name="polygonArea" type="{http://datex2.eu/schema/2/2_0}PolygonArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaExtended", propOrder = {
    "namedArea",
    "polygonArea"
})
public class AreaExtended {

    protected NamedArea namedArea;
    protected List<PolygonArea> polygonArea;

    /**
     * Gets the value of the namedArea property.
     * 
     * @return
     *     possible object is
     *     {@link NamedArea }
     *     
     */
    public NamedArea getNamedArea() {
        return namedArea;
    }

    /**
     * Sets the value of the namedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedArea }
     *     
     */
    public void setNamedArea(NamedArea value) {
        this.namedArea = value;
    }

    /**
     * Gets the value of the polygonArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the polygonArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolygonArea }
     * 
     * 
     */
    public List<PolygonArea> getPolygonArea() {
        if (polygonArea == null) {
            polygonArea = new ArrayList<PolygonArea>();
        }
        return this.polygonArea;
    }

}
