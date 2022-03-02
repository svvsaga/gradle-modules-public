
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargeCurrency" type="{http://datex2.eu/schema/2/2_0}CurrencyEnum"/&gt;
 *         &lt;element name="maximumDuration" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="chargeBandName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="applicableForUser" type="{http://datex2.eu/schema/2/2_0}UserTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="charge" type="{http://datex2.eu/schema/2/2_0}Charge" maxOccurs="unbounded"/&gt;
 *         &lt;element name="applicableForPeriod" type="{http://datex2.eu/schema/2/2_0}OverallPeriod" minOccurs="0"/&gt;
 *         &lt;element name="applicableForVehicles" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingPermit" type="{http://datex2.eu/schema/2/2_0}ParkingPermit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chargeBandExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBand", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "chargeCurrency",
    "maximumDuration",
    "chargeBandName",
    "applicableForUser",
    "charge",
    "applicableForPeriod",
    "applicableForVehicles",
    "parkingPermit",
    "chargeBandExtension"
})
public class ChargeBand {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyEnum chargeCurrency;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float maximumDuration;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString chargeBandName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<UserTypeEnum> applicableForUser;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected List<Charge> charge;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected OverallPeriod applicableForPeriod;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<VehicleCharacteristics> applicableForVehicles;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<ParkingPermit> parkingPermit;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType chargeBandExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the chargeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyEnum }
     *     
     */
    public CurrencyEnum getChargeCurrency() {
        return chargeCurrency;
    }

    /**
     * Sets the value of the chargeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyEnum }
     *     
     */
    public void setChargeCurrency(CurrencyEnum value) {
        this.chargeCurrency = value;
    }

    /**
     * Gets the value of the maximumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * Sets the value of the maximumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumDuration(Float value) {
        this.maximumDuration = value;
    }

    /**
     * Gets the value of the chargeBandName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChargeBandName() {
        return chargeBandName;
    }

    /**
     * Sets the value of the chargeBandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChargeBandName(MultilingualString value) {
        this.chargeBandName = value;
    }

    /**
     * Gets the value of the applicableForUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTypeEnum }
     * 
     * 
     */
    public List<UserTypeEnum> getApplicableForUser() {
        if (applicableForUser == null) {
            applicableForUser = new ArrayList<UserTypeEnum>();
        }
        return this.applicableForUser;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge }
     * 
     * 
     */
    public List<Charge> getCharge() {
        if (charge == null) {
            charge = new ArrayList<Charge>();
        }
        return this.charge;
    }

    /**
     * Gets the value of the applicableForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getApplicableForPeriod() {
        return applicableForPeriod;
    }

    /**
     * Sets the value of the applicableForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setApplicableForPeriod(OverallPeriod value) {
        this.applicableForPeriod = value;
    }

    /**
     * Gets the value of the applicableForVehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForVehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getApplicableForVehicles() {
        if (applicableForVehicles == null) {
            applicableForVehicles = new ArrayList<VehicleCharacteristics>();
        }
        return this.applicableForVehicles;
    }

    /**
     * Gets the value of the parkingPermit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingPermit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingPermit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingPermit }
     * 
     * 
     */
    public List<ParkingPermit> getParkingPermit() {
        if (parkingPermit == null) {
            parkingPermit = new ArrayList<ParkingPermit>();
        }
        return this.parkingPermit;
    }

    /**
     * Gets the value of the chargeBandExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getChargeBandExtension() {
        return chargeBandExtension;
    }

    /**
     * Sets the value of the chargeBandExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setChargeBandExtension(ExtensionType value) {
        this.chargeBandExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
