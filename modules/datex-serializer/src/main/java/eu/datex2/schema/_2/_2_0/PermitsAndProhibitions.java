
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermitsAndProhibitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermitsAndProhibitions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activity" type="{http://datex2.eu/schema/2/2_0}RestAreaActivityEnum"/&gt;
 *         &lt;element name="regulation" type="{http://datex2.eu/schema/2/2_0}RegulationEnum"/&gt;
 *         &lt;element name="permitsAndProhibitionsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermitsAndProhibitions", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "activity",
    "regulation",
    "permitsAndProhibitionsExtension"
})
public class PermitsAndProhibitions {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected RestAreaActivityEnum activity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected RegulationEnum regulation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType permitsAndProhibitionsExtension;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link RestAreaActivityEnum }
     *     
     */
    public RestAreaActivityEnum getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestAreaActivityEnum }
     *     
     */
    public void setActivity(RestAreaActivityEnum value) {
        this.activity = value;
    }

    /**
     * Gets the value of the regulation property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationEnum }
     *     
     */
    public RegulationEnum getRegulation() {
        return regulation;
    }

    /**
     * Sets the value of the regulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationEnum }
     *     
     */
    public void setRegulation(RegulationEnum value) {
        this.regulation = value;
    }

    /**
     * Gets the value of the permitsAndProhibitionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPermitsAndProhibitionsExtension() {
        return permitsAndProhibitionsExtension;
    }

    /**
     * Sets the value of the permitsAndProhibitionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPermitsAndProhibitionsExtension(ExtensionType value) {
        this.permitsAndProhibitionsExtension = value;
    }

}
