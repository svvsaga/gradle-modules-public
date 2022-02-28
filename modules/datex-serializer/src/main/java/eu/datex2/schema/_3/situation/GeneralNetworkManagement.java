
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Network management action that is instigated either manually or automatically by the
 *         network/road operator. Compliance with any resulting control may be advisory or mandatory.
 *       
 * 
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
    "_GeneralNetworkManagementExtension"
})
public class GeneralNetworkManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected _GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    protected _PersonCategoryEnum trafficManuallyDirectedBy;
    @XmlElement(name = "_generalNetworkManagementExtension")
    protected _ExtensionType _GeneralNetworkManagementExtension;

    /**
     * Gets the value of the generalNetworkManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _GeneralNetworkManagementTypeEnum }
     *     
     */
    public _GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Sets the value of the generalNetworkManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _GeneralNetworkManagementTypeEnum }
     *     
     */
    public void setGeneralNetworkManagementType(_GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    /**
     * Gets the value of the trafficManuallyDirectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link _PersonCategoryEnum }
     *     
     */
    public _PersonCategoryEnum getTrafficManuallyDirectedBy() {
        return trafficManuallyDirectedBy;
    }

    /**
     * Sets the value of the trafficManuallyDirectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PersonCategoryEnum }
     *     
     */
    public void setTrafficManuallyDirectedBy(_PersonCategoryEnum value) {
        this.trafficManuallyDirectedBy = value;
    }

    /**
     * Gets the value of the _GeneralNetworkManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GeneralNetworkManagementExtension() {
        return _GeneralNetworkManagementExtension;
    }

    /**
     * Sets the value of the _GeneralNetworkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GeneralNetworkManagementExtension(_ExtensionType value) {
        this._GeneralNetworkManagementExtension = value;
    }

}
