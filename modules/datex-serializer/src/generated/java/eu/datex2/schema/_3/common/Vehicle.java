
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anonymizedVehicleReference" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleColour" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountryOfOrigin" type="{http://datex2.eu/schema/3/common}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="vehicleIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleManufacturer" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleModel" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleRegistrationPlateIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/3/common}_VehicleStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="axleSpacingOnVehicle" type="{http://datex2.eu/schema/3/common}AxleSpacing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specificAxleWeight" type="{http://datex2.eu/schema/3/common}AxleWeight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardousGoodsAssociatedWithVehicle" type="{http://datex2.eu/schema/3/common}HazardousMaterials" minOccurs="0"/&gt;
 *         &lt;element name="_vehicleExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "anonymizedVehicleReference",
    "vehicleColour",
    "vehicleCountryOfOrigin",
    "vehicleIdentifier",
    "vehicleManufacturer",
    "vehicleModel",
    "vehicleRegistrationPlateIdentifier",
    "vehicleStatus",
    "vehicleCharacteristics",
    "axleSpacingOnVehicle",
    "specificAxleWeight",
    "hazardousGoodsAssociatedWithVehicle",
    "_VehicleExtension"
})
public class Vehicle {

    protected String anonymizedVehicleReference;
    protected MultilingualString vehicleColour;
    protected String vehicleCountryOfOrigin;
    protected String vehicleIdentifier;
    protected String vehicleManufacturer;
    protected String vehicleModel;
    protected String vehicleRegistrationPlateIdentifier;
    protected _VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected List<AxleSpacing> axleSpacingOnVehicle;
    protected List<AxleWeight> specificAxleWeight;
    protected HazardousMaterials hazardousGoodsAssociatedWithVehicle;
    @XmlElement(name = "_vehicleExtension")
    protected _ExtensionType _VehicleExtension;

    /**
     * Gets the value of the anonymizedVehicleReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymizedVehicleReference() {
        return anonymizedVehicleReference;
    }

    /**
     * Sets the value of the anonymizedVehicleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymizedVehicleReference(String value) {
        this.anonymizedVehicleReference = value;
    }

    /**
     * Gets the value of the vehicleColour property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleColour() {
        return vehicleColour;
    }

    /**
     * Sets the value of the vehicleColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleColour(MultilingualString value) {
        this.vehicleColour = value;
    }

    /**
     * Gets the value of the vehicleCountryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCountryOfOrigin() {
        return vehicleCountryOfOrigin;
    }

    /**
     * Sets the value of the vehicleCountryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCountryOfOrigin(String value) {
        this.vehicleCountryOfOrigin = value;
    }

    /**
     * Gets the value of the vehicleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    /**
     * Sets the value of the vehicleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentifier(String value) {
        this.vehicleIdentifier = value;
    }

    /**
     * Gets the value of the vehicleManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    /**
     * Sets the value of the vehicleManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturer(String value) {
        this.vehicleManufacturer = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the vehicleRegistrationPlateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationPlateIdentifier() {
        return vehicleRegistrationPlateIdentifier;
    }

    /**
     * Sets the value of the vehicleRegistrationPlateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationPlateIdentifier(String value) {
        this.vehicleRegistrationPlateIdentifier = value;
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
     * Gets the value of the axleSpacingOnVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the axleSpacingOnVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxleSpacingOnVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleSpacing }
     * 
     * 
     */
    public List<AxleSpacing> getAxleSpacingOnVehicle() {
        if (axleSpacingOnVehicle == null) {
            axleSpacingOnVehicle = new ArrayList<AxleSpacing>();
        }
        return this.axleSpacingOnVehicle;
    }

    /**
     * Gets the value of the specificAxleWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificAxleWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificAxleWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleWeight }
     * 
     * 
     */
    public List<AxleWeight> getSpecificAxleWeight() {
        if (specificAxleWeight == null) {
            specificAxleWeight = new ArrayList<AxleWeight>();
        }
        return this.specificAxleWeight;
    }

    /**
     * Gets the value of the hazardousGoodsAssociatedWithVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousMaterials }
     *     
     */
    public HazardousMaterials getHazardousGoodsAssociatedWithVehicle() {
        return hazardousGoodsAssociatedWithVehicle;
    }

    /**
     * Sets the value of the hazardousGoodsAssociatedWithVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousMaterials }
     *     
     */
    public void setHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        this.hazardousGoodsAssociatedWithVehicle = value;
    }

    /**
     * Gets the value of the _VehicleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VehicleExtension() {
        return _VehicleExtension;
    }

    /**
     * Sets the value of the _VehicleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VehicleExtension(_ExtensionType value) {
        this._VehicleExtension = value;
    }

}
