
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingPermit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingPermit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingPermitType" type="{http://datex2.eu/schema/2/2_0}PermitTypeEnum"/&gt;
 *         &lt;element name="parkingPermitScheme" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="parkingPermitIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="parkingPermitExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingPermit", propOrder = {
    "parkingPermitType",
    "parkingPermitScheme",
    "parkingPermitIdentifier",
    "parkingPermitExtension"
})
public class ParkingPermit {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PermitTypeEnum parkingPermitType;
    protected String parkingPermitScheme;
    protected String parkingPermitIdentifier;
    protected ExtensionType parkingPermitExtension;

    /**
     * Gets the value of the parkingPermitType property.
     * 
     * @return
     *     possible object is
     *     {@link PermitTypeEnum }
     *     
     */
    public PermitTypeEnum getParkingPermitType() {
        return parkingPermitType;
    }

    /**
     * Sets the value of the parkingPermitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermitTypeEnum }
     *     
     */
    public void setParkingPermitType(PermitTypeEnum value) {
        this.parkingPermitType = value;
    }

    /**
     * Gets the value of the parkingPermitScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingPermitScheme() {
        return parkingPermitScheme;
    }

    /**
     * Sets the value of the parkingPermitScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingPermitScheme(String value) {
        this.parkingPermitScheme = value;
    }

    /**
     * Gets the value of the parkingPermitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingPermitIdentifier() {
        return parkingPermitIdentifier;
    }

    /**
     * Sets the value of the parkingPermitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingPermitIdentifier(String value) {
        this.parkingPermitIdentifier = value;
    }

    /**
     * Gets the value of the parkingPermitExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingPermitExtension() {
        return parkingPermitExtension;
    }

    /**
     * Sets the value of the parkingPermitExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingPermitExtension(ExtensionType value) {
        this.parkingPermitExtension = value;
    }

}
