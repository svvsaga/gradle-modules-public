
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A referent on a linear object that has a known location such as a node, a reference marker
 *         (e.g. a marker-post), an intersection etc.
 *       
 * 
 * <p>Java class for Referent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Referent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referentIdentifier" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="referentName" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="referentType" type="{http://datex2.eu/schema/3/locationReferencing}_ReferentTypeEnum"/&gt;
 *         &lt;element name="referentDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="_referentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Referent", propOrder = {
    "referentIdentifier",
    "referentName",
    "referentType",
    "referentDescription",
    "pointCoordinates",
    "_ReferentExtension"
})
public class Referent {

    @XmlElement(required = true)
    protected String referentIdentifier;
    protected String referentName;
    @XmlElement(required = true)
    protected _ReferentTypeEnum referentType;
    protected MultilingualString referentDescription;
    protected PointCoordinates pointCoordinates;
    @XmlElement(name = "_referentExtension")
    protected _ExtensionType _ReferentExtension;

    /**
     * Gets the value of the referentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferentIdentifier() {
        return referentIdentifier;
    }

    /**
     * Sets the value of the referentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferentIdentifier(String value) {
        this.referentIdentifier = value;
    }

    /**
     * Gets the value of the referentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferentName() {
        return referentName;
    }

    /**
     * Sets the value of the referentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferentName(String value) {
        this.referentName = value;
    }

    /**
     * Gets the value of the referentType property.
     * 
     * @return
     *     possible object is
     *     {@link _ReferentTypeEnum }
     *     
     */
    public _ReferentTypeEnum getReferentType() {
        return referentType;
    }

    /**
     * Sets the value of the referentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ReferentTypeEnum }
     *     
     */
    public void setReferentType(_ReferentTypeEnum value) {
        this.referentType = value;
    }

    /**
     * Gets the value of the referentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReferentDescription() {
        return referentDescription;
    }

    /**
     * Sets the value of the referentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReferentDescription(MultilingualString value) {
        this.referentDescription = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the _ReferentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ReferentExtension() {
        return _ReferentExtension;
    }

    /**
     * Sets the value of the _ReferentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ReferentExtension(_ExtensionType value) {
        this._ReferentExtension = value;
    }

}
