
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Holds common data that are used both in OpenlrPointAccessPoint and OpenlrPointAlongLine.
 *       
 * 
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
    "openlrBasePointLocationExtension"
})
@XmlSeeAlso({
    OpenlrPointAlongLine.class,
    OpenlrPoiWithAccessPoint.class
})
public abstract class OpenlrBasePointLocation
    extends OpenlrPointLocationReference
{

    @XmlElement(required = true)
    protected OpenlrSideOfRoadEnum openlrSideOfRoad;
    @XmlElement(required = true)
    protected OpenlrOrientationEnum openlrOrientation;
    @XmlElement(required = true)
    protected OpenlrLocationReferencePoint openlrLocationReferencePoint;
    @XmlElement(required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLocationReferencePoint;
    protected OpenlrOffsets openlrOffsets;
    @XmlElement(name = "_openlrBasePointLocationExtension")
    protected ExtensionType openlrBasePointLocationExtension;

    /**
     * Gets the value of the openlrSideOfRoad property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrSideOfRoadEnum }
     *     
     */
    public OpenlrSideOfRoadEnum getOpenlrSideOfRoad() {
        return openlrSideOfRoad;
    }

    /**
     * Sets the value of the openlrSideOfRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrSideOfRoadEnum }
     *     
     */
    public void setOpenlrSideOfRoad(OpenlrSideOfRoadEnum value) {
        this.openlrSideOfRoad = value;
    }

    /**
     * Gets the value of the openlrOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrOrientationEnum }
     *     
     */
    public OpenlrOrientationEnum getOpenlrOrientation() {
        return openlrOrientation;
    }

    /**
     * Sets the value of the openlrOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrOrientationEnum }
     *     
     */
    public void setOpenlrOrientation(OpenlrOrientationEnum value) {
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
     * Gets the value of the openlrBasePointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrBasePointLocationExtension() {
        return openlrBasePointLocationExtension;
    }

    /**
     * Sets the value of the openlrBasePointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrBasePointLocationExtension(ExtensionType value) {
        this.openlrBasePointLocationExtension = value;
    }

}
