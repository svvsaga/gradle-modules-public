
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingEquipmentOrServiceFacilityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingEquipmentOrServiceFacilityStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfEquipmentOrServiceFacilityOverride" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfSubitemsOverride" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vacantEquipmentOrServiceFacilitySubitems" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="serviceFacilityOpeningStatus" type="{http://datex2.eu/schema/2/2_0}OpeningStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="equipmentOperationStatus" type="{http://datex2.eu/schema/2/2_0}OperationStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacilityStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingEquipmentOrServiceFacilityStatus", propOrder = {
    "numberOfEquipmentOrServiceFacilityOverride",
    "numberOfSubitemsOverride",
    "vacantEquipmentOrServiceFacilitySubitems",
    "serviceFacilityOpeningStatus",
    "equipmentOperationStatus",
    "parkingEquipmentOrServiceFacilityStatusExtension"
})
public class ParkingEquipmentOrServiceFacilityStatus {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfEquipmentOrServiceFacilityOverride;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSubitemsOverride;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vacantEquipmentOrServiceFacilitySubitems;
    @XmlSchemaType(name = "string")
    protected OpeningStatusEnum serviceFacilityOpeningStatus;
    @XmlSchemaType(name = "string")
    protected OperationStatusEnum equipmentOperationStatus;
    protected _ExtensionType parkingEquipmentOrServiceFacilityStatusExtension;

    /**
     * Gets the value of the numberOfEquipmentOrServiceFacilityOverride property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEquipmentOrServiceFacilityOverride() {
        return numberOfEquipmentOrServiceFacilityOverride;
    }

    /**
     * Sets the value of the numberOfEquipmentOrServiceFacilityOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEquipmentOrServiceFacilityOverride(BigInteger value) {
        this.numberOfEquipmentOrServiceFacilityOverride = value;
    }

    /**
     * Gets the value of the numberOfSubitemsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSubitemsOverride() {
        return numberOfSubitemsOverride;
    }

    /**
     * Sets the value of the numberOfSubitemsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSubitemsOverride(BigInteger value) {
        this.numberOfSubitemsOverride = value;
    }

    /**
     * Gets the value of the vacantEquipmentOrServiceFacilitySubitems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVacantEquipmentOrServiceFacilitySubitems() {
        return vacantEquipmentOrServiceFacilitySubitems;
    }

    /**
     * Sets the value of the vacantEquipmentOrServiceFacilitySubitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVacantEquipmentOrServiceFacilitySubitems(BigInteger value) {
        this.vacantEquipmentOrServiceFacilitySubitems = value;
    }

    /**
     * Gets the value of the serviceFacilityOpeningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningStatusEnum }
     *     
     */
    public OpeningStatusEnum getServiceFacilityOpeningStatus() {
        return serviceFacilityOpeningStatus;
    }

    /**
     * Sets the value of the serviceFacilityOpeningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningStatusEnum }
     *     
     */
    public void setServiceFacilityOpeningStatus(OpeningStatusEnum value) {
        this.serviceFacilityOpeningStatus = value;
    }

    /**
     * Gets the value of the equipmentOperationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationStatusEnum }
     *     
     */
    public OperationStatusEnum getEquipmentOperationStatus() {
        return equipmentOperationStatus;
    }

    /**
     * Sets the value of the equipmentOperationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationStatusEnum }
     *     
     */
    public void setEquipmentOperationStatus(OperationStatusEnum value) {
        this.equipmentOperationStatus = value;
    }

    /**
     * Gets the value of the parkingEquipmentOrServiceFacilityStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingEquipmentOrServiceFacilityStatusExtension() {
        return parkingEquipmentOrServiceFacilityStatusExtension;
    }

    /**
     * Sets the value of the parkingEquipmentOrServiceFacilityStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingEquipmentOrServiceFacilityStatusExtension(_ExtensionType value) {
        this.parkingEquipmentOrServiceFacilityStatusExtension = value;
    }

}
