
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="numberOfMaintenanceVehicles" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehicleActions" type="{http://datex2.eu/schema/3/situation}_MaintenanceVehicleActionsEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_maintenanceVehiclesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    protected List<MaintenanceVehicleActionsEnum> maintenanceVehicleActions;
    @XmlElement(name = "_maintenanceVehiclesExtension")
    protected ExtensionType maintenanceVehiclesExtension;

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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMaintenanceVehiclesExtension() {
        return maintenanceVehiclesExtension;
    }

    /**
     * Sets the value of the maintenanceVehiclesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMaintenanceVehiclesExtension(ExtensionType value) {
        this.maintenanceVehiclesExtension = value;
    }

}
