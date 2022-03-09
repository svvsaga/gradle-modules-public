
package eu.datex2.schema._3.situation;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}ServiceInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journeyDestination" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="journeyOrigin" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="journeyReference" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="transitServiceInformation" type="{http://datex2.eu/schema/3/situation}_TransitServiceInformationEnum"/&gt;
 *         &lt;element name="transitServiceType" type="{http://datex2.eu/schema/3/situation}_TransitServiceTypeEnum"/&gt;
 *         &lt;element name="scheduledDepartureTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="_transitInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitInformation", propOrder = {
    "journeyDestination",
    "journeyOrigin",
    "journeyReference",
    "transitServiceInformation",
    "transitServiceType",
    "scheduledDepartureTime",
    "_TransitInformationExtension"
})
public class TransitInformation
    extends ServiceInformation
{

    protected MultilingualString journeyDestination;
    protected MultilingualString journeyOrigin;
    protected String journeyReference;
    @XmlElement(required = true)
    protected _TransitServiceInformationEnum transitServiceInformation;
    @XmlElement(required = true)
    protected _TransitServiceTypeEnum transitServiceType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureTime;
    @XmlElement(name = "_transitInformationExtension")
    protected _ExtensionType _TransitInformationExtension;

    /**
     * Gets the value of the journeyDestination property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJourneyDestination() {
        return journeyDestination;
    }

    /**
     * Sets the value of the journeyDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJourneyDestination(MultilingualString value) {
        this.journeyDestination = value;
    }

    /**
     * Gets the value of the journeyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJourneyOrigin() {
        return journeyOrigin;
    }

    /**
     * Sets the value of the journeyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJourneyOrigin(MultilingualString value) {
        this.journeyOrigin = value;
    }

    /**
     * Gets the value of the journeyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyReference() {
        return journeyReference;
    }

    /**
     * Sets the value of the journeyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyReference(String value) {
        this.journeyReference = value;
    }

    /**
     * Gets the value of the transitServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link _TransitServiceInformationEnum }
     *     
     */
    public _TransitServiceInformationEnum getTransitServiceInformation() {
        return transitServiceInformation;
    }

    /**
     * Sets the value of the transitServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformation(_TransitServiceInformationEnum value) {
        this.transitServiceInformation = value;
    }

    /**
     * Gets the value of the transitServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link _TransitServiceTypeEnum }
     *     
     */
    public _TransitServiceTypeEnum getTransitServiceType() {
        return transitServiceType;
    }

    /**
     * Sets the value of the transitServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TransitServiceTypeEnum }
     *     
     */
    public void setTransitServiceType(_TransitServiceTypeEnum value) {
        this.transitServiceType = value;
    }

    /**
     * Gets the value of the scheduledDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Sets the value of the scheduledDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTime(XMLGregorianCalendar value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * Gets the value of the _TransitInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TransitInformationExtension() {
        return _TransitInformationExtension;
    }

    /**
     * Sets the value of the _TransitInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TransitInformationExtension(_ExtensionType value) {
        this._TransitInformationExtension = value;
    }

}
