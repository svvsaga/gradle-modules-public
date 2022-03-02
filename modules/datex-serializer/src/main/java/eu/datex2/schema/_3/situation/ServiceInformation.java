
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "ServiceInformation", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "serviceInformationExtension"
})
@XmlSeeAlso({
    RoadOperatorServiceDisruption.class,
    ServiceDisruption.class,
    TransitInformation.class
})
public abstract class ServiceInformation
    extends SituationRecord
{

    @XmlElement(name = "_serviceInformationExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType serviceInformationExtension;

    /**
     * Gets the value of the serviceInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getServiceInformationExtension() {
        return serviceInformationExtension;
    }

    /**
     * Sets the value of the serviceInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setServiceInformationExtension(ExtensionType value) {
        this.serviceInformationExtension = value;
    }

}
