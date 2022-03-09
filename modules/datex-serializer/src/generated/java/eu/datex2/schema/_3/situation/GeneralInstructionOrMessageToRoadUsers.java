
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInstructionOrMessageToRoadUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralInstructionOrMessageToRoadUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/3/situation}_GeneralInstructionToRoadUsersTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="generalMessageToRoadUsers" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_generalInstructionOrMessageToRoadUsersExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInstructionOrMessageToRoadUsers", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalMessageToRoadUsers",
    "_GeneralInstructionOrMessageToRoadUsersExtension"
})
public class GeneralInstructionOrMessageToRoadUsers
    extends NetworkManagement
{

    protected _GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected MultilingualString generalMessageToRoadUsers;
    @XmlElement(name = "_generalInstructionOrMessageToRoadUsersExtension")
    protected _ExtensionType _GeneralInstructionOrMessageToRoadUsersExtension;

    /**
     * Gets the value of the generalInstructionToRoadUsersType property.
     * 
     * @return
     *     possible object is
     *     {@link _GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public _GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(_GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    /**
     * Gets the value of the generalMessageToRoadUsers property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getGeneralMessageToRoadUsers() {
        return generalMessageToRoadUsers;
    }

    /**
     * Sets the value of the generalMessageToRoadUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setGeneralMessageToRoadUsers(MultilingualString value) {
        this.generalMessageToRoadUsers = value;
    }

    /**
     * Gets the value of the _GeneralInstructionOrMessageToRoadUsersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GeneralInstructionOrMessageToRoadUsersExtension() {
        return _GeneralInstructionOrMessageToRoadUsersExtension;
    }

    /**
     * Sets the value of the _GeneralInstructionOrMessageToRoadUsersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GeneralInstructionOrMessageToRoadUsersExtension(_ExtensionType value) {
        this._GeneralInstructionOrMessageToRoadUsersExtension = value;
    }

}
