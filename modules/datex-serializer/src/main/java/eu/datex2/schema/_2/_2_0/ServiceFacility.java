
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFacility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFacility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingEquipmentOrServiceFacility"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceFacilityType" type="{http://datex2.eu/schema/2/2_0}ServiceFacilityTypeEnum"/&gt;
 *         &lt;element name="numberOfSubitems" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromParkingSite" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="serviceFacilityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFacility", propOrder = {
    "serviceFacilityType",
    "numberOfSubitems",
    "distanceFromParkingSite",
    "serviceFacilityExtension"
})
public class ServiceFacility
    extends ParkingEquipmentOrServiceFacility
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceFacilityTypeEnum serviceFacilityType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSubitems;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromParkingSite;
    protected _ExtensionType serviceFacilityExtension;

    /**
     * Gets the value of the serviceFacilityType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilityTypeEnum }
     *     
     */
    public ServiceFacilityTypeEnum getServiceFacilityType() {
        return serviceFacilityType;
    }

    /**
     * Sets the value of the serviceFacilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilityTypeEnum }
     *     
     */
    public void setServiceFacilityType(ServiceFacilityTypeEnum value) {
        this.serviceFacilityType = value;
    }

    /**
     * Gets the value of the numberOfSubitems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSubitems() {
        return numberOfSubitems;
    }

    /**
     * Sets the value of the numberOfSubitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSubitems(BigInteger value) {
        this.numberOfSubitems = value;
    }

    /**
     * Gets the value of the distanceFromParkingSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromParkingSite() {
        return distanceFromParkingSite;
    }

    /**
     * Sets the value of the distanceFromParkingSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromParkingSite(BigInteger value) {
        this.distanceFromParkingSite = value;
    }

    /**
     * Gets the value of the serviceFacilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getServiceFacilityExtension() {
        return serviceFacilityExtension;
    }

    /**
     * Sets the value of the serviceFacilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setServiceFacilityExtension(_ExtensionType value) {
        this.serviceFacilityExtension = value;
    }

}
