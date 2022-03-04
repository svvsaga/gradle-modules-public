
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointCoordinates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://datex2.eu/schema/3/common}Float"/&gt;
 *         &lt;element name="longitude" type="{http://datex2.eu/schema/3/common}Float"/&gt;
 *         &lt;element name="heightCoordinate" type="{http://datex2.eu/schema/3/locationReferencing}HeightCoordinate" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="positionConfidenceEllipse" type="{http://datex2.eu/schema/3/locationReferencing}PositionConfidenceEllipse" minOccurs="0"/&gt;
 *         &lt;element name="horizontalPositionAccuracy" type="{http://datex2.eu/schema/3/locationReferencing}PositionAccuracy" minOccurs="0"/&gt;
 *         &lt;element name="_pointCoordinatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCoordinates", propOrder = {
    "latitude",
    "longitude",
    "heightCoordinate",
    "positionConfidenceEllipse",
    "horizontalPositionAccuracy",
    "pointCoordinatesExtension"
})
public class PointCoordinates {

    protected float latitude;
    protected float longitude;
    protected List<HeightCoordinate> heightCoordinate;
    protected PositionConfidenceEllipse positionConfidenceEllipse;
    protected PositionAccuracy horizontalPositionAccuracy;
    @XmlElement(name = "_pointCoordinatesExtension")
    protected ExtensionType pointCoordinatesExtension;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the heightCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the heightCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeightCoordinate }
     * 
     * 
     */
    public List<HeightCoordinate> getHeightCoordinate() {
        if (heightCoordinate == null) {
            heightCoordinate = new ArrayList<HeightCoordinate>();
        }
        return this.heightCoordinate;
    }

    /**
     * Gets the value of the positionConfidenceEllipse property.
     * 
     * @return
     *     possible object is
     *     {@link PositionConfidenceEllipse }
     *     
     */
    public PositionConfidenceEllipse getPositionConfidenceEllipse() {
        return positionConfidenceEllipse;
    }

    /**
     * Sets the value of the positionConfidenceEllipse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionConfidenceEllipse }
     *     
     */
    public void setPositionConfidenceEllipse(PositionConfidenceEllipse value) {
        this.positionConfidenceEllipse = value;
    }

    /**
     * Gets the value of the horizontalPositionAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAccuracy }
     *     
     */
    public PositionAccuracy getHorizontalPositionAccuracy() {
        return horizontalPositionAccuracy;
    }

    /**
     * Sets the value of the horizontalPositionAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAccuracy }
     *     
     */
    public void setHorizontalPositionAccuracy(PositionAccuracy value) {
        this.horizontalPositionAccuracy = value;
    }

    /**
     * Gets the value of the pointCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointCoordinatesExtension() {
        return pointCoordinatesExtension;
    }

    /**
     * Sets the value of the pointCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointCoordinatesExtension(ExtensionType value) {
        this.pointCoordinatesExtension = value;
    }

}
