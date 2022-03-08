
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SinglePhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SinglePhysicalQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}PhysicalQuantity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicData" type="{http://datex2.eu/schema/3/roadTrafficData}BasicData" minOccurs="0"/&gt;
 *         &lt;element name="_singlePhysicalQuantityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SinglePhysicalQuantity", propOrder = {
    "basicData",
    "singlePhysicalQuantityExtension"
})
public class SinglePhysicalQuantity
    extends PhysicalQuantity
{

    protected BasicData basicData;
    @XmlElement(name = "_singlePhysicalQuantityExtension")
    protected ExtensionType singlePhysicalQuantityExtension;

    /**
     * Gets the value of the basicData property.
     * 
     * @return
     *     possible object is
     *     {@link BasicData }
     *     
     */
    public BasicData getBasicData() {
        return basicData;
    }

    /**
     * Sets the value of the basicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData }
     *     
     */
    public void setBasicData(BasicData value) {
        this.basicData = value;
    }

    /**
     * Gets the value of the singlePhysicalQuantityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSinglePhysicalQuantityExtension() {
        return singlePhysicalQuantityExtension;
    }

    /**
     * Sets the value of the singlePhysicalQuantityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSinglePhysicalQuantityExtension(ExtensionType value) {
        this.singlePhysicalQuantityExtension = value;
    }

}
