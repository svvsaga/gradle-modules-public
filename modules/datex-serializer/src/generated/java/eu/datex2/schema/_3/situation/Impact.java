
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Impact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Impact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacityRemaining" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLanesRestricted" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOperationalLanes" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="residualLaneWidth" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="residualRoadWidth" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="delays" type="{http://datex2.eu/schema/3/situation}Delays" minOccurs="0"/&gt;
 *         &lt;element name="_impactExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impact", propOrder = {
    "capacityRemaining",
    "numberOfLanesRestricted",
    "numberOfOperationalLanes",
    "residualLaneWidth",
    "residualRoadWidth",
    "delays",
    "_ImpactExtension"
})
public class Impact {

    protected Float capacityRemaining;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfLanesRestricted;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfOperationalLanes;
    protected Float residualLaneWidth;
    protected Float residualRoadWidth;
    protected Delays delays;
    @XmlElement(name = "_impactExtension")
    protected _ExtensionType _ImpactExtension;

    /**
     * Gets the value of the capacityRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCapacityRemaining() {
        return capacityRemaining;
    }

    /**
     * Sets the value of the capacityRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCapacityRemaining(Float value) {
        this.capacityRemaining = value;
    }

    /**
     * Gets the value of the numberOfLanesRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanesRestricted() {
        return numberOfLanesRestricted;
    }

    /**
     * Sets the value of the numberOfLanesRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanesRestricted(BigInteger value) {
        this.numberOfLanesRestricted = value;
    }

    /**
     * Gets the value of the numberOfOperationalLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOperationalLanes() {
        return numberOfOperationalLanes;
    }

    /**
     * Sets the value of the numberOfOperationalLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOperationalLanes(BigInteger value) {
        this.numberOfOperationalLanes = value;
    }

    /**
     * Gets the value of the residualLaneWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualLaneWidth() {
        return residualLaneWidth;
    }

    /**
     * Sets the value of the residualLaneWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualLaneWidth(Float value) {
        this.residualLaneWidth = value;
    }

    /**
     * Gets the value of the residualRoadWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualRoadWidth() {
        return residualRoadWidth;
    }

    /**
     * Sets the value of the residualRoadWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualRoadWidth(Float value) {
        this.residualRoadWidth = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    /**
     * Gets the value of the _ImpactExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ImpactExtension() {
        return _ImpactExtension;
    }

    /**
     * Sets the value of the _ImpactExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ImpactExtension(_ExtensionType value) {
        this._ImpactExtension = value;
    }

}
