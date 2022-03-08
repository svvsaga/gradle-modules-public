
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralNetworkManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralNetworkManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalNetworkManagementType" type="{http://datex2.eu/schema/3/situation}_GeneralNetworkManagementTypeEnum"/&gt;
 *         &lt;element name="trafficManuallyDirectedBy" type="{http://datex2.eu/schema/3/situation}_PersonCategoryEnum" minOccurs="0"/&gt;
 *         &lt;element name="_generalNetworkManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    protected GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    protected PersonCategoryEnum trafficManuallyDirectedBy;
    @XmlElement(name = "_generalNetworkManagementExtension")
    protected ExtensionType generalNetworkManagementExtension;

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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralNetworkManagementExtension() {
        return generalNetworkManagementExtension;
    }

    /**
     * Sets the value of the generalNetworkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralNetworkManagementExtension(ExtensionType value) {
        this.generalNetworkManagementExtension = value;
    }

}
