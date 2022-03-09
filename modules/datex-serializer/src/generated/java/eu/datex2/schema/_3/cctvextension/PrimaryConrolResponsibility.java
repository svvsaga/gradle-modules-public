
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimaryConrolResponsibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryConrolResponsibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cameraBaseStationName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="cameraBaseStationIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="controlCentreName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="controlCentreIdentification" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="workGroupName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="workGroupIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="_primaryConrolResponsibilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryConrolResponsibility", propOrder = {
    "cameraBaseStationName",
    "cameraBaseStationIdentification",
    "controlCentreName",
    "controlCentreIdentification",
    "workGroupName",
    "workGroupIdentification",
    "_PrimaryConrolResponsibilityExtension"
})
public class PrimaryConrolResponsibility {

    protected MultilingualString cameraBaseStationName;
    protected String cameraBaseStationIdentification;
    protected MultilingualString controlCentreName;
    protected BigInteger controlCentreIdentification;
    protected MultilingualString workGroupName;
    protected String workGroupIdentification;
    @XmlElement(name = "_primaryConrolResponsibilityExtension")
    protected _ExtensionType _PrimaryConrolResponsibilityExtension;

    /**
     * Gets the value of the cameraBaseStationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCameraBaseStationName() {
        return cameraBaseStationName;
    }

    /**
     * Sets the value of the cameraBaseStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCameraBaseStationName(MultilingualString value) {
        this.cameraBaseStationName = value;
    }

    /**
     * Gets the value of the cameraBaseStationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraBaseStationIdentification() {
        return cameraBaseStationIdentification;
    }

    /**
     * Sets the value of the cameraBaseStationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraBaseStationIdentification(String value) {
        this.cameraBaseStationIdentification = value;
    }

    /**
     * Gets the value of the controlCentreName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getControlCentreName() {
        return controlCentreName;
    }

    /**
     * Sets the value of the controlCentreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setControlCentreName(MultilingualString value) {
        this.controlCentreName = value;
    }

    /**
     * Gets the value of the controlCentreIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getControlCentreIdentification() {
        return controlCentreIdentification;
    }

    /**
     * Sets the value of the controlCentreIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setControlCentreIdentification(BigInteger value) {
        this.controlCentreIdentification = value;
    }

    /**
     * Gets the value of the workGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getWorkGroupName() {
        return workGroupName;
    }

    /**
     * Sets the value of the workGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setWorkGroupName(MultilingualString value) {
        this.workGroupName = value;
    }

    /**
     * Gets the value of the workGroupIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkGroupIdentification() {
        return workGroupIdentification;
    }

    /**
     * Sets the value of the workGroupIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkGroupIdentification(String value) {
        this.workGroupIdentification = value;
    }

    /**
     * Gets the value of the _PrimaryConrolResponsibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PrimaryConrolResponsibilityExtension() {
        return _PrimaryConrolResponsibilityExtension;
    }

    /**
     * Sets the value of the _PrimaryConrolResponsibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PrimaryConrolResponsibilityExtension(_ExtensionType value) {
        this._PrimaryConrolResponsibilityExtension = value;
    }

}
