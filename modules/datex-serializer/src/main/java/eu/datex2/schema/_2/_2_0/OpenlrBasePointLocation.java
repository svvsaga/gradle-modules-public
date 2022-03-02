
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrSideOfRoad" type="{http://datex2.eu/schema/2/2_0}OpenlrSideOfRoadEnum"/&gt;
 *         &lt;element name="openlrOrientation" type="{http://datex2.eu/schema/2/2_0}OpenlrOrientationEnum"/&gt;
 *         &lt;element name="openlrPositiveOffset" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/2/2_0}OpenlrLocationReferencePoint"/&gt;
 *         &lt;element name="openlrLastLocationReferencePoint" type="{http://datex2.eu/schema/2/2_0}OpenlrLastLocationReferencePoint"/&gt;
 *         &lt;element name="openlrBasePointLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrBasePointLocation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrSideOfRoad",
    "openlrOrientation",
    "openlrPositiveOffset",
    "openlrLocationReferencePoint",
    "openlrLastLocationReferencePoint",
    "openlrBasePointLocationExtension"
})
@XmlSeeAlso({
    OpenlrPointAlongLine.class,
    OpenlrPoiWithAccessPoint.class
})
public abstract class OpenlrBasePointLocation {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected OpenlrSideOfRoadEnum openlrSideOfRoad;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected OpenlrOrientationEnum openlrOrientation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrPositiveOffset;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected OpenlrLocationReferencePoint openlrLocationReferencePoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLocationReferencePoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
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
     * Gets the value of the openlrPositiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrPositiveOffset() {
        return openlrPositiveOffset;
    }

    /**
     * Sets the value of the openlrPositiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrPositiveOffset(BigInteger value) {
        this.openlrPositiveOffset = value;
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
