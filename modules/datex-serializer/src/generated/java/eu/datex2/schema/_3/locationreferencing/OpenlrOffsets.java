
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrOffsets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrOffsets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPositiveOffset" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="openlrNegativeOffset" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="_openlrOffsetsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrOffsets", propOrder = {
    "openlrPositiveOffset",
    "openlrNegativeOffset",
    "openlrOffsetsExtension"
})
public class OpenlrOffsets {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrPositiveOffset;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrNegativeOffset;
    @XmlElement(name = "_openlrOffsetsExtension")
    protected ExtensionType openlrOffsetsExtension;

    /**
     * Gets the value of the openlrPositiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrPositiveOffset() {
        return openlrPositiveOffset;
    }

    /**
     * Sets the value of the openlrPositiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrPositiveOffset(BigInteger value) {
        this.openlrPositiveOffset = value;
    }

    /**
     * Gets the value of the openlrNegativeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrNegativeOffset() {
        return openlrNegativeOffset;
    }

    /**
     * Sets the value of the openlrNegativeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrNegativeOffset(BigInteger value) {
        this.openlrNegativeOffset = value;
    }

    /**
     * Gets the value of the openlrOffsetsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrOffsetsExtension() {
        return openlrOffsetsExtension;
    }

    /**
     * Sets the value of the openlrOffsetsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrOffsetsExtension(ExtensionType value) {
        this.openlrOffsetsExtension = value;
    }

}
