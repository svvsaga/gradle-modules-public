
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingReservation" type="{http://datex2.eu/schema/2/2_0}ReservationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingLayout" type="{http://datex2.eu/schema/2/2_0}ParkingLayoutEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="highestFloor" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/&gt;
 *         &lt;element name="lowestFloor" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/&gt;
 *         &lt;element name="temporaryParking" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteAddress" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reservationService" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingUsageScenario" type="{http://datex2.eu/schema/2/2_0}_ParkingSiteScenarioIndexParkingUsageScenario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="openingTimes" type="{http://datex2.eu/schema/2/2_0}OpeningTimes" minOccurs="0"/&gt;
 *         &lt;element name="parkingAccess" type="{http://datex2.eu/schema/2/2_0}ParkingAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingStandardsAndSecurity" type="{http://datex2.eu/schema/2/2_0}ParkingStandardsAndSecurity" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSite", propOrder = {
    "parkingReservation",
    "parkingLayout",
    "highestFloor",
    "lowestFloor",
    "temporaryParking",
    "parkingSiteAddress",
    "reservationService",
    "parkingUsageScenario",
    "openingTimes",
    "parkingAccess",
    "parkingStandardsAndSecurity",
    "parkingSiteExtension"
})
@XmlSeeAlso({
    InterUrbanParkingSite.class,
    SpecialLocationParkingSite.class,
    UrbanParkingSite.class
})
public abstract class ParkingSite
    extends ParkingRecord
{

    @XmlSchemaType(name = "string")
    protected ReservationTypeEnum parkingReservation;
    @XmlSchemaType(name = "string")
    protected List<ParkingLayoutEnum> parkingLayout;
    protected BigInteger highestFloor;
    protected BigInteger lowestFloor;
    protected Boolean temporaryParking;
    protected List<Contact> parkingSiteAddress;
    protected List<Contact> reservationService;
    protected List<ParkingSiteScenarioIndexParkingUsageScenario> parkingUsageScenario;
    protected OpeningTimes openingTimes;
    protected List<ParkingAccess> parkingAccess;
    protected ParkingStandardsAndSecurity parkingStandardsAndSecurity;
    protected ExtensionType parkingSiteExtension;

    /**
     * Gets the value of the parkingReservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationTypeEnum }
     *     
     */
    public ReservationTypeEnum getParkingReservation() {
        return parkingReservation;
    }

    /**
     * Sets the value of the parkingReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationTypeEnum }
     *     
     */
    public void setParkingReservation(ReservationTypeEnum value) {
        this.parkingReservation = value;
    }

    /**
     * Gets the value of the parkingLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingLayoutEnum }
     * 
     * 
     */
    public List<ParkingLayoutEnum> getParkingLayout() {
        if (parkingLayout == null) {
            parkingLayout = new ArrayList<ParkingLayoutEnum>();
        }
        return this.parkingLayout;
    }

    /**
     * Gets the value of the highestFloor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighestFloor() {
        return highestFloor;
    }

    /**
     * Sets the value of the highestFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighestFloor(BigInteger value) {
        this.highestFloor = value;
    }

    /**
     * Gets the value of the lowestFloor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowestFloor() {
        return lowestFloor;
    }

    /**
     * Sets the value of the lowestFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowestFloor(BigInteger value) {
        this.lowestFloor = value;
    }

    /**
     * Gets the value of the temporaryParking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporaryParking() {
        return temporaryParking;
    }

    /**
     * Sets the value of the temporaryParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporaryParking(Boolean value) {
        this.temporaryParking = value;
    }

    /**
     * Gets the value of the parkingSiteAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSiteAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSiteAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getParkingSiteAddress() {
        if (parkingSiteAddress == null) {
            parkingSiteAddress = new ArrayList<Contact>();
        }
        return this.parkingSiteAddress;
    }

    /**
     * Gets the value of the reservationService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reservationService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getReservationService() {
        if (reservationService == null) {
            reservationService = new ArrayList<Contact>();
        }
        return this.reservationService;
    }

    /**
     * Gets the value of the parkingUsageScenario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingUsageScenario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingUsageScenario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSiteScenarioIndexParkingUsageScenario }
     * 
     * 
     */
    public List<ParkingSiteScenarioIndexParkingUsageScenario> getParkingUsageScenario() {
        if (parkingUsageScenario == null) {
            parkingUsageScenario = new ArrayList<ParkingSiteScenarioIndexParkingUsageScenario>();
        }
        return this.parkingUsageScenario;
    }

    /**
     * Gets the value of the openingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningTimes }
     *     
     */
    public OpeningTimes getOpeningTimes() {
        return openingTimes;
    }

    /**
     * Sets the value of the openingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningTimes }
     *     
     */
    public void setOpeningTimes(OpeningTimes value) {
        this.openingTimes = value;
    }

    /**
     * Gets the value of the parkingAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingAccess }
     * 
     * 
     */
    public List<ParkingAccess> getParkingAccess() {
        if (parkingAccess == null) {
            parkingAccess = new ArrayList<ParkingAccess>();
        }
        return this.parkingAccess;
    }

    /**
     * Gets the value of the parkingStandardsAndSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingStandardsAndSecurity }
     *     
     */
    public ParkingStandardsAndSecurity getParkingStandardsAndSecurity() {
        return parkingStandardsAndSecurity;
    }

    /**
     * Sets the value of the parkingStandardsAndSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingStandardsAndSecurity }
     *     
     */
    public void setParkingStandardsAndSecurity(ParkingStandardsAndSecurity value) {
        this.parkingStandardsAndSecurity = value;
    }

    /**
     * Gets the value of the parkingSiteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingSiteExtension() {
        return parkingSiteExtension;
    }

    /**
     * Sets the value of the parkingSiteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingSiteExtension(ExtensionType value) {
        this.parkingSiteExtension = value;
    }

}
