
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.Vehicle;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._VehicleTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleObstructionType" type="{http://datex2.eu/schema/3/situation}_VehicleObstructionTypeEnum"/&gt;
 *         &lt;element name="involvedVehicleType" type="{http://datex2.eu/schema/3/common}_VehicleTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleProblemCause" type="{http://datex2.eu/schema/3/situation}_VehicleProblemCauseEnum" minOccurs="0"/&gt;
 *         &lt;element name="obstructingVehicle" type="{http://datex2.eu/schema/3/common}Vehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_vehicleObstructionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleObstruction", propOrder = {
    "vehicleObstructionType",
    "involvedVehicleType",
    "vehicleProblemCause",
    "obstructingVehicle",
    "_VehicleObstructionExtension"
})
public class VehicleObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    protected _VehicleObstructionTypeEnum vehicleObstructionType;
    protected _VehicleTypeEnum involvedVehicleType;
    protected _VehicleProblemCauseEnum vehicleProblemCause;
    protected List<Vehicle> obstructingVehicle;
    @XmlElement(name = "_vehicleObstructionExtension")
    protected _ExtensionType _VehicleObstructionExtension;

    /**
     * Gets the value of the vehicleObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleObstructionTypeEnum }
     *     
     */
    public _VehicleObstructionTypeEnum getVehicleObstructionType() {
        return vehicleObstructionType;
    }

    /**
     * Sets the value of the vehicleObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionType(_VehicleObstructionTypeEnum value) {
        this.vehicleObstructionType = value;
    }

    /**
     * Gets the value of the involvedVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleTypeEnum }
     *     
     */
    public _VehicleTypeEnum getInvolvedVehicleType() {
        return involvedVehicleType;
    }

    /**
     * Sets the value of the involvedVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleTypeEnum }
     *     
     */
    public void setInvolvedVehicleType(_VehicleTypeEnum value) {
        this.involvedVehicleType = value;
    }

    /**
     * Gets the value of the vehicleProblemCause property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleProblemCauseEnum }
     *     
     */
    public _VehicleProblemCauseEnum getVehicleProblemCause() {
        return vehicleProblemCause;
    }

    /**
     * Sets the value of the vehicleProblemCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleProblemCauseEnum }
     *     
     */
    public void setVehicleProblemCause(_VehicleProblemCauseEnum value) {
        this.vehicleProblemCause = value;
    }

    /**
     * Gets the value of the obstructingVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obstructingVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructingVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getObstructingVehicle() {
        if (obstructingVehicle == null) {
            obstructingVehicle = new ArrayList<Vehicle>();
        }
        return this.obstructingVehicle;
    }

    /**
     * Gets the value of the _VehicleObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VehicleObstructionExtension() {
        return _VehicleObstructionExtension;
    }

    /**
     * Sets the value of the _VehicleObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VehicleObstructionExtension(_ExtensionType value) {
        this._VehicleObstructionExtension = value;
    }

}
