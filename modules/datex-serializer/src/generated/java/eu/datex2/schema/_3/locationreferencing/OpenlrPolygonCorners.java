
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
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
 *         &lt;element name="openlrCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates" maxOccurs="unbounded" minOccurs="3"/&gt;
 *         &lt;element name="_openlrPolygonCornersExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonCorners", propOrder = {
    "openlrCoordinates",
    "openlrPolygonCornersExtension"
})
public class OpenlrPolygonCorners {

    @XmlElement(required = true)
    protected List<PointCoordinates> openlrCoordinates;
    @XmlElement(name = "_openlrPolygonCornersExtension")
    protected ExtensionType openlrPolygonCornersExtension;

    /**
     * Gets the value of the openlrCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the openlrCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenlrCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointCoordinates }
     * 
     * 
     */
    public List<PointCoordinates> getOpenlrCoordinates() {
        if (openlrCoordinates == null) {
            openlrCoordinates = new ArrayList<PointCoordinates>();
        }
        return this.openlrCoordinates;
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
