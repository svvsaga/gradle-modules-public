
package eu.datex2.schema._3.exchangeinformation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.InternationalIdentifier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internationalIdentifier" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_agentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agent", propOrder = {
    "internationalIdentifier",
    "agentExtension"
})
public class Agent {

    protected InternationalIdentifier internationalIdentifier;
    @XmlElement(name = "_agentExtension")
    protected ExtensionType agentExtension;

    /**
     * Gets the value of the internationalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInternationalIdentifier() {
        return internationalIdentifier;
    }

    /**
     * Sets the value of the internationalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInternationalIdentifier(InternationalIdentifier value) {
        this.internationalIdentifier = value;
    }

    /**
     * Gets the value of the agentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAgentExtension() {
        return agentExtension;
    }

    /**
     * Sets the value of the agentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAgentExtension(ExtensionType value) {
        this.agentExtension = value;
    }

}
