
package eu.datex2.schema._3.exchangeinformation;

import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common._ExtensionType;
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
    "_AgentExtension"
})
public class Agent {

    protected InternationalIdentifier internationalIdentifier;
    @XmlElement(name = "_agentExtension")
    protected _ExtensionType _AgentExtension;

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
     * Gets the value of the _AgentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AgentExtension() {
        return _AgentExtension;
    }

    /**
     * Sets the value of the _AgentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AgentExtension(_ExtensionType value) {
        this._AgentExtension = value;
    }

}
