
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrativeAreaOfPoint" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="directionAtPoint" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelativeAtPoint" type="{http://datex2.eu/schema/3/locationReferencing}_LinearDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="heightGradeOfPoint" type="{http://datex2.eu/schema/3/locationReferencing}_HeightGradeEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/3/locationReferencing}LinearElement"/&gt;
 *         &lt;element name="distanceAlongLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="_pointAlongLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointAlongLinearElement", propOrder = {
    "administrativeAreaOfPoint",
    "directionAtPoint",
    "directionRelativeAtPoint",
    "heightGradeOfPoint",
    "linearElement",
    "distanceAlongLinearElement",
    "_PointAlongLinearElementExtension"
})
public class PointAlongLinearElement {

    protected MultilingualString administrativeAreaOfPoint;
    protected _DirectionEnum directionAtPoint;
    protected _LinearDirectionEnum directionRelativeAtPoint;
    protected _HeightGradeEnum heightGradeOfPoint;
    @XmlElement(required = true)
    protected LinearElement linearElement;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement distanceAlongLinearElement;
    @XmlElement(name = "_pointAlongLinearElementExtension")
    protected _ExtensionType _PointAlongLinearElementExtension;

    /**
     * Gets the value of the administrativeAreaOfPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeAreaOfPoint() {
        return administrativeAreaOfPoint;
    }

    /**
     * Sets the value of the administrativeAreaOfPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeAreaOfPoint(MultilingualString value) {
        this.administrativeAreaOfPoint = value;
    }

    /**
     * Gets the value of the directionAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionEnum }
     *     
     */
    public _DirectionEnum getDirectionAtPoint() {
        return directionAtPoint;
    }

    /**
     * Sets the value of the directionAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionEnum }
     *     
     */
    public void setDirectionAtPoint(_DirectionEnum value) {
        this.directionAtPoint = value;
    }

    /**
     * Gets the value of the directionRelativeAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link _LinearDirectionEnum }
     *     
     */
    public _LinearDirectionEnum getDirectionRelativeAtPoint() {
        return directionRelativeAtPoint;
    }

    /**
     * Sets the value of the directionRelativeAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LinearDirectionEnum }
     *     
     */
    public void setDirectionRelativeAtPoint(_LinearDirectionEnum value) {
        this.directionRelativeAtPoint = value;
    }

    /**
     * Gets the value of the heightGradeOfPoint property.
     * 
     * @return
     *     possible object is
     *     {@link _HeightGradeEnum }
     *     
     */
    public _HeightGradeEnum getHeightGradeOfPoint() {
        return heightGradeOfPoint;
    }

    /**
     * Sets the value of the heightGradeOfPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link _HeightGradeEnum }
     *     
     */
    public void setHeightGradeOfPoint(_HeightGradeEnum value) {
        this.heightGradeOfPoint = value;
    }

    /**
     * Gets the value of the linearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearElement }
     *     
     */
    public LinearElement getLinearElement() {
        return linearElement;
    }

    /**
     * Sets the value of the linearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearElement }
     *     
     */
    public void setLinearElement(LinearElement value) {
        this.linearElement = value;
    }

    /**
     * Gets the value of the distanceAlongLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getDistanceAlongLinearElement() {
        return distanceAlongLinearElement;
    }

    /**
     * Sets the value of the distanceAlongLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setDistanceAlongLinearElement(DistanceAlongLinearElement value) {
        this.distanceAlongLinearElement = value;
    }

    /**
     * Gets the value of the _PointAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PointAlongLinearElementExtension() {
        return _PointAlongLinearElementExtension;
    }

    /**
     * Sets the value of the _PointAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PointAlongLinearElementExtension(_ExtensionType value) {
        this._PointAlongLinearElementExtension = value;
    }

}
