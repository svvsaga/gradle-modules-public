
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInstructionOrMessageToRoadUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralInstructionOrMessageToRoadUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/2/2_0}GeneralInstructionToRoadUsersTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="generalMessageToRoadUsers" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="generalInstructionOrMessageToRoadUsersExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInstructionOrMessageToRoadUsers", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalMessageToRoadUsers",
    "generalInstructionOrMessageToRoadUsersExtension"
})
public class GeneralInstructionOrMessageToRoadUsers
    extends NetworkManagement
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString generalMessageToRoadUsers;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
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
