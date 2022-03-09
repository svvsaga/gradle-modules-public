
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPointAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPointAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrSideOfRoad" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrSideOfRoadEnum" minOccurs="0"/&gt;
 *         &lt;element name="openlrOrientation" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrOrientationEnum" minOccurs="0"/&gt;
 *         &lt;element name="_openlrPointAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPointAttributes", propOrder = {
    "openlrSideOfRoad",
    "openlrOrientation",
    "_OpenlrPointAttributesExtension"
})
public class OpenlrPointAttributes {

    protected _OpenlrSideOfRoadEnum openlrSideOfRoad;
    protected _OpenlrOrientationEnum openlrOrientation;
    @XmlElement(name = "_openlrPointAttributesExtension")
    protected _ExtensionType _OpenlrPointAttributesExtension;

    /**
     * Gets the value of the openlrSideOfRoad property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrSideOfRoadEnum }
     *     
     */
    public _OpenlrSideOfRoadEnum getOpenlrSideOfRoad() {
        return openlrSideOfRoad;
    }

    /**
     * Sets the value of the openlrSideOfRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrSideOfRoadEnum }
     *     
     */
    public void setOpenlrSideOfRoad(_OpenlrSideOfRoadEnum value) {
        this.openlrSideOfRoad = value;
    }

    /**
     * Gets the value of the openlrOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrOrientationEnum }
     *     
     */
    public _OpenlrOrientationEnum getOpenlrOrientation() {
        return openlrOrientation;
    }

    /**
     * Sets the value of the openlrOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrOrientationEnum }
     *     
     */
    public void setOpenlrOrientation(_OpenlrOrientationEnum value) {
        this.openlrOrientation = value;
    }

    /**
     * Gets the value of the _OpenlrPointAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPointAttributesExtension() {
        return _OpenlrPointAttributesExtension;
    }

    /**
     * Sets the value of the _OpenlrPointAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPointAttributesExtension(_ExtensionType value) {
        this._OpenlrPointAttributesExtension = value;
    }

}
