
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleObstructionType" type="{http://datex2.eu/schema/2/2_0}VehicleObstructionTypeEnum"/&gt;
 *         &lt;element name="obstructingVehicle" type="{http://datex2.eu/schema/2/2_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleObstructionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "obstructingVehicle",
    "vehicleObstructionExtension"
})
public class VehicleObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VehicleObstructionTypeEnum vehicleObstructionType;
    protected List<Vehicle> obstructingVehicle;
    protected _ExtensionType vehicleObstructionExtension;

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
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVehicleObstructionExtension() {
        return vehicleObstructionExtension;
    }

    /**
     * Sets the value of the vehicleObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVehicleObstructionExtension(_ExtensionType value) {
        this.vehicleObstructionExtension = value;
    }

}
