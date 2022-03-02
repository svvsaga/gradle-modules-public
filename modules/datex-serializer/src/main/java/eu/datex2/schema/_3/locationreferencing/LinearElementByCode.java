
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A linear element along a single linear object defined by its identifier or code in a road
 *         network reference model (specified in LinearElement class) which segments the road network according to
 *         specific business rules.
 *       
 * 
 * <p>Java class for LinearElementByCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElementByCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linearElementIdentifier" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_linearElementByCodeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElementByCode", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "linearElementIdentifier",
    "linearElementByCodeExtension"
})
public class LinearElementByCode
    extends LinearElement
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected String linearElementIdentifier;
    @XmlElement(name = "_linearElementByCodeExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType linearElementByCodeExtension;

    /**
     * Gets the value of the linearElementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearElementIdentifier() {
        return linearElementIdentifier;
    }

    /**
     * Sets the value of the linearElementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearElementIdentifier(String value) {
        this.linearElementIdentifier = value;
    }

    /**
     * Gets the value of the linearElementByCodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearElementByCodeExtension() {
        return linearElementByCodeExtension;
    }

    /**
     * Sets the value of the linearElementByCodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearElementByCodeExtension(ExtensionType value) {
        this.linearElementByCodeExtension = value;
    }

}
