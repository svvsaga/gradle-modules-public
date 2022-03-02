
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is not bounded by any other points on the road
 *         network.
 *       
 * 
 * <p>Java class for TpegSimplePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegSimplePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegSimplePointLocationType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc01SimplePointLocationSubtypeEnum"/&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"/&gt;
 *         &lt;element name="_tpegSimplePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegSimplePoint", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "tpegSimplePointLocationType",
    "point",
    "tpegSimplePointExtension"
})
public class TpegSimplePoint
    extends TpegPointLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected TpegLoc01SimplePointLocationSubtypeEnum tpegSimplePointLocationType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected TpegPoint point;
    @XmlElement(name = "_tpegSimplePointExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
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
