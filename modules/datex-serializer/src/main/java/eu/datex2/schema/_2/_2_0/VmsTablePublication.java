
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsTablePublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsTablePublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation"/&gt;
 *         &lt;element name="vmsUnitTable" type="{http://datex2.eu/schema/2/2_0}VmsUnitTable" maxOccurs="unbounded"/&gt;
 *         &lt;element name="vmsTablePublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsTablePublication", propOrder = {
    "headerInformation",
    "vmsUnitTable",
    "vmsTablePublicationExtension"
})
public class VmsTablePublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<VmsUnitTable> vmsUnitTable;
    protected _ExtensionType vmsTablePublicationExtension;

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the vmsUnitTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsUnitTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsUnitTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsUnitTable }
     * 
     * 
     */
    public List<VmsUnitTable> getVmsUnitTable() {
        if (vmsUnitTable == null) {
            vmsUnitTable = new ArrayList<VmsUnitTable>();
        }
        return this.vmsUnitTable;
    }

    /**
     * Gets the value of the vmsTablePublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsTablePublicationExtension() {
        return vmsTablePublicationExtension;
    }

    /**
     * Sets the value of the vmsTablePublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsTablePublicationExtension(_ExtensionType value) {
        this.vmsTablePublicationExtension = value;
    }

}
