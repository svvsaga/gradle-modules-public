
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification of validity, either explicitly or by a validity time period specification
 *         which may be discontinuous.
 *       
 * 
 * <p>Java class for Validity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Validity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validityStatus" type="{http://datex2.eu/schema/3/common}_ValidityStatusEnum"/&gt;
 *         &lt;element name="overrunning" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="validityTimeSpecification" type="{http://datex2.eu/schema/3/common}OverallPeriod"/&gt;
 *         &lt;element name="_validityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validity", propOrder = {
    "validityStatus",
    "overrunning",
    "validityTimeSpecification",
    "_ValidityExtension"
})
public class Validity {

    @XmlElement(required = true)
    protected _ValidityStatusEnum validityStatus;
    protected Boolean overrunning;
    @XmlElement(required = true)
    protected OverallPeriod validityTimeSpecification;
    @XmlElement(name = "_validityExtension")
    protected _ExtensionType _ValidityExtension;

    /**
     * Gets the value of the validityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ValidityStatusEnum }
     *     
     */
    public _ValidityStatusEnum getValidityStatus() {
        return validityStatus;
    }

    /**
     * Sets the value of the validityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ValidityStatusEnum }
     *     
     */
    public void setValidityStatus(_ValidityStatusEnum value) {
        this.validityStatus = value;
    }

    /**
     * Gets the value of the overrunning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrunning() {
        return overrunning;
    }

    /**
     * Sets the value of the overrunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrunning(Boolean value) {
        this.overrunning = value;
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
     * Gets the value of the _ValidityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ValidityExtension() {
        return _ValidityExtension;
    }

    /**
     * Sets the value of the _ValidityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ValidityExtension(_ExtensionType value) {
        this._ValidityExtension = value;
    }

}
