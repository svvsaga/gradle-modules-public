
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Line attributes are part of a location reference point and consists of functional road
 *         class (FRC),form of way (FOW) and bearing (BEAR) data.
 *       
 * 
 * <p>Java class for OpenlrLineAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLineAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrFunctionalRoadClass" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFunctionalRoadClassEnum"/&gt;
 *         &lt;element name="openlrFormOfWay" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFormOfWayEnum"/&gt;
 *         &lt;element name="openlrBearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees"/&gt;
 *         &lt;element name="_openlrLineAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLineAttributes", propOrder = {
    "openlrFunctionalRoadClass",
    "openlrFormOfWay",
    "openlrBearing",
    "_OpenlrLineAttributesExtension"
})
public class OpenlrLineAttributes {

    @XmlElement(required = true)
    protected _OpenlrFunctionalRoadClassEnum openlrFunctionalRoadClass;
    @XmlElement(required = true)
    protected _OpenlrFormOfWayEnum openlrFormOfWay;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int openlrBearing;
    @XmlElement(name = "_openlrLineAttributesExtension")
    protected _ExtensionType _OpenlrLineAttributesExtension;

    /**
     * Gets the value of the openlrFunctionalRoadClass property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public _OpenlrFunctionalRoadClassEnum getOpenlrFunctionalRoadClass() {
        return openlrFunctionalRoadClass;
    }

    /**
     * Sets the value of the openlrFunctionalRoadClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrFunctionalRoadClass(_OpenlrFunctionalRoadClassEnum value) {
        this.openlrFunctionalRoadClass = value;
    }

    /**
     * Gets the value of the openlrFormOfWay property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrFormOfWayEnum }
     *     
     */
    public _OpenlrFormOfWayEnum getOpenlrFormOfWay() {
        return openlrFormOfWay;
    }

    /**
     * Sets the value of the openlrFormOfWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrFormOfWayEnum }
     *     
     */
    public void setOpenlrFormOfWay(_OpenlrFormOfWayEnum value) {
        this.openlrFormOfWay = value;
    }

    /**
     * Gets the value of the openlrBearing property.
     * 
     */
    public int getOpenlrBearing() {
        return openlrBearing;
    }

    /**
     * Sets the value of the openlrBearing property.
     * 
     */
    public void setOpenlrBearing(int value) {
        this.openlrBearing = value;
    }

    /**
     * Gets the value of the _OpenlrLineAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLineAttributesExtension() {
        return _OpenlrLineAttributesExtension;
    }

    /**
     * Sets the value of the _OpenlrLineAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLineAttributesExtension(_ExtensionType value) {
        this._OpenlrLineAttributesExtension = value;
    }

}
