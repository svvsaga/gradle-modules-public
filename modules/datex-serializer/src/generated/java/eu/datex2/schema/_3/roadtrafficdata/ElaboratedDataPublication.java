
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.HeaderInformation;
import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common.PayloadPublication;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedDataPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedDataPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forecastDefault" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="periodDefault" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="timeDefault" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/3/common}HeaderInformation"/&gt;
 *         &lt;element name="referenceSettings" type="{http://datex2.eu/schema/3/roadTrafficData}ReferenceSettings" minOccurs="0"/&gt;
 *         &lt;element name="physicalQuantity" type="{http://datex2.eu/schema/3/roadTrafficData}PhysicalQuantity" maxOccurs="unbounded"/&gt;
 *         &lt;element name="informationManager" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_elaboratedDataPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedDataPublication", propOrder = {
    "forecastDefault",
    "periodDefault",
    "timeDefault",
    "headerInformation",
    "referenceSettings",
    "physicalQuantity",
    "informationManager",
    "_ElaboratedDataPublicationExtension"
})
public class ElaboratedDataPublication
    extends PayloadPublication
{

    protected Boolean forecastDefault;
    protected Float periodDefault;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeDefault;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    protected ReferenceSettings referenceSettings;
    @XmlElement(required = true)
    protected List<PhysicalQuantity> physicalQuantity;
    protected InternationalIdentifier informationManager;
    @XmlElement(name = "_elaboratedDataPublicationExtension")
    protected _ExtensionType _ElaboratedDataPublicationExtension;

    /**
     * Gets the value of the forecastDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastDefault() {
        return forecastDefault;
    }

    /**
     * Sets the value of the forecastDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastDefault(Boolean value) {
        this.forecastDefault = value;
    }

    /**
     * Gets the value of the periodDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriodDefault() {
        return periodDefault;
    }

    /**
     * Sets the value of the periodDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriodDefault(Float value) {
        this.periodDefault = value;
    }

    /**
     * Gets the value of the timeDefault property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDefault() {
        return timeDefault;
    }

    /**
     * Sets the value of the timeDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDefault(XMLGregorianCalendar value) {
        this.timeDefault = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the referenceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSettings }
     *     
     */
    public ReferenceSettings getReferenceSettings() {
        return referenceSettings;
    }

    /**
     * Sets the value of the referenceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSettings }
     *     
     */
    public void setReferenceSettings(ReferenceSettings value) {
        this.referenceSettings = value;
    }

    /**
     * Gets the value of the physicalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the physicalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalQuantity }
     * 
     * 
     */
    public List<PhysicalQuantity> getPhysicalQuantity() {
        if (physicalQuantity == null) {
            physicalQuantity = new ArrayList<PhysicalQuantity>();
        }
        return this.physicalQuantity;
    }

    /**
     * Gets the value of the informationManager property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManager() {
        return informationManager;
    }

    /**
     * Sets the value of the informationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManager(InternationalIdentifier value) {
        this.informationManager = value;
    }

    /**
     * Gets the value of the _ElaboratedDataPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElaboratedDataPublicationExtension() {
        return _ElaboratedDataPublicationExtension;
    }

    /**
     * Sets the value of the _ElaboratedDataPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElaboratedDataPublicationExtension(_ExtensionType value) {
        this._ElaboratedDataPublicationExtension = value;
    }

}
