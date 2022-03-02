
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegFramedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegFramedPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegFramedPointLocationType" type="{http://datex2.eu/schema/2/2_0}TpegLoc01FramedPointLocationSubtypeEnum"/&gt;
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/2/2_0}TpegNonJunctionPoint"/&gt;
 *         &lt;element name="to" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/&gt;
 *         &lt;element name="from" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/&gt;
 *         &lt;element name="tpegFramedPointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegFramedPoint", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegFramedPointLocationType",
    "framedPoint",
    "to",
    "from",
    "tpegFramedPointExtension"
})
public class TpegFramedPoint
    extends TpegPointLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01FramedPointLocationSubtypeEnum tpegFramedPointLocationType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected TpegNonJunctionPoint framedPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected TpegPoint to;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected TpegPoint from;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegFramedPointExtension;

    /**
     * Gets the value of the tpegFramedPointLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01FramedPointLocationSubtypeEnum getTpegFramedPointLocationType() {
        return tpegFramedPointLocationType;
    }

    /**
     * Sets the value of the tpegFramedPointLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegFramedPointLocationType = value;
    }

    /**
     * Gets the value of the framedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public TpegNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Sets the value of the framedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public void setFramedPoint(TpegNonJunctionPoint value) {
        this.framedPoint = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the tpegFramedPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegFramedPointExtension() {
        return tpegFramedPointExtension;
    }

    /**
     * Sets the value of the tpegFramedPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegFramedPointExtension(ExtensionType value) {
        this.tpegFramedPointExtension = value;
    }

}
