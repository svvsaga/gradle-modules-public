
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersectWithApplicableDays" type="{http://datex2.eu/schema/3/common}Boolean"/&gt;
 *         &lt;element name="specialDayType" type="{http://datex2.eu/schema/3/common}_SpecialDayTypeEnum"/&gt;
 *         &lt;element name="publicEvent" type="{http://datex2.eu/schema/3/common}_PublicEventTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="namedArea" type="{http://datex2.eu/schema/3/common}NamedArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_specialDayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialDay", propOrder = {
    "intersectWithApplicableDays",
    "specialDayType",
    "publicEvent",
    "namedArea",
    "_SpecialDayExtension"
})
@XmlSeeAlso({
    PublicHoliday.class
})
public class SpecialDay {

    protected boolean intersectWithApplicableDays;
    @XmlElement(required = true)
    protected _SpecialDayTypeEnum specialDayType;
    protected _PublicEventTypeEnum publicEvent;
    protected List<NamedArea> namedArea;
    @XmlElement(name = "_specialDayExtension")
    protected _ExtensionType _SpecialDayExtension;

    /**
     * Gets the value of the intersectWithApplicableDays property.
     * 
     */
    public boolean isIntersectWithApplicableDays() {
        return intersectWithApplicableDays;
    }

    /**
     * Sets the value of the intersectWithApplicableDays property.
     * 
     */
    public void setIntersectWithApplicableDays(boolean value) {
        this.intersectWithApplicableDays = value;
    }

    /**
     * Gets the value of the specialDayType property.
     * 
     * @return
     *     possible object is
     *     {@link _SpecialDayTypeEnum }
     *     
     */
    public _SpecialDayTypeEnum getSpecialDayType() {
        return specialDayType;
    }

    /**
     * Sets the value of the specialDayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SpecialDayTypeEnum }
     *     
     */
    public void setSpecialDayType(_SpecialDayTypeEnum value) {
        this.specialDayType = value;
    }

    /**
     * Gets the value of the publicEvent property.
     * 
     * @return
     *     possible object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public _PublicEventTypeEnum getPublicEvent() {
        return publicEvent;
    }

    /**
     * Sets the value of the publicEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public void setPublicEvent(_PublicEventTypeEnum value) {
        this.publicEvent = value;
    }

    /**
     * Gets the value of the namedArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the namedArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedArea }
     * 
     * 
     */
    public List<NamedArea> getNamedArea() {
        if (namedArea == null) {
            namedArea = new ArrayList<NamedArea>();
        }
        return this.namedArea;
    }

    /**
     * Gets the value of the _SpecialDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SpecialDayExtension() {
        return _SpecialDayExtension;
    }

    /**
     * Sets the value of the _SpecialDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SpecialDayExtension(_ExtensionType value) {
        this._SpecialDayExtension = value;
    }

}
