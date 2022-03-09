
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeProfiledPhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeProfiledPhysicalQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}PhysicalQuantity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicData" type="{http://datex2.eu/schema/3/roadTrafficData}BasicData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_timeProfiledPhysicalQuantityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeProfiledPhysicalQuantity", propOrder = {
    "basicData",
    "_TimeProfiledPhysicalQuantityExtension"
})
public class TimeProfiledPhysicalQuantity
    extends PhysicalQuantity
{

    protected List<BasicData> basicData;
    @XmlElement(name = "_timeProfiledPhysicalQuantityExtension")
    protected _ExtensionType _TimeProfiledPhysicalQuantityExtension;

    /**
     * Gets the value of the basicData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the basicData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicData }
     * 
     * 
     */
    public List<BasicData> getBasicData() {
        if (basicData == null) {
            basicData = new ArrayList<BasicData>();
        }
        return this.basicData;
    }

    /**
     * Gets the value of the _TimeProfiledPhysicalQuantityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TimeProfiledPhysicalQuantityExtension() {
        return _TimeProfiledPhysicalQuantityExtension;
    }

    /**
     * Sets the value of the _TimeProfiledPhysicalQuantityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TimeProfiledPhysicalQuantityExtension(_ExtensionType value) {
        this._TimeProfiledPhysicalQuantityExtension = value;
    }

}
