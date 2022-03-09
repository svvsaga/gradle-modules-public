
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfVehiclesInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfVehiclesInvolved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfVehicles" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/3/common}_VehicleStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="_groupOfVehiclesInvolvedExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfVehiclesInvolved", propOrder = {
    "numberOfVehicles",
    "vehicleStatus",
    "vehicleCharacteristics",
    "_GroupOfVehiclesInvolvedExtension"
})
public class GroupOfVehiclesInvolved {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVehicles;
    protected _VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    @XmlElement(name = "_groupOfVehiclesInvolvedExtension")
    protected _ExtensionType _GroupOfVehiclesInvolvedExtension;

    /**
     * Gets the value of the numberOfVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Sets the value of the numberOfVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehicles(BigInteger value) {
        this.numberOfVehicles = value;
    }

    /**
     * Gets the value of the vehicleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleStatusEnum }
     *     
     */
    public _VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Sets the value of the vehicleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleStatusEnum }
     *     
     */
    public void setVehicleStatus(_VehicleStatusEnum value) {
        this.vehicleStatus = value;
    }

    /**
     * Gets the value of the vehicleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getVehicleCharacteristics() {
        return vehicleCharacteristics;
    }

    /**
     * Sets the value of the vehicleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setVehicleCharacteristics(VehicleCharacteristics value) {
        this.vehicleCharacteristics = value;
    }

    /**
     * Gets the value of the _GroupOfVehiclesInvolvedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GroupOfVehiclesInvolvedExtension() {
        return _GroupOfVehiclesInvolvedExtension;
    }

    /**
     * Sets the value of the _GroupOfVehiclesInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GroupOfVehiclesInvolvedExtension(_ExtensionType value) {
        this._GroupOfVehiclesInvolvedExtension = value;
    }

}
