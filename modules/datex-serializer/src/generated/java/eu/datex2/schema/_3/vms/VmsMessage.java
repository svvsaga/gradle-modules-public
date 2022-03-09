
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associatedTrafficManagementPlan" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="messageSetBy" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="setBySystem" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="reasonForSetting" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="codedReasonForSetting" type="{http://datex2.eu/schema/3/vms}_SettingReasonEnum" minOccurs="0"/&gt;
 *         &lt;element name="messageInformationType" type="{http://datex2.eu/schema/3/vms}_MessageInformationTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primarySetting" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="mareNostrumCompliant" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeLastSet" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="requestedBy" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="relatedSituation" type="{http://datex2.eu/schema/3/vms}_SituationVersionedReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedSituationRecord" type="{http://datex2.eu/schema/3/vms}_SituationRecordVersionedReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromClosestSituationRecord" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="sequencingInterval" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="displayAreaSettings" type="{http://datex2.eu/schema/3/vms}_VmsMessageDisplayAreaIndexDisplayAreaSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://datex2.eu/schema/3/vms}Image" minOccurs="0"/&gt;
 *         &lt;element name="_vmsMessageExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsMessage", propOrder = {
    "associatedTrafficManagementPlan",
    "messageSetBy",
    "setBySystem",
    "reasonForSetting",
    "codedReasonForSetting",
    "messageInformationType",
    "primarySetting",
    "mareNostrumCompliant",
    "timeLastSet",
    "requestedBy",
    "relatedSituation",
    "relatedSituationRecord",
    "distanceFromClosestSituationRecord",
    "sequencingInterval",
    "displayAreaSettings",
    "image",
    "_VmsMessageExtension"
})
public class VmsMessage {

    protected String associatedTrafficManagementPlan;
    protected MultilingualString messageSetBy;
    protected Boolean setBySystem;
    protected MultilingualString reasonForSetting;
    protected _SettingReasonEnum codedReasonForSetting;
    protected List<_MessageInformationTypeEnum> messageInformationType;
    protected Boolean primarySetting;
    protected Boolean mareNostrumCompliant;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLastSet;
    protected MultilingualString requestedBy;
    protected List<_SituationVersionedReference> relatedSituation;
    protected List<_SituationRecordVersionedReference> relatedSituationRecord;
    protected Float distanceFromClosestSituationRecord;
    protected Float sequencingInterval;
    protected List<_VmsMessageDisplayAreaIndexDisplayAreaSettings> displayAreaSettings;
    protected Image image;
    @XmlElement(name = "_vmsMessageExtension")
    protected _ExtensionType _VmsMessageExtension;

    /**
     * Gets the value of the associatedTrafficManagementPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedTrafficManagementPlan() {
        return associatedTrafficManagementPlan;
    }

    /**
     * Sets the value of the associatedTrafficManagementPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedTrafficManagementPlan(String value) {
        this.associatedTrafficManagementPlan = value;
    }

    /**
     * Gets the value of the messageSetBy property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMessageSetBy() {
        return messageSetBy;
    }

    /**
     * Sets the value of the messageSetBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMessageSetBy(MultilingualString value) {
        this.messageSetBy = value;
    }

    /**
     * Gets the value of the setBySystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetBySystem() {
        return setBySystem;
    }

    /**
     * Sets the value of the setBySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetBySystem(Boolean value) {
        this.setBySystem = value;
    }

    /**
     * Gets the value of the reasonForSetting property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReasonForSetting() {
        return reasonForSetting;
    }

    /**
     * Sets the value of the reasonForSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReasonForSetting(MultilingualString value) {
        this.reasonForSetting = value;
    }

    /**
     * Gets the value of the codedReasonForSetting property.
     * 
     * @return
     *     possible object is
     *     {@link _SettingReasonEnum }
     *     
     */
    public _SettingReasonEnum getCodedReasonForSetting() {
        return codedReasonForSetting;
    }

    /**
     * Sets the value of the codedReasonForSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SettingReasonEnum }
     *     
     */
    public void setCodedReasonForSetting(_SettingReasonEnum value) {
        this.codedReasonForSetting = value;
    }

    /**
     * Gets the value of the messageInformationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageInformationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageInformationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _MessageInformationTypeEnum }
     * 
     * 
     */
    public List<_MessageInformationTypeEnum> getMessageInformationType() {
        if (messageInformationType == null) {
            messageInformationType = new ArrayList<_MessageInformationTypeEnum>();
        }
        return this.messageInformationType;
    }

    /**
     * Gets the value of the primarySetting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimarySetting() {
        return primarySetting;
    }

    /**
     * Sets the value of the primarySetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimarySetting(Boolean value) {
        this.primarySetting = value;
    }

    /**
     * Gets the value of the mareNostrumCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMareNostrumCompliant() {
        return mareNostrumCompliant;
    }

    /**
     * Sets the value of the mareNostrumCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMareNostrumCompliant(Boolean value) {
        this.mareNostrumCompliant = value;
    }

    /**
     * Gets the value of the timeLastSet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLastSet() {
        return timeLastSet;
    }

    /**
     * Sets the value of the timeLastSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLastSet(XMLGregorianCalendar value) {
        this.timeLastSet = value;
    }

    /**
     * Gets the value of the requestedBy property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRequestedBy() {
        return requestedBy;
    }

    /**
     * Sets the value of the requestedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRequestedBy(MultilingualString value) {
        this.requestedBy = value;
    }

    /**
     * Gets the value of the relatedSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _SituationVersionedReference }
     * 
     * 
     */
    public List<_SituationVersionedReference> getRelatedSituation() {
        if (relatedSituation == null) {
            relatedSituation = new ArrayList<_SituationVersionedReference>();
        }
        return this.relatedSituation;
    }

    /**
     * Gets the value of the relatedSituationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSituationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _SituationRecordVersionedReference }
     * 
     * 
     */
    public List<_SituationRecordVersionedReference> getRelatedSituationRecord() {
        if (relatedSituationRecord == null) {
            relatedSituationRecord = new ArrayList<_SituationRecordVersionedReference>();
        }
        return this.relatedSituationRecord;
    }

    /**
     * Gets the value of the distanceFromClosestSituationRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceFromClosestSituationRecord() {
        return distanceFromClosestSituationRecord;
    }

    /**
     * Sets the value of the distanceFromClosestSituationRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceFromClosestSituationRecord(Float value) {
        this.distanceFromClosestSituationRecord = value;
    }

    /**
     * Gets the value of the sequencingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSequencingInterval() {
        return sequencingInterval;
    }

    /**
     * Sets the value of the sequencingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSequencingInterval(Float value) {
        this.sequencingInterval = value;
    }

    /**
     * Gets the value of the displayAreaSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the displayAreaSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayAreaSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsMessageDisplayAreaIndexDisplayAreaSettings }
     * 
     * 
     */
    public List<_VmsMessageDisplayAreaIndexDisplayAreaSettings> getDisplayAreaSettings() {
        if (displayAreaSettings == null) {
            displayAreaSettings = new ArrayList<_VmsMessageDisplayAreaIndexDisplayAreaSettings>();
        }
        return this.displayAreaSettings;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the _VmsMessageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsMessageExtension() {
        return _VmsMessageExtension;
    }

    /**
     * Sets the value of the _VmsMessageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsMessageExtension(_ExtensionType value) {
        this._VmsMessageExtension = value;
    }

}
