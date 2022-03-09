
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearWithinLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearWithinLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrativeAreaOfLinearSection" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="directionOnLinearSection" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelativeOnLinearSection" type="{http://datex2.eu/schema/3/locationReferencing}_LinearDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="heightGradeOfLinearSection" type="{http://datex2.eu/schema/3/locationReferencing}_HeightGradeEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/3/locationReferencing}LinearElement"/&gt;
 *         &lt;element name="fromPoint" type="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="toPoint" type="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="_linearWithinLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearWithinLinearElement", propOrder = {
    "administrativeAreaOfLinearSection",
    "directionOnLinearSection",
    "directionRelativeOnLinearSection",
    "heightGradeOfLinearSection",
    "linearElement",
    "fromPoint",
    "toPoint",
    "_LinearWithinLinearElementExtension"
})
public class LinearWithinLinearElement {

    protected MultilingualString administrativeAreaOfLinearSection;
    protected _DirectionEnum directionOnLinearSection;
    protected _LinearDirectionEnum directionRelativeOnLinearSection;
    protected _HeightGradeEnum heightGradeOfLinearSection;
    @XmlElement(required = true)
    protected LinearElement linearElement;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement fromPoint;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement toPoint;
    @XmlElement(name = "_linearWithinLinearElementExtension")
    protected _ExtensionType _LinearWithinLinearElementExtension;

    /**
     * Gets the value of the administrativeAreaOfLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeAreaOfLinearSection() {
        return administrativeAreaOfLinearSection;
    }

    /**
     * Sets the value of the administrativeAreaOfLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeAreaOfLinearSection(MultilingualString value) {
        this.administrativeAreaOfLinearSection = value;
    }

    /**
     * Gets the value of the directionOnLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionEnum }
     *     
     */
    public _DirectionEnum getDirectionOnLinearSection() {
        return directionOnLinearSection;
    }

    /**
     * Sets the value of the directionOnLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionEnum }
     *     
     */
    public void setDirectionOnLinearSection(_DirectionEnum value) {
        this.directionOnLinearSection = value;
    }

    /**
     * Gets the value of the directionRelativeOnLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link _LinearDirectionEnum }
     *     
     */
    public _LinearDirectionEnum getDirectionRelativeOnLinearSection() {
        return directionRelativeOnLinearSection;
    }

    /**
     * Sets the value of the directionRelativeOnLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LinearDirectionEnum }
     *     
     */
    public void setDirectionRelativeOnLinearSection(_LinearDirectionEnum value) {
        this.directionRelativeOnLinearSection = value;
    }

    /**
     * Gets the value of the heightGradeOfLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link _HeightGradeEnum }
     *     
     */
    public _HeightGradeEnum getHeightGradeOfLinearSection() {
        return heightGradeOfLinearSection;
    }

    /**
     * Sets the value of the heightGradeOfLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link _HeightGradeEnum }
     *     
     */
    public void setHeightGradeOfLinearSection(_HeightGradeEnum value) {
        this.heightGradeOfLinearSection = value;
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
     * Gets the value of the fromPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getFromPoint() {
        return fromPoint;
    }

    /**
     * Sets the value of the fromPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setFromPoint(DistanceAlongLinearElement value) {
        this.fromPoint = value;
    }

    /**
     * Gets the value of the toPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getToPoint() {
        return toPoint;
    }

    /**
     * Sets the value of the toPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setToPoint(DistanceAlongLinearElement value) {
        this.toPoint = value;
    }

    /**
     * Gets the value of the _LinearWithinLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LinearWithinLinearElementExtension() {
        return _LinearWithinLinearElementExtension;
    }

    /**
     * Sets the value of the _LinearWithinLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LinearWithinLinearElementExtension(_ExtensionType value) {
        this._LinearWithinLinearElementExtension = value;
    }

}
