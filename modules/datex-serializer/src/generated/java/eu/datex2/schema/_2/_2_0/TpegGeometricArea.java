
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegGeometricArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegGeometricArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegAreaLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="radius" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger"/&gt;
 *         &lt;element name="centrePoint" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2/2_0}TpegAreaDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="tpegGeometricAreaExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegGeometricArea", propOrder = {
    "radius",
    "centrePoint",
    "name",
    "tpegGeometricAreaExtension"
})
public class TpegGeometricArea
    extends TpegAreaLocation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radius;
    @XmlElement(required = true)
    protected PointCoordinates centrePoint;
    protected TpegAreaDescriptor name;
    protected ExtensionType tpegGeometricAreaExtension;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    /**
     * Gets the value of the centrePoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getCentrePoint() {
        return centrePoint;
    }

    /**
     * Sets the value of the centrePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setCentrePoint(PointCoordinates value) {
        this.centrePoint = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaDescriptor }
     *     
     */
    public TpegAreaDescriptor getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaDescriptor }
     *     
     */
    public void setName(TpegAreaDescriptor value) {
        this.name = value;
    }

    /**
     * Gets the value of the tpegGeometricAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegGeometricAreaExtension() {
        return tpegGeometricAreaExtension;
    }

    /**
     * Sets the value of the tpegGeometricAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegGeometricAreaExtension(ExtensionType value) {
        this.tpegGeometricAreaExtension = value;
    }

}
