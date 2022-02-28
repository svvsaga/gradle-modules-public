
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about a service which may influence the behaviour of drivers and hence the
 *         characteristics of the traffic flow.
 *       
 * 
 * <p>Java class for ServiceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_serviceInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInformation", propOrder = {
    "_ServiceInformationExtension"
})
@XmlSeeAlso({
    RoadOperatorServiceDisruption.class,
    ServiceDisruption.class,
    TransitInformation.class
})
public abstract class ServiceInformation
    extends SituationRecord
{

    @XmlElement(name = "_serviceInformationExtension")
    protected _ExtensionType _ServiceInformationExtension;

    /**
     * Gets the value of the _ServiceInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ServiceInformationExtension() {
        return _ServiceInformationExtension;
    }

    /**
     * Sets the value of the _ServiceInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ServiceInformationExtension(_ExtensionType value) {
        this._ServiceInformationExtension = value;
    }

}
