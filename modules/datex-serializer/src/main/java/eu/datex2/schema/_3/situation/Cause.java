
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains details of the cause of a record within a situation
 * 
 * <p>Java class for Cause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="causeType" type="{http://datex2.eu/schema/3/situation}_CauseTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="detailedCauseType" type="{http://datex2.eu/schema/3/situation}DetailedCauseType" minOccurs="0"/&gt;
 *         &lt;element name="managedCause" type="{http://datex2.eu/schema/3/situation}SituationRecordReference" minOccurs="0"/&gt;
 *         &lt;element name="_causeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cause", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "causeDescription",
    "causeType",
    "detailedCauseType",
    "managedCause",
    "causeExtension"
})
public class Cause {

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected MultilingualString causeDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected CauseTypeEnum causeType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected DetailedCauseType detailedCauseType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected SituationRecordReference managedCause;
    @XmlElement(name = "_causeExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType causeExtension;

    /**
     * Gets the value of the causeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCauseDescription() {
        return causeDescription;
    }

    /**
     * Sets the value of the causeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCauseDescription(MultilingualString value) {
        this.causeDescription = value;
    }

    /**
     * Gets the value of the causeType property.
     * 
     * @return
     *     possible object is
     *     {@link CauseTypeEnum }
     *     
     */
    public CauseTypeEnum getCauseType() {
        return causeType;
    }

    /**
     * Sets the value of the causeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseTypeEnum }
     *     
     */
    public void setCauseType(CauseTypeEnum value) {
        this.causeType = value;
    }

    /**
     * Gets the value of the detailedCauseType property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedCauseType }
     *     
     */
    public DetailedCauseType getDetailedCauseType() {
        return detailedCauseType;
    }

    /**
     * Sets the value of the detailedCauseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedCauseType }
     *     
     */
    public void setDetailedCauseType(DetailedCauseType value) {
        this.detailedCauseType = value;
    }

    /**
     * Gets the value of the managedCause property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRecordReference }
     *     
     */
    public SituationRecordReference getManagedCause() {
        return managedCause;
    }

    /**
     * Sets the value of the managedCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRecordReference }
     *     
     */
    public void setManagedCause(SituationRecordReference value) {
        this.managedCause = value;
    }

    /**
     * Gets the value of the causeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCauseExtension() {
        return causeExtension;
    }

    /**
     * Sets the value of the causeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCauseExtension(ExtensionType value) {
        this.causeExtension = value;
    }

}
