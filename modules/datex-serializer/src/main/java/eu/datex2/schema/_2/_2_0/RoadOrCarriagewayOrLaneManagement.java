
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOrCarriagewayOrLaneManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadOrCarriagewayOrLaneManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadOrCarriagewayOrLaneManagementType" type="{http://datex2.eu/schema/2/2_0}RoadOrCarriagewayOrLaneManagementTypeEnum"/&gt;
 *         &lt;element name="minimumCarOccupancy" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="roadOrCarriagewayOrLaneManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "roadOrCarriagewayOrLaneManagementExtension"
})
public class RoadOrCarriagewayOrLaneManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumCarOccupancy;
    protected _ExtensionType roadOrCarriagewayOrLaneManagementExtension;

    /**
     * Gets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(RoadOrCarriagewayOrLaneManagementTypeEnum value) {
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
     * Gets the value of the roadOrCarriagewayOrLaneManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getRoadOrCarriagewayOrLaneManagementExtension() {
        return roadOrCarriagewayOrLaneManagementExtension;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementExtension(_ExtensionType value) {
        this.roadOrCarriagewayOrLaneManagementExtension = value;
    }

}
