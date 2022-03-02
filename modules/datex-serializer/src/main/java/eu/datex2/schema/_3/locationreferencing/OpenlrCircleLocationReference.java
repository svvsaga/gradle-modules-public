
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The OpenLR method of area definition by providing a center position and a radius
 *       
 * 
 * <p>Java class for OpenlrCircleLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrCircleLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrRadius" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger"/&gt;
 *         &lt;element name="openlrGeoCoordinate" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrGeoCoordinate"/&gt;
 *         &lt;element name="_openlrCircleLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrCircleLocationReference", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "openlrRadius",
    "openlrGeoCoordinate",
    "openlrCircleLocationReferenceExtension"
})
public class OpenlrCircleLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrRadius;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected OpenlrGeoCoordinate openlrGeoCoordinate;
    @XmlElement(name = "_openlrCircleLocationReferenceExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrCircleLocationReferenceExtension;

    /**
     * Gets the value of the openlrRadius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrRadius() {
        return openlrRadius;
    }

    /**
     * Sets the value of the openlrRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrRadius(BigInteger value) {
        this.openlrRadius = value;
    }

    /**
     * Gets the value of the openlrGeoCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrGeoCoordinate }
     *     
     */
    public OpenlrGeoCoordinate getOpenlrGeoCoordinate() {
        return openlrGeoCoordinate;
    }

    /**
     * Sets the value of the openlrGeoCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrGeoCoordinate }
     *     
     */
    public void setOpenlrGeoCoordinate(OpenlrGeoCoordinate value) {
        this.openlrGeoCoordinate = value;
    }

    /**
     * Gets the value of the openlrCircleLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrCircleLocationReferenceExtension() {
        return openlrCircleLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrCircleLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrCircleLocationReferenceExtension(ExtensionType value) {
        this.openlrCircleLocationReferenceExtension = value;
    }

}
