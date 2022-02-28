
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceVehicles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceVehicles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfMaintenanceVehicles" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehicleActions" type="{http://datex2.eu/schema/2/2_0}MaintenanceVehicleActionsEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehiclesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceVehicles", propOrder = {
    "numberOfMaintenanceVehicles",
    "maintenanceVehicleActions",
    "maintenanceVehiclesExtension"
})
public class MaintenanceVehicles {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfMaintenanceVehicles;
    @XmlSchemaType(name = "string")
    protected List<MaintenanceVehicleActionsEnum> maintenanceVehicleActions;
    protected _ExtensionType maintenanceVehiclesExtension;

    /**
     * Gets the value of the numberOfMaintenanceVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMaintenanceVehicles() {
        return numberOfMaintenanceVehicles;
    }

    /**
     * Sets the value of the numberOfMaintenanceVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMaintenanceVehicles(BigInteger value) {
        this.numberOfMaintenanceVehicles = value;
    }

    /**
     * Gets the value of the maintenanceVehicleActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceVehicleActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceVehicleActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceVehicleActionsEnum }
     * 
     * 
     */
    public List<MaintenanceVehicleActionsEnum> getMaintenanceVehicleActions() {
        if (maintenanceVehicleActions == null) {
            maintenanceVehicleActions = new ArrayList<MaintenanceVehicleActionsEnum>();
        }
        return this.maintenanceVehicleActions;
    }

    /**
     * Gets the value of the maintenanceVehiclesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getMaintenanceVehiclesExtension() {
        return maintenanceVehiclesExtension;
    }

    /**
     * Sets the value of the maintenanceVehiclesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setMaintenanceVehiclesExtension(_ExtensionType value) {
        this.maintenanceVehiclesExtension = value;
    }

}
