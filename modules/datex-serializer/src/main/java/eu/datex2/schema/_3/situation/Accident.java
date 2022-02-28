
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.GroupOfVehiclesInvolved;
import eu.datex2.schema._3.common.Vehicle;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Accidents are events where one or more vehicles are involved in collisions or in leaving
 *         the roadway. These include collisions between vehicles or with other road users or obstacles.
 *       
 * 
 * <p>Java class for Accident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accident"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accidentCause" type="{http://datex2.eu/schema/3/situation}_AccidentCauseEnum" minOccurs="0"/&gt;
 *         &lt;element name="accidentType" type="{http://datex2.eu/schema/3/situation}_AccidentTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="collisionType" type="{http://datex2.eu/schema/3/situation}_CollisionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfPeopleInvolved" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfVehiclesInvolved" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInvolved" type="{http://datex2.eu/schema/3/common}Vehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfVehiclesInvolved" type="{http://datex2.eu/schema/3/common}GroupOfVehiclesInvolved" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfPeopleInvolved" type="{http://datex2.eu/schema/3/situation}GroupOfPeopleInvolved" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_accidentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accident", propOrder = {
    "accidentCause",
    "accidentType",
    "collisionType",
    "totalNumberOfPeopleInvolved",
    "totalNumberOfVehiclesInvolved",
    "vehicleInvolved",
    "groupOfVehiclesInvolved",
    "groupOfPeopleInvolved",
    "_AccidentExtension"
})
public class Accident
    extends TrafficElement
{

    protected _AccidentCauseEnum accidentCause;
    @XmlElement(required = true)
    protected List<_AccidentTypeEnum> accidentType;
    protected _CollisionTypeEnum collisionType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfPeopleInvolved;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfVehiclesInvolved;
    protected List<Vehicle> vehicleInvolved;
    protected List<GroupOfVehiclesInvolved> groupOfVehiclesInvolved;
    protected List<GroupOfPeopleInvolved> groupOfPeopleInvolved;
    @XmlElement(name = "_accidentExtension")
    protected _ExtensionType _AccidentExtension;

    /**
     * Gets the value of the accidentCause property.
     * 
     * @return
     *     possible object is
     *     {@link _AccidentCauseEnum }
     *     
     */
    public _AccidentCauseEnum getAccidentCause() {
        return accidentCause;
    }

    /**
     * Sets the value of the accidentCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AccidentCauseEnum }
     *     
     */
    public void setAccidentCause(_AccidentCauseEnum value) {
        this.accidentCause = value;
    }

    /**
     * Gets the value of the accidentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accidentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _AccidentTypeEnum }
     * 
     * 
     */
    public List<_AccidentTypeEnum> getAccidentType() {
        if (accidentType == null) {
            accidentType = new ArrayList<_AccidentTypeEnum>();
        }
        return this.accidentType;
    }

    /**
     * Gets the value of the collisionType property.
     * 
     * @return
     *     possible object is
     *     {@link _CollisionTypeEnum }
     *     
     */
    public _CollisionTypeEnum getCollisionType() {
        return collisionType;
    }

    /**
     * Sets the value of the collisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CollisionTypeEnum }
     *     
     */
    public void setCollisionType(_CollisionTypeEnum value) {
        this.collisionType = value;
    }

    /**
     * Gets the value of the totalNumberOfPeopleInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfPeopleInvolved() {
        return totalNumberOfPeopleInvolved;
    }

    /**
     * Sets the value of the totalNumberOfPeopleInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfPeopleInvolved(BigInteger value) {
        this.totalNumberOfPeopleInvolved = value;
    }

    /**
     * Gets the value of the totalNumberOfVehiclesInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfVehiclesInvolved() {
        return totalNumberOfVehiclesInvolved;
    }

    /**
     * Sets the value of the totalNumberOfVehiclesInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfVehiclesInvolved(BigInteger value) {
        this.totalNumberOfVehiclesInvolved = value;
    }

    /**
     * Gets the value of the vehicleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicleInvolved() {
        if (vehicleInvolved == null) {
            vehicleInvolved = new ArrayList<Vehicle>();
        }
        return this.vehicleInvolved;
    }

    /**
     * Gets the value of the groupOfVehiclesInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfVehiclesInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfVehiclesInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfVehiclesInvolved }
     * 
     * 
     */
    public List<GroupOfVehiclesInvolved> getGroupOfVehiclesInvolved() {
        if (groupOfVehiclesInvolved == null) {
            groupOfVehiclesInvolved = new ArrayList<GroupOfVehiclesInvolved>();
        }
        return this.groupOfVehiclesInvolved;
    }

    /**
     * Gets the value of the groupOfPeopleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfPeopleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfPeopleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfPeopleInvolved }
     * 
     * 
     */
    public List<GroupOfPeopleInvolved> getGroupOfPeopleInvolved() {
        if (groupOfPeopleInvolved == null) {
            groupOfPeopleInvolved = new ArrayList<GroupOfPeopleInvolved>();
        }
        return this.groupOfPeopleInvolved;
    }

    /**
     * Gets the value of the _AccidentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AccidentExtension() {
        return _AccidentExtension;
    }

    /**
     * Sets the value of the _AccidentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AccidentExtension(_ExtensionType value) {
        this._AccidentExtension = value;
    }

}
