
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfPeopleInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfPeopleInvolved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfPeople" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="injuryStatus" type="{http://datex2.eu/schema/2/2_0}InjuryStatusTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="involvementRole" type="{http://datex2.eu/schema/2/2_0}InvolvementRolesEnum" minOccurs="0"/&gt;
 *         &lt;element name="categoryOfPeopleInvolved" type="{http://datex2.eu/schema/2/2_0}PersonCategoryEnum" minOccurs="0"/&gt;
 *         &lt;element name="groupOfPeopleInvolvedExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "injuryStatus",
    "involvementRole",
    "categoryOfPeopleInvolved",
    "groupOfPeopleInvolvedExtension"
})
public class GroupOfPeopleInvolved {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPeople;
    @XmlSchemaType(name = "string")
    protected InjuryStatusTypeEnum injuryStatus;
    @XmlSchemaType(name = "string")
    protected InvolvementRolesEnum involvementRole;
    @XmlSchemaType(name = "string")
    protected PersonCategoryEnum categoryOfPeopleInvolved;
    protected _ExtensionType groupOfPeopleInvolvedExtension;

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
     * Gets the value of the injuryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public InjuryStatusTypeEnum getInjuryStatus() {
        return injuryStatus;
    }

    /**
     * Sets the value of the injuryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatus(InjuryStatusTypeEnum value) {
        this.injuryStatus = value;
    }

    /**
     * Gets the value of the involvementRole property.
     * 
     * @return
     *     possible object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public InvolvementRolesEnum getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Sets the value of the involvementRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public void setInvolvementRole(InvolvementRolesEnum value) {
        this.involvementRole = value;
    }

    /**
     * Gets the value of the categoryOfPeopleInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getCategoryOfPeopleInvolved() {
        return categoryOfPeopleInvolved;
    }

    /**
     * Sets the value of the categoryOfPeopleInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setCategoryOfPeopleInvolved(PersonCategoryEnum value) {
        this.categoryOfPeopleInvolved = value;
    }

    /**
     * Gets the value of the groupOfPeopleInvolvedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getGroupOfPeopleInvolvedExtension() {
        return groupOfPeopleInvolvedExtension;
    }

    /**
     * Sets the value of the groupOfPeopleInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setGroupOfPeopleInvolvedExtension(_ExtensionType value) {
        this.groupOfPeopleInvolvedExtension = value;
    }

}
