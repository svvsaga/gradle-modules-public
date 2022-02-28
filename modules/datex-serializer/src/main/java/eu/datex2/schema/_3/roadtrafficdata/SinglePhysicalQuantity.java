
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated physical quantity at a single instant or period in time, with
 *         related properties explaining its context, meaning or status
 *       
 * 
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
    "_SinglePhysicalQuantityExtension"
})
public class SinglePhysicalQuantity
    extends PhysicalQuantity
{

    protected BasicData basicData;
    @XmlElement(name = "_singlePhysicalQuantityExtension")
    protected _ExtensionType _SinglePhysicalQuantityExtension;

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
     * Gets the value of the _SinglePhysicalQuantityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SinglePhysicalQuantityExtension() {
        return _SinglePhysicalQuantityExtension;
    }

    /**
     * Sets the value of the _SinglePhysicalQuantityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SinglePhysicalQuantityExtension(_ExtensionType value) {
        this._SinglePhysicalQuantityExtension = value;
    }

}
