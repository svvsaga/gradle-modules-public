
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.VehicleCharacteristics;
import eu.datex2.schema._3.locationreferencing.DirectionEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Network management action which is applicable to the road network and its users.
 *       
 * 
 * <p>Java class for NetworkManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="complianceOption" type="{http://datex2.eu/schema/3/situation}_ComplianceOptionEnum"/&gt;
 *         &lt;element name="applicableForTrafficDirection" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applicableForTrafficType" type="{http://datex2.eu/schema/3/situation}_TrafficTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="placesAtWhichApplicable" type="{http://datex2.eu/schema/3/situation}_PlacesEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="automaticallyInitiated" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_networkManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagement", propOrder = {
    "complianceOption",
    "applicableForTrafficDirection",
    "applicableForTrafficType",
    "placesAtWhichApplicable",
    "automaticallyInitiated",
    "forVehiclesWithCharacteristicsOf",
    "networkManagementExtension"
})
@XmlSeeAlso({
    GeneralInstructionOrMessageToRoadUsers.class,
    GeneralNetworkManagement.class,
    ReroutingManagement.class,
    RoadOrCarriagewayOrLaneManagement.class,
    SpeedManagement.class,
    WinterDrivingManagement.class
})
public abstract class NetworkManagement
    extends OperatorAction
{

    @XmlElement(required = true)
    protected ComplianceOptionEnum complianceOption;
    protected List<DirectionEnum> applicableForTrafficDirection;
    protected List<TrafficTypeEnum> applicableForTrafficType;
    protected List<PlacesEnum> placesAtWhichApplicable;
    protected Boolean automaticallyInitiated;
    protected List<VehicleCharacteristics> forVehiclesWithCharacteristicsOf;
    @XmlElement(name = "_networkManagementExtension")
    protected ExtensionType networkManagementExtension;

    /**
     * Gets the value of the complianceOption property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceOptionEnum }
     *     
     */
    public ComplianceOptionEnum getComplianceOption() {
        return complianceOption;
    }

    /**
     * Sets the value of the complianceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceOptionEnum }
     *     
     */
    public void setComplianceOption(ComplianceOptionEnum value) {
        this.complianceOption = value;
    }

    /**
     * Gets the value of the applicableForTrafficDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForTrafficDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForTrafficDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectionEnum }
     * 
     * 
     */
    public List<DirectionEnum> getApplicableForTrafficDirection() {
        if (applicableForTrafficDirection == null) {
            applicableForTrafficDirection = new ArrayList<DirectionEnum>();
        }
        return this.applicableForTrafficDirection;
    }

    /**
     * Gets the value of the applicableForTrafficType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForTrafficType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForTrafficType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficTypeEnum }
     * 
     * 
     */
    public List<TrafficTypeEnum> getApplicableForTrafficType() {
        if (applicableForTrafficType == null) {
            applicableForTrafficType = new ArrayList<TrafficTypeEnum>();
        }
        return this.applicableForTrafficType;
    }

    /**
     * Gets the value of the placesAtWhichApplicable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the placesAtWhichApplicable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacesAtWhichApplicable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacesEnum }
     * 
     * 
     */
    public List<PlacesEnum> getPlacesAtWhichApplicable() {
        if (placesAtWhichApplicable == null) {
            placesAtWhichApplicable = new ArrayList<PlacesEnum>();
        }
        return this.placesAtWhichApplicable;
    }

    /**
     * Gets the value of the automaticallyInitiated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticallyInitiated() {
        return automaticallyInitiated;
    }

    /**
     * Sets the value of the automaticallyInitiated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticallyInitiated(Boolean value) {
        this.automaticallyInitiated = value;
    }

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the forVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForVehiclesWithCharacteristicsOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getForVehiclesWithCharacteristicsOf() {
        if (forVehiclesWithCharacteristicsOf == null) {
            forVehiclesWithCharacteristicsOf = new ArrayList<VehicleCharacteristics>();
        }
        return this.forVehiclesWithCharacteristicsOf;
    }

    /**
     * Gets the value of the networkManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkManagementExtension() {
        return networkManagementExtension;
    }

    /**
     * Sets the value of the networkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkManagementExtension(ExtensionType value) {
        this.networkManagementExtension = value;
    }

}
