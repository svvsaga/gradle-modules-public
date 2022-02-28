
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingThresholds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingThresholds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="almostFullDecreasing" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="almostFullIncreasing" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="entranceFull" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="fullDecreasing" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="fullIncreasing" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="overcrowding" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="overcrowdingLevel1" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="overcrowdingLevel2" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingLastMaximumOccupancy" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkingStatusColourMapping" type="{http://datex2.eu/schema/2/2_0}ParkingStatusColourMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingThresholdsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingThresholds", propOrder = {
    "almostFullDecreasing",
    "almostFullIncreasing",
    "entranceFull",
    "fullDecreasing",
    "fullIncreasing",
    "overcrowding",
    "overcrowdingLevel1",
    "overcrowdingLevel2",
    "parkingLastMaximumOccupancy",
    "parkingStatusColourMapping",
    "parkingThresholdsExtension"
})
public class ParkingThresholds {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger almostFullDecreasing;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger almostFullIncreasing;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger entranceFull;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fullDecreasing;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fullIncreasing;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger overcrowding;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger overcrowdingLevel1;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger overcrowdingLevel2;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingLastMaximumOccupancy;
    protected List<ParkingStatusColourMapping> parkingStatusColourMapping;
    protected _ExtensionType parkingThresholdsExtension;

    /**
     * Gets the value of the almostFullDecreasing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlmostFullDecreasing() {
        return almostFullDecreasing;
    }

    /**
     * Sets the value of the almostFullDecreasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlmostFullDecreasing(BigInteger value) {
        this.almostFullDecreasing = value;
    }

    /**
     * Gets the value of the almostFullIncreasing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlmostFullIncreasing() {
        return almostFullIncreasing;
    }

    /**
     * Sets the value of the almostFullIncreasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlmostFullIncreasing(BigInteger value) {
        this.almostFullIncreasing = value;
    }

    /**
     * Gets the value of the entranceFull property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntranceFull() {
        return entranceFull;
    }

    /**
     * Sets the value of the entranceFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntranceFull(BigInteger value) {
        this.entranceFull = value;
    }

    /**
     * Gets the value of the fullDecreasing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullDecreasing() {
        return fullDecreasing;
    }

    /**
     * Sets the value of the fullDecreasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullDecreasing(BigInteger value) {
        this.fullDecreasing = value;
    }

    /**
     * Gets the value of the fullIncreasing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullIncreasing() {
        return fullIncreasing;
    }

    /**
     * Sets the value of the fullIncreasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullIncreasing(BigInteger value) {
        this.fullIncreasing = value;
    }

    /**
     * Gets the value of the overcrowding property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOvercrowding() {
        return overcrowding;
    }

    /**
     * Sets the value of the overcrowding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOvercrowding(BigInteger value) {
        this.overcrowding = value;
    }

    /**
     * Gets the value of the overcrowdingLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOvercrowdingLevel1() {
        return overcrowdingLevel1;
    }

    /**
     * Sets the value of the overcrowdingLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOvercrowdingLevel1(BigInteger value) {
        this.overcrowdingLevel1 = value;
    }

    /**
     * Gets the value of the overcrowdingLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOvercrowdingLevel2() {
        return overcrowdingLevel2;
    }

    /**
     * Sets the value of the overcrowdingLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOvercrowdingLevel2(BigInteger value) {
        this.overcrowdingLevel2 = value;
    }

    /**
     * Gets the value of the parkingLastMaximumOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingLastMaximumOccupancy() {
        return parkingLastMaximumOccupancy;
    }

    /**
     * Sets the value of the parkingLastMaximumOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingLastMaximumOccupancy(BigInteger value) {
        this.parkingLastMaximumOccupancy = value;
    }

    /**
     * Gets the value of the parkingStatusColourMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingStatusColourMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingStatusColourMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingStatusColourMapping }
     * 
     * 
     */
    public List<ParkingStatusColourMapping> getParkingStatusColourMapping() {
        if (parkingStatusColourMapping == null) {
            parkingStatusColourMapping = new ArrayList<ParkingStatusColourMapping>();
        }
        return this.parkingStatusColourMapping;
    }

    /**
     * Gets the value of the parkingThresholdsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingThresholdsExtension() {
        return parkingThresholdsExtension;
    }

    /**
     * Sets the value of the parkingThresholdsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingThresholdsExtension(_ExtensionType value) {
        this.parkingThresholdsExtension = value;
    }

}
