
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="directionPurpose" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionPurposeEnum" minOccurs="0"/&gt;
 *         &lt;element name="geographicDescriptor" type="{http://datex2.eu/schema/3/locationReferencing}_GeographicCharacteristicEnum" minOccurs="0"/&gt;
 *         &lt;element name="infrastructureDescriptor" type="{http://datex2.eu/schema/3/locationReferencing}_InfrastructureDescriptorEnum" minOccurs="0"/&gt;
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="locationDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="positionOnCarriageway" type="{http://datex2.eu/schema/3/locationReferencing}_RelativePositionOnCarriagewayEnum" minOccurs="0"/&gt;
 *         &lt;element name="sequentialRampNumber" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/3/locationReferencing}Carriageway" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="namedArea" type="{http://datex2.eu/schema/3/locationReferencing}NamedArea" minOccurs="0"/&gt;
 *         &lt;element name="roadInformation" type="{http://datex2.eu/schema/3/locationReferencing}RoadInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_supplementaryPositionalDescriptionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locationPrecision" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPositionalDescription", propOrder = {
    "directionPurpose",
    "geographicDescriptor",
    "infrastructureDescriptor",
    "lengthAffected",
    "locationDescription",
    "positionOnCarriageway",
    "sequentialRampNumber",
    "carriageway",
    "namedArea",
    "roadInformation",
    "_SupplementaryPositionalDescriptionExtension"
})
public class SupplementaryPositionalDescription {

    protected _DirectionPurposeEnum directionPurpose;
    protected _GeographicCharacteristicEnum geographicDescriptor;
    protected _InfrastructureDescriptorEnum infrastructureDescriptor;
    protected Float lengthAffected;
    protected MultilingualString locationDescription;
    protected _RelativePositionOnCarriagewayEnum positionOnCarriageway;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequentialRampNumber;
    protected List<Carriageway> carriageway;
    protected NamedArea namedArea;
    protected List<RoadInformation> roadInformation;
    @XmlElement(name = "_supplementaryPositionalDescriptionExtension")
    protected _ExtensionType _SupplementaryPositionalDescriptionExtension;
    @XmlAttribute(name = "locationPrecision")
    protected BigInteger locationPrecision;

    /**
     * Gets the value of the directionPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionPurposeEnum }
     *     
     */
    public _DirectionPurposeEnum getDirectionPurpose() {
        return directionPurpose;
    }

    /**
     * Sets the value of the directionPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionPurposeEnum }
     *     
     */
    public void setDirectionPurpose(_DirectionPurposeEnum value) {
        this.directionPurpose = value;
    }

    /**
     * Gets the value of the geographicDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link _GeographicCharacteristicEnum }
     *     
     */
    public _GeographicCharacteristicEnum getGeographicDescriptor() {
        return geographicDescriptor;
    }

    /**
     * Sets the value of the geographicDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link _GeographicCharacteristicEnum }
     *     
     */
    public void setGeographicDescriptor(_GeographicCharacteristicEnum value) {
        this.geographicDescriptor = value;
    }

    /**
     * Gets the value of the infrastructureDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link _InfrastructureDescriptorEnum }
     *     
     */
    public _InfrastructureDescriptorEnum getInfrastructureDescriptor() {
        return infrastructureDescriptor;
    }

    /**
     * Sets the value of the infrastructureDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link _InfrastructureDescriptorEnum }
     *     
     */
    public void setInfrastructureDescriptor(_InfrastructureDescriptorEnum value) {
        this.infrastructureDescriptor = value;
    }

    /**
     * Gets the value of the lengthAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Sets the value of the lengthAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLocationDescription(MultilingualString value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the positionOnCarriageway property.
     * 
     * @return
     *     possible object is
     *     {@link _RelativePositionOnCarriagewayEnum }
     *     
     */
    public _RelativePositionOnCarriagewayEnum getPositionOnCarriageway() {
        return positionOnCarriageway;
    }

    /**
     * Sets the value of the positionOnCarriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RelativePositionOnCarriagewayEnum }
     *     
     */
    public void setPositionOnCarriageway(_RelativePositionOnCarriagewayEnum value) {
        this.positionOnCarriageway = value;
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
     * Gets the value of the carriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carriageway }
     * 
     * 
     */
    public List<Carriageway> getCarriageway() {
        if (carriageway == null) {
            carriageway = new ArrayList<Carriageway>();
        }
        return this.carriageway;
    }

    /**
     * Gets the value of the namedArea property.
     * 
     * @return
     *     possible object is
     *     {@link NamedArea }
     *     
     */
    public NamedArea getNamedArea() {
        return namedArea;
    }

    /**
     * Sets the value of the namedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedArea }
     *     
     */
    public void setNamedArea(NamedArea value) {
        this.namedArea = value;
    }

    /**
     * Gets the value of the roadInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadInformation }
     * 
     * 
     */
    public List<RoadInformation> getRoadInformation() {
        if (roadInformation == null) {
            roadInformation = new ArrayList<RoadInformation>();
        }
        return this.roadInformation;
    }

    /**
     * Gets the value of the _SupplementaryPositionalDescriptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SupplementaryPositionalDescriptionExtension() {
        return _SupplementaryPositionalDescriptionExtension;
    }

    /**
     * Sets the value of the _SupplementaryPositionalDescriptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SupplementaryPositionalDescriptionExtension(_ExtensionType value) {
        this._SupplementaryPositionalDescriptionExtension = value;
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
