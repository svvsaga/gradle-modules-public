
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Holds common data that are used both in OpenlrPointAccessPoint and OpenlrPointAlongLine.
 *       
 * 
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
    "openlrPointAttributesExtension"
})
public class OpenlrPointAttributes {

    protected OpenlrSideOfRoadEnum openlrSideOfRoad;
    protected OpenlrOrientationEnum openlrOrientation;
    @XmlElement(name = "_openlrPointAttributesExtension")
    protected ExtensionType openlrPointAttributesExtension;

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
     * Gets the value of the openlrPointAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPointAttributesExtension() {
        return openlrPointAttributesExtension;
    }

    /**
     * Sets the value of the openlrPointAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPointAttributesExtension(ExtensionType value) {
        this.openlrPointAttributesExtension = value;
    }

}
