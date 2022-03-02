
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegSimplePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegSimplePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegSimplePointLocationType" type="{http://datex2.eu/schema/2/2_0}TpegLoc01SimplePointLocationSubtypeEnum"/&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/&gt;
 *         &lt;element name="tpegSimplePointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegSimplePoint", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegSimplePointLocationType",
    "point",
    "tpegSimplePointExtension"
})
public class TpegSimplePoint
    extends TpegPointLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01SimplePointLocationSubtypeEnum tpegSimplePointLocationType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected TpegPoint point;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegSimplePointExtension;

    /**
     * Gets the value of the tpegSimplePointLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01SimplePointLocationSubtypeEnum getTpegSimplePointLocationType() {
        return tpegSimplePointLocationType;
    }

    /**
     * Sets the value of the tpegSimplePointLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegSimplePointLocationType(TpegLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegSimplePointLocationType = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setPoint(TpegPoint value) {
        this.point = value;
    }

    /**
     * Gets the value of the tpegSimplePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegSimplePointExtension() {
        return tpegSimplePointExtension;
    }

    /**
     * Sets the value of the tpegSimplePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegSimplePointExtension(ExtensionType value) {
        this.tpegSimplePointExtension = value;
    }

}
