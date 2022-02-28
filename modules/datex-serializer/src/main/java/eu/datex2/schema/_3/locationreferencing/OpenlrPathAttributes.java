
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Properties of the path from the associated location reference point to the next location
 *         reference point, which are specified to assist correct identification of the point in an external map
 *         data source.
 *       
 * 
 * <p>Java class for OpenlrPathAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPathAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLowestFrcToNextLRPoint" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFunctionalRoadClassEnum"/&gt;
 *         &lt;element name="openlrDistanceToNextLRPoint" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="_openlrPathAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPathAttributes", propOrder = {
    "openlrLowestFrcToNextLRPoint",
    "openlrDistanceToNextLRPoint",
    "_OpenlrPathAttributesExtension"
})
public class OpenlrPathAttributes {

    @XmlElement(required = true)
    protected _OpenlrFunctionalRoadClassEnum openlrLowestFrcToNextLRPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrDistanceToNextLRPoint;
    @XmlElement(name = "_openlrPathAttributesExtension")
    protected _ExtensionType _OpenlrPathAttributesExtension;

    /**
     * Gets the value of the openlrLowestFrcToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public _OpenlrFunctionalRoadClassEnum getOpenlrLowestFrcToNextLRPoint() {
        return openlrLowestFrcToNextLRPoint;
    }

    /**
     * Sets the value of the openlrLowestFrcToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrLowestFrcToNextLRPoint(_OpenlrFunctionalRoadClassEnum value) {
        this.openlrLowestFrcToNextLRPoint = value;
    }

    /**
     * Gets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrDistanceToNextLRPoint() {
        return openlrDistanceToNextLRPoint;
    }

    /**
     * Sets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrDistanceToNextLRPoint(BigInteger value) {
        this.openlrDistanceToNextLRPoint = value;
    }

    /**
     * Gets the value of the _OpenlrPathAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPathAttributesExtension() {
        return _OpenlrPathAttributesExtension;
    }

    /**
     * Sets the value of the _OpenlrPathAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPathAttributesExtension(_ExtensionType value) {
        this._OpenlrPathAttributesExtension = value;
    }

}
