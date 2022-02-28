
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplementaryPositionalDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPositionalDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationDescriptor" type="{http://datex2.eu/schema/2/2_0}LocationDescriptorEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sequentialRampNumber" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="affectedCarriagewayAndLanes" type="{http://datex2.eu/schema/2/2_0}AffectedCarriagewayAndLanes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPositionalDescriptionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locationPrecision" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPositionalDescription", propOrder = {
    "locationDescriptor",
    "sequentialRampNumber",
    "affectedCarriagewayAndLanes",
    "supplementaryPositionalDescriptionExtension"
})
public class SupplementaryPositionalDescription {

    @XmlSchemaType(name = "string")
    protected List<LocationDescriptorEnum> locationDescriptor;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequentialRampNumber;
    protected List<AffectedCarriagewayAndLanes> affectedCarriagewayAndLanes;
    protected _ExtensionType supplementaryPositionalDescriptionExtension;
    @XmlAttribute(name = "locationPrecision")
    protected BigInteger locationPrecision;

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDescriptorEnum }
     * 
     * 
     */
    public List<LocationDescriptorEnum> getLocationDescriptor() {
        if (locationDescriptor == null) {
            locationDescriptor = new ArrayList<LocationDescriptorEnum>();
        }
        return this.locationDescriptor;
    }

    /**
     * Gets the value of the sequentialRampNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequentialRampNumber() {
        return sequentialRampNumber;
    }

    /**
     * Sets the value of the sequentialRampNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequentialRampNumber(BigInteger value) {
        this.sequentialRampNumber = value;
    }

    /**
     * Gets the value of the affectedCarriagewayAndLanes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedCarriagewayAndLanes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedCarriagewayAndLanes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedCarriagewayAndLanes }
     * 
     * 
     */
    public List<AffectedCarriagewayAndLanes> getAffectedCarriagewayAndLanes() {
        if (affectedCarriagewayAndLanes == null) {
            affectedCarriagewayAndLanes = new ArrayList<AffectedCarriagewayAndLanes>();
        }
        return this.affectedCarriagewayAndLanes;
    }

    /**
     * Gets the value of the supplementaryPositionalDescriptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getSupplementaryPositionalDescriptionExtension() {
        return supplementaryPositionalDescriptionExtension;
    }

    /**
     * Sets the value of the supplementaryPositionalDescriptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setSupplementaryPositionalDescriptionExtension(_ExtensionType value) {
        this.supplementaryPositionalDescriptionExtension = value;
    }

    /**
     * Gets the value of the locationPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationPrecision() {
        return locationPrecision;
    }

    /**
     * Sets the value of the locationPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationPrecision(BigInteger value) {
        this.locationPrecision = value;
    }

}
