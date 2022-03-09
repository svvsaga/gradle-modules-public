
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrBasePointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrBasePointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrPointLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrSideOfRoad" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrSideOfRoadEnum"/&gt;
 *         &lt;element name="openlrOrientation" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrOrientationEnum"/&gt;
 *         &lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLocationReferencePoint"/&gt;
 *         &lt;element name="openlrLastLocationReferencePoint" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLastLocationReferencePoint"/&gt;
 *         &lt;element name="openlrOffsets" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrOffsets" minOccurs="0"/&gt;
 *         &lt;element name="_openlrBasePointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrBasePointLocation", propOrder = {
    "openlrSideOfRoad",
    "openlrOrientation",
    "openlrLocationReferencePoint",
    "openlrLastLocationReferencePoint",
    "openlrOffsets",
    "_OpenlrBasePointLocationExtension"
})
@XmlSeeAlso({
    OpenlrPointAlongLine.class,
    OpenlrPoiWithAccessPoint.class
})
public abstract class OpenlrBasePointLocation
    extends OpenlrPointLocationReference
{

    @XmlElement(required = true)
    protected _OpenlrSideOfRoadEnum openlrSideOfRoad;
    @XmlElement(required = true)
    protected _OpenlrOrientationEnum openlrOrientation;
    @XmlElement(required = true)
    protected OpenlrLocationReferencePoint openlrLocationReferencePoint;
    @XmlElement(required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLocationReferencePoint;
    protected OpenlrOffsets openlrOffsets;
    @XmlElement(name = "_openlrBasePointLocationExtension")
    protected _ExtensionType _OpenlrBasePointLocationExtension;

    /**
     * Gets the value of the openlrSideOfRoad property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrSideOfRoadEnum }
     *     
     */
    public _OpenlrSideOfRoadEnum getOpenlrSideOfRoad() {
        return openlrSideOfRoad;
    }

    /**
     * Sets the value of the openlrSideOfRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrSideOfRoadEnum }
     *     
     */
    public void setOpenlrSideOfRoad(_OpenlrSideOfRoadEnum value) {
        this.openlrSideOfRoad = value;
    }

    /**
     * Gets the value of the openlrOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrOrientationEnum }
     *     
     */
    public _OpenlrOrientationEnum getOpenlrOrientation() {
        return openlrOrientation;
    }

    /**
     * Sets the value of the openlrOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrOrientationEnum }
     *     
     */
    public void setOpenlrOrientation(_OpenlrOrientationEnum value) {
        this.openlrOrientation = value;
    }

    /**
     * Gets the value of the openlrLocationReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLocationReferencePoint }
     *     
     */
    public OpenlrLocationReferencePoint getOpenlrLocationReferencePoint() {
        return openlrLocationReferencePoint;
    }

    /**
     * Sets the value of the openlrLocationReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLocationReferencePoint }
     *     
     */
    public void setOpenlrLocationReferencePoint(OpenlrLocationReferencePoint value) {
        this.openlrLocationReferencePoint = value;
    }

    /**
     * Gets the value of the openlrLastLocationReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public OpenlrLastLocationReferencePoint getOpenlrLastLocationReferencePoint() {
        return openlrLastLocationReferencePoint;
    }

    /**
     * Sets the value of the openlrLastLocationReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public void setOpenlrLastLocationReferencePoint(OpenlrLastLocationReferencePoint value) {
        this.openlrLastLocationReferencePoint = value;
    }

    /**
     * Gets the value of the openlrOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrOffsets }
     *     
     */
    public OpenlrOffsets getOpenlrOffsets() {
        return openlrOffsets;
    }

    /**
     * Sets the value of the openlrOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrOffsets }
     *     
     */
    public void setOpenlrOffsets(OpenlrOffsets value) {
        this.openlrOffsets = value;
    }

    /**
     * Gets the value of the _OpenlrBasePointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrBasePointLocationExtension() {
        return _OpenlrBasePointLocationExtension;
    }

    /**
     * Sets the value of the _OpenlrBasePointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrBasePointLocationExtension(_ExtensionType value) {
        this._OpenlrBasePointLocationExtension = value;
    }

}
