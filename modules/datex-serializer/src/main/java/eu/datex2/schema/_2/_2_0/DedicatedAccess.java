
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DedicatedAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DedicatedAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dedicatedAccess" type="{http://datex2.eu/schema/2/2_0}_ParkingAccessReference"/&gt;
 *         &lt;element name="distanceFromParkingSpace" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="dedicatedAccessExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DedicatedAccess", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "dedicatedAccess",
    "distanceFromParkingSpace",
    "dedicatedAccessExtension"
})
public class DedicatedAccess {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected ParkingAccessReference dedicatedAccess;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromParkingSpace;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType dedicatedAccessExtension;

    /**
     * Gets the value of the dedicatedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAccessReference }
     *     
     */
    public ParkingAccessReference getDedicatedAccess() {
        return dedicatedAccess;
    }

    /**
     * Sets the value of the dedicatedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAccessReference }
     *     
     */
    public void setDedicatedAccess(ParkingAccessReference value) {
        this.dedicatedAccess = value;
    }

    /**
     * Gets the value of the distanceFromParkingSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromParkingSpace() {
        return distanceFromParkingSpace;
    }

    /**
     * Sets the value of the distanceFromParkingSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromParkingSpace(BigInteger value) {
        this.distanceFromParkingSpace = value;
    }

    /**
     * Gets the value of the dedicatedAccessExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDedicatedAccessExtension() {
        return dedicatedAccessExtension;
    }

    /**
     * Sets the value of the dedicatedAccessExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDedicatedAccessExtension(ExtensionType value) {
        this.dedicatedAccessExtension = value;
    }

}
