
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.HeaderInformation;
import eu.datex2.schema._3.common.PayloadPublication;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A publication containing one or more VMS controller unit tables each comprising a set of
 *         records which hold details of VMS controller units.
 *       
 * 
 * <p>Java class for VmsTablePublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsTablePublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/3/common}HeaderInformation"/&gt;
 *         &lt;element name="vmsControllerTable" type="{http://datex2.eu/schema/3/vms}VmsControllerTable" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_vmsTablePublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "vmsControllerTable",
    "vmsTablePublicationExtension"
})
public class VmsTablePublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<VmsControllerTable> vmsControllerTable;
    @XmlElement(name = "_vmsTablePublicationExtension")
    protected ExtensionType vmsTablePublicationExtension;

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
     * Gets the value of the vmsControllerTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsControllerTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsControllerTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsControllerTable }
     * 
     * 
     */
    public List<VmsControllerTable> getVmsControllerTable() {
        if (vmsControllerTable == null) {
            vmsControllerTable = new ArrayList<VmsControllerTable>();
        }
        return this.vmsControllerTable;
    }

    /**
     * Gets the value of the vmsTablePublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsTablePublicationExtension() {
        return vmsTablePublicationExtension;
    }

    /**
     * Sets the value of the vmsTablePublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsTablePublicationExtension(ExtensionType value) {
        this.vmsTablePublicationExtension = value;
    }

}
