
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Characteristics specific to a pictogram display area on the VMS.
 * 
 * <p>Java class for PictogramDisplayArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictogramDisplayArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramCodeListIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="pictogramNumberOfColours" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="_pictogramDisplayAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictogramDisplayArea", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "pictogramCodeListIdentifier",
    "pictogramNumberOfColours",
    "pictogramDisplayAreaExtension"
})
public class PictogramDisplayArea
    extends DisplayArea
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String pictogramCodeListIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pictogramNumberOfColours;
    @XmlElement(name = "_pictogramDisplayAreaExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType pictogramDisplayAreaExtension;

    /**
     * Gets the value of the pictogramCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramCodeListIdentifier() {
        return pictogramCodeListIdentifier;
    }

    /**
     * Sets the value of the pictogramCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramCodeListIdentifier(String value) {
        this.pictogramCodeListIdentifier = value;
    }

    /**
     * Gets the value of the pictogramNumberOfColours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPictogramNumberOfColours() {
        return pictogramNumberOfColours;
    }

    /**
     * Sets the value of the pictogramNumberOfColours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPictogramNumberOfColours(BigInteger value) {
        this.pictogramNumberOfColours = value;
    }

    /**
     * Gets the value of the pictogramDisplayAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPictogramDisplayAreaExtension() {
        return pictogramDisplayAreaExtension;
    }

    /**
     * Sets the value of the pictogramDisplayAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPictogramDisplayAreaExtension(ExtensionType value) {
        this.pictogramDisplayAreaExtension = value;
    }

}
