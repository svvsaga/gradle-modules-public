
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="associatedManagementOrDiversionPlan" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="messageSetBy" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="setBySystem" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="reasonForSetting" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="codedReasonForSetting" type="{http://datex2.eu/schema/2/2_0}CodedReasonForSettingMessageEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsMessageInformationType" type="{http://datex2.eu/schema/2/2_0}VmsMessageInformationTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primarySetting" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="mareNostrumCompliant" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeLastSet" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="requestedBy" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="situationToWhichMessageIsRelated" type="{http://datex2.eu/schema/2/2_0}VersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="situationRecordToWhichMessageIsRelated" type="{http://datex2.eu/schema/2/2_0}VersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromSituationRecord" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="textPictogramSequencingInterval" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="textPage" type="{http://datex2.eu/schema/2/2_0}_TextPage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsPictogramDisplayArea" type="{http://datex2.eu/schema/2/2_0}_VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsMessageExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "associatedManagementOrDiversionPlan",
    "messageSetBy",
    "setBySystem",
    "reasonForSetting",
    "codedReasonForSetting",
    "vmsMessageInformationType",
    "primarySetting",
    "mareNostrumCompliant",
    "timeLastSet",
    "requestedBy",
    "situationToWhichMessageIsRelated",
    "situationRecordToWhichMessageIsRelated",
    "distanceFromSituationRecord",
    "textPictogramSequencingInterval",
    "textPage",
    "vmsPictogramDisplayArea",
    "vmsMessageExtension"
})
public class VmsMessage {

    protected String associatedManagementOrDiversionPlan;
    protected MultilingualString messageSetBy;
    protected Boolean setBySystem;
    protected MultilingualString reasonForSetting;
    @XmlSchemaType(name = "string")
    protected CodedReasonForSettingMessageEnum codedReasonForSetting;
    @XmlSchemaType(name = "string")
    protected List<VmsMessageInformationTypeEnum> vmsMessageInformationType;
    protected Boolean primarySetting;
    protected Boolean mareNostrumCompliant;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLastSet;
    protected MultilingualString requestedBy;
    protected VersionedReference situationToWhichMessageIsRelated;
    protected VersionedReference situationRecordToWhichMessageIsRelated;
    protected Float distanceFromSituationRecord;
    protected Float textPictogramSequencingInterval;
    protected List<_TextPage> textPage;
    protected List<_VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea> vmsPictogramDisplayArea;
    protected _ExtensionType vmsMessageExtension;

    /**
     * Gets the value of the associatedManagementOrDiversionPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedManagementOrDiversionPlan() {
        return associatedManagementOrDiversionPlan;
    }

    /**
     * Sets the value of the associatedManagementOrDiversionPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedManagementOrDiversionPlan(String value) {
        this.associatedManagementOrDiversionPlan = value;
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
     *     {@link CodedReasonForSettingMessageEnum }
     *     
     */
    public CodedReasonForSettingMessageEnum getCodedReasonForSetting() {
        return codedReasonForSetting;
    }

    /**
     * Sets the value of the codedReasonForSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedReasonForSettingMessageEnum }
     *     
     */
    public void setCodedReasonForSetting(CodedReasonForSettingMessageEnum value) {
        this.codedReasonForSetting = value;
    }

    /**
     * Gets the value of the vmsMessageInformationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsMessageInformationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsMessageInformationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsMessageInformationTypeEnum }
     * 
     * 
     */
    public List<VmsMessageInformationTypeEnum> getVmsMessageInformationType() {
        if (vmsMessageInformationType == null) {
            vmsMessageInformationType = new ArrayList<VmsMessageInformationTypeEnum>();
        }
        return this.vmsMessageInformationType;
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
     * Gets the value of the situationToWhichMessageIsRelated property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedReference }
     *     
     */
    public VersionedReference getSituationToWhichMessageIsRelated() {
        return situationToWhichMessageIsRelated;
    }

    /**
     * Sets the value of the situationToWhichMessageIsRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedReference }
     *     
     */
    public void setSituationToWhichMessageIsRelated(VersionedReference value) {
        this.situationToWhichMessageIsRelated = value;
    }

    /**
     * Gets the value of the situationRecordToWhichMessageIsRelated property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedReference }
     *     
     */
    public VersionedReference getSituationRecordToWhichMessageIsRelated() {
        return situationRecordToWhichMessageIsRelated;
    }

    /**
     * Sets the value of the situationRecordToWhichMessageIsRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedReference }
     *     
     */
    public void setSituationRecordToWhichMessageIsRelated(VersionedReference value) {
        this.situationRecordToWhichMessageIsRelated = value;
    }

    /**
     * Gets the value of the distanceFromSituationRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceFromSituationRecord() {
        return distanceFromSituationRecord;
    }

    /**
     * Sets the value of the distanceFromSituationRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceFromSituationRecord(Float value) {
        this.distanceFromSituationRecord = value;
    }

    /**
     * Gets the value of the textPictogramSequencingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTextPictogramSequencingInterval() {
        return textPictogramSequencingInterval;
    }

    /**
     * Sets the value of the textPictogramSequencingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTextPictogramSequencingInterval(Float value) {
        this.textPictogramSequencingInterval = value;
    }

    /**
     * Gets the value of the textPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _TextPage }
     * 
     * 
     */
    public List<_TextPage> getTextPage() {
        if (textPage == null) {
            textPage = new ArrayList<_TextPage>();
        }
        return this.textPage;
    }

    /**
     * Gets the value of the vmsPictogramDisplayArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsPictogramDisplayArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsPictogramDisplayArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea }
     * 
     * 
     */
    public List<_VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea> getVmsPictogramDisplayArea() {
        if (vmsPictogramDisplayArea == null) {
            vmsPictogramDisplayArea = new ArrayList<_VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea>();
        }
        return this.vmsPictogramDisplayArea;
    }

    /**
     * Gets the value of the vmsMessageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsMessageExtension() {
        return vmsMessageExtension;
    }

    /**
     * Sets the value of the vmsMessageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsMessageExtension(_ExtensionType value) {
        this.vmsMessageExtension = value;
    }

}
