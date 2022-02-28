
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Indicates a specific lane or group of lanes.
 * 
 * <p>Java class for Lane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lane"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="laneNumber" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="laneUsage" type="{http://datex2.eu/schema/3/locationReferencing}_LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="_laneExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lane", propOrder = {
    "laneNumber",
    "laneUsage",
    "_LaneExtension"
})
public class Lane {

    protected BigInteger laneNumber;
    protected _LaneEnum laneUsage;
    @XmlElement(name = "_laneExtension")
    protected _ExtensionType _LaneExtension;

    /**
     * Gets the value of the laneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLaneNumber() {
        return laneNumber;
    }

    /**
     * Sets the value of the laneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLaneNumber(BigInteger value) {
        this.laneNumber = value;
    }

    /**
     * Gets the value of the laneUsage property.
     * 
     * @return
     *     possible object is
     *     {@link _LaneEnum }
     *     
     */
    public _LaneEnum getLaneUsage() {
        return laneUsage;
    }

    /**
     * Sets the value of the laneUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LaneEnum }
     *     
     */
    public void setLaneUsage(_LaneEnum value) {
        this.laneUsage = value;
    }

    /**
     * Gets the value of the _LaneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LaneExtension() {
        return _LaneExtension;
    }

    /**
     * Sets the value of the _LaneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LaneExtension(_ExtensionType value) {
        this._LaneExtension = value;
    }

}
