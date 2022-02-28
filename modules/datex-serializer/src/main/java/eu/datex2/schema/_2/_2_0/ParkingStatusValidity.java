
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingStatusValidity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingStatusValidity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingStatusTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="parkingStatusTimeOffsetToOrigin" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="validityTimeSpecification" type="{http://datex2.eu/schema/2/2_0}OverallPeriod" minOccurs="0"/&gt;
 *         &lt;element name="parkingStatusValidityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingStatusValidity", propOrder = {
    "parkingStatusTime",
    "parkingStatusTimeOffsetToOrigin",
    "validityTimeSpecification",
    "parkingStatusValidityExtension"
})
public class ParkingStatusValidity {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar parkingStatusTime;
    protected Float parkingStatusTimeOffsetToOrigin;
    protected OverallPeriod validityTimeSpecification;
    protected _ExtensionType parkingStatusValidityExtension;

    /**
     * Gets the value of the parkingStatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingStatusTime() {
        return parkingStatusTime;
    }

    /**
     * Sets the value of the parkingStatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingStatusTime(XMLGregorianCalendar value) {
        this.parkingStatusTime = value;
    }

    /**
     * Gets the value of the parkingStatusTimeOffsetToOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getParkingStatusTimeOffsetToOrigin() {
        return parkingStatusTimeOffsetToOrigin;
    }

    /**
     * Sets the value of the parkingStatusTimeOffsetToOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setParkingStatusTimeOffsetToOrigin(Float value) {
        this.parkingStatusTimeOffsetToOrigin = value;
    }

    /**
     * Gets the value of the validityTimeSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getValidityTimeSpecification() {
        return validityTimeSpecification;
    }

    /**
     * Sets the value of the validityTimeSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setValidityTimeSpecification(OverallPeriod value) {
        this.validityTimeSpecification = value;
    }

    /**
     * Gets the value of the parkingStatusValidityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingStatusValidityExtension() {
        return parkingStatusValidityExtension;
    }

    /**
     * Sets the value of the parkingStatusValidityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingStatusValidityExtension(_ExtensionType value) {
        this.parkingStatusValidityExtension = value;
    }

}
