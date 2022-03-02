
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of disruption to normal services which may include roadside services such as those
 *         available at designated service areas, or any other relevant services such as nearby parking.
 *       
 * 
 * <p>Java class for ServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}ServiceInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceDisruptionType" type="{http://datex2.eu/schema/3/situation}_ServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_serviceDisruptionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDisruption", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "serviceDisruptionType",
    "serviceDisruptionExtension"
})
public class ServiceDisruption
    extends ServiceInformation
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    protected List<ServiceDisruptionTypeEnum> serviceDisruptionType;
    @XmlElement(name = "_serviceDisruptionExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType serviceDisruptionExtension;

    /**
     * Gets the value of the serviceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<ServiceDisruptionTypeEnum> getServiceDisruptionType() {
        if (serviceDisruptionType == null) {
            serviceDisruptionType = new ArrayList<ServiceDisruptionTypeEnum>();
        }
        return this.serviceDisruptionType;
    }

    /**
     * Gets the value of the serviceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getServiceDisruptionExtension() {
        return serviceDisruptionExtension;
    }

    /**
     * Sets the value of the serviceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setServiceDisruptionExtension(ExtensionType value) {
        this.serviceDisruptionExtension = value;
    }

}
