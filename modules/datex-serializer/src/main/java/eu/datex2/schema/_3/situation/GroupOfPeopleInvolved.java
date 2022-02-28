
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of people involved in the event having common characteristics and/or status.
 *       
 * 
 * <p>Java class for GroupOfPeopleInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfPeopleInvolved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfPeople" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="injuryStatusType" type="{http://datex2.eu/schema/3/situation}_InjuryStatusTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="involvementRole" type="{http://datex2.eu/schema/3/situation}_InvolvementRolesEnum" minOccurs="0"/&gt;
 *         &lt;element name="categoryOfPeopleInvolved" type="{http://datex2.eu/schema/3/situation}_PersonCategoryEnum" minOccurs="0"/&gt;
 *         &lt;element name="_groupOfPeopleInvolvedExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfPeopleInvolved", propOrder = {
    "numberOfPeople",
    "injuryStatusType",
    "involvementRole",
    "categoryOfPeopleInvolved",
    "_GroupOfPeopleInvolvedExtension"
})
public class GroupOfPeopleInvolved {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPeople;
    protected _InjuryStatusTypeEnum injuryStatusType;
    protected _InvolvementRolesEnum involvementRole;
    protected _PersonCategoryEnum categoryOfPeopleInvolved;
    @XmlElement(name = "_groupOfPeopleInvolvedExtension")
    protected _ExtensionType _GroupOfPeopleInvolvedExtension;

    /**
     * Gets the value of the numberOfPeople property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Sets the value of the numberOfPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPeople(BigInteger value) {
        this.numberOfPeople = value;
    }

    /**
     * Gets the value of the injuryStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link _InjuryStatusTypeEnum }
     *     
     */
    public _InjuryStatusTypeEnum getInjuryStatusType() {
        return injuryStatusType;
    }

    /**
     * Sets the value of the injuryStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatusType(_InjuryStatusTypeEnum value) {
        this.injuryStatusType = value;
    }

    /**
     * Gets the value of the involvementRole property.
     * 
     * @return
     *     possible object is
     *     {@link _InvolvementRolesEnum }
     *     
     */
    public _InvolvementRolesEnum getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Sets the value of the involvementRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link _InvolvementRolesEnum }
     *     
     */
    public void setInvolvementRole(_InvolvementRolesEnum value) {
        this.involvementRole = value;
    }

    /**
     * Gets the value of the categoryOfPeopleInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link _PersonCategoryEnum }
     *     
     */
    public _PersonCategoryEnum getCategoryOfPeopleInvolved() {
        return categoryOfPeopleInvolved;
    }

    /**
     * Sets the value of the categoryOfPeopleInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PersonCategoryEnum }
     *     
     */
    public void setCategoryOfPeopleInvolved(_PersonCategoryEnum value) {
        this.categoryOfPeopleInvolved = value;
    }

    /**
     * Gets the value of the _GroupOfPeopleInvolvedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GroupOfPeopleInvolvedExtension() {
        return _GroupOfPeopleInvolvedExtension;
    }

    /**
     * Sets the value of the _GroupOfPeopleInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GroupOfPeopleInvolvedExtension(_ExtensionType value) {
        this._GroupOfPeopleInvolvedExtension = value;
    }

}
