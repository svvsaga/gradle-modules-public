
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPathAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPathAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLowestFRCToNextLRPoint" type="{http://datex2.eu/schema/2/2_0}OpenlrFunctionalRoadClassEnum"/&gt;
 *         &lt;element name="openlrDistanceToNextLRPoint" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="openlrPathAttributesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPathAttributes", propOrder = {
    "openlrLowestFRCToNextLRPoint",
    "openlrDistanceToNextLRPoint",
    "openlrPathAttributesExtension"
})
public class OpenlrPathAttributes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpenlrFunctionalRoadClassEnum openlrLowestFRCToNextLRPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrDistanceToNextLRPoint;
    protected _ExtensionType openlrPathAttributesExtension;

    /**
     * Gets the value of the openlrLowestFRCToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public OpenlrFunctionalRoadClassEnum getOpenlrLowestFRCToNextLRPoint() {
        return openlrLowestFRCToNextLRPoint;
    }

    /**
     * Sets the value of the openlrLowestFRCToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrLowestFRCToNextLRPoint(OpenlrFunctionalRoadClassEnum value) {
        this.openlrLowestFRCToNextLRPoint = value;
    }

    /**
     * Gets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrDistanceToNextLRPoint() {
        return openlrDistanceToNextLRPoint;
    }

    /**
     * Sets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrDistanceToNextLRPoint(BigInteger value) {
        this.openlrDistanceToNextLRPoint = value;
    }

    /**
     * Gets the value of the openlrPathAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getOpenlrPathAttributesExtension() {
        return openlrPathAttributesExtension;
    }

    /**
     * Sets the value of the openlrPathAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setOpenlrPathAttributesExtension(_ExtensionType value) {
        this.openlrPathAttributesExtension = value;
    }

}
