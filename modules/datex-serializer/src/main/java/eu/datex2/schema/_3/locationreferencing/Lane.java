
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "Lane", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "laneNumber",
    "laneUsage",
    "laneExtension"
})
public class Lane {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected BigInteger laneNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected LaneEnum laneUsage;
    @XmlElement(name = "_laneExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType laneExtension;

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
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getLaneUsage() {
        return laneUsage;
    }

    /**
     * Sets the value of the laneUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setLaneUsage(LaneEnum value) {
        this.laneUsage = value;
    }

    /**
     * Gets the value of the laneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLaneExtension() {
        return laneExtension;
    }

    /**
     * Sets the value of the laneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLaneExtension(ExtensionType value) {
        this.laneExtension = value;
    }

}
