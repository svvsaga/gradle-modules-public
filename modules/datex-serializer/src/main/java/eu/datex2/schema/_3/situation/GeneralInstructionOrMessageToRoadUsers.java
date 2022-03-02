
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * General instruction and/or message that is issued by the network/road operator which is
 *         applicable to drivers and sometimes passengers.
 *       
 * 
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
@XmlType(name = "GeneralInstructionOrMessageToRoadUsers", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalMessageToRoadUsers",
    "generalInstructionOrMessageToRoadUsersExtension"
})
public class GeneralInstructionOrMessageToRoadUsers
    extends NetworkManagement
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected MultilingualString generalMessageToRoadUsers;
    @XmlElement(name = "_generalInstructionOrMessageToRoadUsersExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType generalInstructionOrMessageToRoadUsersExtension;

    /**
     * Gets the value of the generalInstructionToRoadUsersType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
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
     * Gets the value of the generalInstructionOrMessageToRoadUsersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralInstructionOrMessageToRoadUsersExtension() {
        return generalInstructionOrMessageToRoadUsersExtension;
    }

    /**
     * Sets the value of the generalInstructionOrMessageToRoadUsersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralInstructionOrMessageToRoadUsersExtension(ExtensionType value) {
        this.generalInstructionOrMessageToRoadUsersExtension = value;
    }

}
