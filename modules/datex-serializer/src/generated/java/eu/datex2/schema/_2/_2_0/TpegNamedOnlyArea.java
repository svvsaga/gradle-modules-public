
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegNamedOnlyArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegNamedOnlyArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegAreaLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2/2_0}TpegAreaDescriptor" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tpegNamedOnlyAreaExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegNamedOnlyArea", propOrder = {
    "name",
    "tpegNamedOnlyAreaExtension"
})
public class TpegNamedOnlyArea
    extends TpegAreaLocation
{

    @XmlElement(required = true)
    protected List<TpegAreaDescriptor> name;
    protected _ExtensionType tpegNamedOnlyAreaExtension;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegAreaDescriptor }
     * 
     * 
     */
    public List<TpegAreaDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TpegAreaDescriptor>();
        }
        return this.name;
    }

    /**
     * Gets the value of the tpegNamedOnlyAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTpegNamedOnlyAreaExtension() {
        return tpegNamedOnlyAreaExtension;
    }

    /**
     * Sets the value of the tpegNamedOnlyAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTpegNamedOnlyAreaExtension(_ExtensionType value) {
        this.tpegNamedOnlyAreaExtension = value;
    }

}
