
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A roadside unit which can control one or more variable message signs on a single gantry or
 *         mounting or on closely associated gantries or mountings.
 *       
 * 
 * <p>Java class for VmsController complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsController"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfVms" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="externalIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="ipAddress" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="electronicAddress" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="vms" type="{http://datex2.eu/schema/3/vms}_VmsControllerVmsIndexVms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_vmsControllerExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsController", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "numberOfVms",
    "externalIdentifier",
    "ipAddress",
    "electronicAddress",
    "vms",
    "vmsControllerExtension"
})
public class VmsController {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVms;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String externalIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String ipAddress;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String electronicAddress;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected List<VmsControllerVmsIndexVms> vms;
    @XmlElement(name = "_vmsControllerExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType vmsControllerExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the numberOfVms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVms() {
        return numberOfVms;
    }

    /**
     * Sets the value of the numberOfVms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVms(BigInteger value) {
        this.numberOfVms = value;
    }

    /**
     * Gets the value of the externalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIdentifier(String value) {
        this.externalIdentifier = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAddress(String value) {
        this.electronicAddress = value;
    }

    /**
     * Gets the value of the vms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsControllerVmsIndexVms }
     * 
     * 
     */
    public List<VmsControllerVmsIndexVms> getVms() {
        if (vms == null) {
            vms = new ArrayList<VmsControllerVmsIndexVms>();
        }
        return this.vms;
    }

    /**
     * Gets the value of the vmsControllerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsControllerExtension() {
        return vmsControllerExtension;
    }

    /**
     * Sets the value of the vmsControllerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsControllerExtension(ExtensionType value) {
        this.vmsControllerExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
