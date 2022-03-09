
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralNetworkManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralNetworkManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalNetworkManagementType" type="{http://datex2.eu/schema/2/2_0}GeneralNetworkManagementTypeEnum"/&gt;
 *         &lt;element name="trafficManuallyDirectedBy" type="{http://datex2.eu/schema/2/2_0}PersonCategoryEnum" minOccurs="0"/&gt;
 *         &lt;element name="generalNetworkManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralNetworkManagement", propOrder = {
    "generalNetworkManagementType",
    "trafficManuallyDirectedBy",
    "generalNetworkManagementExtension"
})
public class GeneralNetworkManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    @XmlSchemaType(name = "string")
    protected PersonCategoryEnum trafficManuallyDirectedBy;
    protected _ExtensionType generalNetworkManagementExtension;

    /**
     * Gets the value of the generalNetworkManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Sets the value of the generalNetworkManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public void setGeneralNetworkManagementType(GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    /**
     * Gets the value of the trafficManuallyDirectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getTrafficManuallyDirectedBy() {
        return trafficManuallyDirectedBy;
    }

    /**
     * Sets the value of the trafficManuallyDirectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setTrafficManuallyDirectedBy(PersonCategoryEnum value) {
        this.trafficManuallyDirectedBy = value;
    }

    /**
     * Gets the value of the generalNetworkManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getGeneralNetworkManagementExtension() {
        return generalNetworkManagementExtension;
    }

    /**
     * Sets the value of the generalNetworkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setGeneralNetworkManagementExtension(_ExtensionType value) {
        this.generalNetworkManagementExtension = value;
    }

}
