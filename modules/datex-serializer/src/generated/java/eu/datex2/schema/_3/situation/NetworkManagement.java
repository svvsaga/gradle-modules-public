
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.VehicleCharacteristics;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing._DirectionEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "_NetworkManagementExtension"
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
    protected _ComplianceOptionEnum complianceOption;
    protected List<_DirectionEnum> applicableForTrafficDirection;
    protected List<_TrafficTypeEnum> applicableForTrafficType;
    protected List<_PlacesEnum> placesAtWhichApplicable;
    protected Boolean automaticallyInitiated;
    protected List<VehicleCharacteristics> forVehiclesWithCharacteristicsOf;
    @XmlElement(name = "_networkManagementExtension")
    protected _ExtensionType _NetworkManagementExtension;

    /**
     * Gets the value of the complianceOption property.
     * 
     * @return
     *     possible object is
     *     {@link _ComplianceOptionEnum }
     *     
     */
    public _ComplianceOptionEnum getComplianceOption() {
        return complianceOption;
    }

    /**
     * Sets the value of the complianceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ComplianceOptionEnum }
     *     
     */
    public void setComplianceOption(_ComplianceOptionEnum value) {
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
     * {@link _DirectionEnum }
     * 
     * 
     */
    public List<_DirectionEnum> getApplicableForTrafficDirection() {
        if (applicableForTrafficDirection == null) {
            applicableForTrafficDirection = new ArrayList<_DirectionEnum>();
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
     * {@link _TrafficTypeEnum }
     * 
     * 
     */
    public List<_TrafficTypeEnum> getApplicableForTrafficType() {
        if (applicableForTrafficType == null) {
            applicableForTrafficType = new ArrayList<_TrafficTypeEnum>();
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
     * {@link _PlacesEnum }
     * 
     * 
     */
    public List<_PlacesEnum> getPlacesAtWhichApplicable() {
        if (placesAtWhichApplicable == null) {
            placesAtWhichApplicable = new ArrayList<_PlacesEnum>();
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
     * Gets the value of the _NetworkManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NetworkManagementExtension() {
        return _NetworkManagementExtension;
    }

    /**
     * Sets the value of the _NetworkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NetworkManagementExtension(_ExtensionType value) {
        this._NetworkManagementExtension = value;
    }

}
