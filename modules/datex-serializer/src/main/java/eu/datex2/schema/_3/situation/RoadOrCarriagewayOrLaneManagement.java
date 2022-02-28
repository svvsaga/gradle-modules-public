
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Road, carriageway or lane management action that is instigated by the network/road
 *         operator.
 *       
 * 
 * <p>Java class for RoadOrCarriagewayOrLaneManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadOrCarriagewayOrLaneManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadOrCarriagewayOrLaneManagementType" type="{http://datex2.eu/schema/3/situation}_RoadOrCarriagewayOrLaneManagementTypeEnum"/&gt;
 *         &lt;element name="minimumCarOccupancy" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="_roadOrCarriagewayOrLaneManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOrCarriagewayOrLaneManagement", propOrder = {
    "roadOrCarriagewayOrLaneManagementType",
    "minimumCarOccupancy",
    "_RoadOrCarriagewayOrLaneManagementExtension"
})
public class RoadOrCarriagewayOrLaneManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected _RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumCarOccupancy;
    @XmlElement(name = "_roadOrCarriagewayOrLaneManagementExtension")
    protected _ExtensionType _RoadOrCarriagewayOrLaneManagementExtension;

    /**
     * Gets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public _RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(_RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        this.roadOrCarriagewayOrLaneManagementType = value;
    }

    /**
     * Gets the value of the minimumCarOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCarOccupancy() {
        return minimumCarOccupancy;
    }

    /**
     * Sets the value of the minimumCarOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCarOccupancy(BigInteger value) {
        this.minimumCarOccupancy = value;
    }

    /**
     * Gets the value of the _RoadOrCarriagewayOrLaneManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RoadOrCarriagewayOrLaneManagementExtension() {
        return _RoadOrCarriagewayOrLaneManagementExtension;
    }

    /**
     * Sets the value of the _RoadOrCarriagewayOrLaneManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RoadOrCarriagewayOrLaneManagementExtension(_ExtensionType value) {
        this._RoadOrCarriagewayOrLaneManagementExtension = value;
    }

}
