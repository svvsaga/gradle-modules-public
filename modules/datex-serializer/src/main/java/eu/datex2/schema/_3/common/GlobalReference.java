
package eu.datex2.schema._3.common;

import eu.datex2.schema._3.situation.SituationRecordReference;
import eu.datex2.schema._3.situation.SituationReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A versioned reference to an object that may be in another publication from another
 *         publisher.
 *       
 * 
 * <p>Java class for GlobalReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalPublicationIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="externalPublisher" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_globalReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalReference", propOrder = {
    "externalPublicationIdentifier",
    "externalPublisher",
    "_GlobalReferenceExtension"
})
@XmlSeeAlso({
    SituationRecordReference.class,
    SituationReference.class
})
public abstract class GlobalReference {

    protected String externalPublicationIdentifier;
    protected InternationalIdentifier externalPublisher;
    @XmlElement(name = "_globalReferenceExtension")
    protected _ExtensionType _GlobalReferenceExtension;

    /**
     * Gets the value of the externalPublicationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPublicationIdentifier() {
        return externalPublicationIdentifier;
    }

    /**
     * Sets the value of the externalPublicationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPublicationIdentifier(String value) {
        this.externalPublicationIdentifier = value;
    }

    /**
     * Gets the value of the externalPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getExternalPublisher() {
        return externalPublisher;
    }

    /**
     * Sets the value of the externalPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setExternalPublisher(InternationalIdentifier value) {
        this.externalPublisher = value;
    }

    /**
     * Gets the value of the _GlobalReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GlobalReferenceExtension() {
        return _GlobalReferenceExtension;
    }

    /**
     * Sets the value of the _GlobalReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GlobalReferenceExtension(_ExtensionType value) {
        this._GlobalReferenceExtension = value;
    }

}
