
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointByCoordinates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointByCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees" minOccurs="0"/&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="_pointByCoordinatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointByCoordinates", propOrder = {
    "bearing",
    "pointCoordinates",
    "pointByCoordinatesExtension"
})
public class PointByCoordinates {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer bearing;
    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    @XmlElement(name = "_pointByCoordinatesExtension")
    protected ExtensionType pointByCoordinatesExtension;

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBearing(Integer value) {
        this.bearing = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the pointByCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointByCoordinatesExtension() {
        return pointByCoordinatesExtension;
    }

    /**
     * Sets the value of the pointByCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointByCoordinatesExtension(ExtensionType value) {
        this.pointByCoordinatesExtension = value;
    }

}
