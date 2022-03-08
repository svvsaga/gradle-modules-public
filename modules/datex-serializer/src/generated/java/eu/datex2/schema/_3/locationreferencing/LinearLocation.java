
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLinear" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLinear" minOccurs="0"/&gt;
 *         &lt;element name="gmlLineString" type="{http://datex2.eu/schema/3/locationReferencing}GmlLineString" minOccurs="0"/&gt;
 *         &lt;element name="secondarySupplementaryDescription" type="{http://datex2.eu/schema/3/locationReferencing}SupplementaryPositionalDescription" minOccurs="0"/&gt;
 *         &lt;element name="_linearLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearLocation", propOrder = {
    "openlrLinear",
    "gmlLineString",
    "secondarySupplementaryDescription",
    "linearLocationExtension"
})
@XmlSeeAlso({
    SingleRoadLinearLocation.class
})
public class LinearLocation
    extends NetworkLocation
{

    protected OpenlrLinear openlrLinear;
    protected GmlLineString gmlLineString;
    protected SupplementaryPositionalDescription secondarySupplementaryDescription;
    @XmlElement(name = "_linearLocationExtension")
    protected ExtensionType linearLocationExtension;

    /**
     * Gets the value of the openlrLinear property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLinear }
     *     
     */
    public OpenlrLinear getOpenlrLinear() {
        return openlrLinear;
    }

    /**
     * Sets the value of the openlrLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLinear }
     *     
     */
    public void setOpenlrLinear(OpenlrLinear value) {
        this.openlrLinear = value;
    }

    /**
     * Gets the value of the gmlLineString property.
     * 
     * @return
     *     possible object is
     *     {@link GmlLineString }
     *     
     */
    public GmlLineString getGmlLineString() {
        return gmlLineString;
    }

    /**
     * Sets the value of the gmlLineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GmlLineString }
     *     
     */
    public void setGmlLineString(GmlLineString value) {
        this.gmlLineString = value;
    }

    /**
     * Gets the value of the secondarySupplementaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public SupplementaryPositionalDescription getSecondarySupplementaryDescription() {
        return secondarySupplementaryDescription;
    }

    /**
     * Sets the value of the secondarySupplementaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public void setSecondarySupplementaryDescription(SupplementaryPositionalDescription value) {
        this.secondarySupplementaryDescription = value;
    }

    /**
     * Gets the value of the linearLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearLocationExtension() {
        return linearLocationExtension;
    }

    /**
     * Sets the value of the linearLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearLocationExtension(ExtensionType value) {
        this.linearLocationExtension = value;
    }

}
