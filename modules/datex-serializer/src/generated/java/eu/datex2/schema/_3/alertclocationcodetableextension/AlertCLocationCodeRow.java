
package eu.datex2.schema._3.alertclocationcodetableextension;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.PointCoordinates;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCLocationCodeRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocationCodeRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationCode" type="{http://datex2.eu/schema/3/common}Integer"/&gt;
 *         &lt;element name="typeClass" type="{http://datex2.eu/schema/3/alertCLocationCodeTableExtension}_LocationCodeClassTypeEnum"/&gt;
 *         &lt;element name="typeCode" type="{http://datex2.eu/schema/3/common}Integer"/&gt;
 *         &lt;element name="subTypeCode" type="{http://datex2.eu/schema/3/common}Integer"/&gt;
 *         &lt;element name="alertCLocationCodeRoadName" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="secondName" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="areaReference" type="{http://datex2.eu/schema/3/common}Integer"/&gt;
 *         &lt;element name="linearReference" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="negativeOffset" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="positiveOffset" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="alertCLocationCodeRoadNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="junctionNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="remoteTargetNegativeOffset" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="remoteTargetPositiveOffset" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://datex2.eu/schema/3/alertCLocationCodeTableExtension}_LocationCodeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://datex2.eu/schema/3/alertCLocationCodeTableExtension}_LocationCodeSubTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="_alertCLocationCodeRowExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocationCodeRow", propOrder = {
    "locationCode",
    "typeClass",
    "typeCode",
    "subTypeCode",
    "alertCLocationCodeRoadName",
    "firstName",
    "secondName",
    "areaReference",
    "linearReference",
    "negativeOffset",
    "positiveOffset",
    "alertCLocationCodeRoadNumber",
    "junctionNumber",
    "remoteTargetNegativeOffset",
    "remoteTargetPositiveOffset",
    "type",
    "subType",
    "pointCoordinates",
    "_AlertCLocationCodeRowExtension"
})
public class AlertCLocationCodeRow {

    @XmlElement(required = true)
    protected BigInteger locationCode;
    @XmlElement(required = true)
    protected _LocationCodeClassTypeEnum typeClass;
    @XmlElement(required = true)
    protected BigInteger typeCode;
    @XmlElement(required = true)
    protected BigInteger subTypeCode;
    protected String alertCLocationCodeRoadName;
    @XmlElement(required = true)
    protected String firstName;
    protected String secondName;
    @XmlElement(required = true)
    protected BigInteger areaReference;
    protected BigInteger linearReference;
    protected BigInteger negativeOffset;
    protected BigInteger positiveOffset;
    protected String alertCLocationCodeRoadNumber;
    protected String junctionNumber;
    protected String remoteTargetNegativeOffset;
    protected String remoteTargetPositiveOffset;
    protected _LocationCodeTypeEnum type;
    protected _LocationCodeSubTypeEnum subType;
    protected PointCoordinates pointCoordinates;
    @XmlElement(name = "_alertCLocationCodeRowExtension")
    protected _ExtensionType _AlertCLocationCodeRowExtension;

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationCode(BigInteger value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the typeClass property.
     * 
     * @return
     *     possible object is
     *     {@link _LocationCodeClassTypeEnum }
     *     
     */
    public _LocationCodeClassTypeEnum getTypeClass() {
        return typeClass;
    }

    /**
     * Sets the value of the typeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LocationCodeClassTypeEnum }
     *     
     */
    public void setTypeClass(_LocationCodeClassTypeEnum value) {
        this.typeClass = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeCode(BigInteger value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the subTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubTypeCode() {
        return subTypeCode;
    }

    /**
     * Sets the value of the subTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubTypeCode(BigInteger value) {
        this.subTypeCode = value;
    }

    /**
     * Gets the value of the alertCLocationCodeRoadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCodeRoadName() {
        return alertCLocationCodeRoadName;
    }

    /**
     * Sets the value of the alertCLocationCodeRoadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCodeRoadName(String value) {
        this.alertCLocationCodeRoadName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the areaReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAreaReference() {
        return areaReference;
    }

    /**
     * Sets the value of the areaReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAreaReference(BigInteger value) {
        this.areaReference = value;
    }

    /**
     * Gets the value of the linearReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinearReference() {
        return linearReference;
    }

    /**
     * Sets the value of the linearReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinearReference(BigInteger value) {
        this.linearReference = value;
    }

    /**
     * Gets the value of the negativeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNegativeOffset() {
        return negativeOffset;
    }

    /**
     * Sets the value of the negativeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNegativeOffset(BigInteger value) {
        this.negativeOffset = value;
    }

    /**
     * Gets the value of the positiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositiveOffset() {
        return positiveOffset;
    }

    /**
     * Sets the value of the positiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositiveOffset(BigInteger value) {
        this.positiveOffset = value;
    }

    /**
     * Gets the value of the alertCLocationCodeRoadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCodeRoadNumber() {
        return alertCLocationCodeRoadNumber;
    }

    /**
     * Sets the value of the alertCLocationCodeRoadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCodeRoadNumber(String value) {
        this.alertCLocationCodeRoadNumber = value;
    }

    /**
     * Gets the value of the junctionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionNumber() {
        return junctionNumber;
    }

    /**
     * Sets the value of the junctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionNumber(String value) {
        this.junctionNumber = value;
    }

    /**
     * Gets the value of the remoteTargetNegativeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTargetNegativeOffset() {
        return remoteTargetNegativeOffset;
    }

    /**
     * Sets the value of the remoteTargetNegativeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTargetNegativeOffset(String value) {
        this.remoteTargetNegativeOffset = value;
    }

    /**
     * Gets the value of the remoteTargetPositiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTargetPositiveOffset() {
        return remoteTargetPositiveOffset;
    }

    /**
     * Sets the value of the remoteTargetPositiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTargetPositiveOffset(String value) {
        this.remoteTargetPositiveOffset = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link _LocationCodeTypeEnum }
     *     
     */
    public _LocationCodeTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LocationCodeTypeEnum }
     *     
     */
    public void setType(_LocationCodeTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link _LocationCodeSubTypeEnum }
     *     
     */
    public _LocationCodeSubTypeEnum getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LocationCodeSubTypeEnum }
     *     
     */
    public void setSubType(_LocationCodeSubTypeEnum value) {
        this.subType = value;
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
     * Gets the value of the _AlertCLocationCodeRowExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCLocationCodeRowExtension() {
        return _AlertCLocationCodeRowExtension;
    }

    /**
     * Sets the value of the _AlertCLocationCodeRowExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCLocationCodeRowExtension(_ExtensionType value) {
        this._AlertCLocationCodeRowExtension = value;
    }

}
