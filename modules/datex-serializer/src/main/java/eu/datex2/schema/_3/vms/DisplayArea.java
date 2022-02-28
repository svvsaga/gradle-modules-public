
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Lane;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Configuration (static or dynamic) of a display area.
 * 
 * <p>Java class for DisplayArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequencingCapable" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfSequentialPages" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="positionXAbsolute" type="{http://datex2.eu/schema/3/vms}_PositionXAbsoluteEnum" minOccurs="0"/&gt;
 *         &lt;element name="positionXRelativeToPrevious" type="{http://datex2.eu/schema/3/vms}_PositionXRelativeEnum" minOccurs="0"/&gt;
 *         &lt;element name="positionYAbsolute" type="{http://datex2.eu/schema/3/vms}_PositionYAbsoluteEnum" minOccurs="0"/&gt;
 *         &lt;element name="positionYRelativeToPrevious" type="{http://datex2.eu/schema/3/vms}_PositionYRelativeEnum" minOccurs="0"/&gt;
 *         &lt;element name="displayGeometry" type="{http://datex2.eu/schema/3/vms}DisplayGeometry" minOccurs="0"/&gt;
 *         &lt;element name="overriddenLaneAssociation" type="{http://datex2.eu/schema/3/locationReferencing}Lane" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_displayAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayArea", propOrder = {
    "sequencingCapable",
    "maxNumberOfSequentialPages",
    "positionXAbsolute",
    "positionXRelativeToPrevious",
    "positionYAbsolute",
    "positionYRelativeToPrevious",
    "displayGeometry",
    "overriddenLaneAssociation",
    "_DisplayAreaExtension"
})
@XmlSeeAlso({
    PictogramDisplayArea.class,
    SupplementaryPanelArea.class,
    TextDisplayArea.class
})
public class DisplayArea {

    protected Boolean sequencingCapable;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfSequentialPages;
    protected _PositionXAbsoluteEnum positionXAbsolute;
    protected _PositionXRelativeEnum positionXRelativeToPrevious;
    protected _PositionYAbsoluteEnum positionYAbsolute;
    protected _PositionYRelativeEnum positionYRelativeToPrevious;
    protected DisplayGeometry displayGeometry;
    protected List<Lane> overriddenLaneAssociation;
    @XmlElement(name = "_displayAreaExtension")
    protected _ExtensionType _DisplayAreaExtension;

    /**
     * Gets the value of the sequencingCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequencingCapable() {
        return sequencingCapable;
    }

    /**
     * Sets the value of the sequencingCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequencingCapable(Boolean value) {
        this.sequencingCapable = value;
    }

    /**
     * Gets the value of the maxNumberOfSequentialPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfSequentialPages() {
        return maxNumberOfSequentialPages;
    }

    /**
     * Sets the value of the maxNumberOfSequentialPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfSequentialPages(BigInteger value) {
        this.maxNumberOfSequentialPages = value;
    }

    /**
     * Gets the value of the positionXAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionXAbsoluteEnum }
     *     
     */
    public _PositionXAbsoluteEnum getPositionXAbsolute() {
        return positionXAbsolute;
    }

    /**
     * Sets the value of the positionXAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionXAbsoluteEnum }
     *     
     */
    public void setPositionXAbsolute(_PositionXAbsoluteEnum value) {
        this.positionXAbsolute = value;
    }

    /**
     * Gets the value of the positionXRelativeToPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionXRelativeEnum }
     *     
     */
    public _PositionXRelativeEnum getPositionXRelativeToPrevious() {
        return positionXRelativeToPrevious;
    }

    /**
     * Sets the value of the positionXRelativeToPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionXRelativeEnum }
     *     
     */
    public void setPositionXRelativeToPrevious(_PositionXRelativeEnum value) {
        this.positionXRelativeToPrevious = value;
    }

    /**
     * Gets the value of the positionYAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionYAbsoluteEnum }
     *     
     */
    public _PositionYAbsoluteEnum getPositionYAbsolute() {
        return positionYAbsolute;
    }

    /**
     * Sets the value of the positionYAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionYAbsoluteEnum }
     *     
     */
    public void setPositionYAbsolute(_PositionYAbsoluteEnum value) {
        this.positionYAbsolute = value;
    }

    /**
     * Gets the value of the positionYRelativeToPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link _PositionYRelativeEnum }
     *     
     */
    public _PositionYRelativeEnum getPositionYRelativeToPrevious() {
        return positionYRelativeToPrevious;
    }

    /**
     * Sets the value of the positionYRelativeToPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PositionYRelativeEnum }
     *     
     */
    public void setPositionYRelativeToPrevious(_PositionYRelativeEnum value) {
        this.positionYRelativeToPrevious = value;
    }

    /**
     * Gets the value of the displayGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayGeometry }
     *     
     */
    public DisplayGeometry getDisplayGeometry() {
        return displayGeometry;
    }

    /**
     * Sets the value of the displayGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayGeometry }
     *     
     */
    public void setDisplayGeometry(DisplayGeometry value) {
        this.displayGeometry = value;
    }

    /**
     * Gets the value of the overriddenLaneAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the overriddenLaneAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverriddenLaneAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane }
     * 
     * 
     */
    public List<Lane> getOverriddenLaneAssociation() {
        if (overriddenLaneAssociation == null) {
            overriddenLaneAssociation = new ArrayList<Lane>();
        }
        return this.overriddenLaneAssociation;
    }

    /**
     * Gets the value of the _DisplayAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DisplayAreaExtension() {
        return _DisplayAreaExtension;
    }

    /**
     * Sets the value of the _DisplayAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DisplayAreaExtension(_ExtensionType value) {
        this._DisplayAreaExtension = value;
    }

}
