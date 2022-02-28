
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficViewRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficViewRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordSequenceNumber" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="trafficElement" type="{http://datex2.eu/schema/2/2_0}TrafficElement" minOccurs="0"/&gt;
 *         &lt;element name="operatorAction" type="{http://datex2.eu/schema/2/2_0}OperatorAction" minOccurs="0"/&gt;
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2/2_0}ElaboratedData" minOccurs="0"/&gt;
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/2/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trafficViewRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficViewRecord", propOrder = {
    "recordSequenceNumber",
    "trafficElement",
    "operatorAction",
    "elaboratedData",
    "urlLink",
    "trafficViewRecordExtension"
})
public class TrafficViewRecord {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger recordSequenceNumber;
    protected TrafficElement trafficElement;
    protected OperatorAction operatorAction;
    protected ElaboratedData elaboratedData;
    protected List<UrlLink> urlLink;
    protected _ExtensionType trafficViewRecordExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the recordSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Sets the value of the recordSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSequenceNumber(BigInteger value) {
        this.recordSequenceNumber = value;
    }

    /**
     * Gets the value of the trafficElement property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficElement }
     *     
     */
    public TrafficElement getTrafficElement() {
        return trafficElement;
    }

    /**
     * Sets the value of the trafficElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficElement }
     *     
     */
    public void setTrafficElement(TrafficElement value) {
        this.trafficElement = value;
    }

    /**
     * Gets the value of the operatorAction property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorAction }
     *     
     */
    public OperatorAction getOperatorAction() {
        return operatorAction;
    }

    /**
     * Sets the value of the operatorAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorAction }
     *     
     */
    public void setOperatorAction(OperatorAction value) {
        this.operatorAction = value;
    }

    /**
     * Gets the value of the elaboratedData property.
     * 
     * @return
     *     possible object is
     *     {@link ElaboratedData }
     *     
     */
    public ElaboratedData getElaboratedData() {
        return elaboratedData;
    }

    /**
     * Sets the value of the elaboratedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElaboratedData }
     *     
     */
    public void setElaboratedData(ElaboratedData value) {
        this.elaboratedData = value;
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the urlLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    /**
     * Gets the value of the trafficViewRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTrafficViewRecordExtension() {
        return trafficViewRecordExtension;
    }

    /**
     * Sets the value of the trafficViewRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTrafficViewRecordExtension(_ExtensionType value) {
        this.trafficViewRecordExtension = value;
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

}
