
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "GroupOfPeopleInvolved", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "numberOfPeople",
    "injuryStatusType",
    "involvementRole",
    "categoryOfPeopleInvolved",
    "groupOfPeopleInvolvedExtension"
})
public class GroupOfPeopleInvolved {

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPeople;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected InjuryStatusTypeEnum injuryStatusType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected InvolvementRolesEnum involvementRole;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected PersonCategoryEnum categoryOfPeopleInvolved;
    @XmlElement(name = "_groupOfPeopleInvolvedExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType groupOfPeopleInvolvedExtension;

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
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public InjuryStatusTypeEnum getInjuryStatusType() {
        return injuryStatusType;
    }

    /**
     * Sets the value of the injuryStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatusType(InjuryStatusTypeEnum value) {
        this.injuryStatusType = value;
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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfPeopleInvolvedExtension() {
        return groupOfPeopleInvolvedExtension;
    }

    /**
     * Sets the value of the groupOfPeopleInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfPeopleInvolvedExtension(ExtensionType value) {
        this.groupOfPeopleInvolvedExtension = value;
    }

}
