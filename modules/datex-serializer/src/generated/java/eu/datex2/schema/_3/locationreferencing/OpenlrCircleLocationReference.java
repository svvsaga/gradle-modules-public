
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
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
@XmlType(name = "OpenlrCircleLocationReference", propOrder = {
    "openlrRadius",
    "openlrGeoCoordinate",
    "_OpenlrCircleLocationReferenceExtension"
})
public class OpenlrCircleLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrRadius;
    @XmlElement(required = true)
    protected OpenlrGeoCoordinate openlrGeoCoordinate;
    @XmlElement(name = "_openlrCircleLocationReferenceExtension")
    protected _ExtensionType _OpenlrCircleLocationReferenceExtension;

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
     * Gets the value of the _OpenlrCircleLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrCircleLocationReferenceExtension() {
        return _OpenlrCircleLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrCircleLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrCircleLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrCircleLocationReferenceExtension = value;
    }

}
