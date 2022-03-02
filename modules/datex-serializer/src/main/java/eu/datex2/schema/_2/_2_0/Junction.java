
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Junction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Junction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="junctionClassification" type="{http://datex2.eu/schema/2/2_0}JunctionClassificationEnum" minOccurs="0"/&gt;
 *         &lt;element name="junctionName" type="{http://datex2.eu/schema/2/2_0}MultilingualString"/&gt;
 *         &lt;element name="junctionNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="motorway" type="{http://datex2.eu/schema/2/2_0}Road" minOccurs="0"/&gt;
 *         &lt;element name="destinationMotorway" type="{http://datex2.eu/schema/2/2_0}Road" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="junctionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Junction", propOrder = {
    "junctionClassification",
    "junctionName",
    "junctionNumber",
    "motorway",
    "destinationMotorway",
    "junctionExtension"
})
public class Junction {

    @XmlSchemaType(name = "string")
    protected JunctionClassificationEnum junctionClassification;
    @XmlElement(required = true)
    protected MultilingualString junctionName;
    protected String junctionNumber;
    protected Road motorway;
    protected List<Road> destinationMotorway;
    protected ExtensionType junctionExtension;

    /**
     * Gets the value of the junctionClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JunctionClassificationEnum }
     *     
     */
    public JunctionClassificationEnum getJunctionClassification() {
        return junctionClassification;
    }

    /**
     * Sets the value of the junctionClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JunctionClassificationEnum }
     *     
     */
    public void setJunctionClassification(JunctionClassificationEnum value) {
        this.junctionClassification = value;
    }

    /**
     * Gets the value of the junctionName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJunctionName() {
        return junctionName;
    }

    /**
     * Sets the value of the junctionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJunctionName(MultilingualString value) {
        this.junctionName = value;
    }

    /**
     * Gets the value of the junctionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionNumber() {
        return junctionNumber;
    }

    /**
     * Sets the value of the junctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionNumber(String value) {
        this.junctionNumber = value;
    }

    /**
     * Gets the value of the motorway property.
     * 
     * @return
     *     possible object is
     *     {@link Road }
     *     
     */
    public Road getMotorway() {
        return motorway;
    }

    /**
     * Sets the value of the motorway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Road }
     *     
     */
    public void setMotorway(Road value) {
        this.motorway = value;
    }

    /**
     * Gets the value of the destinationMotorway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the destinationMotorway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationMotorway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Road }
     * 
     * 
     */
    public List<Road> getDestinationMotorway() {
        if (destinationMotorway == null) {
            destinationMotorway = new ArrayList<Road>();
        }
        return this.destinationMotorway;
    }

    /**
     * Gets the value of the junctionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getJunctionExtension() {
        return junctionExtension;
    }

    /**
     * Sets the value of the junctionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setJunctionExtension(ExtensionType value) {
        this.junctionExtension = value;
    }

}
