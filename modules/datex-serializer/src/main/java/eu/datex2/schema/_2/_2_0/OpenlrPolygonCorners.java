
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPolygonCorners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPolygonCorners"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrCoordinate" type="{http://datex2.eu/schema/2/2_0}PointCoordinates" maxOccurs="unbounded" minOccurs="3"/&gt;
 *         &lt;element name="openlrPolygonCornersExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonCorners", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrCoordinate",
    "openlrPolygonCornersExtension"
})
public class OpenlrPolygonCorners {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected List<PointCoordinates> openlrCoordinate;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType openlrPolygonCornersExtension;

    /**
     * Gets the value of the openlrCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the openlrCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenlrCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointCoordinates }
     * 
     * 
     */
    public List<PointCoordinates> getOpenlrCoordinate() {
        if (openlrCoordinate == null) {
            openlrCoordinate = new ArrayList<PointCoordinates>();
        }
        return this.openlrCoordinate;
    }

    /**
     * Gets the value of the openlrPolygonCornersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPolygonCornersExtension() {
        return openlrPolygonCornersExtension;
    }

    /**
     * Sets the value of the openlrPolygonCornersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPolygonCornersExtension(ExtensionType value) {
        this.openlrPolygonCornersExtension = value;
    }

}
