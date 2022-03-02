
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Vehicle;
import eu.datex2.schema._3.common.VehicleTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An obstruction on the road caused by one or more vehicles.
 * 
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
@XmlType(name = "VehicleObstruction", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "vehicleObstructionType",
    "involvedVehicleType",
    "vehicleProblemCause",
    "obstructingVehicle",
    "vehicleObstructionExtension"
})
public class VehicleObstruction
    extends Obstruction
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    protected VehicleObstructionTypeEnum vehicleObstructionType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected VehicleTypeEnum involvedVehicleType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected VehicleProblemCauseEnum vehicleProblemCause;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected List<Vehicle> obstructingVehicle;
    @XmlElement(name = "_vehicleObstructionExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType vehicleObstructionExtension;

    /**
     * Gets the value of the vehicleObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public VehicleObstructionTypeEnum getVehicleObstructionType() {
        return vehicleObstructionType;
    }

    /**
     * Sets the value of the vehicleObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionType(VehicleObstructionTypeEnum value) {
        this.vehicleObstructionType = value;
    }

    /**
     * Gets the value of the involvedVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeEnum }
     *     
     */
    public VehicleTypeEnum getInvolvedVehicleType() {
        return involvedVehicleType;
    }

    /**
     * Sets the value of the involvedVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeEnum }
     *     
     */
    public void setInvolvedVehicleType(VehicleTypeEnum value) {
        this.involvedVehicleType = value;
    }

    /**
     * Gets the value of the vehicleProblemCause property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleProblemCauseEnum }
     *     
     */
    public VehicleProblemCauseEnum getVehicleProblemCause() {
        return vehicleProblemCause;
    }

    /**
     * Sets the value of the vehicleProblemCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleProblemCauseEnum }
     *     
     */
    public void setVehicleProblemCause(VehicleProblemCauseEnum value) {
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
     * Gets the value of the vehicleObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleObstructionExtension() {
        return vehicleObstructionExtension;
    }

    /**
     * Sets the value of the vehicleObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleObstructionExtension(ExtensionType value) {
        this.vehicleObstructionExtension = value;
    }

}
