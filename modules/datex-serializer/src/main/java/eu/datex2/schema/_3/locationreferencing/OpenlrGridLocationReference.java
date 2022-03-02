
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Area defined using an OpenLR™ method consisting in defining it by a tessellation of
 *         rectangles
 *       
 * 
 * <p>Java class for OpenlrGridLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrGridLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrNumColumns" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="openlrNumRows" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="openlrRectangle" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrRectangle"/&gt;
 *         &lt;element name="_openlrGridLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGridLocationReference", propOrder = {
    "openlrNumColumns",
    "openlrNumRows",
    "openlrRectangle",
    "openlrGridLocationReferenceExtension"
})
public class OpenlrGridLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrNumColumns;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrNumRows;
    @XmlElement(required = true)
    protected OpenlrRectangle openlrRectangle;
    @XmlElement(name = "_openlrGridLocationReferenceExtension")
    protected ExtensionType openlrGridLocationReferenceExtension;

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
     * Gets the value of the openlrRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrRectangle }
     *     
     */
    public OpenlrRectangle getOpenlrRectangle() {
        return openlrRectangle;
    }

    /**
     * Sets the value of the openlrRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrRectangle }
     *     
     */
    public void setOpenlrRectangle(OpenlrRectangle value) {
        this.openlrRectangle = value;
    }

    /**
     * Gets the value of the openlrGridLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrGridLocationReferenceExtension() {
        return openlrGridLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrGridLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrGridLocationReferenceExtension(ExtensionType value) {
        this.openlrGridLocationReferenceExtension = value;
    }

}
