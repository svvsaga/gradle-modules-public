
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrGridAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrGridAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrNumColumns" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="openlrNumRows" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="openlrGridAttributesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGridAttributes", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrNumColumns",
    "openlrNumRows",
    "openlrGridAttributesExtension"
})
public class OpenlrGridAttributes {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrNumColumns;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrNumRows;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType openlrGridAttributesExtension;

    /**
     * Gets the value of the openlrNumColumns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrNumColumns() {
        return openlrNumColumns;
    }

    /**
     * Sets the value of the openlrNumColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrNumColumns(BigInteger value) {
        this.openlrNumColumns = value;
    }

    /**
     * Gets the value of the openlrNumRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrNumRows() {
        return openlrNumRows;
    }

    /**
     * Sets the value of the openlrNumRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrNumRows(BigInteger value) {
        this.openlrNumRows = value;
    }

    /**
     * Gets the value of the openlrGridAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrGridAttributesExtension() {
        return openlrGridAttributesExtension;
    }

    /**
     * Sets the value of the openlrGridAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrGridAttributesExtension(ExtensionType value) {
        this.openlrGridAttributesExtension = value;
    }

}
